package Lab2.prob2A;

public class GradeReport {

        private Student student;

        public GradeReport(Student student) {
            this.student = student;
        }

        public Student getStudent() {
            return student;
        }

        @Override
        public String toString() {
            return "Grade report for student: " + student.getName();
        }

}
