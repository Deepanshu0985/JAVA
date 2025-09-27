package learnermanagement;
import learnermanagement.course.*;
import learnermanagement.cohort.Cohorts;
import learnermanagement.instructor.Instructor;
import learnermanagement.learner.Learner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Learner Management System");
        Course offlineJava = new Offline("C001", "Java Programming", "Learn Java from scratch", Courselang.JAVA,"Room 101");
        Course onlineNode = new Online("C002", "Node.js Development", "Master Node.js with hands-on projects", Courselang.NODEJS,"https://onlinecourse.com/nodejs");

        offlineJava.displayCourseDetails();
        onlineNode.displayCourseDetails();

        Learner learner1 = new Learner("L001", "Alice", "alice@example.com");
        learner1.displaylearnerDetails();

        Instructor instructor1 = new Instructor("I001", "Bob", "bob@example.com");
        instructor1.displayinstructorDetails();

        Cohorts c1 = new Cohorts("COH001", "Java Beginners", "Cohort for beginners to learn Java", "2023-10-01", "2024-03-31");
        Cohorts c2 = new Cohorts("COH002", "Node.js Beginners", "Cohort for beginners to learn Node.js", "2023-11-01", "2024-04-30");

        offlineJava.addcohort(c1);
        onlineNode.addcohort(c2);
    }
}
