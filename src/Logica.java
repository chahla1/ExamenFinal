import java.util.ArrayList;
import java.util.List;

//Aqui creamos la clase donde se implementa la logica del negocio
public class Logica {
    //Creamos una lista con  un array en donde se guarden los electrodomesticos
    private List<Electrodomesticos> electrodomesticos = new ArrayList<>();

    //Añadimos el metodo lavadora
    public static void anadirLavadora(Lavadora lavadora) {
        Electrodomesticos.add(lavadora);
    }

    //Añadimos el metodo lavavajillas
    public void anadirLavavajillas(Lavavajillas lavavajillas) {
        electrodomesticos.add(lavavajillas);
    }

    public void buscarElectrodomestico(String marca, String modelo, Integer programasDesde, Integer programasHasta) {
        for (Electrodomesticos e : electrodomesticos) {
            boolean coincide = (marca == null || marca.isEmpty() || e.getMarca().equalsIgnoreCase(marca)) &&
                    (modelo == null || modelo.isEmpty() || e.getModelo().equalsIgnoreCase(modelo)) &&
                    (programasDesde == null || e.getNumDeProgramas() >= programasDesde) &&
                    (programasHasta == null || e.getNumDeProgramas() <= programasHasta);
            if (coincide) {
                e.imprimir();
            }
        }
    }
}

