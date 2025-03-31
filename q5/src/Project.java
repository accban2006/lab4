import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Project {
    private String projectid;
    private Date startDate;
    private Date endDate;
    private List<Employee> listOfEmployee;

    public Project(String projectid, Date startDate, Date endDate) {
        this.projectid = projectid;
        this.startDate = startDate;
        this.endDate = endDate;
        this.listOfEmployee = new ArrayList<>();
    }

    public String getProjectid() {
        return projectid;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public List<Employee> getListOfEmployee() {
        return listOfEmployee;
    }

    public void addEmployee(Employee employee) {
        this.listOfEmployee.add(employee);
    }

    public Integer estimateBudget() {
        int totalBudget = 0;
        if (listOfEmployee != null) {
            long durationMillis = endDate.getTime() - startDate.getTime();
            long durationDays = durationMillis / (24 * 60 * 60 * 1000); 
            for (Employee employee : listOfEmployee) {
                totalBudget += employee.calculateWeeklySalary() * (durationDays / 7); 
                if (durationDays % 7 > 0) {
                    totalBudget += employee.calculateWeeklySalary() * (1); 
                }
            }
        }
        return totalBudget;
    }

    @Override
    public String toString() {
        return "Project [projectid=" + projectid + ", startDate=" + startDate + ", endDate=" + endDate + ", numberOfEmployees=" + (listOfEmployee != null ? listOfEmployee.size() : 0) + "]";
    }
}