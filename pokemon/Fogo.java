public class Fogo extends Pokemon{
    public Fogo(String nome, int vida, int forca) {
        super(nome, vida, forca);
    }
    @Override
    public void ataca(Attack atacando) {
        if(atacando instanceof Agua){
            this.setVida(getVida() - 25);
        }
        if(atacando instanceof Terra){
            this.setVida(getVida() - 25);
        }

        if(atacando instanceof Eletricidade){
            this.setVida(getVida() - 10);
        }

        if(atacando instanceof Normais){
            this.setVida(getVida() - 10);
        }

        if(atacando instanceof Fogo){
            this.setVida(getVida() - 15);
        }
   
    }

    @Override
    public void recebeDano(Attack apanhando) {
        if(apanhando instanceof Agua){
            this.setVida(getVida() - 0);
        }
        if(apanhando instanceof Terra){
            this.setVida(getVida() - 10);
        }

        if(apanhando instanceof Eletricidade){
            this.setVida(getVida() - 25);
        }

        if(apanhando instanceof Normais){
            this.setVida(getVida() - 10);
        }

        if(apanhando instanceof Fogo){
            this.setVida(getVida() - 10);
        }
    }

    @Override
    public String toString() {
       return super.toString();
    }
}