package day27_accessModifier;

import day26_statics.studentTask.Student;

public class TestStudent {
    public static void main(String[] args) {
        CydeoStudent student1 = new CydeoStudent("Jama", 37,'F');
        CydeoStudent student2 = new CydeoStudent("Mark", 40,'M');
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);
        System.out.println("School name is "+CydeoStudent.schoolName+ " and code is "+ CydeoStudent.secretCode);

    }
}
