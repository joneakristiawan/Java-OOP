
public class HP {
	int hp;

	public HP(int hp) {
		this.hp = hp;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void reduce(int dmg) {
		hp -= dmg;
		if (hp < 0) {
			hp = 0;
		}
	}
	
	public void showHP(String name) {
		System.out.println(name + " current HP is " + hp);
	}
	
}
