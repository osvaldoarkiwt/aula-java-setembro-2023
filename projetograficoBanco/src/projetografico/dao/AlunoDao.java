package projetografico.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import projetografico.application.ConnectionFactory;
import projetografico.model.Aluno;

public class AlunoDao {
	
	Connection con = ConnectionFactory.createConnection();
	
	public void cadastrarAluno(Aluno aluno) {
		
		String query = "INSERT INTO aluno(nome,idade,curso) values(?,?,?)";
		
		try {
			PreparedStatement pstmt = con.prepareStatement(query);
								
			pstmt.setString(1, aluno.getNome());
			pstmt.setInt(2, aluno.getIdade());
			pstmt.setString(3, aluno.getCurso());
			
			pstmt.execute();
			
			System.out.println("Aluno cadastrado com sucesso!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public List<Aluno> carregarAlunos(){
	
		List<Aluno> alunos = new ArrayList<>();
		
		String query = "SELECT * FROM aluno";
		
		try {
			PreparedStatement pstmt = con.prepareStatement(query);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
			
				Aluno aluno = new Aluno();
				
				aluno.setId(rs.getLong(1));
				aluno.setNome(rs.getString(2));
				aluno.setIdade(rs.getInt(3));
				aluno.setCurso(rs.getString(4));
				
				alunos.add(aluno);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return alunos;
	}

	public Aluno carregarAlunoPeloId(Long id) {
		
		String query = "SELECT * FROM aluno WHERE id=?";
		
		Aluno aluno = new Aluno();

		try {
			PreparedStatement pstmt = con.prepareStatement(query);
			
			pstmt.setLong(1, id);
			
			ResultSet rs = pstmt.executeQuery();
		
			while(rs.next()) {
						
				aluno.setId(rs.getLong(1));
				aluno.setNome(rs.getString(2));
				aluno.setIdade(rs.getInt(3));
				aluno.setCurso(rs.getString(4));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return aluno;
	}
	
	public void deletarAlunoPeloId(Aluno aluno) {
		
		Long id = aluno.getId();
		
		String query = "DELETE FROM aluno WHERE id=?";
		
		try {
			PreparedStatement pstmt = con.prepareStatement(query);
			
			pstmt.setLong(1, id);
			
			pstmt.execute();
			
			System.out.println("Aluno deletado com sucesso!");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
		
	public void atualizarAlunoPeloId(Long id,Aluno aluno) {
		
		String query = "UPDATE aluno SET nome=?, idade=?, curso=? WHERE id=?";
		
		try {
			PreparedStatement pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, aluno.getNome());
			pstmt.setInt(2, aluno.getIdade());
			pstmt.setString(3, aluno.getCurso());
			pstmt.setLong(4, id);
			
			pstmt.execute();
			
			System.out.println("Aluno atualizado com sucesso!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
