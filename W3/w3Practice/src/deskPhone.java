public class deskPhone implements ITelephone {

    private int MyNumber;
    private boolean isRinging;

    public deskPhone(int MyNumber){
        this.MyNumber = MyNumber;
    }

    @Override
    public void isON() {
        System.out.println("This method dose not apply for this phone.");
    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("Answering the deskPhone");
            isRinging = false;
        }

    }

    @Override
    public boolean callPhone(int phoneNum) {
        if(phoneNum == MyNumber){
            isRinging = true;
            System.out.println("Ring Ring");

        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public void dial(int phoneNum) {
        System.out.println("Now ringing " + phoneNum + "on Deskphone.");

    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    
}