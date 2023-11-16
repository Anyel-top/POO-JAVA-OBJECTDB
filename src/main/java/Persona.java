import javax.persistence.*;
import java.time.LocalDate;


@Entity
public class Persona {

    @Id
    String identificador;
    String nombres;
    String apellidos;
    LocalDate FechaNacimiento;

    public Persona(String identificador, String nombres, String apellidos, LocalDate fechaNacimiento) {
        this.identificador = identificador;
        this.nombres = nombres;
        this.apellidos = apellidos;
        FechaNacimiento = fechaNacimiento;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "identificador='" + identificador + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", FechaNacimiento=" + FechaNacimiento +
                '}';
    }
}

