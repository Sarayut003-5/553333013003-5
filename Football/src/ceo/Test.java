package ceo;

public class Test {


	public static void main(String[] args) {
		Tenner lamp = new Tenner();
		System.out.println("name : "+lamp.getName());
		System.out.println("position : "+lamp.getPosition());
		System.out.println("friend : "+lamp.getFriend()[1]);
		new Tenner(2);
	}
}
