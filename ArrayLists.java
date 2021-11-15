import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists{
    public static void main(String[] args){
//class of primitive Datatypes Byte | Short | Integer |Long | Double | Float | String | Boolean
	ArrayList<Integer> list1 = new ArrayList<Integer>();
	ArrayList<String> list2 = new ArrayList<>();
	ArrayList<Float> list3 = new ArrayList<Float>();
	ArrayList<Boolean> list4 = new ArrayList<>();

	list1.add(0); // add new item
	list1.add(2);
	list1.add(3);
	list1.add(1, 100); // add new item 100 on first Index 
	System.out.println(list1);
	System.out.println();
	int ele1 = list1.get(1);
	System.out.println(list1.get(1));
	System.out.println(ele1);
	System.out.println(list1);
	list1.set(1, 10); // updating/changing item 100 to 10 on first Index 
	System.out.println(list1.get(1));
	System.out.println(list1);
	System.out.println();
	list1.remove(3); // removing the time in the index 3. 
	System.out.println(list1);
	System.out.println();
	System.out.println(list1.size()); //to identify the length
	for (int i = 0; i<list1.size(); i++){
		System.out.println(list1.get(i));
	}
	Collections.sort(list1);
	System.out.println(list1);
    }

}