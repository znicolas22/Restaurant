package Clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private static Restaurant instance;
    List<Masa> mese = new ArrayList<>();
    List<Ospatar> ospatari = new ArrayList<>();
    List<Bucatar> bucatari = new ArrayList<>();
    List<Client> clienti = new ArrayList<>();
    List<Comanda> comenzi = new ArrayList<>();

    private Restaurant() {

    }

    public static Restaurant getInstance(){
        if(instance == null){
            instance = new Restaurant();
        }
        return instance;
    }

    public static void setInstance(Restaurant instance) {
        Restaurant.instance = instance;
    }

    public List<Masa> getMese() {
        return mese;
    }

    public void setMese(List<Masa> mese) {
        this.mese = mese;
    }
    public void setOMasa(Masa masa){
        this.mese.add(masa);
    }

    public List<Ospatar> getOspatari() {
        return ospatari;
    }

    public void setOspatari(List<Ospatar> ospatari) {
        this.ospatari = ospatari;
    }
    public void setUnOspatar(Ospatar ospatar){
        this.ospatari.add(ospatar);
    }

    public List<Bucatar> getBucatari() {
        return bucatari;
    }

    public void setBucatari(List<Bucatar> bucatari) {
        this.bucatari = bucatari;
    }
    public void setUnBucatar(Bucatar bucatar){
        this.bucatari.add(bucatar);
    }

    public List<Client> getClienti() {
        return clienti;
    }

    public void setClienti(List<Client> clienti) {
        this.clienti = clienti;
    }
    public void setUnClient(Client client){
        this.clienti.add(client);
    }

    public List<Comanda> getComenzi() {
        return comenzi;
    }

    public void setComenzi(List<Comanda> comenzi) {
        this.comenzi = comenzi;
    }
    public void setOComanda(Comanda comanda){
        this.comenzi.add(comanda);
    }


    @Override
    public String toString() {
        return "Restaurant{\n" +
                "mese=" + mese + "\n" +
                ", ospatari=" + ospatari +
                ", bucatari=" + bucatari +
                ", comenzi=" + comenzi +
                '}';
    }

}
