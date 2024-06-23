import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;

public class OutlineCampoFormularioStep {

	private String nome;
	private String mensagem;

	@Dado("que eu estou na página de cadastro")
	public void queEuEstouNaPáginaDeCadastro() {
	    System.out.println("Usuário está na pagina de cadastro");
	}
	@Quando("eu insiro o nome {string}")
	public void euInsiroONome(String nome) {
	    this.nome = nome;
	}
	@Quando("eu submeto o formulário")
	public void euSubmetoOFormulário() {
	    if(nome == null || nome.isEmpty()) {
	    	mensagem = "Nome não pode estar em branco";
	    }else if (nome.length() < 2) {
	    	mensagem = "Nome muito curto";
	    }else if (!nome.matches("[a-zA-Z\\s]+")) {
	    	mensagem = "Nome contém caracteres inválidos";
	    }else {
	    	mensagem = "Nome válido";
	    }
	    
	}
	@Então("devo ver {string}")
    public void devoVer(String mensagemEsperada) {
        assertEquals(mensagemEsperada, mensagem);
    }



}
