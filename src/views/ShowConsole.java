package views;
import java.util.Scanner;
import models.Person;

public class ShowConsole{
    Scanner scanner = new Scanner(System.in);    


    private int tamano;

   public int tamañoArreglo(){
     System.out.println("Ingrese cantidad de Personas del listado: ");
     tamano = scanner.nextInt();
     return tamano;
   }

   public Person ingresarPersona(){
        scanner.nextLine();
        System.out.println("Ingrese Persona:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        int edad;

        do {
            System.out.print("Edad: ");
            edad = scanner.nextInt();
            if (edad < 0) {
                System.out.println("Edad no puede ser negativa");
            }
        } while (edad < 0);

        return new Person(nombre, edad);
    }

    public int buscarEdad() {
        System.out.print("Edad a buscar: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); 
        return edad;
    }
    

   public void showMessage(String message){
        System.out.println(message);
   }

    

}