package Enums;

public enum Tip_Comanda {
    LA_PACHET(1), LA_MASA(2);
    private int codComanda;

    Tip_Comanda(int codComanda) {
        this.codComanda = codComanda;
    }

    public int getCodComanda() {
        return codComanda;
    }
}