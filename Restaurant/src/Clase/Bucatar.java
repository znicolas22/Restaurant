package Clase;

import Enums.Tip_Bucatar;
import Interfete.OperatiuniBucatarComanda;
import Interfete.OperatiuniDisponibilitate;

import java.util.ArrayList;
import java.util.List;

public class Bucatar implements OperatiuniBucatarComanda, OperatiuniDisponibilitate {
    private int bucatar_ID;
    private List<Comanda> comenzi = new ArrayList<>();
    private Tip_Bucatar skill;

    public Bucatar() {
        this.bucatar_ID = 0;
        this.comenzi = null;
        this.skill = Tip_Bucatar.BUCATAR_NORMAL;
    }

    public Bucatar(Tip_Bucatar skill) {
        this.skill = skill;
    }

    public Bucatar(int bucatar_ID, List<Comanda> comenzi, Tip_Bucatar skill) {
        this.bucatar_ID = bucatar_ID;
        this.comenzi = comenzi;
        this.skill = skill;
    }

    public int getBucatar_ID() {
        return bucatar_ID;
    }

    public void setBucatar_ID(int bucatar_ID) {
        this.bucatar_ID = bucatar_ID;
    }

    public List<Comanda> getComenzi() {
        return comenzi;
    }

    public void setComenzi(List<Comanda> comenzi) {
        this.comenzi = comenzi;
    }

    public Tip_Bucatar getSkill() {
        return skill;
    }

    public void setSkill(Tip_Bucatar skill) {
        this.skill = skill;
    }

    @Override
    public void preiaComanada(Comanda comanda) {
        comenzi.add(comanda);
    }

    @Override
    public String toString() {
        return "Bucatar{" +
                "skill=" + skill +
                ", comenzi=" + comenzi +
                '}';
    }

    @Override
    public void checkDisp() {
        System.out.println("Bucatarul " + this.skill.toString() + " se ocupa de comenzile");
        for (int i = 0; i < comenzi.toArray().length; i++) {
            System.out.println(comenzi.get(i));
        }
    }
}
