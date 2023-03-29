package Clase;

import java.util.List;

public class Patron {
    private Restaurant restaurant;

    public Patron() {
        this.restaurant = Restaurant.getInstance();
    }

    public void adaugaMese(List<Masa> mese){
       restaurant.setMese(mese);
    }
    public void adaugaOMasa(Masa masa){
        restaurant.setOMasa(masa);
    }

    public void adaugaOspatari(List<Ospatar> ospatari){
        restaurant.setOspatari(ospatari);
    }
    public void adaugaUnOspatar(Ospatar ospatar) {
        restaurant.setUnOspatar(ospatar);
    }

    public void adaugaBucatari(List<Bucatar> bucatari){
        restaurant.setBucatari(bucatari);
    }
    public void adaugaUnBucatar(Bucatar bucatar){
        restaurant.setUnBucatar(bucatar);
    }

    public void adaugaClienti(List<Client> clienti){
        restaurant.setClienti(clienti);
    }
    public void adaugaUnClient(Client client){
        restaurant.setUnClient(client);
    }

    public void adaugaComenzi(List<Comanda> comenzi){
        restaurant.setComenzi(comenzi);
    }
    public void adaugaOComanda(Comanda comanda){
        restaurant.setOComanda(comanda);
    }

    public void afisareRestaurant(){
        System.out.println("----------Restaurant----------");
        for (Masa masa:restaurant.mese){
            System.out.println(masa);
        }
        System.out.println("\n");
        for (Comanda comanda:restaurant.comenzi) {
            System.out.println(comanda);
        }
        System.out.println("\n");
        for(Ospatar ospatar:restaurant.ospatari){
            System.out.println(ospatar);
        }
        System.out.println("\n");
        for (Bucatar bucatar:restaurant.bucatari){
            System.out.println(bucatar);
        }

    }

}
