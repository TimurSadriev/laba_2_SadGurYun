/*
 * 
 */
package src;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

// TODO: Auto-generated Javadoc
/**
 * @author IgorGuryanov
 * @version 228
 * Класс с добавлением картинки.
 */
public class Image extends JComponent {

	/** Картинка */
	BufferedImage image;
	
	/**
	 * Объект картинки.
	 */
	public Image() {
		
		// получаем изображение и проверяем на доступность
		try 
		{
			image = ImageIO.read(new File("../src/1.jpg"));
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Унаследованный метод отрисовки.
	 *
	 * @param графика открытого окна
	 */
	public void paintComponent(Graphics g)
    {
        if(image == null) return;
        
        
        // Отображение рисунка в левом верхнем углу.
        g.drawImage(image, 20, 20, null);
    }
	
}
