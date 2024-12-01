import java.util.Scanner;
public class gradecalculator{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your ID and Number of courses");
    String id = scan.nextLine();
    int n=scan.nextInt();
    double total=0;
    int crd=0,tcrd=0;
    for(int i=1;i<=n;i++)
    {
        System.out.print("C"+i+":Credit(Max 3): ");
        int credit = scan.nextInt();
        tcrd+=credit;
        System.out.print("CT(Max 30): ");
        int ct = scan.nextInt();
        System.out.print("AT(Max 10): ");
        int at = scan.nextInt();
        System.out.print("FE(Max 60): ");
        int fe = scan.nextInt();
        double point=0;
        int marks=ct+at+fe;
        if(marks>=80)point=4;
        else if(marks>=75)point=3.75;
        else if(marks>=70)point=3.5;
        else if(marks>=65)point=3.25;
        else if(marks>=60)point=3;
        else if(marks>=55)point=2.75;
        else if(marks>=50)point=2.5;
        else if(marks>=45)point=2.25;
        else if(marks>=40)point=2;
        total+=point*credit;
        if(marks>=40)
        crd+=credit;
    }
    double cgpa=total/crd;
    String grade;
    if(cgpa==4)grade="A+";
        else if(cgpa>=3.75)grade="A";
        else if(cgpa>=3.5)grade="A-";
        else if(cgpa>=3.25)grade="B+";
        else if(cgpa>=3)grade="B";
        else if(cgpa>=2.75)grade="B-";
        else if(cgpa>=2.5)grade="C+";
        else if(cgpa>=2.25)grade="C";
        else if(cgpa>=2)grade="D";
        else grade="F";
        System.out.println("ID: "+id);
        System.out.println("Cedit taken: "+tcrd);
        System.out.println("Credit earned: "+crd);
        System.out.printf("CGPA: %.2f\n", cgpa);
        System.out.println("GRADE: "+grade);
}
    
}
