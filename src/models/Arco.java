package models;

public class Arco extends Arma {

    //Constructores

    public Arco(String nombreArma, double poderAtaque) {
        super(nombreArma, poderAtaque);
    }

    //Métodos

    @Override
    public String toString() {
        return "arco '" + getNombreArma() + "', tiene un poder de ataque de " +
                getPoderAtaque() + ". ";
    }
}

