package com.rmuti.datastructure;

public class ShowArraylish {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add("Show1");
		list.add("Show2");
		list.add("Show3");
		list.add("Show4");
		list.add("Show5");
		System.out.println(list);

		ArrayListQueue queue = new ArrayListQueue();
		queue.enQueue("Show1");
		queue.enQueue("Show2");
		queue.enQueue("Show3");
		queue.enQueue("Show4");
		queue.enQueue("Show5");
		System.out.println(queue);

		ArrayListStack stack = new ArrayListStack();
		stack.push("Show1");
		stack.push("Show2");
		stack.push("Show3");
		stack.push("Show4");
		stack.push("Show5");
		System.out.println(stack);


	}

}