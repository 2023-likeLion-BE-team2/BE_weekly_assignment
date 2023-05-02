package manage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class deep implements studentManager {
    List<Student> list = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        list.add(student);
    }

    @Override
    public void updateStudent(String name, double score) {
        for (Student student : list) {
            if(student.getName().equals(name)){
                student.setPoint(score);
            }
        }
    }
    @Override
    public void deleteStudent(String name) {
        list.removeIf(student -> student.getName().equals(name));
    }

    @Override
    public void printAllStudent() {
        for (Student s : list) {
            System.out.println(s.getName() + " 학생의 점수는 " + s.getPoint() + "점 입니다.");
        }
    }
}
