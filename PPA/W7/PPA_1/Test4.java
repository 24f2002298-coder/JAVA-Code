import java.util.*;

//Define class WrongDestinationException
class WrongDestinationException extends Exception{
    public WrongDestinationException(String msg){
        super(msg);
    }
}

//Define class ImproperHeadCountException
class ImproperHeadCountException extends Exception{
    public ImproperHeadCountException(String msg){
        super(msg);
    }
}

class CarRental{
    int passenger_count;
    String chosen_destination;
    HashMap<String,Double> available_destinations;  
	
    public CarRental(int pc, String dest) {
        passenger_count = pc;
        chosen_destination = dest;
        //preassigned destinations and total car fare
        //Leave the code below as it is
        available_destinations = new HashMap<String,Double>();
        available_destinations.put("Marina Beach", 2000.0);
        available_destinations.put("Elliot's Beach", 5000.0);
        available_destinations.put("Film City", 8000.0);
    }
    public void carBooker(){
        //define this method according to the problem description
        try{
            if(this.passenger_count <= 0){
                throw new ImproperHeadCountException("Head count should be positive non zero value");
            }
            Double price = this.available_destinations.get(chosen_destination);
            Double prc_prsn = price / this.passenger_count;
            System.out.println("Destination: "+this.chosen_destination+", Head cost: "+prc_prsn);
        }
        catch(ImproperHeadCountException e){
            System.out.println(e);
        }
        catch(NullPointerException e){
            e.initCause(new WrongDestinationException("Invalid destination"));
            throw e;
        }
    }

}
public class Test4{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        
        int num = s.nextInt(); //input the number of car rental requests
        try {
            for(int i=1;i<=num;i++) {
                int heads = s.nextInt(); //enter head count
                s.nextLine();  //enter destination
                String dest = s.nextLine();     
                CarRental obj = new CarRental(heads,dest);
                obj.carBooker();
            }
        }catch(Exception e) {
            System.out.println(e.getCause());
        }
    }
}