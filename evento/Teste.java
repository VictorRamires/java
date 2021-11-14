
public class Teste{

	String vetor[];

	public Teste(){
		vetor = new String[10];
		
		for(int i = 0; i < 10; i++){
			vetor[i] = ("lindo");
		}
	}	

	void imprimeVetor(){
		
		for(int i = 0; i < 10; i++){
			System.out.printf("%s \n", vetor[i]);
		}
	}



	public static void main(String[] args) {
	
		Teste vetor = new Teste();

		vetor.imprimeVetor();
	
	}
}