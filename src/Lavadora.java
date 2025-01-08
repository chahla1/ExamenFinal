//Creamos la clase Lavadora

class Lavadora extends Electrodomesticos{
    //Añadimos los atributos de la lavadora
    private int capDeCarga;
    private int revPorMinuto;

    //Creamos el constructor
    public Lavadora(String Marca, String Modelo, int numDeProgramas, int capDeCarga, int revPorMinuto){
        super(Marca, Modelo,numDeProgramas);
        this.capDeCarga= capDeCarga;
        this.revPorMinuto = revPorMinuto;
    }

    //Creamos los getters y setters
    public int getCapDeCarga(){
        return capDeCarga;
    }
    public void setCapDeCarga(int capDeCarga){
        this.capDeCarga= capDeCarga;
    }
    public int getRevPorMinuto(){
        return revPorMinuto;
    }
    public void setRevPorMinuto(int revPorMinuto){
        this.revPorMinuto = revPorMinuto;
    }

    //Aqui inicializamos el metodo imprimir
    @Override
    public void imprimir() {
        System.out.println("Lavadora: " + getMarca() + " " + getModelo() + ", Programas: " + getNumDeProgramas() +
                ", Carga: " + capDeCarga + " kg: " + revPorMinuto);
    }
}
