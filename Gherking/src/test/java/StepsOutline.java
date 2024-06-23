import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;

public class StepsOutline {
	
	private String username;
	private String password;
	private String loginMessage;
	@Dado("que eu estou na página de login")
	public void queEuEstouNaPáginaDeLogin() {
	    
	}
	@Quando("eu insiro o nome de usuário {string}")
	public void euInsiroONomeDeUsuário(String username) {
	    if(username == null) {
	    	throw new NullPointerException();
	    }
	    this.username = username; 
	}
	@Quando("eu insiro a senha {string}")
	public void euInsiroASenha(String password) {
		if(password == null) {
	    	throw new NullPointerException();
	    }
	    this.password = password; 
	}
	@Quando("eu clico no botão de login")
	public void euClicoNoBotãoDeLogin() {
	    if("admin".equals(username) && "password123".equals(password)) {
	    	 loginMessage = "Bem-vindo, admin!";
	    } else if ("admin".equals(username) && password.isEmpty()){
	    	loginMessage = "Senha não pode estar em branco";
	    } else if(username.isEmpty()) {
	    	loginMessage = "Nome de usuário não pode estar em branco";
	    } else if("user".equals(username) && "wrongpassword".equals(password)) {
	    	loginMessage = "Credenciais inválidas";
	    }else {
	    	loginMessage = "Usuário não encontrado";
	    	//throw new IllegalArgumentException(loginMessage);
	    	
	    }
	}
	@Então("eu devo ver {string}")
	public void euDevoVer(String expectedMessage) {
	    assertEquals(expectedMessage, loginMessage);
	}



}
