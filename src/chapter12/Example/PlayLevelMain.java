package chapter12.Example;

public class PlayLevelMain {

	public static void main(String[] args) {
		
		Player player = new Player();
		player.play(1);
		
		AdvencedLevel aLevel = new AdvencedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
		
	}

}
