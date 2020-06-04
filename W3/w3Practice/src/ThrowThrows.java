import java.io.IOException;

public class ThrowThrows {

    /** throw exception examples */
    static void validate(int age) {
        if(age < 18) {
            throw new ArithmeticException("not valid");
        } else {
            System.out.println("Welcome to vote");
        }
    }

    /** throws Exceptions examples */

    public void m() throws IOException {
        throw new IOException("devise error m()");
    }

    public void n() throws IOException {
        m();
    }

    public void p() throws IOException {
        try{
            n();
        } catch(IOException e) {
            System.out.println("Exeption handeled at p()");
        }
    }

    public static void main(String[] args) {
        //validate(12);

        ThrowThrows obj = new ThrowThrows();
        
        try {
            obj.p();
        } catch (IOException e) {
            //TODO: handle exception
        }
        System.out.println("Normal Flow");
    }
    
}