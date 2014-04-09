package ceo;

public class Tenner {

	private String name;
	private String position;
	private String friend[];
	public Tenner() {
		name = "Neymar";
		position = "Striker - ST";
		friend = new String[]{"Cristiano Ronaldo","Leo Messi","Wayne Rooney"};
	}
	public Tenner(int c) {
		System.out.println("Neymar Overloadind 2");
	}
	public String getName(){			
		return name;		
	}
	public String getPosition(){			
		return position;		
	}
	public String[] getFriend(){			
		return friend;		
	}
	

}
