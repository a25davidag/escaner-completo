import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una temperatura");
        int temperatura = sc.nextInt();
        System.out.println(temperatura);

        if (temperatura < 0) {
            System.out.println(" Hace frio");
        } else if (temperatura > 30) {
            System.out.println(" Hace calor");
        } else {
            System.out.println(" Clima Templado");

        }

        //2
        System.out.print("Dectector de color");
        sc.nextLine();
        String color = sc.nextLine();
        System.out.println(color);
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
        System.out.println(velocidad);
        if (velocidad > 120) {
            System.out.println("Multa");
        } else if (0 < velocidad && velocidad <= 120) {
            System.out.println("Velocidad correcta:");
        }

        //4
        System.out.println("Ingresa un animal");
        sc.nextLine();
        String animal = sc.nextLine();
        System.out.println(animal);
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
        System.out.println(edad);
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
        System.out.println(semaforo);
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
        System.out.println(numero);
        if (numero == 20) {
            System.out.println("El numero es correcto");
        }else if (numero < 19) {
            System.out.println("El numero es mas alto");
        } else if (numero >= 21 ) {
            System.out.println("El numero es mas bajo");
        }

        //8

    }
    }

