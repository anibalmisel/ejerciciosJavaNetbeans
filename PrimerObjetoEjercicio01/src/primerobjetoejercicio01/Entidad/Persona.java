package primerobjetoejercicio01.Entidad;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author aniba
 */
public class Persona {

    // atributos: El estado de un objeto es una lista de variables conocidas como sus atributos, cuyos
    //valores representan el estado que caracteriza al objeto
    private String nombre;
    private String apellido;
    private String sexo;
    private String dni;
    private Date fechaNacimiento;
    private String direccion;
    private String status;//Candidato, Paciente, Odontologo
    private String correo;
    private String telefono;
    private int edad;
    private Date fechaActual;

    // constructores
    public Persona() {
    }

    public Persona(String nombre, String apellido, String sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
    }

    public Persona(String nombre, String apellido, String sexo, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
    }

    public Persona(String nombre, String apellido, String sexo, String dni, Date fechaNacimiento, String direccion, String status, String correo, String telefono, int edad, Date fechaActual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.status = status;
        this.correo = correo;
        this.telefono = telefono;
        this.edad = edad;
        this.fechaActual = fechaActual;
    }

    // métodos propios
    // Para acceder a los atributos de un objeto se definen los métodos get y set
    public String getNombre() {//métodos get consultar el estado de un objeto
        return nombre;
    }

    public void setNombre(String nombre) {//métodos set para modificar su estado
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }
//dejare que la edad sea calculada por la fecha de nacimiento.

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Aqui, construimos las funciones
    public int calculoEdad(Date fechaNacimiento) {
        fechaActual = new Date();
        edad = (int) ((fechaActual.getTime() - fechaNacimiento.getTime()) / 31536000000L);
        return edad;
    }

    public int calculoEdad(String fechaString) {
        SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date fecha = formateador.parse(fechaString);
            fechaActual = new Date();
            edad = (int) ((fechaActual.getTime() - fecha.getTime()) / 31536000000L);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", dni=" + dni + ", fechaNacimiento=" + fechaNacimiento + ", direccion=" + direccion + ", status=" + status + ", correo=" + correo + ", telefono=" + telefono + ", edad=" + edad + ", fechaActual=" + fechaActual + '}';
    }

}
