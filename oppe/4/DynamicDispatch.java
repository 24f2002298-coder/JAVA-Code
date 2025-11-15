import java.util.Scanner;
class AirPlane{
    private String model;

    AirPlane(String model){
        this.model=model;
    }

    public void dispaly(){
        System.out.println("Inside an anonymous Airplane");
    }

    public String getModel(){
        return this.model;
    }
}

class Boeing extends AirPlane{

    Boeing(String model){
        super(model);
    }

    public void dispaly(){
        System.out.println("Inside Boeing "+super.getModel());
    }
}

class AirBus extends AirPlane{

    AirBus(String model){
        super(model);
    }

    public void dispaly(){
        System.out.println("Inside AirBus "+super.getModel());
    }
}


class DynamicDispatch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AirPlane[] ap=new AirPlane[3];
        ap[0]=new AirPlane("");
        ap[1]=new Boeing(sc.next());
        ap[2]=new AirBus(sc.next());
        ap[0].dispaly();
        ap[1].dispaly();
        ap[2].dispaly();
        sc.close();
    }
}
