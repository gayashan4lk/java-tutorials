//introducing constructor
//start of box1****************
class box1{
    double width,depth,height;


    box1(double a,double b, double c)
    {
        System.out.println("constructing box...");
        width = a;
        depth = b;
        height = c;
    }

    double volumeof()
    {
        return width *depth * height;
    }
}
//START OF BOX2
class box2{
    double wd,dp,hg;

    box2(double e,double f,double g)
    {
        System.out.println("constructing box2...");
        this.wd = e;
        this.hg = f;
        this.dp = g;
    }
    double volm()
    {
     return wd* hg* dp ;
    }
}

//start of mainclass**************
class box1Demo{
        public static void main(String args[]){
            box1 b1 = new box1(3,3,3);
            box1 b2 = new box1(15,20,25);

            double vol;
            vol = b2.volumeof();
            System.out.println("volume is ... " +vol  );

            vol = b1.volumeof();
            System.out.println(" now..."+ vol );

            box2 b3 = new box2(5,5,5);

            vol = b3.volm();
            System.out.println(" volume by box2..." + vol);

        }
}