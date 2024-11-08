package notification;

public abstract class AbstractNotify {
	public AbstractNotify(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	private String name;
	private int age;
	
	public abstract String awake();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

}
