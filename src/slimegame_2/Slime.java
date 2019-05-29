package slimegame_2;

import javax.swing.JOptionPane;

public class Slime {

	
	String name;
	int hp = 80;
	
	public Slime(String n) {
	
		name = n;
	}
	
	public void attack(Human h) {
		if(hp > 0) {
		System.out.println(name + "은(는)" + h.name + "공격했습니다");
		h.hp = h.hp -10;
	
	if (h.hp< 1) {
		JOptionPane.showMessageDialog(null, "Game Over");
		System.exit(0);
	}
	
	Study1.lbl2.setText(name + "의 공격" + h.name + "의 체력은"+ h.hp);
	}
}
}
