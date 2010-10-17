
import java.io.*;


public class print_name{
  
     public static void main(String[] args) throws Exception{
                  
      int x, y=1 ;
      BufferedReader B =new BufferedReader(new InputStreamReader(System.in));
        
     System.out.println("enter something ");
     x =Integer.parseInt(B.readLine());

     while (y <=x ){
         y++;
         System.out.println("gayashan is the greatest");
     }
          System.out.println("printing process is ended!");

        
        
     }
             
}