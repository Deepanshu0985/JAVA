package learnermanagement.instructor;

public class Instructor {
    private String instructorid ;
    private String instructorname ;
    private String instructoremail ;

    public Instructor(String instructorid, String instructorname, String instructoremail) {
        this.instructorid = instructorid;
        this.instructorname = instructorname;
        this.instructoremail = instructoremail;
    }

    public String getInstructorid() {
        return instructorid;
    }

    public String getInstructorname() {
        return instructorname;
    }

    public String getInstructoremail() {
        return instructoremail;
    }

    

    public void displayinstructorDetails() {
        System.out.println("Instructor ID: " + instructorid);
        System.out.println("Instructor Name: " + instructorname);
        System.out.println("Instructor Email: " + instructoremail);
    }
}
