import java.util.Scanner;
public class Uri1114{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int codsenha;
        codsenha = teclado.nextInt();
        
        while(codsenha != 2002){
            System.out.println("Senha Invalida");
            codsenha = teclado.nextInt();
        }
       System.out.println("Acesso Permitido");
    }
}