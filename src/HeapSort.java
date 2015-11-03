import java.util.ArrayList;

public class HeapSort{
	
	public static <T extends Comparable<T>> ArrayList<T> sort(ArrayList<T> array){
		
		MaxHeap<T> heap = new MaxHeap<T>(array);		
		
		for(int i = array.size() - 1; i >= 0; --i){
			
			array.set(i, heap.delete());
		}
		
		return array;
	}
}