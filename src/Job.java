import java.util.ArrayList;

public class Job {
    private String company;
    private String jobTitle;
    private String startDate;
    private String endDate;
    private String jobDescription;
    private ArrayList<Job> jobs;

    public Job(){}

    //method to assemble work info into a string
    public String jobString(ArrayList<Job> jobs){
        String js = "";
        if(jobs.size() > 0) {
            js = "WORK EXPERIENCE\n\n";
            for (int i = 0; i < jobs.size(); i++) {
                js += jobs.get(i).getJobTitle() + ", " + jobs.get(i).getCompany().toUpperCase() + "\n"
                        + jobs.get(i).getStartDate() + " - " + jobs.get(i).getEndDate() + "\n  - "
                        + jobs.get(i).getJobDescription() + "\n\n";
            }
            js += "\n";
        }
        return js;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public ArrayList<Job> getJobs() {
        return jobs;
    }

    public void setJobs(ArrayList<Job> jobs) {
        this.jobs = jobs;
    }
}
