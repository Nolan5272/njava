import javax.swing.*;
import java.awt.*;

public class render{
	public static void main(String[] args) {
        	JFrame frame = new JFrame();
        	Container pane = frame.getContentPane();
        	pane.setLayout(new BorderLayout());
       
       		// panel to display render results
        	JPanel renderPanel = new JPanel() {
            		public void paintComponent(Graphics g) {
                		Graphics2D g2 = (Graphics2D) g;
                	g2.setColor(Color.BLACK);
                	g2.fillRect(0, 0, getWidth(), getHeight());
                
                // rendering magic will happen here
            					}
        	};
        	pane.add(renderPanel, BorderLayout.CENTER);
        
        	frame.setSize(600, 600);
        	frame.setVisible(true);
	}
}