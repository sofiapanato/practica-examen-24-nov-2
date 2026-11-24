public class VentiladorMecanico extends EquipoMedico {
    private double presionPsi;

    public VentiladorMecanico(String serial, String salaUbi, double presionPsi) {
        super(serial, salaUbi);
        if (presionPsi <= 0) {
            System.out.println("Advertencia: Presion invalido. Valor minimo: 5.0");
            this.presionPsi = 5.0;
        } else {
            this.presionPsi = presionPsi;
        }  
    }
    @Override
    public void emitirAlertaCritica() {
        if (operativo==false) {
            System.out.println("Equipo " + serial + " fuera de servicio.");
            return;
        }
        System.out.println("Depresurizacion o alteracion en el flujo de oxigeno: " + presionPsi);

    }

    @Override
    public double calcularConsumoDiarioKWh() {
        if (!operativo) {
        return 0.0;
        } else {
        return 3.5 + (presionPsi * 0.2);
        }
    }
}
