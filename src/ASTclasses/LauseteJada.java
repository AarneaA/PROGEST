package ASTclasses;

import java.util.ArrayList;
import java.util.List;

public class LauseteJada extends PuuTipp {
	
	private final List<PuuTipp> statements;

	public LauseteJada(List<PuuTipp> statements) {
		this.statements = statements;
	}

	@Override
	public List<Object> getChildren() { //
		return new ArrayList<Object>(statements); 
	}
}