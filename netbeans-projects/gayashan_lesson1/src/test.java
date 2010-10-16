// classes & objects_part1 //

class numbers {
       int i;
 }


public class test {
          public static void main(String[] args){

               numbers n1 ;

                n1 = new numbers();
               numbers n2 = new numbers();
               numbers n3 = new numbers();

               n1.i= 10;
               n2.i= 56;
               n3.i=100;

               System.out.println(n1);
               System.out.println(n2);
               System.out.println(n3);

               System.out.println(" n1.i=" +n1.i+ ", n2.i="+ n2.i+", n3.i="+n3.i);
          }

}