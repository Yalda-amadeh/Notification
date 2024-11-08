package notification;

public class Manager extends AbstractNotify {
	private int managerid;

	public Manager(String name, int age,int managerid) {
		super(name, age);
		this.managerid=managerid;
	}

	@Override
	public String awake() {
	    if (managerid == 1) {
	        return "InPerson"; 
	    } else {
	        return "No InPerson"; 
	    }
	}

	public int getManagerid() {
		return managerid;
	}

	public void setManagerid(int managerid) {
		this.managerid = managerid;
	}

}
