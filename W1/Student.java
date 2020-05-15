
public class Student {
    
    String sid;
    String name;
    String address;
    String degree;
    String year;

    public void SetStudent ( String sid, String name, String address, String degree, String year) {
        this.sid = sid;
        this.name = name;
        this.address = address;
        this.degree = degree;
        this.year = year;
    }

    public String getStudent() {
        return "Student id = " + sid + "\nStudent Name = " + name + "\nStudent Addres = " + address + "\nStudent Year = " + year;
    }
}