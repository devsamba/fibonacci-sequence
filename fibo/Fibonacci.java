/* Algorithm for printing the Fibonacci Sequence 
 *
 * Algoritimo para imprimir Sequência de Fibonacci
*/

package fibo;

public class Fibonacci {

    public static void main(String[] args) {

        int a = 0, b = 1;

        System.out.println(b);
        System.out.println(a);

        for(int i = 0; i < 8; i++) {

            a = a + b;
            b = a - b;

            System.out.println("The result is  " + a);

        }
    }
}