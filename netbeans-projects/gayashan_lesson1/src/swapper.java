//this class ------>Swap
public class swapper {
      public void swap( int x, int y) {

          System.out.println("inside the class  initial x ="+x+ " ,y ="+ y ) ;

          //swap values
          int temp =x;
          x=y;
          y=temp;

          System.out.println("in swap() : finel  x ="+x+" ,y="+y );



        }
}