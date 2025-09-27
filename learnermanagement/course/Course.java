package learnermanagement.course;
import java.util.List;

import learnermanagement.cohort.Cohorts;

public abstract class Course {
    private String courseid ;
    private String coursename ;
    private String coursedescription ;
    private Courselang courselang ;
    private List<Cohorts> cohorts ;

    public Course(String courseid, String coursename, String coursedescription, Courselang courselang, List<Cohorts> cohorts) {
        this(courseid, coursename, coursedescription, courselang);
        this.cohorts = cohorts;
    }
    public Course(String courseid, String coursename, String coursedescription, Courselang courselang){
        this.courseid = courseid;
        this.coursename = coursename;
        this.coursedescription = coursedescription;
        this.courselang = courselang;
    }

    public String getCourseid() {
        return courseid;
    }   
    public String getCoursename() {
        return coursename;
    }
    public String getCoursedescription() {
        return coursedescription;
    }

    public Courselang getCourselang() {
        return courselang;
    }
    
    public void addcohort(Cohorts cohort){
        cohorts.add(cohort);
    }
    public void displayCourseDetails() {
        System.out.println("Course ID: " + courseid);
        System.out.println("Course Name: " + coursename);
        System.out.println("Course Description: " + coursedescription);
        System.out.println("Course Language: " + courselang);
        
    }
    
}
