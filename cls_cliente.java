public class cls_cliente {
    private String id;
    private String nombre;
    private String contacto;
    private String sexo;
    private float salario;

    public cls_cliente(String id, String nombre, String contacto, String sexo, float salario) {
        this.id = id;
        this.nombre = nombre;
        this.contacto = contacto;
        this.sexo = sexo;
        this.salario = salario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    
}