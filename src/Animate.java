
public class Animate implements Runnable{
	
	BlockBreakerPanel bp;
	
	Animate(BlockBreakerPanel b){
		this.bp=b;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true) {
			bp.update();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	

}
