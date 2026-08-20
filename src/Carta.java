public class Carta {

    // -------------- Atributos --------------
    private Palo palo;
    private int valor;


    // -------------- Constructora --------------
    public Carta(Palo pPalo, int pValor){
        this.palo = pPalo;
        this.valor = pValor;
    }


    // -------------- Metodos --------------
    public Palo getPalo(){
        return this.palo;
    }


    public int getValor(){
        return this.valor;
    }


    @Override
    public String toString(){

        String val;

        if (this.valor == 1){
            val = "As" ;
        }
        else if (this.valor == 3){
            val = "Tres";
        }
        else if (this.valor == 10){
            val = "Sota";
        }
        else if (this.valor == 11){
            val = "Caballo";
        }
        else if (this.valor == 12){
            val = "Rey";
        }
        else{
            val = String.valueOf(this.valor);
        }
        return val + " de " + this.palo;
    }
}
