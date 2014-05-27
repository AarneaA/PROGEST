package ASTclasses;

import java.util.Arrays;
import java.util.List;

public class Muutuja extends PuuTipp {
	
	private final String name;

	public Muutuja(String name) {
		this.name = name;
	}

	@Override
	public List<Object> getChildren() {
		return Arrays.asList((Object)name);
	}
	
	public String getName() { //
		return name;
	}
}
