

package composite;

public class Person implements composite.Content {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public void display(int counter) {
		System.out.println(counter+"-"+name+"-");
	}
}
