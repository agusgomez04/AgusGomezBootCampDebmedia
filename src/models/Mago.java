package models;

public class Mago extends Guerrero {

    //Atributos

    private Baculo armaMago;

    //Constructores

    public Mago(String nombre, double fuerza) {
        super(nombre, fuerza);
    }

    public void setArmaMago(Baculo armaMago) {
        this.armaMago = armaMago;
    }

    //Métodos

    public double ataqueMagico() {
        return getFuerza() * armaMago.poderAtaque;
    }

    @Override
    public double ataqueBasico() {
        return 0;
    }

    @Override
    public String toString() {
        return "Mi nombre es " + getNombre() + ", soy un Mago con "
                + getFuerza() + " puntos de fuerza!";
    }
}
