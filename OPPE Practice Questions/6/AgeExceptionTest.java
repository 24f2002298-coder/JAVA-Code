import java.util.Scanner;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String msg){
           super(msg); 
    }
}

public class AgeExceptionTest{
    public static boolean isEligibletoVote(int age) throws InvalidAgeException{
        if(age >= 18){
            return true;
        }
        else{
            throw new InvalidAgeException("Invalid age to vote");
        }
    }
 
    public static boolean isEligibletoWriteUPSC(int age) throws InvalidAgeException{
        if(age <= 32){
            return true;
        }
        else{
            throw new InvalidAgeException("Invalid age to write UPSC");
        }
    }

    public static void main(String[] args){
        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        sc.close();
        try{
            isEligibletoVote(age);
            isEligibletoWriteUPSC(age);
            System.out.println("Eligible to vote and to write UPSC");
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}