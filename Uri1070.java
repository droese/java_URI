import java.util.Scanner;
public class Uri1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int num;
        int impares=0;
        
        num = teclado.nextInt();
        if(num%2==0){
            num = num + 1;
        }
        for (int cont=1; cont<=6 ; cont++){
        
        System.out.println (num);
        num = num + 2;
        }
    }
}