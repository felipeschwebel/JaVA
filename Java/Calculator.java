import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    char op;
    Double n1, n2;
    Scanner input = new Scanner(System.in);


    System.out.println("Escolha qual operação deseja fazer: (+, -, *, /)");
    op = input.next().charAt(0);

    System.out.println("Insira o primeiro e o segundo Numero um por um");
    n1 = input.nextDouble();
    n2 = input.nextDouble();
    input.close();

    switch (op) {
        


      case '+':
        System.out.printf("%.2f + %.2f = %.2f", n1, n2, (n1+n2));
        break;

      case '-':
      System.out.printf("%.2f - %.2f = %.2f", n1, n2, (n1-n2));
        break;

      case '*':
        System.out.printf("%.2f * %.2f = %.2f", n1, n2, (n1*n2));
        break;

      case '/':
      if (n2 != 0)
        System.out.printf("%.2f / %.2f = %.2f", n1, n2, (n1/n2));
        else 
        System.out.println("Escolha um numero diferente de 0");
        break;

      default:
        System.out.printf("%c não é uma operação válida", op);
        break;
    }

    
  }
}
