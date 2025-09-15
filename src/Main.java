import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una temperatura");
        int temperatura = sc.nextInt();
        //System.out.println(temperatura);  Esto lo que hace es que repita el resultado

        if (temperatura < 0) {
            System.out.println("Hace frio");
        } else if (temperatura > 30) {
            System.out.println("Hace calor");
        } else {
            System.out.println("Clima Templado");

        }

        //2
        System.out.print("Dectector de color");
        sc.nextLine();
        String color = sc.nextLine();
        //System.out.println(color);
        if (color.equals("rojo")) {
            System.out.println("color primario ");
        } else if (color.equals("verde")) {
            System.out.println("color primario");
        } else if (color.equals("azul")) {
            System.out.println("color primario");
        } else {
            System.out.println("otro color");
        }

        //3
        System.out.print("Velocidad del coche");
        //sc.nextLine();  cuidado
        int velocidad = sc.nextInt();
        //System.out.println(velocidad);
        if (velocidad > 120) {
            System.out.println("Multa");
        } else if (0 < velocidad && velocidad <= 120) {
            System.out.println("Velocidad correcta:");
        }

        //4
        System.out.println("Ingresa un animal");
        sc.nextLine();
        String animal = sc.nextLine();
        //System.out.println(animal);
        if (animal.equals("gato") || animal.equals("perro")) {
            System.out.println("Animal Domestico");
        }else if (animal.equals("tigre") || animal.equals("leon")) {
            System.out.println("Animal Salvaje");
        }else {
            System.out.println("No clasificado");
        }

        //5
        System.out.print("Ingresa edad");
        int edad = sc.nextInt();
        //System.out.println(edad);
        if (edad < 12){
            System.out.println("No puede entrar");
        }else if (12 <= edad && edad <= 17) {
            System.out.println("puede entrar pero necesita un adulto");
        }else if (edad >= 18) {
            System.out.println("puede entrar");
        }

        //6
        System.out.print("color del semaforo");
        sc.nextLine();
        String semaforo = sc.nextLine();
        //System.out.println(semaforo);
        if (semaforo.equals("verde")){
            System.out.println("avanza");
        }else if (semaforo.equals("amarillo")) {
            System.out.println("precaucion");
        }else if (semaforo.equals("rojo")) {
            System.out.println("detente");
        }

        //7
        System.out.print("Ingresa un numero");
        //sc.nextLine();
        int numero = sc.nextInt();
        //System.out.println(numero);
        if (numero == 20) {
            System.out.println("El numero es correcto");
        }else if (numero < 19) {
            System.out.println("El numero es mas alto");
        } else if (numero >= 21 ) {
            System.out.println("El numero es mas bajo");
        }

        //8
        System.out.println("Ingresa palabra");
        sc.nextLine();
        String palabra1 = sc.nextLine();
        System.out.println("Ingresa palabra");
        //sc.nextLine();
        String palabra2 = sc.nextLine();
        if (palabra1.equals(palabra2)) {
            System.out.println("Las palabras coinciden");
        }else {
            System.out.println("No coiciden");
        }

        //9
        // Pedir los 3 votos
        System.out.print("Ingresa el primer voto (A, B o C): ");
        String a = sc.nextLine().toUpperCase();

        System.out.print("Ingresa el segundo voto (A, B o C): ");
        String b = sc.nextLine().toUpperCase();

        System.out.print("Ingresa el tercer voto (A, B o C): ");
        String c = sc.nextLine().toUpperCase();

        // Contadores
        int votosA = 0, votosB = 0, votosC = 0;

        // Sumar votos
        if (a.equals("A")) votosA++;
        else if (a.equals("B")) votosB++;
        else if (a.equals("C")) votosC++;

        if (b.equals("A")) votosA++;
        else if (b.equals("B")) votosB++;
        else if (b.equals("C")) votosC++;

        if (c.equals("A")) votosA++;
        else if (c.equals("B")) votosB++;
        else if (c.equals("C")) votosC++;

        // Determinar ganador
        if (votosA > votosB && votosA > votosC) {
            System.out.println("Ganó A con " + votosA + " votos.");
        } else if (votosB > votosA && votosB > votosC) {
            System.out.println("Ganó B con " + votosB + " votos.");
        } else if (votosC > votosA && votosC > votosB) {
            System.out.println("Ganó C con " + votosC + " votos.");
        } else {
            System.out.println("Hay empate.");
        }


        fdgffgdf
    }

    }

