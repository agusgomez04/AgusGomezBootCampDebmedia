package models;

public class Espada extends Arma {

    //Constructores

    public Espada(String nombreArma, double poderAtaque) {
        super(nombreArma, poderAtaque);
    }

    //Métodos

    @Override
    public String toString() {
        return "espada '" + getNombreArma() + "', tiene un poder de ataque de " +
                getPoderAtaque() + ". ";
    }
}
