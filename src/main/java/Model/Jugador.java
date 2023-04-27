package Model;
public class Jugador extends Personaje {

	private String ataqueEspecial;

	public Jugador() {
		super("125", "1000");
		setAtaqueEspecial("Pata' en el hocico");
	}

	@Override
	public String getTipoEspecifico() {
		return "Jugador";
	}
	public String getTipo() {
		return "Jugador";
	}

	public String getAtaqueEspecial() {
		return ataqueEspecial;
	}
	private void setAtaqueEspecial(String ataqueEspecial) {
		this.ataqueEspecial = ataqueEspecial;
	}

	@Override
	public String toString() {
		return "Jugador{" +
				"ataqueEspecial='" + ataqueEspecial + '\'' +
				", fuerza='" + fuerza + '\'' +
				", vida='" + vida + '\'' +
				'}';
	}
}