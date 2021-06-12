import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReference {

    public static void main(String[] args) {

        // Primeiro pensamento: seria fazer uma classe anonima.
        List<String> numerosAleatorios1 = Arrays.asList("1","0","4","1","2","3","9","9","6","5");
        System.out.println("Numeros Aleatórios 1");

        numerosAleatorios1.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });


        // Segundo pensamento: seria resumir para lambda.
        List<String> numerosAleatorios2 = Arrays.asList("1","0","4","1","2","3","9","9","6","5");
        System.out.println("\n Numeros Aleatórios 2");

        numerosAleatorios2.forEach(s -> System.out.println(s));


        // Por fim: transformar a lambda para um "method reference"
        List<String> numerosAleatorios3 = Arrays.asList("1","0","4","1","2","3","9","9","6","5");
        System.out.println("\n Numeros Aleatórios 3");

        numerosAleatorios3.forEach(System.out::println);
    }
}