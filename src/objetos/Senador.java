package objetos;
import javax.swing.JOptionPane;

public  final class Senador extends Candidato{
	private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
		if(numero<333 || numero>999)
		{
			this.numero = 0;
			JOptionPane.showMessageDialog(null, "Numero invalido, digite novamente.");
		}
	}

	public Senador() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
