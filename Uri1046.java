import java.util.Scanner;
public class Uri1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int HInicio, HFim, duracao, total;

        HInicio = teclado.nextInt();
        HFim = teclado.nextInt();
        
        if ((HInicio >= HFim)){
            total = HInicio - HFim;
            duracao = 24 - total;
            System.out.println ("O JOGO DUROU " + duracao + " HORA(S)");
        }
        else{
            duracao = HFim - HInicio;
            System.out.println ("O JOGO DUROU " + duracao + " HORA(S)");

        }
    }
}