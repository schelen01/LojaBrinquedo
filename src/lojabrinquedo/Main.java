package lojabrinquedo;

public class Main {
    public static void main(String[] args) {
        Brinquedo brinquedo1 = new Brinquedo("VerdadeDesafio", "estrela", "12", "001", 10,299);
        Brinquedo brinquedo2 = new Brinquedo("QuebraCabeça500peças", "estrela", "10", "002", 10,359);
        Brinquedo brinquedo3 = new Brinquedo("QuebraCabeça300peças", "estrela", "5", "003", 15,300);

        System.out.println("Informações Brinquedo:" +brinquedo1.getNome());
        System.out.println("Marca do produto:" + brinquedo1.getMarca());
        System.out.println("Classificação Indicativa do produto:" + brinquedo1.getClassificacaoIndicativa());
        System.out.println("Identificação do produto:" + brinquedo1.getIdBrinquedo());
        System.out.println("Tem o produto no estoque?:" + brinquedo1.temEstoque());

    }
}