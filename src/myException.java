import java.util.*;
class gotProblem extends Exception
        {
            gotProblem(String s){
                super(s);
            }
        }
public class myException {
    static void validate(int age)throws gotProblem
    {
        if(age<18)
            throw new gotProblem("Its a kid");
        else
            System.out.println("Eligible");
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the age:");
        int n=sc.nextInt();
        try{
            validate(n);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("rest of code");
    }
}

