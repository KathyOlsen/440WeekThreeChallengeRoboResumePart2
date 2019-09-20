import java.util.ArrayList;

public class Skill {
    private String skillName;
    private String proficiency;
    private ArrayList<Skill> skills;

    public Skill() {
    }

    //method to assemble skills info into a string
    public String skillString(ArrayList<Skill> skills){
        String ss = "";
        if(skills.size() > 0) {
            ss = "SKILLS\n\n";
            for (int i = 0; i < skills.size(); i++) {
                ss += skills.get(i).getSkillName() + ", " + skills.get(i).getProficiency() + "\n";
            }
            ss += "\n";
        }
        return ss;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getProficiency() {
        return proficiency;
    }

    public void setProficiency(String proficiency) {
        this.proficiency = proficiency;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }
}
