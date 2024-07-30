package umg.principal;

import org.UMG.principal.Vehiculos.Coche;
import org.UMG.principal.Vehiculos.Moto;
import org.UMG.principal.Vehiculos.Vehiculo;
import umg.principal.conductores.Conductor;
import umg.principal.conductores.conductordeCoche;
import umg.principal.conductores.conductordeMoto;


public class Main {
public static void main(String[] args) {

    Conductor conductor = new Conductor("Pedro Gómez", "56789012");
    conductor.mostrarInformacion();


     conductordeCoche conductorcoche = new conductordeCoche("Juan Pérez", "12345678", 10);
    conductorcoche.mostrarInformacion();


    conductordeMoto conductormoto = new conductordeMoto("María López", "98765432", true);
    conductormoto.mostrarInformacion();

    // Crear una instancia de Vehiculo
    Vehiculo vehiculo = new Vehiculo("Toyota", "Corolla", 2020);
    System.out.println("Detalles del Vehículo:");
    vehiculo.mostrarDetalles();

    // Crear una instancia de Coche
    Coche coche = new Coche("Ford", "Mustang", 2021, 4, "V8");
    System.out.println("\nDetalles del Coche:");
    coche.mostrarDetalles();

    // Crear una instancia de Moto
    Moto moto = new Moto("Harley-Davidson", "Street 750", 2019, true);
    System.out.println("\nDetalles de la Moto:");
    moto.mostrarDetalles();

}
}