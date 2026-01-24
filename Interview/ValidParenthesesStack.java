
import java.util.Stack;

public class ValidParenthesesStack {
    public static boolean isValid(String s){
        Stack <Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            // if opening bracket then push
            if(ch =='(' || ch =='{' || ch =='['){
                st.push(ch);
            }
            // if closing bracket 
            else{
                // stack empty means no opening bracket for this closing bracket
                if(st.isEmpty()){
                    return false;
                }
                char top = st.pop();

                if(ch==')' && top != '(') return false;
                if(ch =='}' && top != '{') return false;
                if(ch ==']' && top != '[') return false;
            }
        }
        return st.isEmpty();

    }

    public static void main(String[] args) {
        String s = "{[()]}";
        System.out.println(isValid(s)); //true return 
        String s2 = "{[((())])}";
        System.out.println(isValid(s2)); // false return
    }
}
