public class OOCollegeTest {
    
    public static void main(String[] args) {
        
        OOCollege student1 = new OOCollege();
        Department Student1Dep = new Department();
        Student Student1info = new Student();

        // fields in this instances are private
        student1.setCource("cmis 232", "coding", 3, "cmis 231");
        System.out.println(student1.getCource());
        Student1Dep.setDepartment("Comp. 13423", "IT", "Jacksonville, FL");
        System.out.println(Student1Dep.getDepartment());

        // this fields are define Public 
        Student1info.name ="Brian Miranda Perez";
        Student1info.degree = "Comp Sience";
        Student1info.sid = "1234321232";
        Student1info.year = "2nd Year";
        Student1info.address = "13456 devans road Jacksonville, Fl";

        // get Student
        System.out.println(Student1info.getStudent());

    }
}