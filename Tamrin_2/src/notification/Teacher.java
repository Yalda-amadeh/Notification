package notification;

public class Teacher extends AbstractNotify {
	private int teacherid;
	

	public Teacher(String name, int age,int teacherid) {
		super(name, age);
		this.teacherid=teacherid;
	}

	@Override
	public String awake() {
	    if (teacherid == 2) {
	        return "CALL"; 
	    } else {
	        return "No CALL"; 
	    }
	}

	public int getTeacherid() {
		return teacherid;
	}

	public void setTeacherid(int teacherid) {
		this.teacherid = teacherid;
	}


	}
