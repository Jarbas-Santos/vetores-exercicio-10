import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();

        String[] vectNames = new String[n];
        double[] vectNotaS1 = new double[n];  
        double[] vectNotaS2 = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
            sc.nextLine();
            vectNames[i] = sc.nextLine();
            vectNotaS1[i] = sc.nextDouble();
            vectNotaS2[i] = sc.nextDouble();            
        }
        
        System.out.println("Alunos aprovados:");
        for (int i = 0; i < n; i++) {
            double average = (vectNotaS1[i] + vectNotaS2[i]) / 2.0;
            if (average >= 6.0) {
                System.out.println(vectNames[i]);
            }
        }

        sc.close();
    } 
}