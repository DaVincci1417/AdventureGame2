package Model;
public class Zombie extends Personaje {

	private String ataqueEspecial;

	public Zombie() {
		super("50", "500");
		setAtaqueEspecial("¡¡cerebro!!");
	}

	public String getTipoEspecifico(){
		return "Zombie";
	}
	public String getTipo() {
		return "Enemigo";
	}

	public String getAtaqueEspecial() {
		return ataqueEspecial;
	}
	private void setAtaqueEspecial(String ataqueEspecial) {
		this.ataqueEspecial = ataqueEspecial;
	}

	@Override
	public String toString() {
		return "Zombie{" +
				"ataqueEspecial='" + ataqueEspecial + '\'' +
				", fuerza='" + fuerza + '\'' +
				", vida='" + vida + '\'' +
				'}';
	}
}