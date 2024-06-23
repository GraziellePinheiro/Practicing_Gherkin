import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Assertions;

import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;

public class cenariosString {

	private String primeiraString;
	private String segundaString;
	private String resultadoConcatenacao;

	@Dado("que tenho a string {string}")
	public void queTenhoAString(String string) {
	    if(primeiraString == null) {
	    	primeiraString = string;
	    }else {
	    	segundaString = string;
	    }
	}
	
	@Dado("tenho a string {string}")
	public void tenhoAString(String string) {
		if(primeiraString == null) {
	    	primeiraString = string;
	    }else {
	    	segundaString = string;
	    }
	}

	@Quando("eu concatenar as duas strings")
	public void euConcatenarAsDuasStrings() {
		resultadoConcatenacao = primeiraString + " " + segundaString;
	}
	@Então("o resultado será {string}")
	public void oResultadoSerá(String string) {
		Assertions.assertEquals(resultadoConcatenacao, string);
	}

	//Cenário 2
	
	private String frase;
	@Dado("que tenho a frase {string}")
    public void queTenhoAFrase(String string) {
        frase = string;
    }
	@Quando("eu verificar se ela contém a palavra {string}")
	public void euVerificarSeElaContémAPalavra(String string) {
		boolean resultado = frase.contains(string);
	    
	    if(resultado) {
	    	frase = "Verdadeiro";
	    }else {
	    	frase = "Falso";
	    }
	}
	@Então("o resultado deverá ser verdadeiro")
	public void oResultadoDeveráSerVerdadeiro() {
	    Assertions.assertTrue(frase.equals("Verdadeiro"));
	}


	// Cenário 3
	private String AFrase;
	private String parteExtraida;
	@Dado("que tenho a seguinte frase {string}")
	public void queTenhoASeguinteFrase(String string) {
	    AFrase = string;
	}
	@Quando("eu extrair a parte {string}")
	public void euExtrairAParte(String parte) {
	   if(AFrase.contains(parte)) {
		   parteExtraida = parte;
	   } else {
		   parteExtraida = null;
	   }
	}
	@Então("o resultado deverá ser {string}")
	public void oResultadoDeveráSer(String string) {
	    Assertions.assertEquals(string, parteExtraida);
	}

	
// Cenario 4
	
	private String FraseOriginal;
	private String FraseEsperada;
	@Dado("que tenho string {string}")
	public void queTenhoString(String string) {
	    FraseOriginal = string;
	}
	
	@Quando("eu substituir {string} por {string}")
	public void euSubstituirPor(String string1, String string2) {
	    FraseEsperada = FraseOriginal.replace(string1, string2);
	}
	
	
	@Então("o resultado deve ser {string}")
	public void oResultadoDeveSer(String res) {
	    Assertions.assertEquals(res, FraseEsperada);
	}
	
	// Cenário 5
	
	private String msgOriginal;
	private String msgMaiusc;
	@Dado("que tenho uma frase {string}")
	public void queTenhoUmaFrase(String string) {
		if(string == null) {
			throw new NullPointerException("A frase fornecida não pode ser nula!");
		}
	    msgOriginal = string;
	}
	@Quando("eu converter para maiúsculas")
	public void euConverterParaMaiúsculas() {
	    msgMaiusc = msgOriginal.toUpperCase();
	}
	@Então("oH resultado deverá ser  {string}")
	public void oHResultadoDeveráSer(String res) {
		System.out.println(msgMaiusc);
	    Assertions.assertEquals(res, msgMaiusc);
	}

// Cenário Date
	private int dia;
	private int mes;
	private int ano;
	private String DataFormatada;
	@Dado("que tenho o dia {int}")
	public void queTenhoODia(int dia) {
		if(dia < 1 || dia > 31) {
			throw new IllegalArgumentException("Dia inválido: " + dia);
		}
	    this.dia = dia;
	}
	@Dado("tenho o mês {int}")
	public void tenhoOMês(int mes) {
		if(mes < 1 || mes > 12) {
			throw new IllegalArgumentException("Mês invalido: " + mes);
		}
	    this.mes = mes;
	}
	@Dado("tenho o ano {int}")
	public void tenhoOAno(int ano) {
		if(ano < 1) {
			throw new IllegalArgumentException("Ano inválido, digite um ano valido?" + ano);
		}
	   this.ano = ano;
	}
	@Quando("eu formatar a data")
	public void euFormatarAData() {
	    LocalDate data = LocalDate.of(ano, mes, dia);
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    DataFormatada = data.format(formatter);
	}
	@Então("resultado deverá ser {string}")
	public void resultadoDeveráSer(String dataEsperada) {
		System.out.println(dataEsperada);
	    assertEquals(dataEsperada, DataFormatada);
	}

// Cenário Data atual
	
	private LocalDate dataAtual;
	private String dataFormatada;
	@Dado("que eu tenho a data atual")
	public void queEuTenhoADataAtual() {
	    dataAtual = LocalDate.now();
	    System.out.println("Data autal: " + dataAtual);
	}
	@Quando("eu formatar a data atual")
	public void euFormatarADataAtual() {
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    dataFormatada = dataAtual.format(formatter);
	    System.out.println("Data formatada: " + dataFormatada);
	}
	@Então("o resultado deverá ser o dia atual no formato {string}")
	public void oResultadoDeveráSerODiaAtualNoFormato(String dataEsperada) {
	    String dataAtualEsperada = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	    System.out.println("Data Esperada: " + dataEsperada);
	    System.out.println("Data atual formatada" + dataFormatada);
	    
	    assertEquals(dataAtualEsperada, dataFormatada);
	}





}
