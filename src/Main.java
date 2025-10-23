public class Main {
    // El nombre de la clase la primera siempre en mayúscula
    // Esto es un comentario

    /*
    Si a un valor le ponemos 'final' delante no se puede modificar luego.
    */
    final static String DNI = "123123A";
    // TODO me falta esto

    static int edadGlobal = 12;

    public static void main(String[] args) {
        System.out.println("Esta es la segunda línea del programa\n");
        System.out.println("Este es mi primer programa en Java\n");

        // Creamos un objeto para poder llamar a los métodos no estáticos
        Main objeto = new Main();
        objeto.nombreMetodo1(edadGlobal);
    }

    public void nombreMetodo() {
        System.out.println("Has llamado a nombreMetodo()");
    }

    public void nombreMetodo1(int edadGlobal) {
        int edadMetodo = 123;
        System.out.println(edadMetodo);
        System.out.println(this.edadGlobal);
        // Para llamar a una variable definida fuera, se le pone this.
    }
}

