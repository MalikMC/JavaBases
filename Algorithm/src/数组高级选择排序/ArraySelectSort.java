package 数组高级选择排序;

import java.util.Arrays;

//选择排序：从0索引开始，依次和后面的元素比较，小的往前放，第一次完毕，最小值出现在最小索引处

public class ArraySelectSort {

	public static void main(String[] args) {
		
          int[] arrary= {12,3,35,67,21,6};
          
          for(int i=0;i<arrary.length-1;i++)
          {
        	  System.out.println("这是第"+(i+1)+"轮比较");
        	  
        	  for(int j=i+1;j<arrary.length;j++)
        	  {
        		  int temp;
        		  if(arrary[i]>arrary[j])
        		  {
        			  temp=arrary[i];
        			  arrary[i]=arrary[j];
        			  arrary[j]=temp;
        			  
        		  }
        		  
        		  System.out.println(Arrays.toString(arrary));
        		  
        	  }
        	  
          }
		
	}

}
