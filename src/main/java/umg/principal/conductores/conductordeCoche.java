package umg.principal.conductores;
import java.util.Scanner;

public class conductordeCoche extends Conductor{
    private int experienciaAnios;

    public conductordeCoche (String nombre, String licencia, int experienciaAnios) {
        super(nombre, licencia);
        this.experienciaAnios = experienciaAnios;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Años de experiencia: " + experienciaAnios);
    }
}


