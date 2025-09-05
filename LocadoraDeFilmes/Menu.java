import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int controle;
        Scanner entrada = new Scanner(System.in);

        

        System.out.println("Digite o nome da locadora");
        Locadora loc = new Locadora(entrada.nextLine());
        
        do {
            System.out.println("1 - Adicionar filme \n 2 - Exibir filmes");
            controle = entrada.nextInt();
            entrada.nextLine();
            switch (controle) {
                case 1:
                    System.out.print("Digite o nome do seu novo filme: ");
                    String nome = entrada.nextLine();
                    System.out.print("Digite a categoria do seu novo filme: ");
                    String genero = entrada.nextLine();
                    System.out.print("Digite o ano de lançamento do seu novo filme: ");
                    int anoLancamento = entrada.nextInt();

                    loc.adicionarFilme(new Filme(nome, genero, anoLancamento));
                    break;

                case 2:
                    loc.listarFilmes();
                    break;

                default:
                    break;
            }
        } while (true);

    }

}