import java.util.ArrayList;

public class Recruiter {
    private String recruiter;
    private String skillSought;

    public Recruiter() {
    }

    public ArrayList<Person> searchSkills(ArrayList<Person> people,String skillSought){
        ArrayList<Person> haveSkillSought = new ArrayList<>();
        if (people.size() > 0) {
            for (Person person : people) {
                for (Skill skill : person.getSkills()) {
                    if (skill.toString().equalsIgnoreCase(skillSought)) {
                        haveSkillSought.add(person);
                    }
                }
            }
        }
        return haveSkillSought;
    }

    public String getRecruiter() {
        return recruiter;
    }

    public void setRecruiter(String recruiter) {
        this.recruiter = recruiter;
    }

    public String getSkillSought() {
        return skillSought;
    }

    public void setSkillSought(String skillSought) {
        this.skillSought = skillSought;
    }
}
