package src;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

// TODO: Auto-generated Javadoc
/**
 * The Class Image.
 */
public class Image extends JComponent {

	/** The image. */
	BufferedImage image;
	
	/**
	 * Instantiates a new image.
	 */
	public Image() {
		
		// получаем изображение и проверяем на доступность
		try 
		{
			image = ImageIO.read(new File("../1.jpg"));
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Paint component.
	 *
	 * @param g the g
	 */
	public void paintComponent(Graphics g)
    {
        if(image == null) return;
        
        
        // Отображение рисунка в левом верхнем углу.
        g.drawImage(image, 20, 20, null);
    }
	
}
