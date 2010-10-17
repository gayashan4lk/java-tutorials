/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author gayashan
 */
public class For {
    public static void main(String args[])throws Exception
    {
          int num , fact=1;

          BufferedReader BR = new BufferedReader (new InputStreamReader(System.in));

          num = Integer.parseInt(BR.readLine());
    
    for (int i= 1; i<=num; i++)
          fact = fact*i ;
    System.out.println("the factorial of " +num+ " is "+fact);
    }

}
