/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gayashan
 */
public class commandLine {
    public static void main(String[] args){

    int number;
    int a,b,c,remainder;

    number = Integer.parseInt( args[0]);

    a=number/1000;        remainder=number%1000;
    b=remainder/100;         remainder=remainder%100;
    c=remainder/10;          remainder=remainder%10;

    System.out.println("thousends are" +a);
    System.out.println("hundreds are" +b);
    System.out.println("tens are" +c);
    System.out.println("thousends are"+remainder);

    }
}
