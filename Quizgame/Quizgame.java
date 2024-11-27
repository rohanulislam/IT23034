import java.util.Scanner;
public class Quizgame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the quiz game!\n");
        int score = 0;

        Question[] questions = new Question[]{
            new Question("Who is the OOP course teacher of ICT-20?", "a. Zia Sir  \nb. Badrul Sir  \nc. Bikash Sir", 'a'),
            new Question("123 + 448 = ?", "a. 561  \nb. 571  \nc. 671", 'b'),
            new Question("Students of ICT-20 are currently in _____ year", "a. 1st  \nb. 2nd  \nc. 3rd", 'b'),
            new Question("What is the regular class time of ICT-20?", "a. 10am-12pm  \nb. 9am-2pm  \nc. 9am-4pm", 'c'),
            new Question("What is the session of ICT-20?", "a. 21-22  \nb. 22-23  \nc. 24-25", 'b'),
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
