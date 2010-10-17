/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author gayashan
 */
public class HandlingInput_2 {
   public static void main(String[] args) throws Exception
   {

       InputStreamReader isr  = new InputStreamReader(System.in);
       BufferedReader br = new BufferedReader(isr);

       int d;

       System.out.println("Enter Diameter in m3");
       d = Integer.parseInt(br.readLine());

       System.out.println("volume of sphere is "+(4/3*22/7*d/2*d/2*d/2)+"m3");

   }
}
