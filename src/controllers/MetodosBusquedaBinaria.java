package controllers;

import models.Person;


public class MetodosBusquedaBinaria {
    private Person[] persona;

    public MetodosBusquedaBinaria(Person[] persona){
        this.persona = persona;
    }


    public String buscarbinaria(Person[] persona, int edad){
        int bajo = 0;
        int alto = persona.length -1;
        
        while (bajo <= alto) { 

            int medio = (alto + bajo) / 2;
            int valorCentro = persona[medio].getEdad();

            for (int i = bajo; i <= alto; i++) {
                System.out.print(persona[i].getEdad() + " | ");
            }
            System.out.println();

            System.out.print("bajo=" + bajo);
            System.out.print("  alto=" + alto);
            System.out.print("  centro=" + medio);
            System.out.print("  valorCentro=" + valorCentro);

            if (valorCentro == edad) {
                System.out.println("  --> ENCONTRADO");
                return "\nLa persona con edad " + edad + " es " + persona[medio].getNombre();
            }else if(valorCentro < edad){
                System.out.println("  --> DERECHA");
                bajo = medio +1;
            }else{
                System.out.println("  --> IZQUIERDA");
                alto = medio -1;
            }

        }

        

        return "\nNo se encontró a ninguna persona con la edad " + edad;
    }
}
