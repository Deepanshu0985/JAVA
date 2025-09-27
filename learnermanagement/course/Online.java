package learnermanagement.course;

public class Online extends Course {
    private String zoomurl;
    public Online(String courseid, String coursename, String coursedescription, Courselang courselang, String zoomurl) {
        super(courseid, coursename, coursedescription, courselang);
        this.zoomurl = zoomurl;
    }
    public String getZoomurl() {
        return zoomurl;
    }

    
    
}
