package models.metodos;

import models.*;

import java.util.*;

public class Metodos {

    //Atributos

    public static List<Guerrero> ejercito;
    public static List<Arma> armeria;
    public static Map<Guerrero, Arma> ejercitoEquipado;
    public static List<Guerrero> guerreroSinArma;
    public static List<Arma> armaSinGuerrero;

    //Métodos

    public static void cargarEjercito() {
        ejercito = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Seleccione (1) para ingresar un Berserker, (2) para un Arquero y (3) para un Mago.");
        System.out.println("Seleccione (0) para cortar la carga.");
        try {
            int ingreso = teclado.nextInt();
            while (ingreso != 0) {
                if (ingreso == 1) {
                    System.out.println("Ingrese nombre del Berzerker");
                    String nombre = teclado.next();
                    System.out.println("Ingrese fuerza del Berzerker");
                    double fuerza = teclado.nextDouble();
                    Berzerker b = new Berzerker(nombre, fuerza);
                    ejercito.add(b);
                } else if (ingreso == 2) {
                    System.out.println("Ingrese nombre del Arquero");
                    String nombre = teclado.next();
                    System.out.println("Ingrese fuerza del Arquero");
                    double fuerza = teclado.nextDouble();
                    Arquero arq = new Arquero(nombre, fuerza);
                    ejercito.add(arq);
                } else if (ingreso == 3) {
                    System.out.println("Ingrese nombre del Mago");
                    String nombre = teclado.next();
                    System.out.println("Ingrese fuerza del Mago");
                    double fuerza = teclado.nextDouble();
                    Mago mago = new Mago(nombre, fuerza);
                    ejercito.add(mago);
                } else {
                    System.out.println("Debe ingresar valores entre 1, 2, 3 o 0 para continuar!");
                }
                System.out.println("Vuelva a ingresar 1, 2 o 3 para continuar cargando el ejercito o 0 para finalizar.");
                ingreso = teclado.nextInt();
            }
        } catch (InputMismatchException e) {
            System.out.println("NO es valido ingresar letras o números distintos de 1, 2, 3 y 0");
            System.out.println("Vuelva a intentar!");
            cargarEjercito();
        }
    }

    public static void cargarArmeria() {
        armeria = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Seleccione (1) para ingresar una Espada, (2) para un Arco y (3) para un Báculo.");
        System.out.println("Seleccione (0) para cortar la carga.");
        try {
            int ingreso = teclado.nextInt();
            while (ingreso != 0) {
                if (ingreso == 1) {
                    System.out.println("Ingrese nombre de la Espada");
                    String nombre = teclado.next();
                    System.out.println("Ingrese el poder de ataque de la Espada");
                    double poder = teclado.nextDouble();
                    Espada esp = new Espada(nombre, poder);
                    armeria.add(esp);
                } else if (ingreso == 2) {
                    System.out.println("Ingrese nombre del Arco");
                    String nombre = teclado.next();
                    System.out.println("Ingrese el poder de ataque del Arco");
                    double poder = teclado.nextDouble();
                    Arco arq = new Arco(nombre, poder);
                    armeria.add(arq);
                } else if (ingreso == 3) {
                    System.out.println("Ingrese nombre del Báculo");
                    String nombre = teclado.next();
                    System.out.println("Ingrese el poder de ataque del Báculo");
                    double poder = teclado.nextDouble();
                    Baculo mago = new Baculo(nombre, poder);
                    armeria.add(mago);
                } else {
                    System.out.println("Debe ingresar valores entre 1, 2, 3 o 0 para continuar!");
                }
                System.out.println("Vuelva a ingresar 1, 2 o 3 para continuar cargando la armería o 0 para finalizar.");
                ingreso = teclado.nextInt();
            }
        } catch (InputMismatchException e) {
            System.out.println("NO es valido ingresar letras o números distintos de 1, 2, 3 y 0");
            System.out.println("Vuelva a intentar!");
            cargarArmeria();
        }
    }

    public static void cargarArma(Guerrero g, Arma a) {
        // acá faltaria verificar si el guerrero tiene Arma, pero esta bien. En éste ejemplo claramente, ninguno se cargaba con arma.
        if ((g.getClass() == Berzerker.class) && (a.getClass() == Espada.class)) {
            ((Berzerker) g).setArmaBerzerker((Espada) a);
        } else if ((g.getClass() == Arquero.class) && (a.getClass() == Arco.class)) {
            ((Arquero) g).setArmaArquero((Arco) a);
        } else if ((g.getClass() == Mago.class) && (a.getClass() == Baculo.class)) {
            ((Mago) g).setArmaMago((Baculo) a);
        } else {
            System.out.println("Soy un " + g.getClass() + " solo puedo portar un/a " + a.getClass());
        }

    }

