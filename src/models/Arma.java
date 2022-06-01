package models;

abstract public class Arma {

    //Atributos

    private int idArma;
    private static int ultimoIdArma;
    private String nombreArma;
    protected double poderAtaque;

    //Constructores

    public Arma() {
    }

    public Arma(String nombreArma, double poderAtaque) {
        this.idArma = ++ultimoIdArma;
        this.nombreArma = nombreArma;
        this.poderAtaque = poderAtaque;
    }

    //Getters

    public String getNombreArma() {
        return nombreArma;
    }

    public double getPoderAtaque() {
        return poderAtaque;
    }

    public int getIdArma() {
        return idArma;
    }
}
