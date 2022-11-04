

package composite;

import java.util.ArrayList;

public class GroupChat implements Content {
	private String name;
	private ArrayList<Content> files = new ArrayList<Content>();

	public GroupChat(String name) {
		this.name = name;
	}

	public void add(Content object) {
		files.add(object);
	}

	@Override
	public void display(int counter) {
		System.out.println(counter+"--|"+name+"|--");
		counter++;
		for (Content file : files) {
			Content result = file;
			result.display(counter);
		}
	}
}
