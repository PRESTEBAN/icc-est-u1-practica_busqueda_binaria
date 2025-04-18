
import controllers.BurbujaMejorado;
import controllers.MetodosBusquedaBinaria;
import models.Person;
import views.ShowConsole;

public class App {
    public static void main(String[] args) throws Exception {

        ShowConsole sc = new ShowConsole();
        int edad = 0;
        
        Person[] personas = new Person[sc.tamañoArreglo()];
        
        for (int i = 0; i < personas.length; i++) {
            personas[i] = sc.ingresarPersona();    
        }

        BurbujaMejorado bM = new BurbujaMejorado(personas);
        bM.ordenarPersonaBurbuja();
        sc.showMessage("Valor la personada de la edad:");
        int edadBuscada = sc.buscarEdad();
        MetodosBusquedaBinaria mBb = new MetodosBusquedaBinaria(personas);
        String resultado = mBb.buscarbinaria(personas, edadBuscada);
        sc.showMessage(resultado);

    }
}
