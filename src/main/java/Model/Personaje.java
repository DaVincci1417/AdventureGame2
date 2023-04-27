package Model;
public abstract class Personaje{

	protected String fuerza;
	protected String vida;

	public Personaje(String fuerza, String vida) {
		setFuerza(fuerza);
		setVida(vida);
	}

	public abstract String getTipoEspecifico();
	public abstract String getTipo();

	//Getters
	public String getFuerza() {
		return this.fuerza;
	}
	public String getVida() {
		return this.vida;
	}

	//Setters
	private void setFuerza(String fuerza) {
		this.fuerza = fuerza;
	}
	private void setVida(String vida) {
		this.vida = vida;
	}

}