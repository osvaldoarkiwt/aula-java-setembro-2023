package projetografico.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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

}
