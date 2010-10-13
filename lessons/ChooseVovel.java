class ChooseVovel{
           public static void main(String[] args){
               
                   char letter = args[0].charAt(0);
               
                   switch (letter) {
                            case 'a':
                            case 'e':
                            case 'i':
                            case 'o':
                            case 'U':
                              System.out.println(letter+"is a vovel");
                               break;

                              default: System.out.println("consonent");      
             }

       }           
}
