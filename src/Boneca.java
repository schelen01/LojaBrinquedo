
public class Boneca extends Brinquedo {
    public Boneca(String nome, String marca, int classificacaoIndicativa, boolean tipo, int idBrinquedo, int quantidade, double precoCompra, double precoVenda) {
        super(nome, marca, classificacaoIndicativa, tipo, idBrinquedo, quantidade, precoCompra, precoVenda);
    }
    @Override
    public double getPrecoCompra(){
        return super.getPrecoCompra() + (getPrecoCompra() * 0.5);
    }
}
