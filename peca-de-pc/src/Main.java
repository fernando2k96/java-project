import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
        
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        
        double total;
        
        if (codigo == 1) {
        	total = quantidade * 50.00;
        }
        else if (codigo == 2) {
        	total = quantidade * 120.00;
        }
        else if (codigo == 3) {
        	total = quantidade * 200.00;
        }
        else if (codigo == 4) {
        	total = quantidade * 30.00;
        }
        else {
        	total = quantidade * 500.00;
        }
	
        System.out.printf("Total: R$ %.2f%n", total);
        
        sc.close();
        
       }
  
}


