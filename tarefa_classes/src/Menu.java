import java.util.Scanner;
public class Menu {
    /**
     * Esta classe representa o Menu
     */
    Scanner sc = new Scanner(System.in);
    public void opcoes() {
        System.out.println("digite 1 para fazer pedido");
        System.out.println("digite 2 para sair ");

        int opc = sc.nextInt();
        if (opc == 1) {
            System.out.println("Digite seu nome: ");
            String nomeCliente = sc.nextLine();
            sc.nextLine();
        }
        else {
            System.exit(0);
        }

    }
}
