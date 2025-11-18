import java.util.Scanner;
import java.util.ArrayList;

interface MobileDevice{
    String makeCall();
}

interface Camera{
    String takePicture();
}

class SmartPhone implements MobileDevice, Camera{

    String name;
    public SmartPhone(){}
    public SmartPhone(String name){this.name = name;}

    public String makeCall(){
        return name + " makes a call";
    }
    public String takePicture(){
        return name + " takes a picture";
    }
}

public class InterfaceTest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> messageList = new ArrayList<String>();
        for(int i=0;i<3;i++){
            String type = sc.next();
            if(type.equals("M")){
                MobileDevice m = new SmartPhone(sc.next());
                messageList.add(m.makeCall());
            }
            else if(type.equals("C")){
                Camera c = new SmartPhone(sc.next());
                messageList.add(c.takePicture());
            }
        }
        sc.close();

        for(String s : messageList){
            System.out.println(s);
        }
    }
}