package models;

public class Enemigo {

    //Atributos

    private int vida;

    //Constructores

    public Enemigo(int vida) {
        this.vida = vida;
    }

    //Getters

    public int getVida() {
        return vida;
    }

    //Metodos
    public int ataqueEnemigo(){
        return vida * 5;
    }
}
