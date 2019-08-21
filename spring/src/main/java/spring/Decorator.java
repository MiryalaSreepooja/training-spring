package spring;

public class Decorator implements Writer {

	public void write(String message) {
		System.out.println("Iam decorator writter"+ message);
	}
	

}
