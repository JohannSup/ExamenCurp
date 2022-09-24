package servicios;

import java.util.ArrayList;

public class BeanPerson extends ArrayList<String> {

    private String nombre;

    private String primer_Apellido;

    private String segundo_Apellido;

    private String sexo;

    private String estado_Nacimiento;

    private String fecha_Nacimiento;

    private String curp;

    public BeanPerson() {
    }

    public BeanPerson(String nombre, String primer_Apellido, String segundo_Apellido, String sexo, String estado_Nacimiento, String fecha_Nacimiento,String curp) {
        this.nombre = nombre;
        this.primer_Apellido = primer_Apellido;
        this.segundo_Apellido = segundo_Apellido;
        this.sexo = sexo;
        this.estado_Nacimiento = estado_Nacimiento;
        this.fecha_Nacimiento = fecha_Nacimiento;
        this.curp= curp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimer_Apellido() {
        return primer_Apellido;
    }

    public void setPrimer_Apellido(String primer_Apellido) {
        this.primer_Apellido = primer_Apellido;
    }

    public String getSegundo_Apellido() {
        return segundo_Apellido;
    }

    public void setSegundo_Apellido(String segundo_Apellido) {
        this.segundo_Apellido = segundo_Apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado_Nacimiento() {
        return estado_Nacimiento;
    }

    public void setEstado_Nacimiento(String estado_Nacimiento) {
        this.estado_Nacimiento = estado_Nacimiento;
    }

    public String getFecha_Nacimiento() {
        return fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(String fecha_Nacimiento) {
        this.fecha_Nacimiento = fecha_Nacimiento;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }
}
