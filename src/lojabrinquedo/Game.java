package lojabrinquedo;

public class Game extends Brinquedo {


    public Game(String nome, String marca, String classificacaoIndicativa, String idBrinquedo, int quantidade, double precoCompra) {
        super(nome, marca, classificacaoIndicativa, idBrinquedo, quantidade, precoCompra);
    }

    @Override
    public double getPrecoCompra() {
        return super.getPrecoCompra() + (getPrecoCompra() * 0.3);
    }
}


