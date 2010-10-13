class MarkReporting{
      
       public static void main(String[] args){
            
           int score=Integer.parseInt(args[0]);
           char grade;
           
           if (score >=75){ grade='A';
           }
           else if (score >=65){ grade='B';
           } 
           else if (score >=45){ grade='C';
           }
           else if (score >=35){ grade='D';
           } 
           else  { grade='F' ;
           }
                System.out.println("Grade"+grade);
      }
  }