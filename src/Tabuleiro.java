public class Tabuleiro extends Brinquedo {
    //Herda tudo, menos o construtor do tabuleiro


    public Tabuleiro(String nome, String marca, int classificacaoIndicativa, boolean tipo, int idBrinquedo, int quantidade, double precoCompra, double precoVenda) {
        super(nome, marca, classificacaoIndicativa, tipo, idBrinquedo, quantidade, precoCompra, precoVenda);
    }

    @Override
    public double getPrecoCompra(){
        return super.getPrecoCompra() + (getPrecoCompra() * 0.5);
    }


}
