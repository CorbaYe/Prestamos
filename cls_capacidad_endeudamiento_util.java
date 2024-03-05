public class cls_capacidad_endeudamiento_util {
    private float cuota;
    private String estado_prestamo;
    private cls_cliente cliente;
    private cls_capacidad_endeudamiento capacidad_endeudamiento;

    public cls_capacidad_endeudamiento_util(float capacidad_endeudamiento){
        this.cuota = cliente.getSalario() / this.capacidad_endeudamiento.getPlazo_meses();
        if (this.cuota > capacidad_endeudamiento) {
            this.estado_prestamo = "Aprobado";
        }else{
            this.estado_prestamo = "Denegado";
        }
    }

    public float getCuota() {
        return cuota;
    }

    public void setCuota(float cuota) {
        this.cuota = cuota;
    }

    public String getEstado_prestamo() {
        return estado_prestamo;
    }

    public void setEstado_prestamo(String estado_prestamo) {
        this.estado_prestamo = estado_prestamo;
    }
    
}
