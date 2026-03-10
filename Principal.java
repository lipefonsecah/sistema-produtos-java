package produtos;

public class Principal {

    public static void main(String[] args) {

        produtos p1 = new produtos("Notebook", 3500);
        produtos p2 = new produtos("Mouse", 80);
        produtos p3 = new produtos();

        p3.nome = "Teclado";
        p3.preco = 150;

        p1.exibirDados();
        p2.exibirDados();
        p3.exibirDados();

        produtos.exibirQuantidadeTotal();

    }

}