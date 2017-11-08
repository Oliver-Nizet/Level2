import javax.swing.JFrame;

public class GameWindow {
	public static final int width = 1925;
	public static final int height = 1000;

	JFrame window;
	GamePanel panel;

	public static void main(String[] args) {
		GameWindow gw = new GameWindow();
	}

	GameWindow() {
		window = new JFrame();
		window.setVisible(true);
		window.setSize(width, height);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new GamePanel();
		window.add(panel);
	}
}
