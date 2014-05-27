package ASTclasses;

import java.util.Arrays;
import java.util.List;




public class KuniLause extends PuuTipp {
	
	private final PuuTipp condition;
	private final PuuTipp body;

	public KuniLause(PuuTipp condition, PuuTipp body) {
		this.condition = condition;
		this.body = body;
	}

	
	public List<Object> getChildren() {
		return Arrays.asList((Object)condition, body);
	}
	
	public PuuTipp getCondition() {
		return condition;
	}
	
	public PuuTipp getBody() { //
		return body;
	}
}
