import java.util.Scanner;
import java.util.Stack;


public class BJ_4949 {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
    int []check = new int[4];
    while(true){
      String input = scanner.nextLine();
      if(input.equals(".")){
        break;
      }
      else{
        System.out.println(countChar(input));
      }
      
    }
    }
    public static String countChar(String input){
      Stack<Character> stack = new Stack<>();
      int count=0;
      for(int i=0;i<input.length();i++){
        char in = input.charAt(i);

        if(in=='('||in=='['){
          stack.push(in);
        }
        else if(in == ')'){
          if(stack.empty()|| stack.peek() != '('){
            return "no";
          }
          else{
            stack.pop();
          }
        }
        else if(in == ']'){
          if(stack.empty()|| stack.peek() != '['){
            return "no";
          }
          else{
            stack.pop();
          }
        }

      }
      if(stack.empty()) {
        return "yes";
      }
      else {
        return "no";
      }
    }
      

}
