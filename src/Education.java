import java.util.ArrayList;

public class Education {
    private String degree;
    private String major;
    private String university;
    private int gradYear;
    private ArrayList<Education> educations;

    public Education(){}

    //method to assemble education info into a string
    public String educationString(ArrayList<Education> educations){
        String es = "";
        if(educations.size() > 0) {
            es = "EDUCATION\n\n";
            for (int i = 0; i < educations.size(); i++) {
                es += educations.get(i).getUniversity() + " (" + educations.get(i).getDegree() + " in " +
                        educations.get(i).getMajor() + ", " + educations.get(i).getGradYear() + ")\n\n";
            }
            es += "\n";
        }
        return es;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public ArrayList<Education> getEducations() {
        return educations;
    }

    public void setEducations(ArrayList<Education> educations) {
        this.educations = educations;
    }
}
