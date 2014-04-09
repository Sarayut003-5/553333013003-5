package ceo;

public class Tenner {


	private String name;
	private String position;
	private String friend[];
	public Tenner() {
		name = "Neymar";
		position = "SS";
		friend = new String[]{"Cristiano Ronaldo","Leo Messi","Wayne Rooney"};
	}
	public Tenner(int a) {
		
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
