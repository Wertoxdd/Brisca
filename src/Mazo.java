import java.util.ArrayList;
import java.util.Random;

public class Mazo extends ListaCartas {
    // -------------- Atributos --------------
    private static Mazo miMazo = null;


    // -------------- Constructora --------------
    private Mazo(){
        super();
    }


    // -------------- Singleton --------------
    private static Mazo getMazo() {
        if (miMazo == null){
            miMazo = new Mazo();
        }
        return miMazo;
    }


    // -------------- Metodos --------------
    private void generarMazo(){
        int i;

        i = 1;
        while (i <= 10){
            this.agregarCarta(new Carta(Palo.OROS, i));
        }

        i = 1;
        while (i <= 10){
            this.agregarCarta(new Carta(Palo.BASTOS, i));
        }

        i = 1;
        while (i <= 10){
            this.agregarCarta(new Carta(Palo.ESPADAS, i));
        }

        i = 1;
        while (i <= 10){
            this.agregarCarta(new Carta(Palo.COPAS, i));
        }
    }


    private void barajarMazo(){
        Random random = new Random();
        ArrayList<Carta> aux = new ArrayList<Carta>();

        for (int i = 0; i < this.tamaño(); i++){
            aux.add(this.eliminarCarta(0));
        }

        while (!aux.isEmpty()){
            int r = random.nextInt(aux.size());
            this.agregarCarta(aux.remove(r));
        }
    }


    public Carta darCarta(){
        return this.eliminarCarta(this.tamaño() - 1);
    }


    public boolean estaVacio(){
        return this.tamaño() == 0;
    }


    //TODO metodo resetear mazo
}
