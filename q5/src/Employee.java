

public class Employee implements Comparable<Employee> {
    private String employeeid;
    private String employeeName;
    private Integer salaryPerHour;
    private Integer noOfLeavingDay;
    private Integer noOfTravelDay;

    public Employee(String employeeid, String employeeName, Integer salaryPerHour, Integer noOfLeavingDay, Integer noOfTravelDay) {
        this.employeeid = employeeid;
        this.employeeName = employeeName;
        this.salaryPerHour = salaryPerHour;
        this.noOfLeavingDay = noOfLeavingDay;
        this.noOfTravelDay = noOfTravelDay;
    }

    public String getEmployeeid() {
        return employeeid;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public Integer getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(Integer salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public Integer getNoOfLeavingDay() {
        return noOfLeavingDay;
    }

    public void setNoOfLeavingDay(Integer noOfLeavingDay) {
        this.noOfLeavingDay = noOfLeavingDay;
    }

    public Integer getNoOfTravelDay() {
        return noOfTravelDay;
    }

    public void setNoOfTravelDay(Integer noOfTravelDay) {
        this.noOfTravelDay = noOfTravelDay;
    }

    public Integer calculateWeeklySalary() {
        return salaryPerHour * 8 * (5 - (noOfLeavingDay + noOfTravelDay / 2));
    }

    @Override
    public int compareTo(Employee other) {
        if (!this.noOfTravelDay.equals(other.noOfTravelDay)) {
            return other.noOfTravelDay.compareTo(this.noOfTravelDay); 
        } else {
            return this.noOfLeavingDay.compareTo(other.noOfLeavingDay); 
        }
    }

    @Override
    public String toString() {
        return "Name: " + employeeName + " - Salary Per Hour " + salaryPerHour + " - Weekly Salary " + calculateWeeklySalary() + "]";
    }
}