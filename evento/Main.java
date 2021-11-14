public class Main{
	public static void main(String[] args) {
		Leitor leitor = new Leitor();
		Lutador[] atleta = new Lutador[100];
		Evento[] evento = new Evento[10];
		Luta[] lutas = new Luta[1000];

		int num;
		int j = 0;
		int k = 0;
		int l = 0;
			
			System.out.println("1 - Cadastrar um evento de MMA, informando o nome e o país de origem;"); 
			System.out.println("2 - Cadastrar um lutador e suas informações pessoais e técnicas;");
			System.out.println("3 - Cadastrar uma luta. Uma luta só pode envolver lutadores e eventos já cadastrados;");
			System.out.println("4 - Listar todos os eventos de MMA com suas informações básicas;");
			System.out.println("5 - Listar todos os lutadores de MMA, com suas informações pessoais e técnicas. ");

			do{
				System.out.println("Escolha uma opção do menu: ");
				num = leitor.leInteiro();
				
				switch(num){
					
					case 1: 
						evento[k] = new Evento();
						k++;
						break;

					case 2:
						atleta[j] = new Lutador();
						j++;
						break;

					case 3:
						lutas[l] = new Luta();
						l++;
						break;

					case 4: 
						for(int i = 0; i < k; i++){
							evento[k].listaEvento();
						}
						break;

					case 5:
						for(int i = 0; i < j; i++){
							atleta[i].listaLutadores();
							
						}

						break;

					default: System.out.println("Digito invalido.");
				}

			}while(num != 0);		
			
	}
}