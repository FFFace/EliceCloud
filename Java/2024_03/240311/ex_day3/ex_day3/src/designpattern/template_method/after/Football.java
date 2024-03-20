package designpattern.template_method.after;

class Football extends Game {
	@Override
	void initialize() {
		System.out.println("Football Game Initialized! Start playing.");
	}

	@Override
	void startPlay() {
		System.out.println("Football Game Started. Enjoy the game!");
	}

	@Override
	public void printScore() {
		System.out.println("Football Game: 2 : 1");
	}

	@Override
	void endPlay() {
		System.out.println("Football Game Finished!");
	}
}
