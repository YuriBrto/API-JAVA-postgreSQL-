package Cadastros;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class PessoaDao extends Dao{
	
/*public void incluirPessoa(Pessoa p)throws Exception{
	open();
	stmt=con.prepareStatement("insert into pessoa values(?,?,?)");
	stmt.setInt(1, p.getIdPessoa());
	stmt.setString(2, p.getNomePessoa());
	stmt.setString(3, p.getEmail());
	stmt.execute();
	stmt.close();
	close();
}}*/
	public void AlterarPessoa(Pessoa p) throws Exception {
	    open();
	    String sql = "UPDATE Pessoa SET nomePessoa = ?, email = ? WHERE IdPessoa = ?";
	    stmt = con.prepareStatement(sql);
	    stmt.setString(1, p.getNomePessoa());
	    stmt.setString(2, p.getEmail());
	    stmt.setInt(3, p.getIdPessoa());
	    try {
	        stmt.executeUpdate();
	    } catch (SQLException e) {
	        throw new Exception("Erro ao alterar pessoa: " + e.getMessage());
	    } finally {
	        stmt.close();
	        close();
	    }
	}

/*public void ExcluirPessoa(Pessoa p)throws Exception{
	open();
	stmt=con.prepareStatement("delete from Pessoa where IdPessoa =?");
	stmt.setInt(1, p.getIdPessoa());	
	stmt.execute();
	stmt.close();
	close();
}*/
public Pessoa consultarPessoaIndividual(int cod) throws Exception{
	open();
	stmt =con.prepareStatement("select * from pessoa where IdPessoa = ?");
	stmt.setInt(1, cod);
	rs = stmt.executeQuery();
	Pessoa p = null;
	if(rs.next()) {
		p =new Pessoa ();
		p.setIdPessoa(rs.getInt("IdPessoa"));
		p.setNomePessoa(rs.getString("nomePessoa"));
		p.setEmail(rs.getString("email"));
	}else {
		System.out.println("Registro não encontrado");
	}
	close();
	return p;
}
public List<Pessoa> ListarPessoas(){
	try {
		open();
		stmt = con.prepareStatement("select * from pessoa order by IdPessoa");
		rs = stmt.executeQuery();
		List<Pessoa> listaPessoas = new ArrayList<>();
		while(rs.next()) {
			Pessoa p= new Pessoa();
			p.setIdPessoa(rs.getInt("IdPessoa"));
			p.setNomePessoa(rs.getString("nomePessoa"));
			p.setEmail(rs.getString("email"));
			listaPessoas.add(p);
		}
		close();
		return listaPessoas;
	}catch(Exception e) {
		System.out.println("Error" + e.getMessage());
	}
	return null;
	
	
}}
