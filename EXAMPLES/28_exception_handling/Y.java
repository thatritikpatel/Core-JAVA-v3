class Y{
	public static void main(String[] args){
		System.out.println("----start");

		if(args.length==0){
			throw new MissingCommandlineArgumentException();
		}

		System.out.println("----end");
	}
}

class MissingCommandlineArgumentException extends RuntimeException{

}