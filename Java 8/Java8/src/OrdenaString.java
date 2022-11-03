import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaString {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("casa do código");
        palavras.add("caelum");

        Collections.sort(palavras);
        System.out.println(palavras);

        Comparator<String> comparador = new ComparadorDeStringPorTamanho();
        palavras.sort(comparador);
        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println(palavras);

        Consumer<String> consumidor = new ConsumidorDeString();
        palavras.forEach(consumidor);

        palavras.forEach(s -> System.out.println(s));
    }
}
