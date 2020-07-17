public class App {
    public static void main(String[] args) throws Exception {
        
        Property h = new Property("13959 devan lee", 3, 1700, 192567);

        System.out.println(h.toString());

        h.changeState(Status.SOLD);

        System.out.println("------------------------");
        System.out.println(h.toString());
    }
}
