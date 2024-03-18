import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //Declarando as variaveis inteiras
        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] mat = new int[M][N];


        //for para ler as linhas que é i
        // for para ler as colunas que e J

        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                mat[i][j] = sc.nextInt();

            }
        }
        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
            System.err.print(mat[i][j] + " ");                

            }
            System.out.println();
        }
        sc.close();
    }
}
