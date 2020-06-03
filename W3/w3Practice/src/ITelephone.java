public interface ITelephone {

    void isON();
    void dial(int phoneNum);
    void answer();
    boolean callPhone(int phoneNum);
    boolean isRinging();
}