public class usersDisc {


    public void username (String [] names){
         check(names);
    }
    
    private void check(String [] input) {
        try {

            System.out.println("The user in position #5 is: "+ input[5]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage() + "\n Please enter an array of 6 or more.");
        }
    }
}