interface Iterable {
    boolean has_next();
    Object get_next();
}

class LinkedList <T> {
    private int size;
    private Node first;

    LinkedList(){
        this.size = 0;
        this.first = null;
    }

    public T head(){
        Node temp = first;
        first = first.next;
        size--;
        return temp.data;
    }

    public void insert(T data){
        Node newNode = new Node(data);
        if(first == null){
            first = newNode;
        }
        else{
            Node temp;
            for(temp = first; temp.next != null; temp = temp.next){}
            temp.next = newNode;
        }
        size++;
    }

    class Node{
        private T data;
        private Node next;

        Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    private class Iterator implements Iterable{
        private Node position;

        Iterator(){
            this.position = first;
        }
        
        public boolean has_next(){
            return !(position == null);
        }

        public T get_next(){
            Node temp = position;
            position = position.next;
            return temp.data;
        }
    }

    public Iterable get_iterator(){
        Iterable iterator = new Iterator();
        return iterator;
    }
}

interface Printable {
    public void getValue();
}

class Ticket implements Printable{
    private String id;

    Ticket(String id){
        this.id = id;
    }

    public void getValue(){
        System.out.println("Ticket id is "+this.id);
    }
}

class Date implements Printable{
    private String date;

    Date(String date){
        this.date = date;
    }

    public void getValue(){
        System.out.println("Date is "+this.date);
    }
}

interface Shape{
    void area();
}

class Square implements Shape{
    private int side;

    Square(int side){
        this.side = side;
    }

    public void area(){
        System.out.println("Area of square of side "+this.side+" is: "+Math.pow(this.side,2));
    }
}

class Rectangle implements Shape{
    private int length;
    private int breadth;

    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public void area(){
        System.out.println("Area of rectangle of length "+this.length+" and bradth "+breadth+" is: "+(this.length * this.breadth));
    }
}

class Circle implements Shape{
    private int radius;

    Circle(int radius){
        this.radius = radius;
    }

    public void area(){
        System.out.println("Area of circle of radius "+this.radius+" is: "+Math.pow(radius,2) * Math.PI) ;
    }
}

public class aTest {
    public static void main(String[] args){

        LinkedList<Ticket> ticketlist = new LinkedList<Ticket>();
        LinkedList<Date> datelist = new LinkedList<Date>();
        LinkedList<Square> squarelist = new LinkedList<Square>();
        LinkedList<Rectangle> rectanglelist = new LinkedList<Rectangle>();
        LinkedList<Circle> circlelist = new LinkedList<Circle>();

        Ticket t1 = new Ticket("T872870");
        Ticket t2 = new Ticket("T872871");
        Date d1 = new Date("31-May-2025");
        Date d2 = new Date("1-June-2025");
        Square s1 = new Square(4);
        Square s2 = new Square(5);
        Rectangle r1 = new Rectangle(3,5);
        Rectangle r2 = new Rectangle(9,2);
        Circle c1 = new Circle(2);
        Circle c2 = new Circle(3);

        ticketlist.insert(t1); ticketlist.insert(t2);
        datelist.insert(d1); datelist.insert(d2);
        squarelist.insert(s1); squarelist.insert(s2);
        rectanglelist.insert(r1); rectanglelist.insert(r2);
        circlelist.insert(c1); circlelist.insert(c2);

        print(ticketlist);
        print(datelist);
        draw(squarelist);
        draw(rectanglelist);
        draw(circlelist);
    }

    public static <T> void print(LinkedList<? extends Printable> list){
        Object obj;
        Iterable itr = list.get_iterator();
        while(itr.has_next()){
            obj = itr.get_next();
            ((Printable)obj).getValue();
        }
    }

    public static <T> void draw(LinkedList<? extends Shape> list){
        Object obj;
        Iterable itr = list.get_iterator();
        while(itr.has_next()){
            obj = itr.get_next();
            ((Shape)obj).area();
        }
    }
}


