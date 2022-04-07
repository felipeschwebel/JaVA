import java.util.Scanner;



public class Adivinha {

  



  public static void main(String[] args) {



    int erros = 10, tentativa = 0, palpite = 0;

    int num = 0;

    

    String opcao;

    Scanner scan = new Scanner(System.in);



    num = (int) (Math.random() * 101);



    tentativa = 0;

    erros = 10;

    System.out.println("Número entre 1 e 100 sorteados, você tem 10 tentativas para tentar acertar!");

    while (palpite != num && erros > 0) {



      System.out.print("Adivinhe o número: ");

      

      palpite = scan.nextInt();



      tentativa++;



      if (num < palpite) {

        erros--;

        System.out.println("O número sorteado é menor");

        System.out.println("Você tentou " + tentativa + " vezes antes de acertar!,");

        

      } else if (num > palpite) {

        erros--;

        System.out.println("O número sorteado é maior");

        System.out.println("Você tentou " + tentativa + " vezes antes de acertar!");

      }

    }



    if (palpite == num) {

      System.out.println("Parabéns! Você acertou o número em " + tentativa + " tentativas. Número sorteado: " + num);

    } else if (erros == 0) {

      System.out.println("Você perdeu! O número sorteado foi o " + num);

    }

  }

}
