import java.util.LinkedList;

class T{
	public static void main(String[] args){
		LinkedList list = new LinkedList();

		//Case 3:
		//As a Queue:
		list.offer(12);
		list.offer(78);
		list.offer(59);

		//System.out.println(list.peek());
		//System.out.println(list.peek());
		//System.out.println(list.peek());

		System.out.println(list);

		System.out.println(list.poll());
		System.out.println(list.poll());
		System.out.println(list.poll());

		System.out.println(list);
		
		//Case 2:	
		//As a Stack:
		/*
		list.push(12);
		list.push(87);
		list.push(54);

		System.out.println(list);

		System.out.println(list.pop());
		System.out.println(list.pop());
		System.out.println(list.pop());

		System.out.println(list);
		*/


		//Case 1:
		//As a List:
		/*
		list.add(12);
		list.add(45);
		list.add(78);

		System.out.println(list);

		System.out.println(list.remove(0));
		System.out.println(list.remove(0));
		System.out.println(list.remove(0));

		System.out.println(list);
		*/
	}
}