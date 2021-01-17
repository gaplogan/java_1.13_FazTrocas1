import java.util.Scanner;

public class FazTrocas1 {
    public static void main(String[] args) throws Exception {
        int n1, n2, aux;

        Scanner entrada = new Scanner(System.in);

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        
            do
            {
                System.out.print("Digite o primeiro número: ");
                n1 = entrada.nextInt();

                System.out.print("Digite o segundo número: ");
                n2 = entrada.nextInt();

                System.out.println(); //salta linha

            } while (n1 == n2);

            System.out.println();
            System.out.println("Valores antes das trocas:");
            System.out.println("Primeiro número " + n1);
            System.out.println("Segundo número " + n2);

            //{Faz as trocas utilizando uma variável auxiliar}
            aux = n1;
            n1 = n2;
            n2 = aux;

            System.out.println();
            System.out.println();
            System.out.println("Valores após das trocas:");
            System.out.println("Primeiro número " + n1);
            System.out.println("Segundo número " + n2);

            entrada.close();
    }
}
