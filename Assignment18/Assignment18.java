package Assignment18;

public class Assignment18 {
    public static void main(String[] args) {
        School s = new School();
        s.setSchoolName("Babu Banarasi Das University");
        School.Classroom classroom = new School.Classroom(501, 67, s);
        classroom.printDetail();
        School.Teacher teacher = new School.Teacher("Priyanshu Vishwakarma", s);
        teacher.introduce();

    }
}
class School{
    private String schoolName;
    void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }
    String getSchoolName(){
        return schoolName;
    }

    static class Classroom{
        private int classNumber;
        private int totalStudents;
        private School school;

        Classroom(int classNumber, int totalStudents, School school){
            this.classNumber = classNumber;
            this. totalStudents = totalStudents;
            this.school = school;

        }
        void printDetail(){
            System.out.println("School Name: " + school.getSchoolName());
            System.out.println("Class Number: " + classNumber);
            System.out.println("Total Student: " + totalStudents);
        }
    }

    static class Teacher{
        private String teacherName;
        private School school;
        Teacher(String teacherName, School school){
            this.teacherName = teacherName;
            this.school = school;
        }
        void introduce(){
            System.out.println("Hello, I am " + teacherName + " from " + school.getSchoolName());
        }
    }
}
