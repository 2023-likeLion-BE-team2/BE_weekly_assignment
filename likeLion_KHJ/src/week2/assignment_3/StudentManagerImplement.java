package week2.assignment_3;

import java.util.ArrayList;
import java.util.List;

public class StudentManagerImplement implements StudentManager{
    private List<Student> studentList = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public void updateStudent(String name, double score) {
        for(Student st : studentList){
            if(st.getName().equals(name)){
                st.setScore(score);
            }
        }
    }

    @Override
    public void deleteStudent(String name) {

        studentList.removeIf(student -> student.getName().equals(name));

    }

    @Override
    public void printAllStudents() {
        for(Student st : studentList){
            System.out.printf("%s 학생의 점수는 %.2f점 입니다.\n",st.getName(),st.getScore());
        }
        System.out.println();
    }
}
