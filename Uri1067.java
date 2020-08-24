import java.util.Scanner;
public class Uri1067{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int x,y;
        y = 1;

        x = teclado.nextInt();
            
            do {
                if (y % 2 == 0){
                    System.out.println(y);
                }
                      y = y + 2;
            }while (y <= x);

        System.out.println(x);
        
    }
}