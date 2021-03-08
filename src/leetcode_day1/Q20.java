package leetcode_day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author 冯若航
 * @version 1.0
 * @description: TODO
 * @date 2021/3/7 23:08
 */
public class Q20 {
    public boolean isValid(String s) {
        if(s.length()==0) return true;
        if(s.length()%2==1) return false;
        Stack<Character> stack=new Stack<Character>();
        char[] chars=s.toCharArray();

        for(char c:chars){
            if(c=='('){
                stack.push(')');
            }else if(c=='{'){
                stack.push('}');
            }else if(c=='['){
                stack.push(']');
            }else if(stack.isEmpty()||stack.pop()!=c){
                return false;
            }
        }
        return stack.isEmpty();
    }


}