    public static void equiparEjercito(List<Guerrero> listG, List<Arma> listA) {
        /*
        Esto funciona, pero te complicaste mucho, fijate que lo unico que cambia es el if.
        Podrias haber usado una estructura de la siguiente manera, con los diferentes if consultando por la clase y era mas sencillo para vos.

            for(Loopea Guerreros){
                for(Loopea Armas){
                    Aca metias los 3 ifs. Con sus respectivos comentarios.
                }
           }
        * */
        ejercitoEquipado = new HashMap<>();
        for (int i = 0; i < listG.size(); i++) {
            if (listG.get(i).getClass() == Berzerker.class) {
                for (int j = 0; j < listA.size(); j++) {
                    // Te faltaria preguntar si ya tiene un arma el guerrero y se podria unificar con el if de arriba con un &&.
                    if (listA.get(j).getClass() == Espada.class) {
                        cargarArma(listG.get(i), listA.get(j));
                        ejercitoEquipado.put(listG.get(i), listA.get(j));
                    }
                }
            }
        }
        for (int i = 0; i < listG.size(); i++) {
            if (listG.get(i).getClass() == Arquero.class) {
                for (int j = 0; j < listA.size(); j++) {
                    if (listA.get(j).getClass() == Arco.class) {
                        cargarArma(listG.get(i), listA.get(j));
                        ejercitoEquipado.put(listG.get(i), listA.get(j));
                    }
                }
            }
        }
        for (int i = 0; i < listG.size(); i++) {
            if (listG.get(i).getClass() == Mago.class) {
                for (int j = 0; j < listA.size(); j++) {
                    if (listA.get(j).getClass() == Baculo.class) {
                        cargarArma(listG.get(i), listA.get(j));
                        ejercitoEquipado.put(listG.get(i), listA.get(j));
                    }
                }
            }
        }
    }

    public static void matarEnemigo(Guerrero g, Enemigo e) {
        double resultado;
        if (g.getClass() == Arquero.class || g.getClass() == Berzerker.class) {
            resultado = e.getVida() - g.ataqueBasico();
            if (resultado <= 0) {
                System.out.println(g.getNombre() + " ha derrotado al enemigo!");
            } else {
                System.out.println(g.getNombre() + " no ha derrotado al enemigo.");
            }
        } else if (g.getClass() == Mago.class) {
            resultado = e.getVida() - ((Mago) g).ataqueMagico();
            if (resultado <= 0) {
                System.out.println(g.getNombre() + " ha derrotado al enemigo!");
            } else {
                System.out.println(g.getNombre() + " no ha derrotado al enemigo.");
            }
        }
    }

    public static void resultadoArmeria() {
        guerreroSinArma = new ArrayList<>();
        armaSinGuerrero = new ArrayList<>();
        for (int i = 0; i < ejercito.size(); i++) {
            if (ejercitoEquipado.containsKey(ejercito.get(i))) {
                continue;
            } else {
                guerreroSinArma.add(ejercito.get(i));
            }
        }
        for (int i = 0; i < armeria.size(); i++) {
            if (ejercitoEquipado.containsValue(armeria.get(i))) {
                continue;
            } else {
                armaSinGuerrero.add(armeria.get(i));
            }
        }
        Iterator<Guerrero> it = guerreroSinArma.iterator();
        System.out.println("Los siguientes guerreros quedaron sin armas:");
        for (int i = 0; i < guerreroSinArma.size(); i++) {
            // Aca estas imprimiendo el nombre de la clase. Podrias haber hecho:
            //System.out.println(it2.next().toString());
            System.out.println(it.next().getClass().getName());
        }
        Iterator<Arma> it2 = armaSinGuerrero.iterator();
        System.out.println("Los siguientes armas quedaron sin guerrero:");
        for (int i = 0; i < armaSinGuerrero.size(); i++) {
            // Aca estas imprimiendo el nombre de la clase. Podrias haber hecho:
            //System.out.println(it2.next().toString());
            System.out.println(it2.next().getClass().getName());
        }
    }
}


