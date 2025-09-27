package learnermanagement.cohort;

import java.util.*;

import learnermanagement.instructor.Instructor;
import learnermanagement.learner.Learner;

public class Cohorts {
    private String cohortid ;
    private String cohortname ;
    private String cohortdescription;
    private Date startdate ;
    private Date enddate ;
    private List<Learner> learners ;
    private List<Instructor> instructors ;

    public Cohorts(String cohortid, String cohortname , String cohortdescription, String startdate, String enddate) {
        this.cohortid = cohortid;
        this.cohortname = cohortname;
        this.cohortdescription = cohortdescription;
        this.startdate = new Date(startdate);
        this.enddate = new Date(enddate);
    }
    public Cohorts(String cohortid, String cohortname , String cohortdescription, String startdate, String enddate , List<Learner> learners, List<Instructor> instructors) {
        this(cohortid, cohortname , cohortdescription, startdate, enddate);
        this.learners = learners;
        this.instructors = instructors;
    }



    public String getCohortid() {
        return cohortid;
    }

    public String getCohortname() {
        return cohortname;
    }

    public String getCohortdescription() {
        return cohortdescription;
    }

    public Date getStartdate() {
        return startdate;
    }

    public Date getEnddate() {
        return enddate;
    }
    public void addinstructor(Instructor instructor){
        instructors.add(instructor);
    }
    public void addlearner(Learner learner){
        learners.add(learner);
    }

    public void getCohorts(){
        System.out.println("Cohort ID: " + cohortid);
        System.out.println("Cohort Name: " + cohortname);
        System.out.println("Cohort Description: " + cohortdescription);
        System.out.println("Start Date: " + startdate);
        System.out.println("End Date: " + enddate);
    }

}


