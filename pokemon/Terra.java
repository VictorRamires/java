public class Terra extends Pokemon {
   
    public Terra(String nome, int vida, int forca) {
        super(nome, vida, forca);
    }

    @Override
    public void ataca(Attack atacando) {
        if(atacando instanceof Agua){
            setVida(getVida() - 25);
        }
        if(atacando instanceof Terra){
            setVida(getVida() - 15);
        }

        if(atacando instanceof Eletricidade){
            setVida(getVida() - 0);
        }

        if(atacando instanceof Normais){
            setVida(getVida() - 0);
        }

        if(atacando instanceof Fogo){
            setVida(getVida() - 0);
        }
   
    }

    @Override
    public void recebeDano(Attack apanhando) {
        if(apanhando instanceof Agua){
            setVida(getVida() - 0);
        }
        if(apanhando instanceof Terra){
            setVida(getVida() - 10);
        }

        if(apanhando instanceof Eletricidade){
            setVida(getVida() - 25);
        }

        if(apanhando instanceof Normais){
            setVida(getVida() - 10);
        }

        if(apanhando instanceof Fogo){
            setVida(getVida() - 10);
        }
    }


}