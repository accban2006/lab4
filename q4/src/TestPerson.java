

import java.util.ArrayList;
import java.util.List;

public class TestPerson {
    public static void main(String[] args) {
        Student student1 = new Student("Alice Smith", "123 Nguyen Van Cu St, HCMC", "Information Technology", 2024, 12000.0);
        Student student2 = new Student("Bob Johnson", "45 Le Loi Ave, Hanoi", "Business Administration", 2023, 15000.0);
        Student student3 = new Student("Charlie Brown", "78 Tran Hung Dao Blvd, Danang", "Computer Science", 2025, 13500.0);

        Staff staff1 = new Staff("David Lee", "90 Pasteur St, HCMC", "Faculty of Engineering", 55000.0);
        Staff staff2 = new Staff("Eve Williams", "23 Ly Thuong Kiet St, Hanoi", "Admissions Office", 48000.0);

        System.out.println("--- Student Information ---");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("\n--- Staff Information ---");
        System.out.println(staff1);
        System.out.println(staff2);

        System.out.println("\n--- Changing Student Information ---");
        System.out.println("Before change: " + student2);
        student2.setAddress("101 Dong Khoi St, HCMC");
        student2.setFee(16000.0);
        System.out.println("After change: " + student2);

        System.out.println("\n--- Changing Staff Information ---");
        System.out.println("Before change: " + staff1);
        staff1.setPay(60000.0);
        System.out.println("After change: " + staff1);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        System.out.println("\n--- List of Students ---");
        for (Student student : studentList) {
            System.out.println(student);
        }

        List<Staff> staffList = new ArrayList<>();
        staffList.add(staff1);
        staffList.add(staff2);

        System.out.println("\n--- List of Staff ---");
        for (Staff staff : staffList) {
            System.out.println(staff);
        }

        List<Person> universityMembers = new ArrayList<>();
        universityMembers.add(student1);
        universityMembers.add(staff1);
        universityMembers.add(student3);
        universityMembers.add(staff2);

        System.out.println("\n--- List of University Members (Persons) ---");
        for (Person member : universityMembers) {
            System.out.println(member); 
        }
    }
} 
