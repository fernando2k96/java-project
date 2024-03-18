    import java.util.Scanner;

    public class App {
        public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            //declarando as matrizes
            int N = sc.nextInt();
            int[][] mat = new int[N][N];

            for (int i=0; i<N; i++) {
                for (int j=0; j<N; j++) {
                    mat[i][j] = sc.nextInt();
                }
            }
            //Saida Diagonal Principal 
        System.err.println("DIAGONAL PRINCIPAL");
        for (int i=0; i<N; i++) {
            System.err.print(mat[i][i] + " ");
        }    
        System.out.println();

        //Somando quantidade de negativos
        int cont = 0;
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                if (mat[i][j] < 0) {
                    cont = cont + 1;
                }
            }
                        
        }
        System.out.println("QUANTIDADE DE NEGATIVOS = " + cont);
            sc.close();
        }
    }
