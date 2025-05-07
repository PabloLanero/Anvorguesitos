package Model;

public class Job {
    private int idJob;
    private String jobTitle;
    private double minSalary, maxSalary;

    //Constructors
    public Job (int idJob, String jobTitle, double maxSalary, double minSalary) {
        this.idJob = idJob;
        this.jobTitle = jobTitle;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
    }

    public Job (){}

    //Getter y Setters
    public int getIdJob () {
        return idJob;
    }
    public void setIdJob (int idJob) {
        this.idJob = idJob;
    }
    public String getJobTitle () {
        return jobTitle;
    }
    public void setJobTitle (String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public double getMaxSalary () {
        return maxSalary;
    }
    public void setMaxSalary (double maxSalary) {
        this.maxSalary = maxSalary;
    }
    public double getMinSalary () {
        return minSalary;
    }
    public void setMinSalary (double minSalary) {
        this.minSalary = minSalary;
    }

    //ToString


    @Override
    public String toString () {
        return "Job{" +
                "\"idJob\"=" + idJob +
                ", \"jobTitle\"='" + jobTitle + '\'' +
                ", \"minSalary\"=" + minSalary +
                ", \"maxSalary\"=" + maxSalary +
                '}';
    }
}
