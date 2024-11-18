import java.util.Scanner;

public class Menu {

    public static void Menu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {

            System.out.println("1- Comprar ingresso");
            System.out.println("2- Desistência");
            System.out.println("3- Mostrar Teatro");
            System.out.println("4- Histórico de Logs");
            System.out.println("5- sair");
            System.out.println(": ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    Mostrar.Menu();
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        } while (opcao < 1 && opcao > 5);


    }
}
