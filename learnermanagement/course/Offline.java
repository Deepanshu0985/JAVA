package learnermanagement.course;
// import learnermanagement.cohort.Cohorts;

public class Offline extends Course {
    private String location ;

    public Offline(String courseid, String coursename, String coursedescription, Courselang courselang, String location) {
        super(courseid, coursename, coursedescription, courselang);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void displayCourseDetails() {
        System.out.println("Course ID: " + getCourseid());
        System.out.println("Course Name: " + getCoursename());
        System.out.println("Course Description: " + getCoursedescription());
        System.out.println("Course Language: " + getCourselang());
        System.out.println("Location: " + location);
        
    }

    
}
