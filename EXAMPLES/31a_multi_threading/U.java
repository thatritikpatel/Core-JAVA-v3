import java.util.Scanner;

class Producer extends Thread{
	public void run(){
		Thread t = Thread.currentThread();	

		while(true){
			U.circle.setRadius(t);
		}
	}
}

class Consumer extends Thread{
	public void run(){
		Thread t = Thread.currentThread();
		while(true){
			U.circle.getRadius(t);
		}
	}
}

class U{
	static Circle circle = new Circle();

	public static void main(String[] args){
		Producer p = new Producer();
		p.setName("Producer");

		Consumer c = new Consumer();
		c.setName("Consumer");

		p.start();
		c.start();
	}
}

class Circle{
	private int radius = 0;
	static Scanner sc = new Scanner(System.in);
	
	synchronized void getRadius(Thread t){
		if(radius!=0){
			System.out.println(t.getName()+":: New Radius is: "+radius);
			radius = 0;
			notify();
		}else{
			System.out.println(t.getName()+":: going to wait on the Circle object, because radius is : "+radius);
			try{ wait(); }catch(InterruptedException e){ e.printStackTrace(); }
		}
	}

	synchronized void setRadius(Thread t){
		if(radius==0){
			System.out.println(t.getName()+":: Enter radius: ");
			radius = sc.nextInt();
			notify();
		}else{
			System.out.println(t.getName()+":: going to wait on the Circle object, because radius is : "+radius);
			try{ wait(); }catch(InterruptedException e){ e.printStackTrace(); }
		}
	}
}

