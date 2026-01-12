public class RemoveVowels {
    public static void main(String[] args) {
        String str = "Gourab";
        String result = " ";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!isVowel(ch)) {
                result += ch;
            }
        }
        System.out.println(result);
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
 