//introducing methods
class box{

double w;
double h;
double d;
double a,b,c;
int test;

double volume()
	{
	return w * h * d ;
	}
//another part ***************************************************************
double volumeof()
{
    return a * b * c ;
}

void setDim(double e, double f, double g )
{
    a = e;
    b = f;
    c = g;
}
int testmethod(int h ,int i )
{
    test = h * i ;
    return test ;

}

}
//*****************************************************************************

//starting main class
class boxDemo
{
	public static void main(String args[])
	{
		box b1 = new box();
		box b2 = new box();
		double vol;

		b1.w = 10;
		b1.d = 10;
		b1.h = 10;

		vol = b1.volume();
		System.out.println( "volume1 =  " +vol );

		b2.w = 2;
		b2.d = 2;
		b2.h = 2;
		vol = b2.volume();
		System.out.println( "volume2 = "+vol );

// related with high lighted code
                box b3 =  new box();

                b3.setDim(10,20,30 );
                double vol2;
                vol = b3.volumeof();
                System.out.println(" \nvolumeof method has executed.. " + vol );
//end relation
                int result = b2.testmethod(2, 3 );
                System.out.println("\n multiply 2 , 3 # .." +result );


	}

}//end of main class