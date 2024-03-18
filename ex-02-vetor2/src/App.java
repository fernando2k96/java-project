import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //declarando vetor double
        int N = sc.nextInt();
        double[] vet = new double[N];
        //populando vetor double
        for (int i=0; i<N; i++) {
            vet[i] = sc.nextDouble();
        }
        //Imprimindo vetor double
        for (int i=0; i<N; i++) {
            System.out.print(vet[i] + " ");
            
        }
        System.out.println();
        //Calculando a soma 
        double soma = 0.0;
        for (int i=0; i<N; i++) {
            soma = soma + vet[i];
        }       
      System.out.printf("%.2f%n", soma);
       //Calculando a media
      double media = soma / N;
      System.out.printf("%.2f%n", media);

      sc.close();
    }
}
