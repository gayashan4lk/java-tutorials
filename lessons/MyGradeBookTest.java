
 class GradeBook 
 {
    public void displayMessage ()
    {  
        System.out.println("well come to the GradeBook") ; 
    
      }
  
}







public class MyGradeBookTest
{
   public static void main ( String args[])
    {
        
       GradeBook myGradeBook = new GradeBook() ;
       
       myGradeBook.displayMessage() ;
    }

 }