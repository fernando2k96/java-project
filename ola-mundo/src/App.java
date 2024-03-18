import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //Declarando as variaveis
        int a;
        int b;
        double cont;

        //Recebendo as variaveis
        a = sc.nextInt();
        b = sc.nextInt();
        
        cont = a * b;

        System.out.println("O valor total e: " + cont);
    
    
        
    }
}
