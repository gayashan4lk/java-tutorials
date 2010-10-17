//training for nested if else
import java.io.*;

public class If_else{
    public static void main(String[] args)throws Exception
    {
    
            BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
             
             char grade;
             int x;
             x=Integer.parseInt(br.readLine()) ;
            
             if(x>=75){
                 grade= 'A';
             }
             else if (x>=65) { 
                 grade= 'B';
             }
             else if (x>=50) { 
                 grade= 'C';
             }
             else if (x>=35) { 
                 grade= 'S' ;
             }
             else {grade= 'F';
             }

             System.out .println("Grade"+grade);
                             
            
    }
}
