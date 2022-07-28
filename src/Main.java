public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(21,"Nicolas", 1134567876,50000);
        System.out.println(cliente1.getEdad());
        System.out.println(cliente1.getNombre());
        System.out.println(cliente1.getTelefono());
        System.out.println(cliente1.getCredito());

        Trabajador trabajador1 = new Trabajador(22,"Nicolass", 1134567876,530000);
        System.out.println(trabajador1.getEdad());
        System.out.println(trabajador1.getNombre());
        System.out.println(trabajador1.getTelefono());
        System.out.println(trabajador1.getSalario());
    }

    /*Crea una clase Persona con las siguientes variables:

    La edad

    El nombre

    El teléfono

    Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
    esta nueva clase tendrá la variable credito solo para esa clase.

    Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad,
    el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.

    Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona,
    y con una variable salario que solo tenga la clase Trabajador. */
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono (int telefono) {
        this.telefono = telefono;
    }

    public int getEdad(){
        return this.edad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getTelefono(){
        return this.telefono;
    }

}

class Cliente extends Persona{
    private int credito;

    public Cliente(int edad, String nombre, int telefono, int credito){
        this.setEdad(edad);
        this.setNombre(nombre);
        this.setTelefono(telefono);
        this.setCredito(credito);

    }
    public void setCredito(int credito){
        this.credito = credito;
    }
    public int getCredito(){
        return this.credito;
    }
}

class Trabajador extends Persona{
    private int salario;

    public Trabajador(int edad, String nombre, int telefono, int salario){
        this.setEdad(edad);
        this.setNombre(nombre);
        this.setTelefono(telefono);
        this.setSalario(salario);

    }

    public void setSalario(int salario){
        this.salario = salario;
    }
    public int getSalario(){
        return this.salario;
    }
}