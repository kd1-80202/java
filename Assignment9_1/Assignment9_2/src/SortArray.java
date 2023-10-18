import java.util.Comparator;

public class SortArray {
	
	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for(int i=0; i<arr.length-1; i++) {
		for(int j=i+1; j<arr.length; j++) {
		if(c.compare(arr[i], arr[j]) > 0) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		}
		}
		}
		}
	

	public static void main(String[] args) {
		
	
		
		class SortArrayComparator implements Comparator<Double>{

			@Override
			public int compare(Double a1, Double a2) {
				if(a1>a2)
					return 1;
				else
				return 0;
			}
	}
		
		SortArrayComparator comparator=new SortArrayComparator();
		double[] arr2= {11.2,33.4,45.4,55.6};
		System.out.println("Before sort=");
		
		for(double a:arr2) {
			System.out.println(a);
		}
		
		
		System.out.println("After sort=");
		selectionSort(arr2, comparator);
		
		for(double a:arr2) {
			System.out.println(a);
	
		}
	}
	
}
