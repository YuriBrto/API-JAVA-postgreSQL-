package Cadastros;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {

	Connection con;//Conexao com o banco de dados
	PreparedStatement stmt; //Acessa a tabela(insert, update, delete, select)
	ResultSet rs; //Consulta a tabela
	CallableStatement call; //Procedures e Function
	
	public void open()throws Exception{
		String url = "jdbc:postgresql://localhost:5064/cadastros";
		String user = "postgres";
		String password = "Wakandaforever10.";
		
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Conexão efetuada com sucesso");
		}catch(SQLException | ClassNotFoundException ex ){
			System.out.println("Erro ao conectar ao banco de dados");
		}
	}
	public void close() throws Exception{
con.close();
}
}