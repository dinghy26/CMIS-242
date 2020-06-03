public class Main {
    
    public static void main(String[] args) {
        ITelephone BrianPhone; 
        BrianPhone = new deskPhone(5098721);
        BrianPhone.isON();
        BrianPhone.callPhone(5098721);
        BrianPhone.answer();

        System.out.println("---------------------------------");

        BrianPhone = new mobilePhone(9141538);
        BrianPhone.isON();
        BrianPhone.callPhone(9141538);
        BrianPhone.answer();
    }
}