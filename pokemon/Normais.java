public class Normais extends Pokemon{
    
    public Normais(String nome, int vida, int forca) {
        super(nome, vida, forca);
    }

    @Override
    public void ataca(Attack atacando) {
        if(atacando instanceof Agua){
            setVida(getVida() - 10);
        }
        if(atacando instanceof Terra){
            setVida(getVida() - 10);
        }

        if(atacando instanceof Eletricidade){
            setVida(getVida() - 10);
        }

        if(atacando instanceof Normais){
            setVida(getVida() - 15);
        }

        if(atacando instanceof Fogo){
            setVida(getVida() - 5);
        }
   
    }

    @Override
    public void recebeDano(Attack apanhando) {
        if(apanhando instanceof Agua){
            setVida(getVida() - 0);
        }
        if(apanhando instanceof Terra){
            setVida(getVida() - 0);
        }

        if(apanhando instanceof Eletricidade){
            setVida(getVida() - 0);
        }

        if(apanhando instanceof Normais){
            setVida(getVida() + 10);
        }

        if(apanhando instanceof Fogo){
            setVida(getVida() - 10);
        }
    }



}