package slimegame;

import javax.swing.JOptionPane;

public class SlimeName {
	public static void main(String[] args) {
		
		Slime s = null;
		
		Slime s1 = new Slime("슬라미");
		Slime s2 = new Slime("슬라이");
 		Human h = new Human("용사");
			
 		
			System.out.println(s1.name + "와"+s2.name + "이(가)나타났다 당신의 이름은 "+ h.name + "이다\n");
			while (true) {
				//인풋박스
				String sTarget = JOptionPane.showInputDialog("어느 몬스터를 공격하겠습니까?" +"1은" + s1.name +"2" + s2.name);
			
				if (sTarget == null || sTarget.equals("")) {
				System.exit(0);
			}
				//형변환
			int target = Integer.parseInt(sTarget);
			
		if (target == 1) {
			
			s = s1;
			
	} else if (target == 2) {
			s = s2;
				

	} else {
				
			
				System.out.println("올바른 숫자를 입력하세요");
			}
		
		if (s.hp < 1) {
			System.out.println(s.name + "는 이미 죽어있다.\n");
		
		}else {
			h.attack(s);
			s.attack(h);	
		}	
		
		if (s1.hp < 1 && s2.hp <1 ) {
			
			JOptionPane.showMessageDialog(null, "Game Clear!");
			System.exit(0);
		}
		}	
	}
}
