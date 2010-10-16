// combime with swapper

class Swap {
    public static void main(String[] args){

          int a,b ;
          a=3;
          b=5;

          System.out.println("in main() : int a ="+a+ " int b ="+b);

          swapper myswapper =new swapper();

          myswapper.swap(a, b);

    }
}