public class Main {
    public static void main(String[] args) {
        // Creamos los objetos Lavadora
        Lavadora lavadora1 = new Lavadora("Balay", "BL204", 5, 7, 1200);
        Lavadora lavadora2 = new Lavadora("AEG", "AL204", 9, 8, 1600);
        Lavadora lavadora3 = new Lavadora("Miele", "ML204", 5, 6, 1500);

        // Creamos los objetos del Lavavajillas
        Lavavajillas lavavajillas1 = new Lavavajillas("Balay", "BV408", 8, 16);
        Lavavajillas lavavajillas2 = new Lavavajillas("Samsung", "SV408", 10, 13);

        // Creamos la instancia de Logica
        Logica logica = new Logica();

        // Añadimos las  lavadoras a la colección
        logica.anadirLavadora(lavadora1);
        logica.anadirLavadora(lavadora2);
        logica.anadirLavadora(lavadora3);

        // Añadimos los lavavajillas a la colección
        logica.anadirLavavajillas(lavavajillas1);
        logica.anadirLavavajillas(lavavajillas2);

        // Realizamos las consultas
        System.out.println("Consulta 1:");
        logica.buscarElectrodomestico("Balay", "", null, 7);

        System.out.println("Consulta 2:");
        logica.buscarElectrodomestico("Balay", "", null, null);

        System.out.println("Consulta 3:");
        logica.buscarElectrodomestico("", "", 7, 9);

    }
}