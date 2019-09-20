import java.util.ArrayList;

public class Person {
    private String name;
    private String email;
    private String phoneNumber;
    private ArrayList<Education> educations = new ArrayList<>();
    private ArrayList<Job> jobs = new ArrayList<>();
    private ArrayList<Skill> skills = new ArrayList<>();
    private ArrayList<Person> people = new ArrayList<>();

    public Person(){}

    //method to assemble name and email into a string
    public String personString(){
        String ps = getName().toUpperCase() + "\n" + getEmail() + "\n" + getPhoneNumber() + "\n\n";
        return ps;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Education> getEducations() {
        return educations;
    }

    public void setEducations(ArrayList<Education> educations) {
        this.educations = educations;
    }

    public ArrayList<Job> getJobs() {
        return jobs;
    }

    public void setJobs(ArrayList<Job> jobs) {
        this.jobs = jobs;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }
}
