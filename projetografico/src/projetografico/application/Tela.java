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
		botaoCadastrar.setBounds(10, 181, 85, 21);
		contentPane.add(botaoCadastrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(211, 48, 382, 196);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Wide Latin", Font.PLAIN, 10));
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
}
