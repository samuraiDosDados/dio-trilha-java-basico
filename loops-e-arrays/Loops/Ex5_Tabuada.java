import java.util.Scanner;

/**
 * @author: Samuel Marques
 * */

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numTabuada = 0;

        System.out.println("Tabuada De Qual Número");
        numTabuada = scanner.nextInt();

        System.out.println("Tabuada do Número: " + numTabuada);
        for (int i = 1; i <= 10; i++){
            System.out.println(numTabuada + " X " + i + " = " + (numTabuada * i));
        }
    }




}
