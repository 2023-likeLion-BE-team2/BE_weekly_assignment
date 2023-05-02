package week2.assignment_3;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String args[]){
        StudentManagerImplement STI = new StudentManagerImplement();
        STI.addStudent(new Student("강영현", 100));
        STI.addStudent(new Student("최상엽", 95));
        STI.addStudent(new Student("신예찬", 77.7));
        STI.addStudent(new Student("윤도운", 50.4));
        STI.addStudent(new Student("이민호", 88.8));

        STI.printAllStudents();

        // 점수 변경
        STI.updateStudent("신예찬",100);
        STI.printAllStudents();

        //기록 삭제
        STI.deleteStudent("이민호");
        STI.printAllStudents();
    }
}
