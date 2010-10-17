import java.io.*;

public class print_numbers{


    public static void main(String[] args) throws Exception {

        int x, y=1;
       BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

       x = Integer.parseInt(br.readLine());

       while ( y<=x){
          System.out.println(y);
          y++;
          }
       

    }
}