package Models;

public class Trabajador extends Persona{

    private String salario;


    public Trabajador(String nombre, String apellido, int edad, String numTelefono, String salario) {
        super(nombre, apellido, edad, numTelefono);
        this.salario = salario;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
}
