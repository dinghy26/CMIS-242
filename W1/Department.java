public class Department {
    
    private String did;
    private String name;
    private String location;

    public void setDepartment(String did, String name, String location ) {

        this.did = did;
        this.name = name;
        this.location = location;
    }

    public String getDepartment() {
        return "did = " + did + "\nName = " + name + "\nLocation = " + location;
    }
}