public abstract class EquipoMedico {
    protected String serial;
    protected String salaUbi;
    protected boolean operativo;

    public EquipoMedico(String serial, String salaUbi /*, boolean operativo*/) {
        this.serial = serial;
        this.salaUbi = salaUbi;
        this.operativo = true;
    }

    public String getSerial() {
        return serial;
    }
    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getSalaUbi() {
        return salaUbi;
    }
    public void setSalaUbi(String salaUbi) {
        this.salaUbi = salaUbi;
    }

    public boolean isOperativo() {
        return operativo;
    }
    public void setOperativo(boolean operativo) {
        this.operativo = operativo;
    }

    public void mostrarDatos() {
        System.out.println("Serial: " + serial + ", Ubicacion: " + salaUbi + ", Equipo operativo: " + operativo);
    }
    public abstract void emitirAlertaCritica();
    public abstract double calcularConsumoDiarioKWh();

    

    
}