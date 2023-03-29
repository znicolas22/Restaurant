package Main;

import Clase.*;
import Enums.Disponibilitate;
import Enums.Tip_Bucatar;
import Enums.Tip_Comanda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Patron patron = new Patron();

        List<Client> clienti = new ArrayList<>();
        List<Client> clienti2 = new ArrayList<>();
        Client client1 = new Client(1);
        Client client2 = new Client(2);
        Client client3 = new Client(3);
        Client client4 = new Client(4);
        clienti.add(client1);
        clienti.add(client2);
        clienti2.add(client3);
        clienti2.add(client4);
        patron.adaugaUnClient(client1);
        patron.adaugaUnClient(client2);
        patron.adaugaUnClient(client3);
        patron.adaugaUnClient(client4);


        Masa masa1 = new Masa(1,true);
        Masa masa2 = new Masa(2, true);
        Masa masa3 = new Masa(3,true);
        Masa masa4 = new Masa(4,true);
        patron.adaugaOMasa(masa1);
        patron.adaugaOMasa(masa2);
        patron.adaugaOMasa(masa3);
        patron.adaugaOMasa(masa4);


        Ospatar ospatar1 = new Ospatar(1, Disponibilitate.DISPONIBIL);
        patron.adaugaUnOspatar(ospatar1);

        Comanda comanda1 = new Comanda(1, 149, 70, Tip_Comanda.LA_MASA);
        Comanda comanda2 = new Comanda(2, 89, 50, Tip_Comanda.LA_MASA);
        Comanda comanda3 = new Comanda(3, 568, 100, Tip_Comanda.LA_PACHET);
        Comanda comanda4 = new Comanda(4, 247, 40, Tip_Comanda.LA_PACHET);
        Comanda comanda5 = new Comanda(5, 119, 30, Tip_Comanda.LA_PACHET);
        patron.adaugaOComanda(comanda1);
        patron.adaugaOComanda(comanda2);
        patron.adaugaOComanda(comanda3);
        patron.adaugaOComanda(comanda4);
        patron.adaugaOComanda(comanda5);

        Bucatar bucatar1 = new Bucatar(Tip_Bucatar.BUCATAR_NORMAL);
        Bucatar bucatar2 = new Bucatar(Tip_Bucatar.BUCATAR_SEF);
        patron.adaugaUnBucatar(bucatar1);
        patron.adaugaUnBucatar(bucatar2);


        ospatar1.preiaComandaLaMasa(clienti,comanda2, masa3); //prin parametrul clienti, ospatarul ocupa masa
        ospatar1.preiaComandaOnline(comanda5);
        ospatar1.preiaComandaOnline(comanda3);
        ospatar1.preiaComandaLaMasa(clienti2,comanda1,masa4);


        ospatar1.repartizareComanda(bucatar1,bucatar2);
        patron.afisareRestaurant();
    }
}
