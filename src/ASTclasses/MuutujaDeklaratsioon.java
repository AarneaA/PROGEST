package ASTclasses;

import java.util.Arrays;
import java.util.List;

public class MuutujaDeklaratsioon extends PuuTipp {
	private final String muutujaNimi;
	private final PuuTipp initializer;

	public MuutujaDeklaratsioon(String muutujaNimi, PuuTipp initializer) {
		this.muutujaNimi = muutujaNimi;
		this.initializer = initializer;
	}

	public List<Object> getChildren() {
		return Arrays.asList((Object)muutujaNimi, initializer);
	}
	
	public String getMuutujaNimi() { //
		return muutujaNimi;
	}
	

	public PuuTipp getInitializer() { //
		return initializer;
	}
}
