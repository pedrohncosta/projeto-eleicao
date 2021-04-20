package cadastrarCandidato;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JTextField;

import objetos.Candidato;
import objetos.DeputadoEstadual;
import objetos.DeputadorFederal;
import objetos.Governador;
import objetos.Presidente;
import objetos.Senador;
import votacao.telaVotacao;

public class telaCadastro extends JFrame{
	public static List <Candidato> candidatos = new ArrayList<Candidato>();
	static Presidente auxPresi;
	Governador auxGov;
	Senador auxSena;
	DeputadorFederal auxDepFed;
	DeputadoEstadual auxDepEst;
	public static telaCadastro tela;
	public telaVotacao telaVot;
	Manipulador mani = new Manipulador();
	private JButton btnCadastrarPresidente;
	private JButton btnCadastrarGov;
	private JButton btnCadastrarSena;
	private JButton btnCadastrarDepFed;
	private JButton btnCadastrarDepEst;
	private JButton btnFinishCadastro;
	private JButton btnRetornar;
	private JTextField tFdnomePresi;
	private JTextField tFdpartidoPresi;
	private JTextField tFdnumeroPresi;
	private JButton btnConfirmCadPresi;
	private JTextField tFdnomeGov;
	private JTextField tfdpartGov;
	private JTextField tFdnumGov;
	private JButton btnConfirmCadGov;
	private JPanel pnlCadastroSena;
	private JTextField tFdnomeSena;
	private JTextField tFdpartiSena;
	private JTextField tFdnumSena;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JButton btnConfirmCadSena;
	private JPanel pnlCadastroDepFed;
	private JTextField tFdnomeDepFed;
	private JTextField tFdpartDepFed;
	private JTextField tFdnumDepFed;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JButton btnConfirmCadDepFed;
	private JPanel pnlCadastroDepEst;
	private JTextField tFdnomeDepEst;
	private JTextField tFdpartDepEst;
	private JTextField tFdnumDepEst;
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_18;
	private JLabel lblNewLabel_19;
	private JLabel lblNewLabel_20;
	private JButton btnConfirmCadDepEst;
	private JPanel pnlCadastrarPresidente;
	private JPanel pnlcadastroGov;

	public void cadPresi()
	{
		String aux ="";
		int auxI,maracutaia;
		auxPresi = new Presidente();

		aux = tFdnomePresi.getText();
		auxPresi.setNome(aux);
		aux = tFdpartidoPresi.getText();
		auxPresi.setPartido(aux);
		aux = tFdnumeroPresi.getText();
		auxI = Integer.parseInt(aux);
		auxPresi.setNumero(auxI);
		
		
		if(auxPresi.getNumero()!=0)
		{
			candidatos.add(auxPresi);
		}
		
	}
		
		
	
	public void cadGov()
	{
		String aux ="";
		int auxI;
		auxGov = new Governador();
		
		
		aux = tFdnomeGov.getText();
		auxGov.setNome(aux);
		aux = tfdpartGov.getText();
		auxGov.setPartido(aux);
		aux = tFdnumGov.getText();
		auxI = Integer.parseInt(aux);
		auxGov.setNumero(auxI);
		
		if(auxGov.getNumero()!=0)
		{
			candidatos.add(auxGov);
		}
	}
		
	
	
	public void cadSena()
	{
		String aux ="";
		int auxI;
		
		auxSena = new Senador();
		
		
		aux = tFdnomeSena.getText();
		auxSena.setNome(aux);
		aux = tFdpartiSena.getText();
		auxSena.setPartido(aux);
		aux = tFdnumSena.getText();
		auxI = Integer.parseInt(aux);
		auxSena.setNumero(auxI);
		
		if(auxSena.getNumero()!=0)
		{
			candidatos.add(auxSena);
		}
		
		
	}
	
	public void cadDepFed()
	{
		String aux ="";
		int auxI;
		auxDepFed = new DeputadorFederal();
		
		
		aux = tFdnomeDepFed.getText();
		auxDepFed.setNome(aux);
		aux = tFdpartDepFed.getText();
		auxDepFed.setPartido(aux);
		aux = tFdnumDepFed.getText();
		auxI = Integer.parseInt(aux);
		auxDepFed.setNumero(auxI);
		
		if(auxDepFed.getNumero()!=0)
		{
			
			candidatos.add(auxDepFed);
		}
		}
		
	
	
