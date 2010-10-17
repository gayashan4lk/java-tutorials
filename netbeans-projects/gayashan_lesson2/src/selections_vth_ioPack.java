/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author gayashan
 */
public class selections_vth_ioPack {
    public static void main(String args[])throws Exception
    {

  
    BufferedReader br=new BufferedReader (new InputStreamReader(System.in)) ;

    int num1,num2;

    System.out.println("enter number 1");
    num1=Integer.parseInt(br.readLine());

    System.out.println("enter number 2");
    num2=Integer.parseInt(br.readLine());

    if (num1>num2) System.out.println("the maximum value is"+num1) ;

    else
        System.out.println("the maximum value is " +num2);
    }

}
