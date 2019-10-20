package 数组高级二分法查找;

public class Binary2Search {

	public static void main(String[] args) {
		int[] array = { 14, 24, 56, 113, 242, 247, 452 };
		int target = -56;
		
         int targetIndex= getIndex(array,target);
         
         System.out.println(targetIndex);

	}
	
	
	public static int getIndex(int[] array,int target)
	{
		int minIndex = 0;
		int maxIndex = array.length - 1;
		int mindIndex = (minIndex + maxIndex) / 2;
		int targetIndex=mindIndex ;
		while(target!=array[mindIndex])
		{
			if(target<array[mindIndex])
			{
				maxIndex=mindIndex-1;
			}
			if(target>array[mindIndex])
			{
				minIndex=mindIndex+1;	
			}
			mindIndex=(minIndex + maxIndex) / 2;
			if(minIndex>maxIndex)
			{
			 return	targetIndex=-1;	
			}

		}
		return targetIndex;
		
		
	}

}
