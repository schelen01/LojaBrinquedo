
public class Carrinho extends Brinquedo {
    public Carrinho(String nome, String marca, int classificacaoIndicativa, boolean tipo, int idBrinquedo, int quantidade, double precoCompra, double precoVenda) {
        super(nome, marca, classificacaoIndicativa, tipo, idBrinquedo, quantidade, precoCompra, precoVenda);
    }

    @Override
    public double getPrecoVenda(){
        return super.getPrecoCompra() + (getPrecoCompra() * 0.6);
    }
}
