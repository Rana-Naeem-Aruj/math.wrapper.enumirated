/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicematch;
import java.util.Scanner;
public class Practicematch {
    enum Flavour{choco,banana,kulfa};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Flavour f1,f2,f3;
        f1=Flavour.choco;
        f2=Flavour.banana;
        f3=Flavour.kulfa;
        System.out.println(f1);
        System.out.println(f1);
        System.out.println(f3.ordinal());
        
        int a=2;
       int y;
       long b;
        Integer ab=a;
        Integer ac=20;
        int aa=ac;
        String str="200";
        System.out.println(Math.ceil(7.4));//round the value
        System.out.println(Math.floor(7.8));//round downd value
        System.out.println(Math.sqrt(a));
        System.out.println(Math.pow(2,2));//power
        System.out.println(Math.round(7.8));
        System.out.println(Math.min(7,4));//minimum number
        System.out.println(Math.max(7,4));
        System.out.println(Math.exp(3));
       
        System.out.println(ab);
        y=Integer.parseInt(str);
        b=Long.parseLong(str);
         System.out.println(y);
          System.out.println(b);
          System.out.println(aa);

    }
            
    
}
