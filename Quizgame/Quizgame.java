import java.util.Scanner;
public class Quizgame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the quiz game!\n");
        int score = 0;

        Question[] questions = new Question[]{
            new Question("Independence day of Bangladesh?", "a. 26 March  \nb. 21 February  \nc. 16 December ", 'a'),
            new Question("123 + 448 = ?", "a. 561  \nb. 571  \nc. 671", 'b'),
            new Question("Manchester Mark 1 is the ___ computer.", "a. 1st  \nb. 2nd  \nc. 3rd", 'b'),
            new Question("What is the regular class time of ICT-20?", "a. 10am-12pm  \nb. 9am-2pm  \nc. 9am-4pm", 'c'),
            new Question("12^2 = ?", "a. 111  \nb. 144  \nc. 140", 'b')
        };
        for(int i = 0;i < questions.length; i++)
        {
            System.out.println(i+1+". " +questions[i].question);
            System.out.println(questions[i].options+"\n");
            String input = scan.nextLine();
            char answer = input.toLowerCase().charAt(0);
            if(questions[i].correctOption==answer)
            {
                System.out.println("Your answer is correct!\n");
                score++;
            }
            else {
                System.out.println("Your answer is wrong! The correct answer is: " + questions[i].correctOption+"\n");
            }
        }
        System.out.println("Your final score is: " + score + "/" + 5);
    }
}
