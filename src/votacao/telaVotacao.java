package votacao;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

import objetos.*;
import cadastrarCandidato.*;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JPanel;

public class telaVotacao extends JFrame{
	Manipulador mani = new Manipulador();
	String aux="";
	Presidente auxPresi = new Presidente();
	Governador auxGov = new Governador();
	Senador auxSena = new Senador();
	DeputadorFederal auxDepFed = new DeputadorFederal();
	DeputadoEstadual auxDepEst = new DeputadoEstadual();
	static int cont=1;
	private JButton btnConfirmVotacao;
	private JTextField tFdnumVot;
	private JTextArea tAaexibirCandi;
	private JButton btnvotar;
	private JLabel lblVotando;
	private JPanel pnlfimdavot;
	private JButton btnContinueVot;
	private JButton btnexibirResul;
	private JPanel pnlresultado;
	private JButton btnSair;
	private JTextArea textArea;
	private JLabel lblNewLabel;
	
	
	public void contandoVotos()
	{
		String auxS="";
		for (Candidato candidato : telaCadastro.candidatos) {
			if(candidato.getClass()==auxPresi.getClass() && candidato.getNumvotos()>=auxPresi.getNumvotos())
			{
				auxPresi = (Presidente) candidato;
			}
			if(candidato.getClass()==auxGov.getClass() && candidato.getNumvotos()>=auxGov.getNumvotos())
			{
				auxGov = (Governador) candidato;
			}
			if(candidato.getClass()==auxSena.getClass() && candidato.getNumvotos()>=auxSena.getNumvotos())
			{
				auxSena = (Senador) candidato;
			}
			if(candidato.getClass()==auxDepFed.getClass() && candidato.getNumvotos()>=auxDepFed.getNumvotos())
			{
				auxDepFed = (DeputadorFederal) candidato;
			}
			if(candidato.getClass()==auxDepEst.getClass() && candidato.getNumvotos()>=auxDepEst.getNumvotos())
			{
				auxDepEst = (DeputadoEstadual) candidato;
			}
		}
		auxS ="Presidente eleito: "+auxPresi.getNome()+"\tvotos: "+auxPresi.getNumvotos()+"\nGovernador Eleito: "+auxGov.getNome()+"\tvotos: "+auxGov.getNumvotos()+"\nSenador Eleito: "+auxSena.getNome()+"\tVotos: "+auxSena.getNumvotos()+"\nDeputado Federal Eleito: "+auxDepFed.getNome()+"\tVotos: "+auxDepFed.getNumvotos()+"\nDeputado Estadual eleito: "+auxDepEst.getNome()+"\tVotos: "+auxDepEst.getNumvotos();
		textArea.setText(auxS);
	}
	public void votando()
	{
		int auxI = Integer.parseInt(aux);
		aux = tFdnumVot.getText();
		if(cont==2)
		{
			
			for (Candidato candidato : telaCadastro.candidatos) {
				
				
				if(candidato.getClass()==auxPresi.getClass() && auxI==candidato.getNumero())
				{
					candidato.implementaVoto();
					
					break;
				}
			}
		}
		if(cont==3)
		{
			for (Candidato candidato : telaCadastro.candidatos) {
				if(candidato.getClass()==auxGov.getClass()&& auxI==candidato.getNumero())
				{
					candidato.implementaVoto();
					break;
				}
			}
		}
		if(cont==4)
		{
			for (Candidato candidato : telaCadastro.candidatos) {
				if(candidato.getClass()==auxSena.getClass()&& auxI==candidato.getNumero())
				{
					candidato.implementaVoto();
					break;
				}
			}
		}
		if(cont==5)
		{
			for (Candidato candidato : telaCadastro.candidatos) {
				if(candidato.getClass()==auxDepFed.getClass()&& auxI==candidato.getNumero())
				{
					candidato.implementaVoto();
					break;
				}
			}
		}
		if(cont==6)
		{
			for (Candidato candidato : telaCadastro.candidatos) {
				if(candidato.getClass()==auxDepEst.getClass()&& auxI==candidato.getNumero())
				{
					candidato.implementaVoto();
					break;
				}
			}
		}
	}
	
	public void search()
	{

		aux = tFdnumVot.getText();
		String help="";
		int auxI = Integer.parseInt(aux);

			if(cont==1)
			{
			for (Candidato candidato : telaCadastro.candidatos) {
				if(candidato.getClass()==auxPresi.getClass()&& auxI==candidato.getNumero())
				{
					help = "Nome: "+candidato.getNome()+"\nPartido: "+candidato.getPartido()+"\nNumero: "+candidato.getNumero();
					tAaexibirCandi.setText(help);
					break;
				}
				
			}
			}
		if(cont==2)
		{
			for (Candidato candidato : telaCadastro.candidatos) {
				if(candidato.getClass()==auxGov.getClass()&& auxI==candidato.getNumero())
				{
					help = "Nome: "+candidato.getNome()+"\nPartido: "+candidato.getPartido()+"\nNumero: "+candidato.getNumero();
					tAaexibirCandi.setText(help);
					break;
				}
			}
		}
		if(cont==3)
		{
			for (Candidato candidato : telaCadastro.candidatos) {
				if(candidato.getClass()==auxSena.getClass()&& auxI==candidato.getNumero())
				{
					help = "Nome: "+candidato.getNome()+"\nPartido: "+candidato.getPartido()+"\nNumero: "+candidato.getNumero();
					tAaexibirCandi.setText(help);
					break;
				}
			}
		}
		if(cont==4)
		{
			for (Candidato candidato : telaCadastro.candidatos) {
				if(candidato.getClass()==auxDepFed.getClass()&& auxI==candidato.getNumero())
				{
					JOptionPane.showMessageDialog(null, "Foi");
					help = "Nome: "+candidato.getNome()+"\nPartido: "+candidato.getPartido()+"\nNumero: "+candidato.getNumero();
					tAaexibirCandi.setText(help);
					break;
				}
			}
		}
		if(cont==5)
		{
			for (Candidato candidato : telaCadastro.candidatos) {
				if(candidato.getClass()==auxDepEst.getClass()&& auxI==candidato.getNumero())
				{
					help = "Nome: "+candidato.getNome()+"\nPartido: "+candidato.getPartido()+"\nNumero: "+candidato.getNumero();
					tAaexibirCandi.setText(help);
					break;
				}
			}
		}
	}
	
