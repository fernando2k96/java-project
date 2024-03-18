import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor para X:");
        int X = sc.nextInt();

        System.out.println("Numeros impares até " + X + ":");

        int i = 1;

        do {
            System.err.println(i);
            i += 2;

        } while(i <= X);

        sc.close();
    }
}
