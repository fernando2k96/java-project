import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Declarando vetores
        int N = sc.nextInt();
        String[] nomes = new String[N];
        int[] idades = new int[N]; 
        double[] alturas = new double[N];
        //Lendo vetores
        for (int i=0; i<N; i++) {  
            nomes[i] = sc.next();
            idades[i] = sc.nextInt();  
            alturas[i] = sc.nextDouble();
        //somando os vetores
        }
         double soma = 0.0;
         for (int i=0; i<N; i++) { 
            soma = soma + alturas[i];
        //fazendo a media entre eles
         }
         double media = soma / N;
         System.out.printf("Altura media: %.2f%n", media);
         //Quantidade de pessoas menores que 16 anos
         int cont = 0;
         for (int i=0; i<N; i++) {
             if (idades[i] < 16) {
                cont = cont + 1;   
         }
    }
    //Calculando porcetagem regra de 3 
    double x = cont * 100.0  / N;
    System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", x);

    sc.close();

   }

}