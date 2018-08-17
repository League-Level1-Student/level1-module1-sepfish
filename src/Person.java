
public class Person {
	
	String name;
	String superpower;
	
	Person(){
		System.out.println("LOADING...");
		System.out.println("Virtual person created.");
	}
	
	void getName() {
		if (name == null) {
			System.out.println("Your virtual person does not have a name.");
		}
			System.out.println("'Hello. My name is " + name + ".'");
	}
	
	void getSuperpower() {
		if (superpower == null) {
			System.out.println("Your virtual person does not have a superpower.");
		} else {
			System.out.println("'My superpower is " + superpower + ".'");
		}
	}
	
	void setName(String name) {
		if (name.equalsIgnoreCase("Miku") | name.equalsIgnoreCase("Luka") | name.equalsIgnoreCase("Rin") | name.equalsIgnoreCase("Len") | name.equalsIgnoreCase("Meiko") | name.equalsIgnoreCase("Kaito")) {
			System.out.println("Loading VOCALOIDS...");
			System.out.println("Just kidding.");
			this.name = name;
			System.out.println("Your virtual person's name has been set to: " + name + ".");
		} else {
			this.name = name;
			System.out.println("Your virtual person's name has been set to: " + name + ".");
		}
	}
	
	void setSuperpower(String superpower) {
		this.superpower = superpower;
		System.out.println("Your virtual person's superpower has been set to: " + superpower + ".");
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Miku");
		person.getSuperpower();
		person.getName();
		person.setSuperpower("flight");
		person.getSuperpower();
	}
	
}
