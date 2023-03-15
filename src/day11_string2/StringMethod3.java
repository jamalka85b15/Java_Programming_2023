package day11_string2;

public class StringMethod3 {

    public static void main(String[] args) {
        String word ="   ";
        boolean r1 = word.isEmpty();
        boolean r2 =word.isBlank();
        System.out.println(r1);
        System.out.println(r2);

        String st2 ="Cydeo";
        String str3 ="cydeo";
        System.out.println(st2.equalsIgnoreCase(str3));
        System.out.println(st2.equals(str3));


        String  students ="Ali, Abu, Max, Alex";
        boolean hasAli =students.contains("Ahmad");
        System.out.println(hasAli);



    }

}
