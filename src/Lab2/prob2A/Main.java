package Lab2.prob2A;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Tony Otim");
        System.out.println("Student Name: " + student.getName() + " Student Grade: " + student.getGradeReport() );

        GradeReport report = student.getGradeReport();
        student.setGradeReport(report);
        System.out.println("Student Name: " + report.getStudent().getName() + " Student Grade: " + report.getStudent().getGradeReport());

    }
}
