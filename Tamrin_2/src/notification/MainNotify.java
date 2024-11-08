package notification;

public class MainNotify {

	public static void main(String[] args) {
		Teacher teach1= new Teacher("ali",23,2);
		
		Manager man1= new Manager("zahra",43,1);
		
		Student st1 = new Student("yalda",23,3);
		Student st2 = new Student("yalda",23,1);
		
		//cannot instantiate 
		//AbstractNotify idk=new AbstractNotify("saeed",31);   
		
		System.out.println(teach1.awake());
		System.out.println(man1.awake());
		System.out.println(st1.awake());
		System.out.println(st2.awake());
		
	}

}
