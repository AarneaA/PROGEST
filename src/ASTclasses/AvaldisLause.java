package ASTclasses;

import java.util.Arrays;
import java.util.List;

public class AvaldisLause extends PuuTipp {

	private final PuuTipp avaldis;

	public AvaldisLause(PuuTipp avaldis) {
		this.avaldis = avaldis;
	}
	
	
	public PuuTipp getAvaldis() {
		return avaldis;
	}


	@Override
	public List<Object> getChildren() {
		// TODO Auto-generated method stub
		//return null;
		return Arrays.asList((Object)this.avaldis);
	}
}
