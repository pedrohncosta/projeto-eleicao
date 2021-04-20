package objetos;
import javax.swing.JOptionPane;

public  final class DeputadoEstadual extends Candidato{
	private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
		if (numero< 10000 || numero >45003)
		{
			this.numero = 0;
			JOptionPane.showMessageDialog(null, "Numero invalido");
		}
	}

	public DeputadoEstadual() {
	
	}



}
