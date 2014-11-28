package domain;

public class Player {

	private Integer num;

	private String name;

	private Integer numero;

	private Integer equipeId;
	
	
	public Player(Integer num, String name, Integer numero, Integer equipeId) {
		super();
		this.num = num;
		this.name = name;
		this.numero = numero;
		this.equipeId = equipeId;
	}
	
	public Player() {
		super();
	}

	@Override
	public String toString() {
		return "Player [num=" + num + ", name=" + name + ", numero=" + numero
				+ ", equipeId=" + equipeId + "]";
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

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getEquipeId() {
		return equipeId;
	}

	public void setEquipeId(Integer equipeId) {
		this.equipeId = equipeId;
	}

}
