import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        int nun;
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um numero para realizar o calculo da fatorial: ");
        
        nun = input.nextInt();
        input.close();
        long fatorial = 1;
        int x = 1;
        if (nun <= 0) {
            System.out.println("O numero inserido deve ser positivo");
            System.exit(0);
        }

        while (x <= nun) {
            fatorial = fatorial * x;
            x++;

        }
        System.out.println("O fatorial de " + nun + " é " + fatorial);

    }

}
