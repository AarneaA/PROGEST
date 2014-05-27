package ASTclasses;

import java.util.Arrays;
import java.util.List;

public class IgaLause extends PuuTipp {
	
	private final PuuTipp variable;
	private final PuuTipp range;
	private final PuuTipp body;

	public IgaLause(PuuTipp variable, PuuTipp range, PuuTipp body) {
		this.variable = variable;
		this.range = range;
		this.body = body;

	}

	@Override
	public List<Object> getChildren() {
		return Arrays.asList((Object)variable, range, body);
	}
	
	public PuuTipp getVariable() {
		return variable;
	}
	
	public PuuTipp getRange() {
		return range;
	}
	
	public PuuTipp getBody() {
		return body;
	}
}