
class square{
    int sq()
    {
        return 10 * 10;
    }

    int squareof(int i)
    {
        return i * i;
    }


}

class squareDemo{
    public static void main(String args[])
    {
        square sq1 = new square();

        System.out.println("square of 10 is ..." + sq1.sq() );

        int x,y,z;

        x = sq1.squareof(5);
        y = sq1.squareof(2);

        System.out.println("(parameterelized method)square of any is ...\n sq of 5 = " +x + "\n sq of 2 = " + y +"\n sq of 15 = " + sq1.squareof(15) +"\n" );



    }

}