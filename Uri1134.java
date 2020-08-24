import java.util.Scanner;
public class Uri1134{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int valor, alcool, gasolina, diesel;
        boolean loop;

        alcool = 0;
        gasolina = 0;
        diesel = 0;
        loop = true;

        while(loop){
            valor = teclado.nextInt();

            switch (valor){
                case 1:
                alcool +=1;
                break;
                case 2:
                gasolina +=1;
                break;
                case 3:
                diesel +=1;
                break;
                case 4:
                loop = false;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}