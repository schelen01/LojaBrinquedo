
public class Brinquedo {

    private String nome;
    private String marca;
    private int classificacaoIndicativa;
    private double precoCompra;
    private double precoVenda;
    private boolean tipo;
    private int idBrinquedo;
    //Criando um atributo do tipo Classe
    private Estoque estoque;

    public Brinquedo (String nome, String marca, int classificacaoIndicativa, boolean tipo, int idBrinquedo, int quantidade, double precoCompra, double precoVenda){
        this.nome =nome;
        this.marca= marca;
        this.classificacaoIndicativa = classificacaoIndicativa;
        this.estoque = new Estoque(quantidade, precoCompra);
        this.precoCompra = precoCompra;
        this.tipo = tipo;
        this.idBrinquedo = idBrinquedo;
        this.precoVenda = precoVenda;
    }

    public boolean temEstoque(){
        if(estoque.getQuantidade() > 0){
            return true;
        } else {
            return false;
        }
    }
    protected double getPrecoCompra(){
        return getPrecoCompra();
    }

    public Estoque getEstoque() {
        return this.estoque;
    }


}
