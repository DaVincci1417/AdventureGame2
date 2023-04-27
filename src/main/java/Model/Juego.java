package Model;

import GestorArchivos.GestorDatos;

import java.util.*;

public class Juego {

	//Atributte
	private Jugador jugador;
	private ArrayList<Personaje> enemigos = new ArrayList<>();
	private ArrayList<Ronda> rondas = new ArrayList<>();

	//Setter and Getter
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
	public ArrayList<Personaje> getEnemigos() {
		return enemigos;
	}
	private void setEnemigos(ArrayList<Personaje> enemigos) {
		this.enemigos = enemigos;
	}
	public ArrayList<Ronda> getRondas() {
		return rondas;
	}
	private void setRondas(ArrayList<Ronda> rondas) {
		this.rondas = rondas;
	}

	//Operation
	public void agregarEnemigo(Personaje enemigo) {
		if(enemigo.getTipo().equalsIgnoreCase("Enemigo")){
			enemigos.add(enemigo);
		}else{
			System.out.println("Ingrese un personaje valido");
		}
	}
	public void agregarJugador(Jugador jugador) {
		if(jugador.getTipo().equalsIgnoreCase("Jugador")){
			setJugador(jugador);
		}else{
			System.out.println("Ingrese un personaje valido");
		}
	}
	public void enfrentamientos(){
		GestorDatos gestorDatos = new GestorDatos();
		Random aleatorio = new Random();
		for(int i = 0; i < enemigos.size(); i++){
			if(aleatorio.nextInt() < 0.7){
				gestorDatos.registrarRonda(new Ronda(enemigos.get(i).getTipoEspecifico(), "El jugador ha vencido al " + enemigos.get(i).getTipoEspecifico() + "."));
			}
			else{
				gestorDatos.registrarRonda(new Ronda(enemigos.get(i).getTipoEspecifico(), "El jugador ha sido vencido por el " + enemigos.get(i).getTipoEspecifico() + "."));
			}
		}
	}
}