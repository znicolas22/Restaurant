package Clase;

//comanda apartine unui client, este preluata de un ospatar

import Enums.Tip_Comanda;

public class Comanda{
    private int idComanda;
    private float valoareComanda;
    private int dificulty;
    protected Tip_Comanda tip;
    private Restaurant restaurant;

    public Comanda() {
        this.restaurant = Restaurant.getInstance();
    }

    public Comanda(int idComanda, float valoareComanda, int dificulty, Tip_Comanda tip) {
        this.idComanda = idComanda;
        this.valoareComanda = valoareComanda;
        this.dificulty = dificulty;
        this.tip = tip;
        this.restaurant = Restaurant.getInstance();

    }

    public int getIdComanda() {
        return idComanda;
    }

    public float getValoareComanda() {
        return valoareComanda;
    }

    public int getDificulty() {
        return dificulty;
    }

    public Tip_Comanda getTip() {
        return tip;
    }

    public void setIdComanda(int idComanda) {
        this.idComanda = idComanda;
    }

    public void setValoareComanda(float valoareComanda) {
        this.valoareComanda = valoareComanda;
    }

    public void setDificulty(int dificulty) {
        this.dificulty = dificulty;
    }

    public void setTip(Tip_Comanda tip) {
        this.tip = tip;
    }



    @Override
    public String toString() {
        return  "[Comanda nr: " + this.idComanda +
                " ,de tipul: " + this.getTip() +
                " ,cu dificultatea " + getDificulty() +
                " ,in valoare de " + getValoareComanda() + " lei]";
    }
}
