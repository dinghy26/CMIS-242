/**
 * OOCollege
 */
public class OOCollege {

    private String cid;
    private String courseName;
    private int credit;
    private String pid;

    public void setCource(String cid, String courseName, int credit, String pid) {
        this.cid = cid;
        this.courseName = courseName;
        this.credit = credit;
        this.pid = pid;
    }

    public String getCource() {
        return "cid = " + cid + "\n Cource Name = " +  courseName + " \n Credits = " + credit + "\n Pid = " + pid;
    }

}