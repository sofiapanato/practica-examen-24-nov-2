public class MonitorSignosVitales extends EquipoMedico {
    private int numParametros;

    public MonitorSignosVitales(String serial, String salaUbi, int numParametros) {
        super(serial, salaUbi);
        if (numParametros <= 0) {
            System.out.println("Advertencia: Numero de parametros invalido. Cantidad minima: 1");
            this.numParametros = 1;
        } else {
            this.numParametros = numParametros;
        }
    }
    @Override
    public void emitirAlertaCritica() {
        if (!operativo) {
            System.out.println("Equipo " + serial + " fuera de servicio.");
            return;
        }
        System.out.println("Arritmia o alteracion en los parametros monitoreados (SpO2, ECG, NIBP): " + numParametros);
    } 

    @Override
    public double calcularConsumoDiarioKWh() {
        if (operativo==false) {
            return 0.0;
        }
        return 1.2 +(numParametros * 0.4);
    }
}
