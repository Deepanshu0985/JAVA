package learnermanagement.learner;

public class Learner {
    private String learnerid ;
    private String learnername ;
    private String learneremail ;

    public Learner(String learnerid, String learnername, String learneremail) {
        this.learnerid = learnerid;
        this.learnername = learnername;
        this.learneremail = learneremail;
    }

    public String getLearnerid() {
        return learnerid;
    }

    public String getLearnername() {
        return learnername;
    }

    public String getLearneremail() {
        return learneremail;
    }
    public void displaylearnerDetails() {
        System.out.println("Learner ID: " + learnerid);
        System.out.println("Learner Name: " + learnername);
        System.out.println("Learner Email: " + learneremail);
    }
    
}
