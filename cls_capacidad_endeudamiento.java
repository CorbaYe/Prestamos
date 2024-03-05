public class cls_capacidad_endeudamiento {
    private cls_cliente cliente;
    private float CAPACIDAD_ENDEUDAMIENTO = 0.6F;
    private float valor_capacidad_endeudamiento;
    private float monto_prestamo;
    private int plazo_meses;
    private float cuota;
    private String estado_prestamo;

    public cls_capacidad_endeudamiento(cls_cliente cliente, float monto_prestamo, int plazo_meses) {
        cls_capacidad_endeudamiento_util capacidad_endeudamiento_util = new cls_capacidad_endeudamiento_util(valor_capacidad_endeudamiento);
        this.cliente = cliente;
        this.monto_prestamo = monto_prestamo;
        this.plazo_meses = plazo_meses;
        this.valor_capacidad_endeudamiento = cliente.getSalario() * CAPACIDAD_ENDEUDAMIENTO;
        this.cuota = capacidad_endeudamiento_util.getCuota();
        this.estado_prestamo = capacidad_endeudamiento_util.getEstado_prestamo();
    }

    public cls_cliente getCliente() {
        return cliente;
    }

    public void setCliente(cls_cliente cliente) {
        this.cliente = cliente;
    }

    public float getCAPACIDAD_ENDEUDAMIENTO() {
        return CAPACIDAD_ENDEUDAMIENTO;
    }

    public void setCAPACIDAD_ENDEUDAMIENTO(float cAPACIDAD_ENDEUDAMIENTO) {
        CAPACIDAD_ENDEUDAMIENTO = cAPACIDAD_ENDEUDAMIENTO;
    }

    public float getValor_capacidad_endeudamiento() {
        return valor_capacidad_endeudamiento;
    }

    public void setValor_capacidad_endeudamiento(float valor_capacidad_endeudamiento) {
        this.valor_capacidad_endeudamiento = valor_capacidad_endeudamiento;
    }

    public float getMonto_prestamo() {
        return monto_prestamo;
    }

    public void setMonto_prestamo(float monto_prestamo) {
        this.monto_prestamo = monto_prestamo;
    }

    public int getPlazo_meses() {
        return plazo_meses;
    }

    public void setPlazo_meses(int plazo_meses) {
        this.plazo_meses = plazo_meses;
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
