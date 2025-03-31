

public class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff[" + super.toString() + ", school=" + school + ", pay=" + pay + "]";
    }

    public static void main(String[] args) {
        Staff staff = new Staff("Bob", "789 Pine Ln", "Engineering", 60000.0);
        System.out.println(staff);
        staff.setPay(65000.0);
        System.out.println("Updated pay: " + staff);
    }
}