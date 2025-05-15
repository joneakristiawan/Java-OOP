
public class Enemy implements IDamageable, IAttack {
	String name;
	HP hp;
	int attack;
	int defense;

	public Enemy(String name, HP hp, int attack, int defense) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HP getHp() {
		return hp;
	}

	public void setHp(HP hp) {
		this.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	@Override
	public void attack(IDamageable target) {
		System.out.println(name + " attacking " + ((Enemy)target).getName());
		target.takeDamage(attack, ((Enemy)target).getDefense());
	}

	@Override
	public int takeDamage(int damage, int defense) {
		int resdmg = damage - defense;
		if (resdmg < 0) {
			resdmg = 0;
		}
		System.out.println(name + " is taking damage for " + resdmg + " point(s)");
		hp.reduce(resdmg);
		return resdmg;
	}
	
	public void showHP() {
		hp.showHP(name);
	}

	

}