	public void mudarNome()
	{
		int control=-1;
		while(control==-1)
		{
			if(cont==0)
			{
				lblVotando.setText("Presidente");
				cont++;
				break;
			}
			else if(cont ==1)
			{
				lblVotando.setText("Governador");
				cont++;
				break;
			}
			else if(cont==2)
			{
				lblVotando.setText("Senador");
				cont++;
				break;
			}
			else if(cont == 3)
			{
				lblVotando.setText("Deputado Federal");
				cont++;
				break;
			}
			else if(cont ==4)
			{
				lblVotando.setText("Deputado Estadual");
				cont++;
				break;
			}
			if(cont ==5)
			{
				lblVotando.setText("Presidente");
				cont++;
				control=1;
				break;
			}
		}
		
		
	}

	public void clearFields()
	{
		tFdnumVot.setText(null);
		tAaexibirCandi.setText(null);
	}
	
	public telaVotacao()
	{
		getContentPane().setLayout(null);
		
		btnConfirmVotacao = new JButton("Confirmar");
		btnConfirmVotacao.setBounds(109, 144, 124, 23);
		btnConfirmVotacao.addActionListener(mani);
		btnConfirmVotacao.setEnabled(false);
		getContentPane().add(btnConfirmVotacao);
		
		tFdnumVot = new JTextField();
		tFdnumVot.setBounds(201, 58, 86, 20);
		getContentPane().add(tFdnumVot);
		tFdnumVot.setColumns(10);
		
		lblNewLabel = new JLabel("Numero");
		lblNewLabel.setBounds(201, 33, 46, 14);
		getContentPane().add(lblNewLabel);
		
		lblVotando = new JLabel("Presidente");
		lblVotando.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblVotando.setBounds(35, 11, 289, 23);
		getContentPane().add(lblVotando);
		
		tAaexibirCandi = new JTextArea();
		tAaexibirCandi.setEditable(false);
		tAaexibirCandi.setBounds(10, 45, 153, 88);
		getContentPane().add(tAaexibirCandi);
		
		btnvotar = new JButton("Votar");
		btnvotar.setBounds(198, 91, 89, 23);
		btnvotar.addActionListener(mani);
		getContentPane().add(btnvotar);
		
		pnlfimdavot = new JPanel();
		pnlfimdavot.setBounds(0, 0, 334, 211);
		pnlfimdavot.setVisible(false);
		getContentPane().add(pnlfimdavot);
		pnlfimdavot.setLayout(null);
		
		btnContinueVot = new JButton("Continuar Votando");
		btnContinueVot.setBounds(45, 67, 233, 23);
		btnContinueVot.addActionListener(mani);
		pnlfimdavot.add(btnContinueVot);
		
		btnexibirResul = new JButton("Exibir Resultado");
		btnexibirResul.setBounds(45, 128, 233, 23);
		btnexibirResul.addActionListener(mani);
		pnlfimdavot.add(btnexibirResul);
		
		pnlresultado = new JPanel();
		pnlresultado.setBounds(0, 0, 334, 211);
		pnlresultado.setVisible(false);
		getContentPane().add(pnlresultado);
		pnlresultado.setLayout(null);
		
		btnSair = new JButton("Sair");
		btnSair.setBounds(77, 178, 173, 23);
		btnSair.addActionListener(mani);
		pnlresultado.add(btnSair);
		
		JLabel lblNewLabel_1 = new JLabel("Resultados");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(102, 11, 145, 25);
		pnlresultado.add(lblNewLabel_1);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(10, 40, 314, 127);
		pnlresultado.add(textArea);
		setBounds(0, 0, 350, 250);
		setVisible(true);
	}
	public class Manipulador implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==btnvotar)
			{
				btnConfirmVotacao.setEnabled(true);
				search();
				
			}
			if(e.getSource()==btnSair)
			{
				System.exit(0);
			}
			if(e.getSource()==btnexibirResul)
			{
				pnlfimdavot.setVisible(false);
				pnlresultado.setVisible(true);
				btnvotar.setVisible(false);
				btnConfirmVotacao.setVisible(false);
				tAaexibirCandi.setVisible(false);
				contandoVotos();
				
			}
			if(e.getSource()==btnConfirmVotacao)
			{
				mudarNome();
				votando();
				tFdnumVot.setText(null);
				btnConfirmVotacao.setEnabled(false);
				tAaexibirCandi.setText(null);
				if(cont==6)
				{
				pnlfimdavot.setVisible(true);
				lblVotando.setVisible(false);
				btnvotar.setVisible(false);
				btnConfirmVotacao.setVisible(false);
				tAaexibirCandi.setVisible(false);
				tFdnumVot.setVisible(false);
				lblNewLabel.setVisible(false);
				}
			}
			if(e.getSource()==btnContinueVot)
			{
				pnlfimdavot.setVisible(false);
				btnvotar.setVisible(true);
				btnConfirmVotacao.setVisible(true);
				tFdnumVot.setVisible(true);
				tAaexibirCandi.setVisible(true);
				lblVotando.setVisible(true);
				lblNewLabel.setVisible(false);
				cont=1;
			}
		}
		
	}
}
