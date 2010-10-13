class selections {
    public static void main(String args[]){

    int num1;
    int num2;

    System.out.println("enter number 1");
    num1=Integer.parseInt(args[0]);

    System.out.println("enter number 2");
    num2=Integer.parseInt(args[1]);

    if (num1>num2) System.out.println("the maximum value is"+num1) ;

    else
        System.out.println("the maximum value is " +num2);
    }

}
