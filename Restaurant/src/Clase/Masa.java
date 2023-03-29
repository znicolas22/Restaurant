package Clase;

import Interfete.OperatiuniDisponibilitate;
import java.util.ArrayList;
import java.util.List;

public class Masa implements OperatiuniDisponibilitate{
    private int masaId;
    boolean disponiblitatea = true;
    private List<Client> clienti = new ArrayList<>(4); //mesele au capacitate de 4 persoane max
    private Restaurant restaurant;

    public Masa() {
    }

    public void setMasaId(int masaId) {
        this.masaId = masaId;
    }

    public Masa(int masaId, Boolean disponiblitatea, ArrayList<Client> clienti) {
        this.masaId = masaId;
        this.disponiblitatea = disponiblitatea;
        this.clienti = clienti;
        if (clienti.isEmpty()){
            this.disponiblitatea = true;
        }else{
            this.disponiblitatea = false;
        }
        this.restaurant = Restaurant.getInstance();
    }

    public Masa(int masaId, Boolean disponiblitatea) {
        this.masaId = masaId;
        this.disponiblitatea = disponiblitatea;
        this.restaurant = Restaurant.getInstance();
    }

    public int getMasaId() {
        return masaId;
    }

    public Boolean getDisponiblitatea() {
        if(this.disponiblitatea == false){
            System.out.println("Masa " + this.getMasaId() + " este ocupata");
        }else{
            System.out.println("Masa " + this.getMasaId() + " este libera");
        }
        return disponiblitatea;
    }

    public List<Client> getClienti() {
        return clienti;
    }

    public void setDisponiblitatea(Boolean disponiblitatea) {
        this.disponiblitatea = disponiblitatea;
    }

    public void setClienti(List<Client> clienti) throws Exception {
        if (clienti.toArray().length > 4) {
            throw new Exception("Capacitatea meselor este de 4 perosane");
        } else {
            this.clienti = clienti;
            this.disponiblitatea = false;
        }
    }

    @Override
    public void checkDisp() {
        if (clienti.isEmpty()) {
            this.setDisponiblitatea(true);
            System.out.println("Masa " + this.getMasaId() + " este libera");
        } else {
            this.setDisponiblitatea(false);
            System.out.println("Masa " + this.getMasaId() + " este ocupata");
        }

    }

    public void afisareClienti() {
        for (int i = 0; i < clienti.toArray().length; i++) {
            System.out.println(clienti);
        }
    }

    @Override
    public String toString() {
        return "Masa{" +
                "masaId=" + masaId +
                ", disponiblitatea=" + disponiblitatea +
                ", clienti=" + clienti +
                '}';
    }
}

