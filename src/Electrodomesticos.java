//Creamos la clase Electrodomesticos

public abstract class Electrodomesticos {
    private String Marca;
    private String Modelo;
    private int numDeProgramas;

    public Electrodomesticos(String Marca, String Modelo, int numDeProgramas){
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.numDeProgramas = numDeProgramas;

    }

    //Ahora creamos los getters
    public String getMarca(){
        return Marca;
    }
    public String getModelo(){
        return Modelo;
    }
    public int getNumDeProgramas(){
        return numDeProgramas;
    }
    // Y ahora creamos los setters
    public void setMarca(String marca) {
        this.Marca = Marca;
    }
    public void setModelo(String Modelo){
        this.Modelo = Modelo;
    }
    public void setNumDeProgramas(int numDeProgramas){
        this.numDeProgramas= numDeProgramas;

    }

    // Aqui creamos el metodo que funciona para la impresion
    public abstract void imprimir();

}
