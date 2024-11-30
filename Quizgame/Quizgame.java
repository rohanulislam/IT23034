import java.util.Scanner;
public class Quizgame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you name: ");
        String name = scan.nextLine();
        System.out.println("Welcome to the quiz game! "+name+"\n");
        while(true){
        int score = 0;

        Question[] questions = new Question[]{
            new Question("Independence day of Bangladesh?", "a. 26 March  \nb. 21 February  \nc. 16 December ", 'a'),
            new Question("123 + 448 = ?", "a. 561  \nb. 571  \nc. 671", 'b'),
            new Question("Manchester Mark 1 is the ___ computer.", "a. 1st  \nb. 2nd  \nc. 3rd", 'b'),
            new Question("What is the ascii value of 'a' ?", "a. 65  \nb. 83  \nc. 97", 'c'),
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
                score+=5;
            }
            else {
                System.out.println("Your answer is wrong! The correct answer is: " + questions[i].correctOption+"\n");
                score--;
            }
        }
        System.out.println("Your final score is: " + score + "/" + 25);
        System.out.println("Do you want to play again? (1.yes/2.no)");
        int check=scan.nextInt();
        if(check==2)break;
        scan.nextLine();
    }
    }
}
