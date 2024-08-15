package Cadastros;
import java.util.ArrayList;
import java.util.List;
public class Menu {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
PessoaDao pd = new PessoaDao();
try {
	//Incluir uma pessoa
	//Pessoa p3 = new Pessoa(3,"Manoel","Manoo@email.com");
	//Pessoa p4 = new Pessoa(4,"yuriBrabo","yuriTheFato@email.com");
	//pd.incluirPessoa(p3);
	//pd.incluirPessoa(p4);
	
	

	//ALTERAR UMA PESSOA
	Pessoa pes = pd.consultarPessoaIndividual(3);
	if(pes != null) {
		pes.setEmail("ManuelGomes@gmail.com");
	    pd.AlterarPessoa(pes);
	    System.out.println("Pessoa alterada com sucesso ! ");
		//LISTANDO TODAS AS PESSOAS 
			//List<Pessoa> listaPessoas = pd.ListarPessoas();
			//for(Pessoa p : listaPessoas) {
			//System.out.println(p);
			//}
	//LISTANDO TODAS AS PESSOAS 
	List<Pessoa> listaPessoas = pd.ListarPessoas();
	for(Pessoa p : listaPessoas) {
		System.out.println("Código Id.... : " + p.getIdPessoa());
		System.out.println("Nome.... : " + p.getNomePessoa());
		System.out.println("Email.... : " + p.getEmail());
		System.out.println("--------------------------");
}
	}
	System.out.println("Pessoa : " + pes);
    

	
	
	//LISTANDO TODAS AS PESSOAS 
	//List<Pessoa> listaPessoas = pd.ListarPessoas();
	//for(Pessoa p : listaPessoas) {
		///System.out.println("Código Id.... : " + p.getIdPessoa());
		//System.out.println("Nome.... : " + p.getNomePessoa());
		//System.out.println("Email.... : " + p.getEmail());
		//System.out.println("--------------------------");
//}
	//VERIFICAR SE A PESSOA EXISTE NO CODIGO
	/*Pessoa pes = pd.consultarPessoaIndividual(1);
	//METODO DE EXCLUSAO
	pd.ExcluirPessoa(pes);
	//LISTANDO TODAS AS PESSOAS 
	List<Pessoa> listaPessoas = pd.ListarPessoas();
		for(Pessoa p : listaPessoas) {
			System.out.println(p);
		}*/
	//CONSULTA INDIVIDUAL
	//Pessoa pes1 = pd.consultarPessoaIndividual(1);
	//System.out.println("Código.... : " + pes1.getIdPessoa());
	//System.out.println("Nome.... : " + pes1.getNomePessoa());
	//System.out.println("Email.... : " + pes1.getEmail());
		//}
		}catch(Exception e) {
	System.out.println("Error" + e.getMessage());
}}

	}
	

