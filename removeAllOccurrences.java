/* Given a string s and a substring part,
remove all occurrences of part from s until part no longer appears in s.

Input:  s = "daabcbaabcbc", part = "abc"
Output: "dab"
*/

public class removeAllOccurrences {
    public static void main(String[] args) {
        String s = "daabcbaabcbc";
        String part = "abc";

        String result = RemoveAllOccurrences(s, part);
        System.out.println(result);
    }

    public static String RemoveAllOccurrences(String s, String part) {

        while (s.contains(part)) {
            s = s.replace(part, "");
        }
        return s;
    }
}
