public class Main {
    public static void main(String[] args) {
        Trabajador trabajador= new Trabajador();
        trabajador.edad = 35;
        trabajador.nombre = "Javier";
        trabajador.telefono = 3415;

        System.out.println(trabajador.edad);
        System.out.println(trabajador.nombre);
        System.out.println(trabajador.telefono);
    }
}

 class Persona {
        int edad;
        String nombre;
        int telefono;
    }
class Cliente extends Persona {
    String credito;
}

class  Trabajador extends Persona {
    String salario;
}
