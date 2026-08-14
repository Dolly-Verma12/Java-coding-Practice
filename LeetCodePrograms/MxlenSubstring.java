public class MxlenSubstring {
    public int maximumLengthSubstring(String s) {

        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            int[] count = new int[26];

            for (int j = i; j < s.length(); j++) {

                char ch = s.charAt(j);

                count[ch - 'a']++;

                if (count[ch - 'a'] > 2) {
                    break;
                }

                int length = j - i + 1;

                max = Math.max(max, length);
            }
        }

        return max;
    }

}
