import java.util.Scanner;
public class Uri1003{
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);
        int A,B,S;

        //System.out.println ("Valor A =");
        A = teclado.nextInt();
        //System.out.println ("Valor B =");
        B = teclado.nextInt();
        S = A + B;

        System.out.println("SOMA = " +S);
    }
}