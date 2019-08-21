package spring;


 class WriterApp{
private Writer writer;


public void setWriter(Writer writer) {
	this.writer = writer;
}


public void print(String message) {
	writer.write(message);
	
}


}