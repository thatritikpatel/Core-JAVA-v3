class C1{
	public static void main(String[] args){
		String threadName = Thread.currentThread().getName();

		X.process();

		//Job 1:
		for(int i=0;i<30;i++){
			System.out.println(threadName+"_Job1_"+i);
		}		
	}
}

class X{
	static void process(){
		String threadName = Thread.currentThread().getName();

		//Job 2:
		for(int i=0;i<30;i++){
			System.out.println(threadName+"_Job2_"+i);
		}
	}
}