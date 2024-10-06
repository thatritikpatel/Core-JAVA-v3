class Z{
	public static void main(String[] args){
		System.out.println("----start");

		if(args.length==0){
			throw new MissingCommandlineArgumentException("No commandline argument found....!!!!");
		}

		System.out.println("----end");
	}
}

class MissingCommandlineArgumentException extends RuntimeException{
	MissingCommandlineArgumentException(){
	
	}

	MissingCommandlineArgumentException(String msg){
		super(msg);
	}
}