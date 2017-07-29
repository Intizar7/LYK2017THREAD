package tr.org.linux.kamp.oyun;

public class ThreadExample {
	static  boolean shouldRun=true;
	public static void main(String[] args) {
		
	 	
		
	Thread a=new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true) {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(1500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("0.çalıştı");
				shouldRun=false;
			  }
			}
		});
		a.start();
		while(shouldRun) {
		System.out.println("1.çalıştı");
		try {
			Thread.sleep(1500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("2.çalıştı");
		
		try {
			Thread.sleep(1500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println("3.çalıştı");
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(1500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("4.çalıştı");
			}
		}).start();
       new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(1500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}				
				System.out.println("5.çalıştı");
			}
		}).start();
       new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(1500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("6.çalıştı");
			}
		}).start();
	  }
	}		

