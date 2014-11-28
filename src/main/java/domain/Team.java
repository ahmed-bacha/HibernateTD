package domain;

public class Team {
	
	private Integer num;
	
	private String name;
	

	public Team(Integer num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	
	public Team() {
		super();
	}
	
	@Override
	public String toString() {
		return "Team [num=" + num + ", name=" + name + "]";
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
		
		
		

}
