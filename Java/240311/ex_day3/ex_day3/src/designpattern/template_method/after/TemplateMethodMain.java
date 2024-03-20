package designpattern.template_method.after;

public class TemplateMethodMain {
public static void main(String[] args) {
		Game game = new Cricket();
		game.play();
		System.out.println();
		game = new Football();
		game.play();
	}

}
