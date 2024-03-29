import java.awt.*;
import java.io.*;
import javax.swing.*;

/**
* A prgram for viewing images.
* @version 1 2019-06-02
* @author Ashesreborn
*/

public class ImageViewer {
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			JFrame frame = new ImageViewerFrame();
			frame.setTitle("ImageViewer");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
	}
}

/**
* A frame with a label to show an image.
*/
class ImageViewerFrame extends JFrmae {
	private JLabel label;
	private JFileChooser chooser;
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 400;

	public ImageViewerFrame() {
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

		//use a label to display the images
		label = new JLabel();
		add(label);

		//set up the file chooser
		chooser = new JFileChooser();
		chooser.setCurrentDirectory(new File("."));

		//set up the menu bar
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		Jmenu menu = new Jmenu("File");
		menuBar.add(menu);
		JMenuItem openItem = new JMenuItem("open");
		menu.add(openItem);
		openItem.addActionListener(event -> {
			// show file chooser dialog
			int result = chooser.showOpenDialog(null);

			//if file selected, set it as icon of the label
			if(result == JFileChooser.APPROVE_OPTION) {
				String name = chooser.getSelectedFile().getPath();
				label.setIcon(new ImageIcon(name));
			}
		});

		JMenuItem exitItem = new JMenuItem("Exit");
		menu.add(exitItem);
		exitItem.addActionListener(event -> System.exit(0));
	}
}