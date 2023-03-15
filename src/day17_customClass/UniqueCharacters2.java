package day17_customClass;

public class UniqueCharacters2 {
    public static void main(String[] args) {
        String str = "aabcccd";
        String unique = "";

        for (int j = 0; j <str.length() ; j++) {

            char ch = str.charAt(j);
            int frequency = 0;
            for (int i = 0; i < str.length(); i++) { //chech how many times th ch has appeared in str
                if (str.charAt(i) == ch) { //if ch appears in str
                    frequency++; //increase the frequency by 1
                }
            }
            if (frequency == 1) {  // uf the frequency is one then its unique
                unique += ch;
            }
        }
        System.out.println(unique);


    }
}
