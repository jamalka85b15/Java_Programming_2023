package day26_statics.studentTask;

public class TestObjects {
    public static void main(String[] args) {

        Student s1 = new Student("Jama", 37, 'F', "A1");
        Student s2 = new Student("Mark", 40, 'M', "A2");
        Student s3 = new Student("Olya", 35, 'F', "A3");
        Student s4 = new Student("Jake", 50, 'M', "A4");
        Student s5 = new Student("Katya", 25, 'M', "A5");

        Student[] students ={s2,s3,s4,s5};


        StudentsGroup group1 = new StudentsGroup("Java Turtles", 1);
        group1.addStudent(s1);
        group1.addStudent(students);
        group1.addStudent("Sophia", 20, 'F', "A6");
        System.out.println(group1);
        group1.removeStudent("A2");
        System.out.println(group1);
        for (Student each : group1.students) {
            System.out.println(each.name+ " : "+ each.id);

        }

        StudentsGroup group2 = new StudentsGroup("Beatles", 2);
        Student st2 =new Student("Max", 41, 'M', "H5");
        Student st3 =new Student("Leo", 31, 'M', "H7");
        Student st4 =new Student("Lee", 39, 'M', "H9");
        Student st5 =new Student("Naz", 34, 'F', "H11");
        group2.addStudent("Sasha", 40, 'F', "T12");
        Student[] st = {st2, st3, st4};
        group2.addStudent(st);
        group2.addStudent(st5);
        System.out.println(group2);
        for (Student each : group2.students) {
            System.out.println(each.name+ " : "+ each.id);

        }
        StudentsGroup[] groups = {group1,group2};
        for (StudentsGroup eachGroup : groups) {
            System.out.println(eachGroup.groupName+ " - "+ eachGroup.students);
        }






    }
}
