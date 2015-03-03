
package binarios;
import java.util.*;

public class Binarios {

    
    public static void main(String[] args) {
    
        Scanner lec=new Scanner(System.in);
        int a,b;
        System.out.println("introduzca un numero");
        a=lec.nextInt();
        while(a!=0){
        b=a%2;
        a=a/2;
        System.out.print(b);
        }
        }
        
    }

