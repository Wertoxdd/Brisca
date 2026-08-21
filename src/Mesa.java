public class Mesa {
    // -------------- Atributos --------------
    private static Mesa miMesa = null;


    // -------------- Constructora --------------
    private Mesa(){
        Jugador j1 = new Jugador();
        Jugador j2 = new Jugador();

        j1.setPuntos(0);
        j2.setPuntos(0);
    }


    // -------------- Singleton --------------
    public static Mesa getMesa(){
        if (miMesa == null){
            miMesa = new Mesa();
        }
        return miMesa;
    }



    // -------------- Metodos --------------
    public void jugarPartida(){

    }
}
