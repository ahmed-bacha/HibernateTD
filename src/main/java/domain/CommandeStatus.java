package domain;

public class CommandeStatus {

	private Integer id;

	private String label;

	public CommandeStatus(Integer id, String label) {
		super();
		this.id = id;
		this.label = label;
	}

	public CommandeStatus() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return "CommandeStatus [id=" + id + ", label=" + label + "]";
	}

}
