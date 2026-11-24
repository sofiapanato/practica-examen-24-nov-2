public class MainMedicina {
    public static void main(String[] args) {
        
        EquipoMedico[] equipos = new EquipoMedico[2];

        equipos[0] = new VentiladorMecanico("VM-101", "UCI-Cama01", 12.0);
        equipos[1] = new MonitorSignosVitales("MSV-202", "UCI-Cama01", 5);

        System.out.println("----Estado inicial de equipos----");
        for (int i = 0; i < equipos.length; i++) {
            equipos[i].mostrarDatos();
            equipos[i].emitirAlertaCritica();
            System.out.println("Consumo diario: " + equipos[i].calcularConsumoDiarioKWh() + " KWh.");
        }

        System.out.println("-------- Desactivacion equipo 1 -----------");
        equipos[0].setOperativo(false);

        for (int i = 0; i < equipos.length; i++) {
            equipos[i].mostrarDatos();
            equipos[i].emitirAlertaCritica();
            System.out.println("Consumo diario: " + equipos[i].calcularConsumoDiarioKWh() + " KWh.");
        }
    }
}
