class C{
	public static void main(String[] args){
		String threadName = Thread.currentThread().getName();

		//Job 1:
		for(int i=0;i<30;i++){
			System.out.println(threadName+"_Job1_"+i);
		}

		//Job 2:
		for(int i=0;i<30;i++){
			System.out.println(threadName+"_Job2_"+i);
		}
	}
}