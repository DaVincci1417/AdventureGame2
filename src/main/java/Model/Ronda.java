package Model;

import java.util.ArrayList;

public class Ronda{
    private Jugador jugador;
    private Personaje enemigo;
    private String resultado;

    public  Ronda(String tipoEnemigo,  String resultado){
        setJugador(new Jugador());
        switch (tipoEnemigo){
            case "Esqueleto":
                setEnemigo(new Esqueleto());
                break;
            case "Zombie":
                setEnemigo(new Zombie());
                break;
            case "Dragon":
                setEnemigo(new Dragon());
                break;
            default:System.out.println("Ingrese un tipo de enemigo valido");
        }
        setResultado(resultado);
    }

    public Jugador getJugador() {
        return jugador;
    }
    private void setJugador(Jugador jugador) {
        if(jugador.getTipo().equalsIgnoreCase("Jugador")){
            this.jugador = jugador;
        }else{
            System.out.println("Ingrese un personaje valido");
        }
    }
    public Personaje getEnemigo() {
        return enemigo;
    }
    private void setEnemigo(Personaje enemigo) {
        if(enemigo.getTipo().equalsIgnoreCase("Enemigo")){
            this.enemigo = enemigo;
        }else{
            System.out.println("Ingrese un personaje valido");
        }
    }
    public String getResultado() {
        return resultado;
    }
    private void setResultado(String resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "Ronda{" +
                "jugador=" + jugador +
                ", enemigo=" + enemigo +
                ", resultado='" + resultado + '\'' +
                '}';
    }
}
