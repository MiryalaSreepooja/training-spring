package spring;

public class PlainText implements Writer {

	public void write(String message) {
		System.out.println("Iam plaintext"+ message);
	}
	

}
