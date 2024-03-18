import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //declarando vetor
        int N = sc.nextInt();
        double[] vet = new double[N];
        //lendo vetor
        for (int i=0; i<N; i++){
            vet[i] = sc.nextDouble();
        }
        //somando 
        double maior = vet[0];
        int posicaomaior = 0;

        for (int i=0; i<N; i++){
            if (vet[i] > maior) {
                maior = vet [i];
                posicaomaior = i;  
            }
        }
        System.out.printf("%.1f%n", maior);
        System.out.println(posicaomaior);

        sc.close();
        }
        
    }

