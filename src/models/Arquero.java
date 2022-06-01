package models;

public class Arquero extends Guerrero {

    //Atributos

    private Arco armaArquero;

    //Constructores

    public Arquero(String nombre, double fuerza) {
        super(nombre, fuerza);
    }

    //Setters

    public void setArmaArquero(Arco armaArquero) {
        this.armaArquero = armaArquero;
    }

    //Métodos

    @Override
    public double ataqueBasico() {
        return getFuerza() * armaArquero.poderAtaque;
    }

    @Override
    public String toString() {
        return "Mi nombre es " + getNombre() + ", soy un Arquero con "
                + getFuerza() + " puntos de fuerza!";
    }
}

