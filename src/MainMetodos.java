public class MainMetodos {
    public static void main(String[] args) {
        System.out.println("Main para probar métodos y variables");
        String nombre = "Borja";
        saludar("Borja");
        saludar("Laura");

        //saludar de arriba es estático, para ejecutarlo todo tiene que ser estático, por eso luego tiene que ser public STATIC void
    }

    public static void saludar(String data){
        System.out.println("Enhorabuena " +data+" has llamado a tu primer método");
        // IMPORTANTE dejar espacios en la frase entre comillas para que no aparezca junto
    }
}
