interface Finterface {
	public abstract boolean filter(int o);
}

public class HigherOrderF {
	public static void display(int arr[],Finterface f) {  //Finterface f = (i) -> i%2 == 0;
		for(int i : arr) {
			if(f.filter(i)) {
				System.out.print(i + " ");
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		display(arr, (i) -> i%2 == 0);   //(i) -> return i%2 == 0
		System.out.println();
	}

}
