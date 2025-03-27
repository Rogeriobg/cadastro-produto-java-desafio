import java.util.Scanner;

public class CadastroProduto {

    public static void main(String[] args) {
        // Criando um objeto Scanner para capturar os dados inseridos pelo usuário
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        int codigoProduto;
        String nomeProduto;
        double precoProduto;
        int quantidadeProduto;

        // Solicitar e capturar os dados do usuário
        System.out.print("Por favor, digite o código do produto: ");
        codigoProduto = scanner.nextInt(); // Lê o código do produto

        scanner.nextLine(); // Consumir a quebra de linha após o número

        System.out.print("Por favor, digite o nome do produto: ");
        nomeProduto = scanner.nextLine(); // Lê o nome do produto

        System.out.print("Por favor, digite o preço do produto: ");
        precoProduto = scanner.nextDouble(); // Lê o preço do produto

        System.out.print("Por favor, digite a quantidade em estoque: ");
        quantidadeProduto = scanner.nextInt(); // Lê a quantidade em estoque

        // Exibir a mensagem com as informações inseridas
        System.out.println("Cadastro realizado com sucesso! O produto " + nomeProduto + " foi cadastrado com o código "
                + codigoProduto +
                ", preço " + precoProduto + " e quantidade " + quantidadeProduto + " em estoque.");

        // Fechar o scanner para evitar vazamento de recursos
        scanner.close();
    }
}
