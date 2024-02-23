package projetografico.application;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import projetografico.model.Aluno;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel titulo;
	private JTextField campoNome;
	private JLabel lblNewLabel_1;
	private JTextField campoIdade;
	private JLabel lblNewLabel_2;
	private JTextField campoCurso;
	private JScrollPane scrollPane;
	private JTable table;
	private Long id = 1L;
	private JButton btnCarregar;
	private JButton btnAtualizar;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
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
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 632, 304);
		contentPane = new JPanel();
		contentPane.setBorder(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		titulo = new JLabel("Cadastro Escola");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setForeground(new Color(0, 128, 255));
		titulo.setFont(new Font("SansSerif", Font.BOLD, 18));
		titulo.setBounds(201, 10, 188, 28);
		contentPane.add(titulo);
		
		JLabel lblNewLabel = new JLabel("nome:");
		lblNewLabel.setBounds(10, 62, 45, 13);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("idade: ");
		lblNewLabel_1.setBounds(10, 95, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("curso: ");
		lblNewLabel_2.setBounds(10, 129, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		campoNome = new JTextField();
		campoNome.setBounds(48, 59, 128, 19);
		contentPane.add(campoNome);
		campoNome.setColumns(10);
		
		campoIdade = new JTextField();
		campoIdade.setBounds(48, 92, 128, 19);
		contentPane.add(campoIdade);
		campoIdade.setColumns(10);

		campoCurso = new JTextField();
		campoCurso.setBounds(48, 126, 128, 19);
		contentPane.add(campoCurso);
		campoCurso.setColumns(10);
		
		JButton botaoCadastrar = new JButton("cadastrar");
		botaoCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Aluno aluno = recuperarDadosDoFormulario(id, campoNome, campoIdade, campoCurso);
				
				if(aluno != null) {
					popularTabela(aluno,table);
					
					id++;
				}
				
				limparCampos(campoNome, campoIdade, campoCurso);
			}
		});
		botaoCadastrar.setForeground(new Color(255, 255, 255));
		botaoCadastrar.setBackground(new Color(0, 128, 255));
		botaoCadastrar.setFont(new Font("SansSerif", Font.PLAIN, 10));
		botaoCadastrar.setBounds(10, 152, 85, 21);
		contentPane.add(botaoCadastrar);

		JButton btnDeletar = new JButton("deletar");
		btnDeletar.setFont(new Font("SansSerif", Font.PLAIN, 10));
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				apagarRegistroDaTabela(table);
			}
		});
		btnDeletar.setBounds(10, 178, 85, 21);
		contentPane.add(btnDeletar);
		
		btnCarregar = new JButton("carregar info");
		btnCarregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				carregarRegistro(campoNome, campoIdade, campoCurso, table);
			}
		});
		btnCarregar.setFont(new Font("SansSerif", Font.PLAIN, 10));
		btnCarregar.setBounds(10, 209, 85, 21);
		contentPane.add(btnCarregar);
		
		btnAtualizar = new JButton("atualizar"); 
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Aluno a = recuperarDadosDoFormulario(id, campoNome, campoIdade, campoCurso);
				
				editarLinha(a, table);
				
				limparCampos(campoNome, campoIdade, campoCurso);
			}
		});
		btnAtualizar.setFont(new Font("SansSerif", Font.PLAIN, 10));
		btnAtualizar.setBounds(10, 236, 85, 21);
		contentPane.add(btnAtualizar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(211, 48, 382, 196);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Verdana", Font.PLAIN, 10));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"id", "Nome", "Idade", "Curso"
			}
		) {
			Class[] columnTypes = new Class[] {
				Long.class, String.class, Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
	}
	
	public static void limparCampos(JTextField nome,JTextField idade, JTextField curso) {
		nome.setText("");
		idade.setText("");
		curso.setText("");
	}
	
	public static Aluno recuperarDadosDoFormulario(Long id, JTextField campoNome,JTextField campoIdade, JTextField campoCurso) {
		 
		String nome = campoNome.getText();
		
		Integer idade = Integer.parseInt(campoIdade.getText().equals("")?
													"0" : campoIdade.getText());

		String curso = campoCurso.getText();
		
		if(!nome.equals("") && idade !=0 && !curso.equals("")) {
					
			Aluno aluno = new Aluno(id,nome,idade,curso);
			
			return aluno;
		}else {
			JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!");
		}
		
		return null;
	}
	
	public static void popularTabela(Aluno aluno,JTable tabela) {
		
		Object[] linha = {aluno.getId(), aluno.getNome(), aluno.getIdade(), aluno.getCurso()};
						
		((DefaultTableModel) tabela.getModel()).addRow(linha);
	}
	
	public static void apagarRegistroDaTabela(JTable tabela) {
		
		int linha = tabela.getSelectedRow();
		
		//System.out.println(linha);
		
		if(linha != -1) {
			
			((DefaultTableModel) tabela.getModel()).removeRow(linha);
		}else {
			JOptionPane.showMessageDialog(tabela, "Nenhuma linha foi selecionada");
		}
	}
	
	public static void carregarRegistro(JTextField campoNome,JTextField campoIdade, JTextField campoCurso, JTable tabela) {
		
		int linha = tabela.getSelectedRow();
				
		DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
		
		if(linha != -1) {
			
			campoNome.setText(modelo.getValueAt(linha, 1).toString());
			
			campoIdade.setText(modelo.getValueAt(linha, 2).toString());
			
			campoCurso.setText(modelo.getValueAt(linha, 3).toString());
			
			//((DefaultTableModel) tabela.getModel()).removeRow(linha);
		}else {
			JOptionPane.showMessageDialog(tabela, "Nenhuma linha foi selecionada");
		}
	}
	
	public static void editarLinha(Aluno aluno,JTable tabela) {
		
		//Object[] linha = {aluno.getId(), aluno.getNome(), aluno.getIdade(), aluno.getCurso()};
						
		//((DefaultTableModel) tabela.getModel()).addRow(linha);
		
		int linha = tabela.getSelectedRow();
		
		DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
		
		Long id = (Long) modelo.getValueAt(linha, 0);
		
		if(linha != -1) {
			
			modelo.setValueAt(id, linha, 0);
			
			modelo.setValueAt(aluno.getNome(), linha, 1);
			
			modelo.setValueAt(aluno.getIdade(), linha, 2);
			
			modelo.setValueAt(aluno.getCurso(), linha, 3);
			
		}else {
			JOptionPane.showMessageDialog(tabela, "Nenhuma linha foi selecionada");
		}		
	}
}
