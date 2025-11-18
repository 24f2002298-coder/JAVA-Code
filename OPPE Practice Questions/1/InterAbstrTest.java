import java.util.Scanner;

interface IResearchScholar{
    public void teches(String str);
    public void studies(String str);
}

class JuniorRS implements IResearchScholar{
    public void teches(String str){}
    public void studies(String str){
        System.out.println("TA studies " + str);
    }
}

class SeniorRS implements IResearchScholar{
    public void teches(String str){
        System.out.println("TA teches " + str);
    }
    public void studies(String str){
        System.out.println("TA studies " + str);
    }
}

public class InterAbstrTest extends SeniorRS{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        
        sc.close();

        JuniorRS jr = new JuniorRS();
        SeniorRS sr = new SeniorRS();

        jr.studies(str1);
        sr.studies(str2);
        sr.teches(str2);
    }
}