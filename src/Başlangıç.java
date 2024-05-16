import java.awt.Color;
import javax.swing.JFrame;

//oyunun başlatma menüsü, oluşturulan ekranı yansıtma
public class Başlangıç {

	public static void main(String[] args) {
		JFrame obj=new JFrame();
		Oyun gamePlay = new Oyun();
		
		obj.setBounds(10, 10, 800, 630);
		obj.setTitle("Clash of spy");	
		obj.setBackground(Color.gray);
		obj.setResizable(false);
		
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gamePlay);
		obj.setVisible(true);

	}

}
