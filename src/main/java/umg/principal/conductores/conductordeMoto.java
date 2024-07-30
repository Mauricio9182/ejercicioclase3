package umg.principal.conductores;

public class conductordeMoto extends Conductor {
    private boolean tieneLicenciaMoto;

    public conductordeMoto(String nombre, String licencia, boolean tieneLicenciaMoto) {
        super(nombre, licencia);
        this.tieneLicenciaMoto = tieneLicenciaMoto;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tiene licencia de moto: " + tieneLicenciaMoto);
    }
}