	public void cadDepEst()
	{
		String aux ="";
		int auxI;
		auxDepEst = new DeputadoEstadual();
		
		
		aux = tFdnomeDepEst.getText();
		auxDepEst.setNome(aux);
		aux = tFdpartDepEst.getText();
		auxDepEst.setPartido(aux);
		aux = tFdnumDepEst.getText();
		auxI = Integer.parseInt(aux);
		auxDepEst.setNumero(auxI);
		
		if(auxDepEst.getNumero()!=0)
		{
			candidatos.add(auxDepEst);
		}
	}
		
		
	
	
	public void clearFields()
	{
		tFdnomeDepEst.setText(null);
		tFdnomeDepFed.setText(null);
		tFdnomeGov.setText(null);
		tFdnomePresi.setText(null);
		tFdnomeSena.setText(null);
		tFdnumDepEst.setText(null);
		tFdnumDepFed.setText(null);
		tFdnumeroPresi.setText(null);
		tFdnumGov.setText(null);
		tFdnumSena.setText(null);
		tFdpartDepEst.setText(null);
		tFdpartDepFed.setText(null);
		tFdpartidoPresi.setText(null);
		tFdpartiSena.setText(null);
		tfdpartGov.setText(null);
		
	}
	
	public telaCadastro()
	{
		getContentPane().setLayout(null);
		
		pnlCadastroDepEst = new JPanel();
		pnlCadastroDepEst.setBounds(0, 0, 534, 516);
		getContentPane().add(pnlCadastroDepEst);
		pnlCadastroDepEst.setVisible(false);
		pnlCadastroDepEst.setLayout(null);
		
		tFdnomeDepEst = new JTextField();
		tFdnomeDepEst.setBounds(36, 147, 133, 20);
		pnlCadastroDepEst.add(tFdnomeDepEst);
		tFdnomeDepEst.setColumns(10);
		
		tFdpartDepEst = new JTextField();
		tFdpartDepEst.setBounds(340, 147, 133, 20);
		pnlCadastroDepEst.add(tFdpartDepEst);
		tFdpartDepEst.setColumns(10);
		
		tFdnumDepEst = new JTextField();
		tFdnumDepEst.setBounds(190, 247, 133, 20);
		pnlCadastroDepEst.add(tFdnumDepEst);
		tFdnumDepEst.setColumns(10);
		
		lblNewLabel_17 = new JLabel("Nome");
		lblNewLabel_17.setBounds(36, 122, 46, 14);
		pnlCadastroDepEst.add(lblNewLabel_17);
		
		lblNewLabel_18 = new JLabel("Numero");
		lblNewLabel_18.setBounds(190, 222, 57, 14);
		pnlCadastroDepEst.add(lblNewLabel_18);
		
		lblNewLabel_19 = new JLabel("Partido");
		lblNewLabel_19.setBounds(340, 122, 66, 14);
		pnlCadastroDepEst.add(lblNewLabel_19);
		
		lblNewLabel_20 = new JLabel("Cadastro - Deputado Estadual");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_20.setBounds(131, 11, 296, 33);
		pnlCadastroDepEst.add(lblNewLabel_20);
		
		btnConfirmCadDepEst = new JButton("Confirmar");
		btnConfirmCadDepEst.setBounds(206, 341, 117, 23);
		btnConfirmCadDepEst.addActionListener(mani);
		pnlCadastroDepEst.add(btnConfirmCadDepEst);
		
		pnlCadastroDepFed = new JPanel();
		pnlCadastroDepFed.setBounds(0, 0, 534, 516);
		getContentPane().add(pnlCadastroDepFed);
		pnlCadastroDepFed.setVisible(false);
		pnlCadastroDepFed.setLayout(null);
		
		tFdnomeDepFed = new JTextField();
		tFdnomeDepFed.setBounds(30, 113, 126, 20);
		pnlCadastroDepFed.add(tFdnomeDepFed);
		tFdnomeDepFed.setColumns(10);
		
		tFdpartDepFed = new JTextField();
		tFdpartDepFed.setBounds(368, 113, 126, 20);
		pnlCadastroDepFed.add(tFdpartDepFed);
		tFdpartDepFed.setColumns(10);
		
		tFdnumDepFed = new JTextField();
		tFdnumDepFed.setBounds(184, 194, 152, 20);
		pnlCadastroDepFed.add(tFdnumDepFed);
		tFdnumDepFed.setColumns(10);
		
		lblNewLabel_13 = new JLabel("Nome");
		lblNewLabel_13.setBounds(30, 88, 61, 14);
		pnlCadastroDepFed.add(lblNewLabel_13);
		
		lblNewLabel_14 = new JLabel("Numero");
		lblNewLabel_14.setBounds(184, 169, 61, 14);
		pnlCadastroDepFed.add(lblNewLabel_14);
		
		lblNewLabel_15 = new JLabel("Partido");
		lblNewLabel_15.setBounds(368, 88, 69, 14);
		pnlCadastroDepFed.add(lblNewLabel_15);
		
		lblNewLabel_16 = new JLabel("Cadastro - Deputado Federal");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_16.setBounds(153, 11, 297, 37);
		pnlCadastroDepFed.add(lblNewLabel_16);
		
		btnConfirmCadDepFed = new JButton("Confirmar");
		btnConfirmCadDepFed.setBounds(184, 312, 137, 23);
		btnConfirmCadDepFed.addActionListener(mani);
		pnlCadastroDepFed.add(btnConfirmCadDepFed);
		
		pnlCadastroSena = new JPanel();
		pnlCadastroSena.setBounds(0, 0, 534, 516);
		getContentPane().add(pnlCadastroSena);
		pnlCadastroSena.setVisible(false);
		pnlCadastroSena.setLayout(null);
		
		tFdnomeSena = new JTextField();
		tFdnomeSena.setBounds(34, 137, 141, 20);
		pnlCadastroSena.add(tFdnomeSena);
		tFdnomeSena.setColumns(10);
		
		tFdpartiSena = new JTextField();
		tFdpartiSena.setBounds(353, 137, 141, 20);
		pnlCadastroSena.add(tFdpartiSena);
		tFdpartiSena.setColumns(10);
		
		tFdnumSena = new JTextField();
		tFdnumSena.setBounds(194, 237, 141, 20);
		pnlCadastroSena.add(tFdnumSena);
		tFdnumSena.setColumns(10);
		
		lblNewLabel_9 = new JLabel("Nome");
		lblNewLabel_9.setBounds(34, 112, 69, 14);
		pnlCadastroSena.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("Numero");
		lblNewLabel_10.setBounds(194, 212, 62, 14);
		pnlCadastroSena.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("Partido");
		lblNewLabel_11.setBounds(353, 112, 69, 14);
		pnlCadastroSena.add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("Cadastro - Senador");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_12.setBounds(176, 11, 211, 33);
		pnlCadastroSena.add(lblNewLabel_12);
		
		btnConfirmCadSena = new JButton("Confirmar");
		btnConfirmCadSena.setBounds(204, 322, 113, 23);
		btnConfirmCadSena.addActionListener(mani);
		pnlCadastroSena.add(btnConfirmCadSena);
		
		pnlCadastrarPresidente = new JPanel();
		pnlCadastrarPresidente.setBounds(0, 0, 534, 516);
		getContentPane().add(pnlCadastrarPresidente);
		pnlCadastrarPresidente.setVisible(false);
		pnlCadastrarPresidente.setLayout(null);
		
		pnlcadastroGov = new JPanel();
		pnlcadastroGov.setBounds(0, 0, 534, 516);
		getContentPane().add(pnlcadastroGov);
		pnlcadastroGov.setVisible(false);
		pnlcadastroGov.setLayout(null);
		
		tFdnomeGov = new JTextField();
		tFdnomeGov.setBounds(34, 111, 141, 20);
		pnlcadastroGov.add(tFdnomeGov);
		tFdnomeGov.setColumns(10);
		
		tfdpartGov = new JTextField();
		tfdpartGov.setBounds(347, 111, 141, 20);
		pnlcadastroGov.add(tfdpartGov);
		tfdpartGov.setColumns(10);
		
		tFdnumGov = new JTextField();
		tFdnumGov.setBounds(190, 203, 141, 20);
		pnlcadastroGov.add(tFdnumGov);
		tFdnumGov.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Nome");
		lblNewLabel_5.setBounds(35, 86, 46, 14);
		pnlcadastroGov.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Numero");
		lblNewLabel_6.setBounds(190, 178, 77, 14);
		pnlcadastroGov.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Partido");
		lblNewLabel_7.setBounds(347, 86, 77, 14);
		pnlcadastroGov.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Cadastro - Governador");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(164, 11, 248, 35);
		pnlcadastroGov.add(lblNewLabel_8);
		
		btnConfirmCadGov = new JButton("Confirmar");
		btnConfirmCadGov.setBounds(200, 311, 131, 23);
		btnConfirmCadGov.addActionListener(mani);
		pnlcadastroGov.add(btnConfirmCadGov);
		
		JLabel lblNewLabel_1 = new JLabel("Cadastro - Presidente");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(176, 11, 279, 30);
		pnlCadastrarPresidente.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nome");
		lblNewLabel_2.setBounds(47, 77, 46, 14);
		pnlCadastrarPresidente.add(lblNewLabel_2);
		
		tFdnomePresi = new JTextField();
		tFdnomePresi.setBounds(26, 107, 151, 20);
		pnlCadastrarPresidente.add(tFdnomePresi);
		tFdnomePresi.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Partido");
		lblNewLabel_3.setBounds(409, 77, 46, 14);
		pnlCadastrarPresidente.add(lblNewLabel_3);
		
		tFdpartidoPresi = new JTextField();
		tFdpartidoPresi.setBounds(354, 107, 151, 20);
		pnlCadastrarPresidente.add(tFdpartidoPresi);
		tFdpartidoPresi.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Numero");
		lblNewLabel_4.setBounds(235, 169, 46, 14);
		pnlCadastrarPresidente.add(lblNewLabel_4);
		
		tFdnumeroPresi = new JTextField();
		tFdnumeroPresi.setBounds(176, 194, 189, 20);
		pnlCadastrarPresidente.add(tFdnumeroPresi);
		tFdnumeroPresi.setColumns(10);
		
		btnConfirmCadPresi = new JButton("Confirmar");
		btnConfirmCadPresi.setBounds(214, 299, 114, 23);
		btnConfirmCadPresi.addActionListener(mani);
		pnlCadastrarPresidente.add(btnConfirmCadPresi);
		
		btnCadastrarPresidente = new JButton("Presidente");
		btnCadastrarPresidente.setBounds(161, 73, 234, 23);
		btnCadastrarPresidente.addActionListener(mani);
		getContentPane().add(btnCadastrarPresidente);
		
		btnCadastrarGov = new JButton("Governador");
		btnCadastrarGov.setBounds(161, 156, 234, 23);
		btnCadastrarGov.addActionListener(mani);
		getContentPane().add(btnCadastrarGov);
		
		btnCadastrarSena = new JButton("Senador");
		btnCadastrarSena.setBounds(161, 236, 234, 23);
		btnCadastrarSena.addActionListener(mani);
		getContentPane().add(btnCadastrarSena);
		
		btnCadastrarDepFed = new JButton("Deputador Federal");
		btnCadastrarDepFed.setBounds(161, 312, 234, 23);
		btnCadastrarDepFed.addActionListener(mani);
		getContentPane().add(btnCadastrarDepFed);
		
		btnCadastrarDepEst = new JButton("Deputado Estadual");
		btnCadastrarDepEst.setBounds(161, 380, 234, 23);
		btnCadastrarDepEst.addActionListener(mani);
		getContentPane().add(btnCadastrarDepEst);
		
		btnFinishCadastro = new JButton("Finalizar");
		btnFinishCadastro.setBounds(207, 450, 132, 23);
		btnFinishCadastro.addActionListener(mani);
		getContentPane().add(btnFinishCadastro);
		
		btnRetornar = new JButton("Voltar");
		btnRetornar.setBounds(207, 527, 132, 23);
		btnRetornar.addActionListener(mani);
		btnRetornar.setVisible(false);
		getContentPane().add(btnRetornar);
		
		JLabel lblNewLabel = new JLabel("Cadastro dos candidatos");
		lblNewLabel.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblNewLabel.setBounds(161, 11, 234, 33);
		getContentPane().add(lblNewLabel);
		setBounds(0, 0, 550, 600);
		setVisible(true);
	}
	
