interface Finterface {
   public abstract boolean filter(int o);
}

public class HigherOrderF {

   public static void display(int arr[], Finterface f) {
       for (int i : arr) {
           if (f.filter(i)) {
               System.out.print(i + " ");  //2 and 4
           }
       }
   }

   public static void main(String[] args) {
       int arr[] = {1, 2, 3, 4, 5};
       
       // Using an instance of a class that implements Finterface
       Finterface evenFilter = new EvenFilter();
       display(arr, evenFilter);
       
       System.out.println();
   }
}

class EvenFilter implements Finterface {
   @Override
   public boolean filter(int o) {
       return o % 2 == 0; 
   }
}
