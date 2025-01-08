//Aqui creamos la clase Lavavajillas
class Lavavajillas extends Electrodomesticos {
    //Creamos el atributo de numero de servicios
    private int numDeServicios;

    //Inicializamos el constructor
    public Lavavajillas(String Marca, String Modelo, int numDeProgramas,int numDeServicios) {
        super(Marca, Modelo, numDeProgramas);
        this.numDeServicios = numDeServicios;
    }

    //Creamos los getters y los setters
    public int getNumDeServicios(){
        return numDeServicios;
    }
    public void setNumDeServicios(int numDeServicios){
        this.numDeServicios = numDeServicios;
    }


    @Override
    public void imprimir() {
        System.out.println("Lavavajillas: " + getMarca() + " " + getModelo() + ", Programas: " + getNumDeProgramas() +
                ", Servicios: " + numDeServicios);
    }

}