package models;

public class Berzerker extends Guerrero {

    //Atributos

    private Espada armaBerzerker;

    //Constructores

    public Berzerker(String nombre, double fuerza) {
        super(nombre, fuerza);
    }

    //Setters

    public void setArmaBerzerker(Espada armaBerzerker) {
        this.armaBerzerker = armaBerzerker;
    }

    //Métodos

    @Override
    public double ataqueBasico() {
        return getFuerza() * armaBerzerker.poderAtaque;
    }

    @Override
    public String toString() {
        return "Mi nombre es " + getNombre() + ", soy un Berzerker con "
                + getFuerza() + " puntos de fuerza!";
    }
}
