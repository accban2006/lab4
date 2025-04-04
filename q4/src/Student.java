

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student[" + super.toString() + ", program=" + program + ", year=" + year + ", fee=" + fee + "]";
    }

    public static void main(String[] args) {
        Student student = new Student("Alice", "123 Main St", "Computer Science", 2023, 10000.0);
        System.out.println(student);
        student.setAddress("456 Oak Ave");
        System.out.println("Updated address: " + student);
    }
}
