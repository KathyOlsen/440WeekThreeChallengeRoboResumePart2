import java.util.ArrayList;
import java.util.Scanner;

public class ResumeApp {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        Person pers = new Person();
        Education education = new Education();
        Job job = new Job();
        Skill skill = new Skill();
        Recruiter recruiter = new Recruiter();
        ArrayList<Education> eds = new ArrayList<>();
        ArrayList<Job> jbs = new ArrayList<>();
        ArrayList<Skill> sks = new ArrayList<>();
        ArrayList<Person> ppl = new ArrayList<>();

        System.out.println("Do you want to create a resume? (yes/no): ");
        if (key.next().equalsIgnoreCase("yes")) {
            key.nextLine();
            //greeting, request name and email
            System.out.println("Welcome to Robo Resume Builder. I will ask you for a variety of information. " +
                    "\nPlease enter all words (apart from Job Descriptions and email) with Initial Caps.");
            System.out.println("Please enter your name as you wish it to appear on your resume: ");
            pers.setName(key.nextLine());
            System.out.println("Please enter your email address: ");
            pers.setEmail(key.nextLine());
            System.out.println("Please enter your phone number (e.g, (555) 123-4567): ");
            pers.setPhoneNumber(key.nextLine());

            //request education info and add it to an array list
            System.out.println("I will now ask you for information on each educational institution you have attended. " +
                    "\nIf you have more than one, please enter the most recent first, then going backwards in time.");
            System.out.println("Would you like to enter an educational institution? (yes/no): ");
            String anotherUni = key.next();
            key.nextLine();
            while (anotherUni.equalsIgnoreCase("yes")) {
                Education e = new Education();
                System.out.println("Please enter the full name of your educational institution (e.g, University of " +
                        "Maryland): ");
                e.setUniversity(key.nextLine());
                System.out.println("Please enter the degree you received (e.g., B.A.): ");
                e.setDegree(key.nextLine());
                System.out.println("Please enter your major (e.g., Mathematics): ");
                e.setMajor(key.nextLine());
                System.out.println("Please enter the year you graduated (e.g., 2005): ");
                e.setGradYear(key.nextInt());
                key.nextLine();
                eds.add(e);
                System.out.println("Do you have another educational institution to enter? (yes/no)");
                anotherUni = key.next();
                key.nextLine();
            }

            //request work experience info and add it to an array list
            System.out.println("Now I will ask you for information on each work experience you have had. " +
                    "\nIf you have more than one, please enter the most recent first, then going backwards in time.");
            System.out.println("Would you like to enter a work experience? (yes/no): ");
            String anotherJob = key.next();
            key.nextLine();
            while (anotherJob.equalsIgnoreCase("yes")) {
                Job j = new Job();
                System.out.println("Please enter the full name of the organization (e.g, Smith Industries): ");
                j.setCompany(key.nextLine());
                System.out.println("Please enter your job title (e.g., Program Manager): ");
                j.setJobTitle(key.nextLine());
                System.out.println("Please enter your start date (e.g., January 2015): ");
                j.setStartDate(key.nextLine());
                System.out.println("Please enter your end date (e.g., March 2019 or Current): ");
                j.setEndDate(key.nextLine());
                System.out.println("Please enter your job description: ");
                j.setJobDescription(key.nextLine());
                jbs.add(j);
                System.out.println("Do you have another job to enter? (yes/no)");
                anotherJob = key.next();
                key.nextLine();
            }

            //request skills info and add it to an array list
            System.out.println("Now I will ask you for information on each skill you have. " +
                    "\nPlease enter your best or most important skill first, then in decreasing order of priority " +
                    "or proficiency.");
            System.out.println("Would you like to enter a skill? (yes/no): ");
            String anotherSkill = key.next();
            key.nextLine();
            while (anotherSkill.equalsIgnoreCase("yes")) {
                Skill s = new Skill();
                System.out.println("Please enter a skill (e.g, Java): ");
                s.setSkillName(key.nextLine());
                System.out.println("Please enter your Competency Proficiency rating. " +
                        "(Fundamental/Novice/Intermediate/Advanced/Expert): ");
                s.setProficiency(key.nextLine());
                sks.add(s);
                System.out.println("Do you have another skill to enter? (yes/no)");
                anotherSkill = key.next();
                key.nextLine();
            }

            //allow user to change name, email, or phone number
            System.out.println("Here are your name, email, and phone number:\n" + pers.personString());
            System.out.println("Do you need to make any corrections to your name? (yes/no): ");
            String r1 = key.next();
            key.nextLine();
            if (r1.equalsIgnoreCase("yes")) {
                System.out.println("Please re-enter your name: ");
                pers.setName(key.nextLine());
            }
            System.out.println("Do you need to make any corrections to your email? (yes/no): ");
            String r2 = key.next();
            key.nextLine();
            if (r2.equalsIgnoreCase("yes")) {
                System.out.println("Please re-enter your email: ");
                pers.setEmail(key.nextLine());
            }
            System.out.println("Do you need to make any corrections to your phone number? (yes/no): ");
            String r3 = key.next();
            key.nextLine();
            if (r3.equalsIgnoreCase("yes")) {
                System.out.println("Please re-enter your phone number: ");
                pers.setPhoneNumber(key.nextLine());
            }

            //add education, work, and skills lists to person list
            pers.setEducations(eds);
            pers.setJobs(jbs);
            pers.setSkills(sks);
            ppl.add(pers);

            //assemble and print resume
            String resume = pers.personString() + education.educationString(eds) +
                    job.jobString(jbs) + skill.skillString(sks);
            System.out.println("Here is your resume:\n\n" + resume);
        }else {
            key.nextLine();
            System.out.println("Are you a recruiter? (yes/no): ");
            if (key.next().equalsIgnoreCase("yes")) {
                key.nextLine();
                System.out.println("Please enter a skill you are searching for: ");
                String skillSought = key.nextLine();

                if (recruiter.searchSkills(ppl, skillSought).size() > 0) {
                    System.out.println("Here is a list of people whose resumes list the skill you seek: \n");
                    for (Person p : recruiter.searchSkills(ppl, skillSought)) {
                        System.out.println(pers.personString() + education.educationString(eds) +
                                job.jobString(jbs) + skill.skillString(sks));
                    }
                } else {
                    System.out.println("Sorry.  No resumes found with that skill.");
                }
            }
        }
        System.out.println("Thank you for visiting.  Goodbye.");
    }

}
