package slimegame_2;

public class Human {

	String name;
	int hp = 100;
	
	public Human(String n) {
		name = n;
	}
	
	public void attack(Slime s) {
		
		System.out.println("인간은" +s.name + "을(를) 공격했습니다.");
		s.hp = s.hp -30;
		
		if (s.hp < 1) {
			Study1.lbl.setText(s.name + "는 사망했다\n");
		Study1.lbl2.setText("");
		}
		else {
			Study1.lbl.setText(s.name + "의 체력은" + s.hp);
		}
		
	
	}
}
