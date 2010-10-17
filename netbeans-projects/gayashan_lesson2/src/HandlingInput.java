
import java.io.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gayashan
 */
public class HandlingInput {
     public static void main(String[] args) throws Exception{

         BufferedReader input=new BufferedReader(new InputStreamReader(System.in));

         String StudentName;

         System.out .println("enter student name");

         StudentName=input.readLine();

         System.out.println("student name is "+StudentName);
      }




}
