import java.util.Stack;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


class Solution {
    public boolean isValid(String s) {

        // I used stack and map strustures.

        Stack<Character> stack = new Stack<>();
        HashMap<Character,Character> parenthesesMap = new HashMap<>();
        parenthesesMap.put('(', ')');
        parenthesesMap.put('{', '}');
        parenthesesMap.put('[', ']');

        Set<Character> openParantheses = new HashSet<>();
        openParantheses.add('(');
        openParantheses.add('{');
        openParantheses.add('[');

        for (int i=0; i<s.length(); i++){
            char character = s.charAt(i);

            if (openParantheses.contains(character)){
                stack.push(character);
            }else if (!stack.isEmpty() && character==parenthesesMap.get(stack.peek())){
                stack.pop();
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }
}