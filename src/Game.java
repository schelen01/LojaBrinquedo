
public class Game extends Brinquedo{
    public Game(String nome, String marca, int classificacaoIndicativa, boolean tipo, int idBrinquedo, int quantidade, double precoCompra, double precoVenda) {
        super(nome, marca, classificacaoIndicativa, tipo, idBrinquedo, quantidade, precoCompra, precoVenda);
    }

    //implementa a lógica da margem.. é abstract? Pegar preço da compra e margem
    @Override
    public double getPrecoCompra(){
        return super.getPrecoCompra() + (getPrecoCompra() * 0.5);
    }
}
