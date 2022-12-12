import Models.Cliente;
import Models.Trabajador;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Neru", "FaintSmile",18,"333444555","Un monton");

        Trabajador trabajador1 = new Trabajador("Diovan", "FaintSmile",20,"333444555","Una banda");

        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println(mostrarDatosCliente(cliente1));
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println(mostrarDatosTrabajador(trabajador1));
        System.out.println("--------------------------------------------------------------------------------------------");



    }

    public static String mostrarDatosCliente(Cliente cliente){
        return "Mi nombre es " + cliente.getNombre() + " " + cliente.getApellido() +". Tengo " + cliente.getEdad() + " años de edad. Mi numero de telefono es: " + cliente.getNumTelefono() + ". Mi credito es: " + cliente.getCredito();
    }
    public static String mostrarDatosTrabajador(Trabajador trabajador){
        return "Mi nombre es " + trabajador.getNombre() + " " + trabajador.getApellido() +". Tengo " + trabajador.getEdad() + " años de edad. Mi numero de telefono es: " + trabajador.getNumTelefono() + ". Mi salario es: " + trabajador.getSalario();
    }
}
