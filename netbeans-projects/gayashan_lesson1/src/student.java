// learn constructor

class student{

    public String name;
    public int id;
    public String address;

      public student(String a, int b, String c){
            name=a;
            id=b;
            address=c;
     }

      public double marks_avg(double a, double b){

          return (a+b/2);
      }

}


class Constructer{
    public static void main(String[] args){

            student s1=new student("shan",123,"tangall");

            System.out.println(s1.name);
            System.out.println(s1.id);

             double avg=s1.marks_avg(72.5, 85.6);

             System.out.println("the average of "+s1.name+" of "+avg);



    }

}