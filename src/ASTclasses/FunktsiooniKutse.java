package ASTclasses;

import java.util.ArrayList;

import java.util.List;

public class FunktsiooniKutse extends PuuTipp {
	
	private final String functionName;
	private final List<PuuTipp> arguments;

	public FunktsiooniKutse(String functionName, List<PuuTipp> arguments) {
		this.functionName = functionName;
		this.arguments = arguments;
	}


	public List<Object> getChildren() {
		List<Object> result = new ArrayList<Object>();
		result.add(this.functionName);
		result.addAll(this.arguments);
		return result;
	}
	
	public String getFunctionName() { //
		return functionName;
	}
	
	public List<PuuTipp> getArguments() { //
		return arguments;
	}
}
