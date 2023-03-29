package Clase;


public class Client
        {
    private int clientId;
    private Restaurant restaurant;


    public Client() {
        this.restaurant = Restaurant.getInstance();
    }

    public Client(int clientId){
        this.clientId = clientId;
        this.restaurant = Restaurant.getInstance();
    }

    public Restaurant getRestaurant() {return restaurant;}

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

//    usless
//    @Override
//    public void ocupaMasa(List<Client> clienti, Masa masa) throws Exception {
//        if (masa.getDisponiblitatea() == true) {
//            if (clienti.toArray().length > 4) {
//                throw new Exception("Capacitatea meselor este de 4 perosane");
//            } else {
//                masa.setClienti(clienti);
//            }
//        } else {
//            throw new Exception("Masa " + this.getMasaId() + " este deja ocupata");
//        }
//    }

//    @Override
//    public void creeazaComandaLaMasa(List<Client> clienti ,Comanda comanda, Ospatar ospatar, Masa masa) throws Exception {
//        if (masa.getDisponiblitatea() == true) {
//            if (clienti.toArray().length > 4) {
//                throw new Exception("Capacitatea meselor este de 4 perosane");
//            } else {
//                masa.setClienti(clienti);
//            }
//        } else {
//            throw new Exception("Masa " + this.getMasaId() + " este deja ocupata");
//        }
//
//        if (ospatar.getDisponibilitate() == Disponibilitate.DISPONIBIL) {
//            this.comanda = comanda;
//            ospatar.preiaComanda(comanda);
//            masa.setComanda(comanda);
//        } else {
//            throw new Exception("Ospatarul are prea multe comenzi");
//        }
//        System.out.println("Clientul cu id-ul " + this.clientId + " a  creat comanda: " +
//                 "[" + comanda + "]" );
//    }

//    @Override
//    public void creeazaComandaDomiciliu(Comanda comanda, Ospatar ospatar, String adresa) throws Exception {
//        if (ospatar.getDisponibilitate() == Disponibilitate.DISPONIBIL) {
//            this.comanda = comanda;
//            ospatar.preiaComanda(comanda);
//
//        } else {
//            throw new Exception("Ospatarul are prea multe comenzi");
//        }
//        System.out.println("Clientul cu id-ul " + this.clientId + " a  creat comanda: " +
//                "[" + comanda + "]" );
//    }


            @Override
            public String toString() {
                return "clientId=" + clientId;
            }
        }
