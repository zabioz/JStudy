package slimegame;

// import javax.swing.JOptionPane;

public class S2 {

	public static void main (String[] args) {
		
	Slime s = null;
	
	Slime s1 = new Slime("슬라미");		
	Slime s2 = new Slime("슬라이");
	
	s = s1;

	System.out.println(s.name);
		
		/* int hp = 100;
		
		while (true) {
			
			if (hp < 1)
			JOptionPane.showMessageDialog(null, "Game Over");
			break;
		}
		
			JOptionPane.showMessageDialog(null, "체력" + hp);
			hp = hp -20;
		*/
	}
}
