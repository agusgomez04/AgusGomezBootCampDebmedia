package models;

public class Baculo extends Arma {

    //Constructores

    public Baculo(String nombreArma, double poderAtaque) {
        super(nombreArma, poderAtaque);
    }

    //Métodos

    @Override
    public String toString() {
        return "báculo '" + getNombreArma() + "', tiene un poder de ataque de " +
                getPoderAtaque() + ". ";
    }
}
