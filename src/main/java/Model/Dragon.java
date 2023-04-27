package Model;
public class Dragon extends Personaje {

	private String ataqueEspecial;


	public Dragon() {
		super("200", "1500");
		setAtaqueEspecial("Llamas del infierno");
	}

	public String getTipoEspecifico(){
		return "Dragon";
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
		return "Dragon{" +
				"ataqueEspecial='" + ataqueEspecial + '\'' +
				", fuerza='" + fuerza + '\'' +
				", vida='" + vida + '\'' +
				'}';
	}
}