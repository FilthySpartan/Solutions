package Lab18.part2;

import java.util.ArrayList;

public class SkilledWorker extends Employee{
    ArrayList<String> skills = new ArrayList<String>();

    public SkilledWorker(String name, String jobTitle){
        super(name, jobTitle);
    }

    public void addSkill(String skill) {
        this.skills.add(skill);
    }

    public String getInfo() {
        String info = super.getInfo();
        info += "Skills:\n\t";
        for (String skill : skills) {
            info += skill + "\n\t";
        }

        return info;
    }
}
