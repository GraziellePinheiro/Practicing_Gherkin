import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;

public class OutlineSessaoUsuarioSteps {
	
	private String estadoSessao;
	private String mensagem;
	@Dado("que o usuário está na página inicial")
	public void queOUsuárioEstáNaPáginaInicial() {
	    System.out.println("Usuário está na pagina inicial");
	}
	@Dado("o estado da sessão é {string}")
	public void oEstadoDaSessãoÉ(String estado) {
	    this.estadoSessao = estado;
	}
	@Quando("o usuário tenta acessar a página restrita")
	public void oUsuárioTentaAcessarAPáginaRestrita() {
	    switch(estadoSessao) {
	    case "logado":
	    	mensagem = "Acesso permitido";
	    	break;
	    case "deslogado":
	    	mensagem = "Por favor, faça login";
	    	break;
	    case "expirado":
	    	mensagem = "Sessão expirada, faça login novamente";
	    	break;
	    default:
	    	mensagem = "Estado de sessão desconhecido";
	    }
	}
	@Então("ele deve ver {string}")
	public void eleDeveVer(String mensagemEsperada) {
	    assertEquals(mensagemEsperada, mensagem);
	}



}
