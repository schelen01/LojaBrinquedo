package lojabrinquedo;

public class Tabuleiro extends Brinquedo {
    //Herda tudo, menos o construtor do tabuleiro

    public Tabuleiro(String nome, String marca, String classificacaoIndicativa, String idBrinquedo, int quantidade, double precoCompra) {
        super(nome, marca, classificacaoIndicativa, idBrinquedo, quantidade, precoCompra);
    }

    //implementa a lógica da margem.. é abstract? Pegar preço da compra e margem

    @Override
    public double getPrecoCompra() {
        return super.getPrecoCompra() + (getPrecoCompra() * 0.5);
    }
}

