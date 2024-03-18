import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //Criando vetor String   
        int N = sc.nextInt();
        String [] nomes = new String[N];
        //Populando vetor String
        for (int i=0; i<N; i++){
            nomes[i] = sc.next();
        }
        //Lendo nomes lidos ''para cada ''
        System.out.println("Nomes lidos:");
        for (String s : nomes) {
            System.out.println(s);
        }
        sc.close();
    }
}
