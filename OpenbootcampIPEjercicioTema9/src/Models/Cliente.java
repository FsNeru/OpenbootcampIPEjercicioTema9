package Models;

public class Cliente extends Persona{

    private String credito;


    public Cliente(String nombre, String apellido, int edad, String numTelefono, String credito) {
        super(nombre, apellido, edad, numTelefono);
        this.credito = credito;
    }

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }
}
