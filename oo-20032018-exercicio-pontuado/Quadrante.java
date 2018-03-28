import java.util.Scanner;
public class Quadrante {
	private string quadrantetipo;
	private int quadranteposicao;
	private boolean quadrantestatus;
	
	public Quadrante(string quadrantetipo, int quadranteposicao, boolean quadrantestatus) {
		this.quadrantestatus = 0;
		this.quadrantetipo = quadrantetipo;
		this.quadrantetipo = quadranteposicao;	
	}
	
	public void preencher(string quadrantetipo) {
		this.quadrantetipo = quadrantetipo;
		quadrantestatus = 1;
	}
	
	public boolean isPreenchido() {
		return this.quadrantestatus == 1;
	}
		
		// Quadrante
			// um quadrante precisa ter um estado que diga se está preenchido ou não
			// também precisa de um tipo para saber se o quadrante é X ou O assim como o usuário
			// lembre-se de encapsular sempre os dados, e se fizer necessário criar atributos
		
		//Contrutor Quatrante
			// no construtor você pode iniciar o quadrante vazio e com um tipo vazio "  "
		
		//Metodo Preencher 
			// este método pode ser usuado para mudar o estado do quadrante para preenchido
			
		//Metodo Preenchido 
			// aqui você verifica se o quadrante é preenchido ou não
}