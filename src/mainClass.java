import ASTclasses.PuuTipp;

public class mainClass {
	public static void main(String[] args) {
	String Code =
"muut nimi = \"Taavi\"; nimi = \"Aarne\";prindi(nimi); muut limiit = 20; kui limiit < 30 siis {    prindi(\"Limiit on väiksem kui 30!\")} muidu {    prindi(\"Limiit ületatud!\")};iga i korral vahemikus 2..20 {    prindi(i)};muut vanus = 22;kuni vanus < 27 tee {    prindi(\"Auto liising kehtib\");    vanus = vanus + 1;};vanus = 15; tee {prindi(\"Oled veel alaealine! \"); vanus = vanus + 1;} kuni vanus <18;";
	PuuTipp astree = PROGESTi.generateAST(Code); 
	PROGESTi.runProgram(astree);
	
	/*for(int i = 0; i<astree.getChildren().size(); i++){
		System.out.println(astree.getChildren().get(i));
	}*/
	
}
}