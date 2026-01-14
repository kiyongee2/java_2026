package abstract_class.game_level;

public class Player {
	
	private PlayerLevel level;
	
	public Player() {
		//부모 타입으로 객체 생성
		level = new Beginner();
		level.showLevelMessage();
	}
	
	//매개 변수의 다형성 - 객체 전달
	public void upgradeLevel(PlayerLevel level) { 
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}

}
