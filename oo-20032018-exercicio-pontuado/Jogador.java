import java.util.Scanner;
public class Jogador {
	private string jogadornome;
	private string jogadortipo;
	
	Jogador (string jogadornome, string jogadortipo){
		this.jogadornome = jogadornome;
		this.jogadortipo = jogadortipo;
		System.out.println("Informe seu nome: ");
		jogadornome = scan.nextString();
	}

	public string getnome (){
		return this.jogadornome;		
	}
	
	public string gettipo (){
		return this.jogadortipo;
	}
	// este cara precisa ter ao menos nome e tipo (X ou O)
	// é necessário encapsular os atributos para garantir a integridade dos dados
	// você deve obrigar nome e tipo quando o objeto for criado
	// fazer métodos para pegar o nome e o tipo	
}