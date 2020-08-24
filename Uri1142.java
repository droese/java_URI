import java.util.Scanner;
public class Uri1142{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);


        int x, num, valor;


        valor = 1;
        num = 1;


        x = teclado.nextInt();


        do{
            System.out.println((num) + " " +(num +=1) + " " +(num +=1) + " PUM");
            num +=2;
            valor +=1;


        } while (valor <=x);
    }
}






