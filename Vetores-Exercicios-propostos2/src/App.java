import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //declarei o vetor
        int N = sc.nextInt();
        int[] vet = new int[N];
        //lendo o vetor
        for (int i=0; i<N; i++){
            vet[i] = sc.nextInt();
        }
        //Mostrando os numeros pares
        for (int i=0; i<N; i++){
            if (vet[i] % 2 ==0) {
                System.out.print(vet[i] + " ");
                
            }
        } 
        System.out.println();

        //mostrando a quantidade de pares
        int quantidadeDePares = 0;
		for (int i=0; i<N; i++) {
			if (vet[i] % 2 == 0) {
				quantidadeDePares++;
			}
		}
		System.out.println(quantidadeDePares);
		
		sc.close();
    }
}
