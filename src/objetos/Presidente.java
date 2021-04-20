package objetos;
import javax.swing.JOptionPane;

public final class Presidente extends Candidato{
	private int numero;

	public  int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		
		if(numero<33 || numero>99)
		{
			this.numero = 0;
			JOptionPane.showMessageDialog(null, "Numero invalido, digite novamente.");
			return;
		}
		this.numero = numero;
	}

	public Presidente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
