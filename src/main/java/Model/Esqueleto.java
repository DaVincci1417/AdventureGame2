package Model;
public class Esqueleto extends Personaje {

	private String ataqueEspecial;

	public Esqueleto() {
		super("100", "1000");
		setAtaqueEspecial("flechazo al hueso");
	}

	public String getTipoEspecifico(){
		return "Esqueleto";
	}
	@Override
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
		return "Esqueleto{" +
				"ataqueEspecial='" + ataqueEspecial + '\'' +
				", fuerza='" + fuerza + '\'' +
				", vida='" + vida + '\'' +
				'}';
	}
}