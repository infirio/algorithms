import java.util.Arrays;

class IceCream implements Comparable{
	int flavor;
	int index;
	IceCream(int flavor, int index){
		this.flavor = flavor;
		this.index = index;
	}
	@Override
	public int compareTo(Object o){
		IceCream ice = (IceCream) o;
		if(this.flavor>ice.flavor)
			return 1;
		else if(this.flavor<ice.flavor)
			return -1;
		else
			return 0;
	
	}
	@Override
	public boolean equals(Object o){
		IceCream ice = (IceCream) o;
		if(ice.index == this.index)
			return true;
		else
			return false;
	}
	
	
}

public class Solution {
	
	public static int binarySearch(int first, int last,IceCream[] arr,int search){
		if(first>=last)
			return -1;
		
		int mid = first+(last-first)/2;

			
		if (arr[mid].flavor>search)
			return binarySearch(first,mid,arr,search);
		
		else if (arr[mid].flavor<search)
			return binarySearch(mid+1,last,arr,search);
		else
			return arr[mid].index;

			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IceCream[] ice = new IceCream[3];
		for(int i=0;i<ice.length;i++)
			ice[i]= new IceCream(i+1,i);
		System.out.println(binarySearch(0,ice.length-1,ice,2));
		
	
	}

}
