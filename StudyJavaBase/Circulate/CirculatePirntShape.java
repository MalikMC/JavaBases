
public class CirculatePirntShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.三角形
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");

			}
			System.out.println(" ");
		}
		System.out.println("========================================");
		
		//2.三角形
		for(int i=5;i>=0;i--)
		{
			for(int j=0;j<i;j++)
			{				
				System.out.print("*");
			}
			System.out.println(" ");
			
		}
		
		System.out.println("========================================");
		
		//3.乘法口诀
		
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print( j+"*"+i+"="+ i*j+" " );
				
			}
			System.out.println(" ");
		}
		
		
		
		
		
		
	}

}
