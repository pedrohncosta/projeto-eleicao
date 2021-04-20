package objetos;
import javax.swing.JOptionPane;

public final class DeputadorFederal extends Candidato{
	private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
		if (numero< 1000 || numero >4500)
		{
			this.numero = 0;
			JOptionPane.showMessageDialog(null, "Numero invalido");
		}
	}

	public DeputadorFederal() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
