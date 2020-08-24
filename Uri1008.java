import java.util.Scanner;
public class Uri1008{
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);
        
        int nfuncionario, horas; 
        float valorhora, salario;

        nfuncionario = teclado.nextInt();
        horas = teclado.nextInt();
        valorhora = teclado.nextFloat();

        salario = horas * valorhora;

        System.out.println("NUMBER = " + nfuncionario);
        System.out.printf("SALARY = U$%.2f\n", salario);
    }
}