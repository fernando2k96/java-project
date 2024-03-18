package salariobonus2;
import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double salariofixo, vendas, total;
		
		nome = sc.next();

		salariofixo = sc.nextDouble();
		vendas = sc.nextDouble();
		
		total = salariofixo + vendas * 0.15;
		
		System.out.printf("TOTAL = R$ %.2f%n", total);
		
		sc.close();

	}

}
