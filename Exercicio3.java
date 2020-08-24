import java.util.Scanner;
public class Exercicio3{
    public static void main (String args []){
    Scanner teclado = new Scanner(System.in);
        float salMinimo;
        float consumokw;
        float valor1kw;
        float valorConta;
        float valorComDesconto;

        //ENTRADA
        System.out.println ("Digite o valor do salário mínimo");
        salMinimo = teclado.nextFloat();
        System.out.println ("Digite o consumo em KW da residencia");
        consumokw = teclado.nextFloat();

        //PROCESSAMENTO
        valor1kw = salMinimo/700.0f;
        valorConta = valor1kw * consumokw;
        valorComDesconto = valorConta * 0.9f;

        // saída no formato F
        System.out.printf ("Valor de 1 Kw R$ %.2f\n", valor1kw);
        System.out.printf ("Valor bruto R$ %.2f\n", valorConta);
        System.out.printf ("Valor c/ desc R$ %.2f\n", valorComDesconto);
    }
}