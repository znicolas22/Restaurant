package Interfete;

import Clase.Client;
import Clase.Comanda;
import Clase.Masa;

import java.util.List;

public interface OperatiuniOspatarComanda {
    void preiaComandaLaMasa(List<Client> clienti, Comanda comanda, Masa masa) throws Exception;

    void preiaComandaOnline(Comanda comanda) throws  Exception;
}
