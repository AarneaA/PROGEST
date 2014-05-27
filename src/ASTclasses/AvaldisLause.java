package ASTclasses;

import java.util.Arrays;
import java.util.List;

public class AvaldisLause extends PuuTipp {

	private final PuuTipp avaldis;

	public AvaldisLause(PuuTipp avaldis) {
		this.avaldis = avaldis;
	}
	
	public List<Object> getChildren() {
		return Arrays.asList((Object)this.avaldis);
	}
	
	public PuuTipp getAvaldis() {
		return avaldis;
	}
}
