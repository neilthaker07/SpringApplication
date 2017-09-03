package first;

public class GreeterWorld implements Greeter {

	String name = null;
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	public String getGreeting() {
		// TODO Auto-generated method stub
		return "Hello world from "+ name +"!";
	}
}
