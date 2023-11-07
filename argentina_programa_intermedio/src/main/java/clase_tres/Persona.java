package clase_tres;

public class Persona {

    private String nombre;
    private String apellido;
    private char sexo;

    private boolean licenciaConducir;

    public Persona(String nombre, String apellido, char sexo, boolean licenciaConducir) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.licenciaConducir = licenciaConducir;
    }

    public boolean isLicenciaConducir() {
        return licenciaConducir;
    }

    public void setLicenciaConducir(boolean licenciaConducir) {
        this.licenciaConducir = licenciaConducir;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
