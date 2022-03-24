import java.util.Random;

public class Sorteio { 
    //Atributos , propriedades, variaveis globais

    //funcoes e procedimentos

    // Rotina principal

    public static void main(String[] args) {

        Random gerador = new Random();

        int c = 1;
        int soma = 0; // ou 1
        int maior = 0;
        int menor = 100;

       
        while (c <= 1000){
            //ler o numero
            int n = 1 + gerador.nextInt(100);


           // if( c == 1){
                //maior = n;
                //menor = n;
           // }
            soma += n; //soma = soma + n
            if (n > maior){
                maior = n;
    
            }
    
            if (n > menor){
                menor = n;
                
            }
            
            c++; // c += 1 ou c = c + 1
            System.out.println(n);
        }
        System.out.println("Maior = "+ maior);
        System.out.println("Menor = "+ menor);
        System.out.println("Soma = "+ soma/1000f);

    }
}