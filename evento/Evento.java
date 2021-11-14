public class Evento{
    
    private String nome;
    private String pais;
    Leitor leitor = new Leitor();

    public Evento(){
       	setNome();
       	setPais();
     }

    public void setNome(){
       	System.out.println("Qual o nome do evento? : ");
       	nome = leitor.leString(); 
    }

    public String getNome(){
      return nome;
    }

    public void setPais(){
       	System.out.println("Qual pais ocorrera o evento?: ");
        pais = leitor.leString(); 
    }

    public String getPais(){
      return pais;
    }
    
    public void listaEvento(){
    	System.out.printf("evento: %s \n", nome);
    	System.out.printf("ocorrera no pais: %s \n", pais);
    	System.out.printf("\n");
    }
}