package ����߼�ѡ������;

import java.util.Arrays;

//ѡ�����򣺴�0������ʼ�����κͺ����Ԫ�رȽϣ�С����ǰ�ţ���һ����ϣ���Сֵ��������С������

public class ArraySelectSort {

	public static void main(String[] args) {
		
          int[] arrary= {12,3,35,67,21,6};
          
          for(int i=0;i<arrary.length-1;i++)
          {
        	  System.out.println("���ǵ�"+(i+1)+"�ֱȽ�");
        	  
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
