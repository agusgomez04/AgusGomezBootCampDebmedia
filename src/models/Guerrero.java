package models;

abstract public class Guerrero {

    //Atributos

    private int idG;
    private static int ultimoIdG;
    private String nombre;
    private double fuerza;

    //Constructores

    public Guerrero(String nombre, double fuerza) {
        idG = ++ultimoIdG;
        this.nombre = nombre;
        this.fuerza = fuerza;
    }

    //Getters

    public String getNombre() {
        return nombre;
    }

    public double getFuerza() {
        return fuerza;
    }

    public int getIdG() {
        return idG;
    }

    //Métodos

    abstract public double ataqueBasico();

}
