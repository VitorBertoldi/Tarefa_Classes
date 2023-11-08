public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Cardapio cardapio = new Cardapio();
        Pedido pedido = new Pedido();
        menu.opcoes();
        cardapio.listarCardapio();
        pedido.pedir();
        menu.opcoes();
    }
}