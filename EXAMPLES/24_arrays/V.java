class V{
	public static void main(String[] args){
		char[] x = {'m','o','h','a','n',' ','k','u','m','a','r'};
		
		int count = 0;
		for(int i=0;i<11;i++){
			if(x[i]=='a'||x[i]=='e'||x[i]=='i'||x[i]=='o'||x[i]=='u'){
				System.out.println(x[i]);
				count++;
			}
		}

		System.out.println(count);
	}
}