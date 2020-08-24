import java.util.Scanner;
public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int HInicio, MInicio, HFim, MFim, HResultado, MResultado;

        HInicio = teclado.nextInt() * 60;
        MInicio = teclado.nextInt();
        HFim = teclado.nextInt() * 60;
        MFim = teclado.nextInt();
        HInicio = HInicio + MInicio;
        HFim = HFim + MFim;
        
        if ((HInicio >= HFim)){
            HResultado = ((24*60) + HInicio-HFim)/60;
            MResultado = ((24*60) + HFim - HInicio)/60;
            System.out.println ("O JOGO DUROU " + HResultado + "HORA(S) E" + MResultado + "MINUTOS");
        }
        else if (HInicio < HFim){
            HResultado = (HInicio - HFim)/60;
            MResultado = (HInicio - HFim)%60;
            System.out.println ("O JOGO DUROU " + HResultado + "HORA(S) E" + MResultado + "MINUTOS");

        }
    }
}