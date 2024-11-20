import java.util.ArrayList;

public class EqnSolver {

    public EqnSolver(){

    }
    public int Score;
 public int Result(String input) {

 String[] parts = input.split("#");

 String equation = parts[0];

   Score = Integer.parseInt(parts[1]);

 String[] numberParts = equation.split("([+\\-*/=])"); // Matches +, -, *, /, =
 ArrayList<Integer> numbers = new ArrayList<>();
 for (String num : numberParts) {
     if (!num.isEmpty() && !num.equals("?")) {
         numbers.add(Integer.parseInt(num));
     }
 }

 String operators = equation.replaceAll("[^+\\-*/]", "");
 int answer = numbers.get(0); 
 for (int i = 0; i < operators.length(); i++) {
     char operator = operators.charAt(i);
     int nextNumber = numbers.get(i + 1);

     switch (operator) {
         case '+':
             answer += nextNumber;
             break;
         case '-':
             answer -= nextNumber;
             break;
         case '*':
             answer *= nextNumber;
             break;
         case '/':
             if (nextNumber != 0) {
                 answer /= nextNumber;
             } else {
                 System.out.println("Error: Division by zero.");
             }
             break;
         default:
             System.out.println("Error: Unsupported operator.");

     }

 }

 return answer;
 }
}
