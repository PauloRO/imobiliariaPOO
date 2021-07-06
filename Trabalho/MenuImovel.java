import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuImovel extends JFrame {

	static JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuImovel frame = new MenuImovel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuImovel() {
		setTitle("Menu Im\u00F3vel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Escolha uma das op\u00E7\u00F5es abaixo:");
		lblNewLabel.setBounds(10, 11, 231, 14);
		contentPane.add(lblNewLabel);
		
		///////////////////////////////// APARTAMENTO
		
		JLabel lblApartamento = new JLabel("Apartamento");
		lblApartamento.setBounds(10, 41, 99, 20);
		contentPane.add(lblApartamento);
		
		JButton btnAlterarApartamento = new JButton("Alterar");
		btnAlterarApartamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlterarImovel imovel = new AlterarImovel();
				imovel.setVisible(true);
				imovel.btnAlterarApartamento.setEnabled(true);
				MenuImovel.this.dispose();
			}
		});
		btnAlterarApartamento.setBounds(10, 67, 115, 23);
		contentPane.add(btnAlterarApartamento);
		
		JButton btnCadastrarApartamento = new JButton("Cadastrar");
		btnCadastrarApartamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastrarImovel imovel = new CadastrarImovel();
				imovel.setVisible(true);
				imovel.btnCadastrarApartamento.setEnabled(true);
				MenuImovel.this.dispose();
			}
		});
		btnCadastrarApartamento.setBounds(140, 67, 115, 23);
		contentPane.add(btnCadastrarApartamento);
		
		JButton btnConsultarApartamento = new JButton("Consultar");
		btnConsultarApartamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarApartamento apartamento = new ConsultarApartamento();
				apartamento.setVisible(true);
				MenuImovel.this.dispose();
			}
		});
		btnConsultarApartamento.setBounds(270, 67, 115, 23);
		contentPane.add(btnConsultarApartamento);
		
		
		JButton btnExcluirApartamento = new JButton("Remover");
		btnExcluirApartamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RemoverApartamento apartamento = new RemoverApartamento();
				apartamento.setVisible(true);
				MenuImovel.this.dispose();
			}
		});
		btnExcluirApartamento.setBounds(402, 67, 115, 23);
		contentPane.add(btnExcluirApartamento);
		
		///////////////////////////////// CASA
		
		JLabel lblCasa = new JLabel("Casa");
		lblCasa.setBounds(10, 106, 44, 20);
		contentPane.add(lblCasa);
		
		JButton btnAlterarCasa = new JButton("Alterar");
		btnAlterarCasa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlterarImovel imovel = new AlterarImovel();
				imovel.setVisible(true);
				imovel.btnAlterarCasa.setEnabled(true);
				MenuImovel.this.dispose();
			}
		});
		btnAlterarCasa.setBounds(10, 132, 115, 23);
		contentPane.add(btnAlterarCasa);
		
		JButton btnCadastrarCasa = new JButton("Cadastrar");
		btnCadastrarCasa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastrarImovel imovel = new CadastrarImovel();
				imovel.setVisible(true);
				imovel.btnCadastrarCasa.setEnabled(true);
				MenuImovel.this.dispose();
			}
		});
		btnCadastrarCasa.setBounds(140, 132, 115, 23);
		contentPane.add(btnCadastrarCasa);
		
		JButton btnConsultarCasa = new JButton("Consultar");
		btnConsultarCasa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarCasa casa = new ConsultarCasa();
				casa.setVisible(true);
				MenuImovel.this.dispose();
			}
		});
		btnConsultarCasa.setBounds(270, 132, 115, 23);
		contentPane.add(btnConsultarCasa);
		
		JButton btnExcluirCasa = new JButton("Remover");
		btnExcluirCasa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RemoverCasa casa = new RemoverCasa();
				casa.setVisible(true);
				MenuImovel.this.dispose();
			}
		});
		btnExcluirCasa.setBounds(402, 132, 115, 23);
		contentPane.add(btnExcluirCasa);
		
		///////////////////////////////// RESIDENCIAL
		
		JLabel lblResidencial = new JLabel("Residencial");
		lblResidencial.setBounds(10, 171, 86, 20);
		contentPane.add(lblResidencial);
		
		JButton btnAlterarResidencial = new JButton("Alterar");
		btnAlterarResidencial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlterarImovel imovel = new AlterarImovel();
				imovel.setVisible(true);
				imovel.btnAlterarResidencial.setEnabled(true);
				MenuImovel.this.dispose();
			}
		});
		btnAlterarResidencial.setBounds(10, 196, 115, 23);
		contentPane.add(btnAlterarResidencial);
		
		JButton btnCadastrarResidencial = new JButton("Cadastrar");
		btnCadastrarResidencial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastrarImovel imovel = new CadastrarImovel();
				imovel.setVisible(true);
				imovel.btnCadastrarResidencial.setEnabled(true);
				MenuImovel.this.dispose();
				}
		});
		btnCadastrarResidencial.setBounds(140, 196, 115, 23);
		contentPane.add(btnCadastrarResidencial);
		
		JButton btnConsultarResidencial = new JButton("Consultar");
		btnConsultarResidencial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarResidencial residencial = new ConsultarResidencial();
				residencial.setVisible(true);
				MenuImovel.this.dispose();
			}
		});
		btnConsultarResidencial.setBounds(270, 196, 115, 23);
		contentPane.add(btnConsultarResidencial);
		
		JButton btnExcluirResidencial = new JButton("Remover");
		btnExcluirResidencial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RemoverResidencial residencial = new RemoverResidencial();
				residencial.setVisible(true);
				MenuImovel.this.dispose();
			}
		});
		btnExcluirResidencial.setBounds(402, 196, 115, 23);
		contentPane.add(btnExcluirResidencial);
		
		///////////////////////////////// SALA COMERCIAL
		
		JLabel lblSalaComercial = new JLabel("Sala Comercial");
		lblSalaComercial.setBounds(10, 235, 115, 20);
		contentPane.add(lblSalaComercial);
		
		JButton btnAlterarSalaComercial = new JButton("Alterar");
		btnAlterarSalaComercial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlterarImovel imovel = new AlterarImovel();
				imovel.setVisible(true);
				imovel.btnAlterarSalaComercial.setEnabled(true);
				MenuImovel.this.dispose();
			}
		});
		btnAlterarSalaComercial.setBounds(10, 258, 115, 23);
		contentPane.add(btnAlterarSalaComercial);
		
		JButton btnCadastrarSalaComercial = new JButton("Cadastrar");
		btnCadastrarSalaComercial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastrarImovel imovel = new CadastrarImovel();
				imovel.setVisible(true);
				imovel.btnCadastrarSalaComercial.setEnabled(true);
				MenuImovel.this.dispose();
			}
		});
		btnCadastrarSalaComercial.setBounds(140, 258, 115, 23);
		contentPane.add(btnCadastrarSalaComercial);
		
		JButton btnConsultarSalaComercial = new JButton("Consultar");
		btnConsultarSalaComercial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarSalaComercial salaComercial = new ConsultarSalaComercial();
				salaComercial.setVisible(true);
				MenuImovel.this.dispose();
			}
		});
		btnConsultarSalaComercial.setBounds(270, 258, 115, 23);
		contentPane.add(btnConsultarSalaComercial);
		
		JButton btnExcluirSalaComercial = new JButton("Remover");
		btnExcluirSalaComercial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RemoverSalaComercial salaComercial = new RemoverSalaComercial();
				salaComercial.setVisible(true);
				MenuImovel.this.dispose();
			}
		});
		btnExcluirSalaComercial.setBounds(402, 258, 115, 23);
		contentPane.add(btnExcluirSalaComercial);
		
		///////////////////////////////// TERRENO
		
		JLabel lblTerreno = new JLabel("Terreno");
		lblTerreno.setBounds(10, 297, 70, 20);
		contentPane.add(lblTerreno);
		
		JButton btnAlterarTerreno = new JButton("Alterar");
		btnAlterarTerreno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlterarImovel imovel = new AlterarImovel();
				imovel.setVisible(true);
				imovel.btnAlterarCasa.setEnabled(true);
				MenuImovel.this.dispose();
			}
		});
		btnAlterarTerreno.setBounds(10, 320, 115, 23);
		contentPane.add(btnAlterarTerreno);
		
		JButton btnCadastrarTerreno = new JButton("Cadastrar");
		btnCadastrarTerreno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastrarImovel imovel = new CadastrarImovel();
				imovel.setVisible(true);
				imovel.btnCadastrarTerreno.setEnabled(true);
				MenuImovel.this.dispose();
			}
		});
		btnCadastrarTerreno.setBounds(140, 320, 115, 23);
		contentPane.add(btnCadastrarTerreno);
		
		JButton btnConsultarTerreno = new JButton("Consultar");
		btnConsultarTerreno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarTerreno terreno = new ConsultarTerreno();
				terreno.setVisible(true);
				MenuImovel.this.dispose();
			}
		});
		btnConsultarTerreno.setBounds(270, 320, 115, 23);
		contentPane.add(btnConsultarTerreno);
		
		JButton btnExcluirTerreno = new JButton("Remover");
		btnExcluirTerreno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RemoverTerreno terreno = new RemoverTerreno();
				terreno.setVisible(true);
				MenuImovel.this.dispose();
			}
		});
		btnExcluirTerreno.setBounds(402, 320, 115, 23);
		contentPane.add(btnExcluirTerreno);
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
	}
}
