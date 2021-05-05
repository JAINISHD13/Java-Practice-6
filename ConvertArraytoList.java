import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArraytoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList();
		
		for(int i=0;i<10;i++)
			list.add(i);
		
		//convert list to array
		
		Integer[] intArray = new Integer[list.size()];
		
		for(int i=0;i<list.size();i++)
		{
			intArray[i]= list.get(i);
		}
		
		System.out.println("List to Array:"+Arrays.toString(intArray));
		
		List<Integer> convertList = Arrays.asList(intArray);
		
		System.out.println("Array to List"+convertList);
		
		
	
	}

}
