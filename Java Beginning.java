
package enyeni;
import java.util.Scanner;

public class Enyeni {

 
    public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
    
    int a, b, c;
    System.out.print("A = ");
    a = kbd.nextInt();
    System.out.print("B = ");
    b = kbd.nextInt();
    
    c = a+b;
    System.out.println("İşlemin sonucu : "+c);
        
   }

}