import models.Berzerker;
import models.Enemigo;
import models.Espada;
import models.Guerrero;
import java.util.Iterator;

import static models.metodos.Metodos.*;


public class Test {
    public static void main(String[] args) {

        cargarEjercito();
        cargarArmeria();
        equiparEjercito(ejercito, armeria);
        /*

        Este loop muestra el ejercito armado.

        ejercitoEquipado.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " Soy portador de " + entry.getValue());
        });

        */

        resultadoArmeria();

        // Prueba matarEnemigo()
        Berzerker pruebaBerzerker = new Berzerker("Berz", 180);
        Espada pruebaEspada = new Espada("Esp", 150);
        Enemigo pruebaEnemigo = new Enemigo(24000);
        cargarArma(pruebaBerzerker, pruebaEspada);
        matarEnemigo(pruebaBerzerker, pruebaEnemigo);


    }

}
