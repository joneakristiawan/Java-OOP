public class Player {
	String username;
	HP hp;
	int attack;
	int defense;
	
	public Player(String username, HP hp, int attack, int defense) {
		this.username = username;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
	}

	public void attack(Enemy target) {
		System.out.println(username + " attacking " + ((Enemy)target).getName());
		target.takeDamage(attack, ((Enemy)target).getDefense());
	}
}
