//fundermental of classes

class room
{
double width;
double heigh;
double depth;



}

class roomDemo{

    public static void main(String args[]){
            room myroom1 = new room();
            double vol;

            myroom1.width = 10;
            myroom1.depth = 10;
            myroom1.heigh = 10;

            vol = myroom1.depth * myroom1.depth * myroom1.heigh ;

            System.out.println("volume of room is ... " + vol );

            room myroom2 ;
            myroom2 = new room();
            double volume;

            myroom2.width = 15;
            myroom2.depth = 1;
            myroom2.heigh = 2;

            volume = myroom2.depth* myroom2.width * myroom2.heigh ;
            System.out.printf( " sec vol is .. " + volume  );

            room r1 = new room();
            room r2 = r1 ;
            r1 = null ;
            //r1.depth = 100; // r1 is null...
            r2.depth = 5000;
            
            System.out.println("\ntesting...." + r2.depth );
                    
                    
                    


    }
}