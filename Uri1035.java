import java.util.Scanner;
publicclassUri1035{
publicstaticvoidmain(Stringargs[]){
Scannerteclado = newScanner(System.in);
 
intA, B, C, D;
 
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();
 
if ( ( B > C) && (D > A) && (C + D > A + B) && (C > 0 && D > 0)  && (A%2 == 0) ){
 
System.out.println("Valores aceitos");
        }
else{
System.out.println("Valores nao aceitos");
 
        } 
 
    }       
}

