package controllers;

import models.Person;

public class BurbujaMejorado {

    private Person[] persona;
    boolean cambio;

    public BurbujaMejorado(Person[] personas){
        this.persona = personas;
    }

    public Person[] ordenarPersonaBurbuja() {
        boolean cambio;

        for (int i = 0; i < persona.length - 1; i++) {
            cambio = false;

            for (int j = 0; j < persona.length - i - 1; j++) {
                if (persona[j].getEdad() > persona[j + 1].getEdad()) {
                    Person temp = persona[j];
                    persona[j] = persona[j + 1];
                    persona[j + 1] = temp;
                    cambio = true;
                }
            }

            if (!cambio) break;
        }

        return persona;
    }

}
    
