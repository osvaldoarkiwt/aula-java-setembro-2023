package projetografico.application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection createConnection(){
		String url = "jdbc:mysql://localhost:3306/escoladb"; //Nome da base de dados
		String user = "root"; //nome do usuário do MySQL
		String password = "iwt123"; //senha do MySQL

		Connection conexao = null;

		try {
			conexao = DriverManager.getConnection(url, user, password);
			System.out.println("conexão estabelecida!");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conexao;
	}
}
