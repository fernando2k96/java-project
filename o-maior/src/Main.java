import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int a, b, c, d, e;
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
       d = (a + b + Math.abs(a - b)) /2;
       e = (d + c + Math.abs(c - d)) /2;
       
        
        System.out.println(e + " eh maior");
        
        
        sc.close();
        
	}

}
