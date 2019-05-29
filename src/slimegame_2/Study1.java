package slimegame_2;

import java.awt.Font;
import java.util.Enumeration;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class Study1 {

	//static Slime s = null;
	
	static JLabel lbl, lbl2;

	static Slime s1 = new Slime("슬라미");
	static Slime s2 = new Slime("슬라이");
	static Human h = new Human("용사");
	
	public static void main(String[] args) {	
 		
 		
		
		Enumeration<Object> keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
            if (value instanceof FontUIResource)
                UIManager.put(key, new FontUIResource("Arial", Font.PLAIN, 14));
        }
		
		// 프레임 생성
		JFrame frm = new JFrame();
		// 프레임 제목 설정
		frm.setTitle("slime game");
		
		// 프레임 크기 설정
		frm.setSize(350,350);
		// 프레임을 화면 가운데에 배치
		frm.setLocationRelativeTo(null);
		 // 프레임을 닫았을 때 메모리에서 제거되도록 설정
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 레이아웃 설정
		//FlowLayout fLay = new FlowLayout();
		frm.getContentPane().setLayout(null);
		
		
        // 버튼 생성
    
        JButton btn1 = new JButton(s1.name);
		JButton btn2 = new JButton(s2.name);
        // 버튼 위치와 크기 설정 setBounds(가로위치, 세로위치, 가로길이, 세로길이);
        btn1.setBounds(30,140,99,30);
        btn2.setBounds(219,140,99,30);
        // 프레임에다가 버튼 추가
        frm.getContentPane().add(btn1);
        frm.getContentPane().add(btn2);
        
        //라벨 설정 setHorizontalAlignment(정렬 위치);
       lbl = new JLabel();
       lbl.setBounds(30, 210, 274, 50);
       lbl.setText("게임 시작");
       lbl.setHorizontalAlignment(JLabel.CENTER);
       frm.getContentPane().add(lbl);
       
       lbl2 = new JLabel();
       lbl2.setBounds(30, 240, 274, 50);
       lbl2.setText(h.name + "의 체력은" + h.hp);
       lbl2.setHorizontalAlignment(JLabel.CENTER);
       frm.getContentPane().add(lbl2);
       
       //img라벨 설정
       JLabel imgLbl1 = new JLabel();
       ImageIcon bsImg = new ImageIcon(Study1.class.getResource("/slimegame_2/img/slime(blue).png"));
       imgLbl1.setIcon(bsImg);
       imgLbl1.setBounds(20,30,122,130);
       imgLbl1.setHorizontalAlignment(JLabel.CENTER);
       frm.getContentPane().add(imgLbl1);
       
       //2
       JLabel imgLbl2 = new JLabel();
       imgLbl2.setIcon(bsImg);
       imgLbl2.setBounds(209,30,122,130);
       imgLbl2.setHorizontalAlignment(JLabel.CENTER);
       frm.getContentPane().add(imgLbl2);
       
		// 프레임이 보이도록 설정
		frm.setVisible(true);
		

	       
	    //버튼이 눌렸을때
	    btn1.addActionListener(event-> {
	    	
	    	battle(s1);
         });
	    btn2.addActionListener(event-> {
	    	battle(s2);
	     });
		
	    
		// 컨텐츠 영역의 크기 표시
        System.out.println(frm.getContentPane().getSize());
	}
	public static void battle(Slime s) {
		
		if (s.hp < 1) {
			lbl.setText(s.name + "는 이미 죽어있다.\n");
		
		}else {
			h.attack(s);
			s.attack(h);	
		
	}
		if (s1.hp < 1 && s2.hp <1 ) {
			
			JOptionPane.showMessageDialog(lbl2, "Game Clear!");
			System.exit(0);
		}
}
}
