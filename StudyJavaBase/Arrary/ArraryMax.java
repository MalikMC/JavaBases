
public class ArraryMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arry= {10,34,754,25,14,64};
    
         int max=arry[0];
         
         for(int i=1;i<arry.length;i++)
         {
        	 max=arry[i]>max?arry[i]:max;
        	
         }
         System.out.println(max);
	}

}
