import java.util.Scanner;
public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner cu = new Scanner(System.in);
                
        int a, b, soma;
        a = cu.nextInt();
        b = cu.nextInt();

        soma = a + b;
        
        System.out.println("TOTAL = " + soma);
    
        cu.close();

    }
}
