import java.util.ArrayList;
import java.util.Iterator;

public class ListaCartas {
    // -------------- Atributos --------------
    protected ArrayList<Carta> cartas;


    // -------------- Constructora --------------
    protected ListaCartas(){
        this.cartas = new ArrayList<Carta>();
    }


    // -------------- Metodos --------------
    private Iterator<Carta> getIterador(){
        return this.cartas.iterator();
    }


    public void agregarCarta(Carta pCarta){
        this.cartas.add(pCarta);
    }


    public int tamaño(){
        return this.cartas.size();
    }


    public Carta eliminarCarta(int pos){
        if (pos >= 0 && pos < this.tamaño()){
            return this.cartas.remove(pos);
        }
        return null;
    }


    public void resetear(){
        this.cartas.clear();
    }
}
