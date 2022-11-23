/* Algorithm for printing the Fibonacci Sequence 
 *
 * Algoritimo para imprimir Sequência de Fibonacci
*/

package fibo;

public class Fibonacci {

    public static void main(String[] args) {

        int a = 0;
        int b = 1;

        System.out.println(b);
        System.out.println(a);

        for(int i = 0; i < 7; i++) {

            System.out.println("The result is  " + a);

            a = a + b;
            b = a - b;
        }
    }
}