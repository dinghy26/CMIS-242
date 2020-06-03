public class mobilePhone implements ITelephone {

    private int MyNumber;
    private boolean isRinging;
    private boolean mobileON = false;

    public mobilePhone(int MyNumber){
        this.MyNumber = MyNumber;
    }

    @Override
    public void isON() {
        mobileON = true;
        System.out.println("Mobile is On.");
    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("Answering the Mobile Phone");
            isRinging = false;
        }

    }

    @Override
    public boolean callPhone(int phoneNum) {
        if(phoneNum == MyNumber && mobileON){
            isRinging = true;
            System.out.println("Mobile Ring");

        } else {
            isRinging = false;
            System.out.println("Mobile OFF");
        }
        return isRinging;
    }

    @Override
    public void dial(int phoneNum) {
        if(mobileON) {
            System.out.println("Now ringing " + phoneNum + "on Mobile Phone.");
        } else {
            System.out.println("Power is off");
        }

    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    
}
