import java.util.Arrays;
import java.util.Scanner;

class Customer{
    private String name;
    private String[] items;

    Customer(String name, String[] items){
        this.name = name;
        this.items = Arrays.copyOf(items, items.length);
    }

    Customer(Customer c1){
        this.name = c1.name;
        this.items = Arrays.copyOf(c1.items, c1.items.length);
    }

    String getName(){
        return this.name;
    }

    String getItem(int index){
        return this.items[index];
    }

    void setItem(int index, String item){
        this.items[index] = item;
    }

    void setName(String name){
        this.name = name;
    }
}

class Order{
    public static void main(String[] args){
        String[] items = {"Eggs", "Noodles", "Bread"};
        Customer c1 = new Customer("c1", items);
        Customer c2 = new Customer(c1);
        System.out.println(c1.getName()+" "+c1.getItem(1));
        System.out.println(c2.getName()+" "+c2.getItem(1));
        Scanner sc = new Scanner(System.in);
        c2.setName(sc.next());
        c2.setItem(1, sc.next());
        sc.close();
        System.out.println(c1.getName()+": "+c1.getItem(1));
        System.out.println(c2.getName()+": "+c2.getItem(1));
    }
}
