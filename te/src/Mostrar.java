import java.util.Scanner;

public class Mostrar {
    public static void Mostrar() {
        for (int i = 1; i < 31; i++) {
            System.out.println( i + "A");
            for (int j = 1; j < 51; j++) {
                System.out.print(j + "-L "+ "\t");
            }
            System.out.println();


        }
        System.out.println();
        Menu.Menu();


    }
    public static void Mostrar2(){
        for (int i = 1; i < 21; i++) {
            System.out.println( i + "B");
            for (int j = 1; j < 31; j++) {
                System.out.print(j + "-L "+ "\t");
            }
            System.out.println();


        }
        System.out.println();
        Menu.Menu();

    }
    public static void Mostrar3(){
        for (int i = 1; i < 11; i++) {
            System.out.println( i + "C");
            for (int j = 1; j < 16; j++) {
                System.out.print(j + "-L "+ "\t");
            }
            System.out.println();


        }
        System.out.println();
        Menu.Menu();

    }
    public static void Menu(){

        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("1- 1° andar");
            System.out.println("2- 2° andar ");
            System.out.println("3- 3° andar");
            System.out.println("4- voltar");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Mostrar();
                    break;
                case 2:
                    Mostrar2();
                    break;
                case 3:
                    Mostrar3();
                    break;
                case 4:
                    Menu.Menu();
                    break;
                default:
                    System.out.println("opção inválida! Tente Novamente!");
                    break;
            }
        } while (opcao < 1 && opcao > 4);




    }
}

