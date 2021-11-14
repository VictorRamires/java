public class Lutador{
   
    private int idade;
    private String nome;
    private String principalarte;
    String vetor[];
    int n;
    Leitor leitor = new Leitor();
    

    public Lutador(){
      setNome();
      setIdade();
      setVitorias();
      setDerrotas();
      setPrincipal();
      //setArtesMarciais();
    }

    public void setNome(){
      System.out.println("Insira o nome: ");
      nome = leitor.leString();
    }

    public String getNome(){
        return nome;
    }

    public void setIdade(){
        System.out.println("Insira a idade: ");
        idade = leitor.leInteiro();
    }

    public int getIdade(){
        return idade;
    }


    public void setPrincipal(){
        System.out.println("Principal arte marcial: ");
        principalarte = leitor.leString(); 
    }
        

    /*public void setArtesMarciais(){

        System.out.println("Quantas artes marciais ele pratica?: ");
        n = leitor.leInteiro();
        vetor = new String[n];      
        System.out.println("qual(is)?: ");

        for(int i = 0; i < n; i++){
            vetor[i] = leitor.leString();
        } 
    }*/

    public void setVitorias(){
    	System.out.println("Vitorias do lutador: ");
    	vitorias = leitor.leInteiro();
    }
     
     public void setDerrotas(){
    	System.out.println("Derrotas do lutador: ");
    	derrotas = leitor.leInteiro();
    }

    public void listaLutadores(){
        System.out.printf("Lutador: %s \n", nome);
        System.out.printf("idade: %d \n", idade);        
        System.out.printf("Principal arte marcial: %s \n", principalarte);

        System.out.printf("\n");
    }
}