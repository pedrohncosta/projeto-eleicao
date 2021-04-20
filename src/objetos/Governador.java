package objetos;
import javax.swing.JOptionPane;

public  final class Governador extends Candidato{
	private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
		if(numero<33 || numero>99)
		{
			this.numero = 0;
			JOptionPane.showMessageDialog(null, "Numero invalido, digite novamente.");
		}
	}

	public Governador() {
		super();
		// TODO Auto-generated constructor stub
	}
}