	public class Manipulador implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==btnCadastrarPresidente)
			{
				pnlCadastrarPresidente.setVisible(true);
				pnlCadastroDepEst.setVisible(false);
				pnlCadastroDepFed.setVisible(false);
				pnlcadastroGov.setVisible(false);
				pnlCadastroSena.setVisible(false);
				btnCadastrarDepEst.setVisible(false);
				btnCadastrarDepFed.setVisible(false);
				btnCadastrarGov.setVisible(false);
				btnCadastrarPresidente.setVisible(false);
				btnCadastrarSena.setVisible(false);
				btnFinishCadastro.setVisible(false);
				btnRetornar.setVisible(true);
			}
			if(e.getSource()==btnCadastrarGov)
			{
				pnlCadastrarPresidente.setVisible(false);
				pnlCadastroDepEst.setVisible(false);
				pnlCadastroDepFed.setVisible(false);
				pnlcadastroGov.setVisible(true);
				pnlCadastroSena.setVisible(false);
				btnCadastrarDepEst.setVisible(false);
				btnCadastrarDepFed.setVisible(false);
				btnCadastrarGov.setVisible(false);
				btnCadastrarPresidente.setVisible(false);
				btnCadastrarSena.setVisible(false);
				btnFinishCadastro.setVisible(false);
				btnRetornar.setVisible(true);
			}
			if(e.getSource()==btnCadastrarSena)
			{
				pnlCadastrarPresidente.setVisible(false);
				pnlCadastroDepEst.setVisible(false);
				pnlCadastroDepFed.setVisible(false);
				pnlcadastroGov.setVisible(false);
				pnlCadastroSena.setVisible(true);
				btnCadastrarDepEst.setVisible(false);
				btnCadastrarDepFed.setVisible(false);
				btnCadastrarGov.setVisible(false);
				btnCadastrarPresidente.setVisible(false);
				btnCadastrarSena.setVisible(false);
				btnFinishCadastro.setVisible(false);
				btnRetornar.setVisible(true);
			}
			if(e.getSource()==btnCadastrarDepFed)
			{
				pnlCadastrarPresidente.setVisible(false);
				pnlCadastroDepEst.setVisible(false);
				pnlCadastroDepFed.setVisible(true);
				pnlcadastroGov.setVisible(false);
				pnlCadastroSena.setVisible(false);
				btnCadastrarDepEst.setVisible(false);
				btnCadastrarDepFed.setVisible(false);
				btnCadastrarGov.setVisible(false);
				btnCadastrarPresidente.setVisible(false);
				btnCadastrarSena.setVisible(false);
				btnFinishCadastro.setVisible(false);
				btnRetornar.setVisible(true);
			}
			if(e.getSource()==btnCadastrarDepEst)
			{
				pnlCadastrarPresidente.setVisible(false);
				pnlCadastroDepEst.setVisible(true);
				pnlCadastroDepFed.setVisible(false);
				pnlcadastroGov.setVisible(false);
				pnlCadastroSena.setVisible(false);
				btnCadastrarDepEst.setVisible(false);
				btnCadastrarDepFed.setVisible(false);
				btnCadastrarGov.setVisible(false);
				btnCadastrarPresidente.setVisible(false);	
				btnCadastrarSena.setVisible(false);
				btnFinishCadastro.setVisible(false);
				btnRetornar.setVisible(true);
			}
			if(e.getSource()==btnRetornar)
			{
				pnlCadastrarPresidente.setVisible(false);
				pnlCadastroDepEst.setVisible(false);
				pnlCadastroDepFed.setVisible(false);
				pnlcadastroGov.setVisible(false);
				pnlCadastroSena.setVisible(false);
				btnCadastrarDepEst.setVisible(true);
				btnCadastrarDepFed.setVisible(true);
				btnCadastrarGov.setVisible(true);
				btnCadastrarPresidente.setVisible(true);
				btnCadastrarSena.setVisible(true);
				btnFinishCadastro.setVisible(true);
				btnRetornar.setVisible(false);
			}
			if(e.getSource()==btnFinishCadastro)
			{
				tela.dispose();
				telaVot= new telaVotacao();
				
			}
			if(e.getSource()==btnConfirmCadPresi)
			{
				cadPresi();
				clearFields();
			
			}
			if(e.getSource()==btnConfirmCadGov)
			{
				cadGov();
				clearFields();
			}
			if(e.getSource()==btnConfirmCadSena)
			{
				cadSena();
				clearFields();
			}
			if(e.getSource()==btnConfirmCadDepFed)
			{
				cadDepFed();
				clearFields();
			}
			if(e.getSource()==btnConfirmCadDepEst)
			{
				cadDepEst();
				clearFields();
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tela = new telaCadastro();
	}
}
