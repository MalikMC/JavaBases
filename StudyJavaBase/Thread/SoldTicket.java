
public class SoldTicket {

	public static void main(String[] args) {
		
		TicketRunnable tk=new TicketRunnable();
		
		Thread A=new Thread(tk);
		Thread B=new Thread(tk);
		Thread C=new Thread(tk);
		Thread D=new Thread(tk);
		
		A.setName("A����");
		B.setName("B����");
		C.setName("C����");
		D.setName("D����");

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
				System.out.println("Ʊ�����꣡");
				break;
			}			
				
			System.out.println("�����̴߳���ҵ���۳�Ʊ��"+ticketCount+ " �߳����ƣ�"+Thread.currentThread().getName());
			ticketCount --;		
		}
				
		
		
		
	}
	
	
}

	
	
	
	

