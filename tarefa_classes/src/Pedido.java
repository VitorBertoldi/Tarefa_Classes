import java.util.ArrayList;
import java.util.Scanner;
public class Pedido {
    /**
     * Esta classe representa os pedidos
     */
    Cardapio cardapio = new Cardapio();
    Scanner sc = new Scanner(System.in);
    ArrayList<String> pedido = new ArrayList<>();
    ArrayList<Double> valorPedido = new ArrayList<>();
    public void pedir() {
        int opcao = 1;
        while (opcao != 0) {
            try {
                System.out.println("Digite o numero do item desejado: ");
                opcao = sc.nextInt();
                pedido.add(cardapio.getCardapio(opcao - 1));
                valorPedido.add(cardapio.getValor(opcao - 1));
            } catch (Exception e) {
                System.out.println("Opcao Invalida");
            }
        }
        System.out.println("Seu pedido foi: ");
        double sum = 0;
        for (int i = 0; i < pedido.size(); i++) {
            System.out.println(pedido.get(i));
            System.out.print("Valor: ");
            System.out.println(valorPedido.get(i));
        }
        for (double number : valorPedido){
            sum += number;
        }
        double taxa = sum * 0.1;
        double valorTotal = taxa + sum;
        System.out.println("Taxa de serviço: " + taxa);
        System.out.println("o valor total foi: " + valorTotal);

        System.out.println("Quanto foi recebido em dinheiro: ");
        double recebido = sc.nextDouble();

        double troco = recebido - valorTotal;
        System.out.println("Seu troco: " + troco);
    }

}
