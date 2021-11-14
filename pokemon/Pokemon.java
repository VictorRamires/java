public abstract class Pokemon implements Attack{

    private String nome;
    private int vida;
    private int forca;

    public Pokemon(String nome, int vida, int forca) {
        setNome(nome);
        setVida(vida);
        setForca(forca);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if (vida > 0 && vida <= 100)
            this.vida = vida;
        else System.out.println("Vida abaixo de 0"); 
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        if (forca > 0 && forca <= 100)
            this.forca = forca;
    }

    @Override
    public String toString() {
        return "Pokemon [forca = " + forca + ", nome = " + nome + ", vida = " + vida + "]";
    }
    
}