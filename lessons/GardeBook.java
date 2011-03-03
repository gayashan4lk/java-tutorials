import java.util.Scanner;

public class GradeBook;
{
  private String courseName;

  public GradeBook ( String name )
  {
    courseName = name;
  }

  public void setCourseName ( String name)
  {
     course name = name;
  }

  public String getCourseName()
  {
      return course name;
  }

  public void displayMessage()
  {
      System.out.printf( " welcome gayashan,we looking for you,you are the bestn%s!\n\n"\,
      getCorseName()	  );
	  getCorseName()
  }


  public void determineClassAverage()
  {
     Scanner input = new Scanner ( System.in);

	 int total;
	 int gradeCounter;
	 int grade;
	 int average;

	 total = 0;
	 gradeCounter = 1;

	 while ( gradeCounter <= 10)
	 {
	    System.out.print(  "  Enter grade: ");
		grade = input.nextInt();
		total = total + grade;
		gradeCounter = gradeCounter + 1 ;
	 }

	 average = total/10 ;

	 System.out.printf( " \nTotal of all 10 grades is %d \n", total );
	 System.out.printf( "  Class average is %d\n",average );


  }

}

