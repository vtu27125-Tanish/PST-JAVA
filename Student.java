import java.util.*;

class Student{
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {

        // 1. CGPA descending
        if (Double.compare(b.getCgpa(), a.getCgpa()) != 0) {
            return Double.compare(b.getCgpa(), a.getCgpa());
        }

        // 2. First name ascending
        if (!a.getFname().equals(b.getFname())) {
            return a.getFname().compareTo(b.getFname());
        }

        // 3. ID ascending
        return a.getId() - b.getId();
    }
}

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<>();

        while(testCases > 0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            studentList.add(new Student(id, fname, cgpa));
            testCases--;
        }

        // ⭐ THIS LINE WAS MISSING
        Collections.sort(studentList, new StudentComparator());

        for(Student st : studentList){
            System.out.println(st.getFname());
        }
    }
}
