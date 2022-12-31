package JavaFundamnentals;
import java.util.Stack;

public class BalancedParenthesis {


    public boolean balancedparenthesis(String str){

        Stack<Character> parenthesisStack = new Stack<>();
        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '{' || ch == '[' || ch =='('){
                parenthesisStack.push(ch);
                System.out.println("pushing "+ch);

            }
            char popvalue;
            switch (ch) {
                case ')', ']', '}' -> {
                    popvalue = parenthesisStack.pop();
                    System.out.println("Encountered : " + ch + " popping " + popvalue);
                }
            }


        }
        System.out.println("Elements remaining in stack"+parenthesisStack);

        return parenthesisStack.isEmpty();

    }

    public static void main(String[] args) {
        String str = "({[]}){}()(())({})";
        BalancedParenthesis bp = new BalancedParenthesis();
        final boolean balancedparenthesis = bp.balancedparenthesis(str);
      //  bp.areBracketsBalanced(str);
        System.out.println(balancedparenthesis);

    }
}
