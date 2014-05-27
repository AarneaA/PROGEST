package ASTclasses;

import java.util.Arrays;
import java.util.List;

public class Omistamine extends PuuTipp {
	
	private final String muutujaNimi;
	private final PuuTipp avaldis;

	public Omistamine(String muutujaNimi, PuuTipp avaldis) {
		this.muutujaNimi = muutujaNimi;
		this.avaldis = avaldis;
	}


	public List<Object> getChildren() {
		return Arrays.asList((Object)muutujaNimi, avaldis);
	}
	
	public PuuTipp getAvaldis() { //
		return avaldis;
	}
	
	public String getMuutujaNimi() { //
		return muutujaNimi;
	}
}