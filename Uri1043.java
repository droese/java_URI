import java.util.Scanner;
public class Uri1043{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float A, B, C, ptriangulo, aretangulo;

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        ptriangulo = A + B + C;
        aretangulo = ((A+B)*C/2) 
        
        if (A < (B+C) && B < (A+C) && C < (B+A)){
            System.out.printf ("Perimetro = %.1f\n", ptriangulo);
        }
        else{
            System.out.printf ("Area = %.1f\n", aretangulo);
        }
    }
}