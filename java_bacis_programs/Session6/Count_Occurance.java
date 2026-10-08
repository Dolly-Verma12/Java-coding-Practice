package Session6;

public class Count_Occurance {
    public class StringArrayExample {
    public static void main(String[] args) {

        String[] words = {"Java", "Python", "Java", "C", "JavaScript", "Java"};

        String target = "Java";
        int count = 0;

        String longest = words[0];

        for (int i = 0; i < words.length; i++) {

            // Count occurrence of target word
            if (words[i].equals(target)) {
                count++;
            }

            // Find longest string
            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }

        System.out.println("Occurrence of " + target + " = " + count);
        System.out.println("Longest string = " + longest);
    }
}
}
