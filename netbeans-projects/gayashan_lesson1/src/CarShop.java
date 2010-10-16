//classes & objects 2

/**
 *
 * @author gayashan
 */
class car{
     public String madeby;
     public String colour;
     public String yearmade;
     public String model;

     public void start(){
         System.out.println(    model+" started " );
                          }
     public void stop(){
         System.out.println(    yearmade+" stopped ");
                          }
}


public class CarShop {
    public static void main(String[] args){

          car mycar= new car();

          mycar.colour="black";
          mycar.madeby="toyota";
          mycar.yearmade="1998";
          mycar.model="ART 9";

           System.out.println("my car details......");
           System.out.println(" made by : "+mycar.madeby);
           System.out.println(" colour : "+mycar.colour);
           System.out.println(" year made : "+mycar.yearmade);
           System.out.println(" model : "+mycar.model);

           //call methords using mycar
          mycar.start();
          mycar.stop();

           car redporsche=new car();

          redporsche.colour="red";
           System.out.println("redporsche.coloure :"+redporsche.colour);
          redporsche.yearmade="2000";
           System.out.println("redporsche.made year :"+redporsche.yearmade);

          mycar=redporsche;

          System.out.println("my car details......");
          System.out.println(" mycar.colour : "+mycar.colour);
          System.out.println(" mycar.made year :"+mycar.yearmade);

         redporsche=mycar;
        

          System.out.println("redporsche.colour :"+redporsche.colour);
          System.out.println("redporsche.made year :"+redporsche.yearmade);


    }

}
