package ASTclasses;

import java.util.Arrays;
import java.util.List;

public class KuiLause extends PuuTipp {
	
	private final PuuTipp condition;
	private final PuuTipp siis;
	private final PuuTipp muidu;

	public KuiLause(PuuTipp condition, PuuTipp siis, PuuTipp muidu) {
		this.condition = condition;
		this.siis = siis;
		this.muidu = muidu;
	}

	@Override
	public List<Object> getChildren() {
		return Arrays.asList((Object)condition, siis, muidu);
	}
	
	public PuuTipp getCondition() {
		return condition;
	}
	
	public PuuTipp getSiis() { //
		return siis;
	}
	
	public PuuTipp getMuidu() { //
		return muidu;
	}
}
