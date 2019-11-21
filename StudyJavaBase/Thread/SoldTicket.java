
public class SoldTicket {

	public static void main(String[] args) {
		
		TicketRunnable tk=new TicketRunnable();
		
		Thread A=new Thread(tk);
		Thread B=new Thread(tk);
		Thread C=new Thread(tk);
		Thread D=new Thread(tk);
		
		A.setName("A窗口");
		B.setName("B窗口");
		C.setName("C窗口");
		D.setName("D窗口");

		A.start();
		B.start();
		C.start();
		D.start();
	}
	
	
}

 class TicketRunnable implements Runnable{
	

	
	public int ticketCount=100;
	
	public void run() {
	
		while(true)
			 synchronized(this)
		{
			if(ticketCount<=0)
			{
				System.out.println("票己售完！");
				break;
			}			
				
			System.out.println("开启线程处理业务售出票号"+ticketCount+ " 线程名称："+Thread.currentThread().getName());
			ticketCount --;		
		}
				
		
		
		
	}
	
	
}

	
	
	
	

