package Clase;

import Enums.Disponibilitate;
import Enums.Tip_Bucatar;
import Enums.Tip_Comanda;
import Interfete.OperatiuniDisponibilitate;
import Interfete.OperatiuniOspatarBucatar;
import Interfete.OperatiuniOspatarComanda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ospatar implements OperatiuniOspatarComanda,
        OperatiuniOspatarBucatar, OperatiuniDisponibilitate {
    private int ospatar_Id;
    protected Disponibilitate disponibilitate;
    private List<Comanda> comenziPreluate = new ArrayList<>(4);
    private Restaurant restaurant;

    public Ospatar() {
        this.ospatar_Id = 0;
        this.disponibilitate = Disponibilitate.INDISPONIBIL;
        this.comenziPreluate = Collections.emptyList();
        this.restaurant = Restaurant.getInstance();
    }

    public Ospatar(int ospatar_Id, Disponibilitate disponibilitate, List<Comanda> comenziPreluate) {
        this.ospatar_Id = ospatar_Id;
        this.disponibilitate = disponibilitate;
        this.comenziPreluate = comenziPreluate;
        this.restaurant = Restaurant.getInstance();
    }

    public Ospatar(int ospatar_Id, Disponibilitate disponibilitate) {
        this.ospatar_Id = ospatar_Id;
        this.disponibilitate = disponibilitate;
        this.restaurant = Restaurant.getInstance();
    }

    public List<Comanda> getComenziPreluate() {
        return comenziPreluate;
    }

    public Comanda retureneazaComanda() {
        return comenziPreluate.get(0);
    }

    public void setComenziPreluate(List<Comanda> comenziPreluate) {
        this.comenziPreluate = comenziPreluate;
    }

    public int getOspatar_Id() {
        return ospatar_Id;
    }

    public Disponibilitate getDisponibilitate() {
        return disponibilitate;
    }

    @Override
    public void preiaComandaLaMasa(List<Client> clienti, Comanda comanda, Masa masa) throws Exception {
        if(masa.disponiblitatea==false)
        {
            throw new Exception("Masa este ocupata");
        }else{
            this.comenziPreluate.add(comanda);
            masa.setDisponiblitatea(false);
            masa.setClienti(clienti);
        }
    }

    @Override
    public void preiaComandaOnline(Comanda comanda) throws Exception {
        if (this.comenziPreluate.toArray().length == 4) {
            this.disponibilitate = Disponibilitate.INDISPONIBIL;
            throw new Exception("Ospatarul are prea multe comenzi");
        }

        if (comanda.getTip() != Tip_Comanda.LA_PACHET) {
            throw new Exception("Comanda nu este de tip: LA_PACHET");
        } else {
            this.comenziPreluate.add(comanda);
        }


    }

    @Override
    public void repartizareComanda(Bucatar bucatar1, Bucatar bucatar2) {
        if (bucatar1.getSkill() == Tip_Bucatar.BUCATAR_NORMAL &&
                bucatar1.getComenzi().toArray().length + this.comenziPreluate.toArray().length <= 5) {
            for (int i = 0; i < comenziPreluate.toArray().length; i++) {
                if (comenziPreluate.get(i).getDificulty() <= 60) {
                    bucatar1.preiaComanada(comenziPreluate.get(i));
                }
            }
        } else {
            System.out.println("Bucatarul " + bucatar1 + " se ocupa deja de prea multe comenzi," +
                    " comanda se repartizeaza la celalalt bucatar ");
            for (int i = 0; i < comenziPreluate.toArray().length; i++) {
                if (comenziPreluate.get(i).getDificulty() > 60) {
                    bucatar2.preiaComanada(comenziPreluate.get(i));
                }
            }
        }
        if (bucatar2.getSkill() == Tip_Bucatar.BUCATAR_SEF) {
            for (int i = 0; i < comenziPreluate.toArray().length; i++) {
                if (comenziPreluate.get(i).getDificulty() > 60) {
                    bucatar2.preiaComanada(comenziPreluate.get(i));
                }
            }
        }
    }

    @Override
    public void checkDisp() {
        System.out.println("Ospatarul " + getOspatar_Id() + " are urmatoarele comenzi");
        for (int i = 0; i < comenziPreluate.toArray().length; i++) {
            System.out.println(comenziPreluate.get(i));
        }
    }

    @Override
    public String toString() {
        return "Ospatar{" + "ospatar_Id=" + ospatar_Id + ", " +
                "disponibilitate= " + disponibilitate + ", " +
                "comenziPreluate=" + comenziPreluate +
                '}';
    }
}