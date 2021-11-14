public class Luta{

	private String lutador1;
	private String lutador2;
	private String vencedor;
	Leitor leitor = new Leitor();

	public Luta(){
		setLutador1();
		setLutador2();
		setVencedor();
	}

	public void setLutador1(){
		System.out.println("Nome dos competidores: ");
	    lutador1 = leitor.leString(); 
	}	

	public String getLutador1(){
		return lutador1;
	}

	public void setLutador2(){
		System.out.println("lutando contra: ");
	    lutador2 = leitor.leString(); 
	}

	public String getLutador2(){
		return lutador2;
	}

	public void setVencedor(){
		System.out.println("O vencedor da luta foi: ");
	    vencedor = leitor.leString();
		System.out.printf("\n");

	}

	public void listaLutas(){
		System.out.printf("Luta: %s x %s \n", lutador1, lutador2);
		System.out.printf("Vencedor: %s\n", vencedor);

	}



}