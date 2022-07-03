import javax.swing.JButton;
import javax.swing.JFrame;
public class Main {
	public static void main(String[] args) {
		JFrame obj =  new JFrame();
		BlockBreakerPanel panel = new BlockBreakerPanel();
		obj.setBounds(10,10,700,600);
		obj.setTitle("BALLOVER");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(panel);
		
		JFrame startScreen = new JFrame();
		JButton start = new JButton("Start");
		
		
		
		


}}
