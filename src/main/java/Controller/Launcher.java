package Controller;

import Model.*;

public class Launcher {
    public static void inicializar(){
        Juego juego = new Juego();
        Jugador jugador = new Jugador();
        Esqueleto esqueleto = new Esqueleto();
        Dragon dragon = new Dragon();
        Zombie zombie = new Zombie();
        juego.agregarJugador(jugador);
        juego.agregarEnemigo(esqueleto);
        juego.agregarEnemigo(dragon);
        juego.agregarEnemigo(zombie);
        juego.enfrentamientos();
    }

    public static void main(String[] args) {
        inicializar();
    }
}
