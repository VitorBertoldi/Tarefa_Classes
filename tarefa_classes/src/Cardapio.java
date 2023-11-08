import java.util.Arrays;
import java.util.List;

public class Cardapio {
    /**
     * Esta classe representa o cardapio de um restaurante
     */
    List<String> cardapio = Arrays.asList("Carbonara", "Bolonhesa", "Parmegiana");
    List<Double> valor = Arrays.asList(32.3, 33.4, 55.6);
    public void listarCardapio() {
        for (int i = 0; i < cardapio.size(); i++) {
            System.out.print(i + 1 + ": ");
            System.out.println(cardapio.get(i));
        }
    }
    public String getCardapio(int i) {
        return cardapio.get(i).toString();
    }
    public Double getValor(int i) {
        return valor.get(i);
    }
}
