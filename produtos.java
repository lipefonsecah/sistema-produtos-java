package produtos;

public class produtos {

    String nome;
    double preco;
    static int quantidadeTotal = 0;

    // construtor padrão
    public produtos() {
        quantidadeTotal++;
    }

    // construtor com parâmetros
    public produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        quantidadeTotal++;
    }

    void exibirDados() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("-------------------");
    }

    static void exibirQuantidadeTotal() {
        System.out.println("Total de produtos cadastrados: " + quantidadeTotal);
    }

}