/*
 * 
 */
package src;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

// TODO: Auto-generated Javadoc
/**
 * @author yunyaev
 * @version 2.0
 * Класс обработчиков.
 */
public class LisstenersClass {
	
	/** Ссылка на окно. */
	win w;
	
	/**
	 * Конструктор класса обработки.
	 *
	 * @param w Ссылка на окно
	 */
	LisstenersClass(win w){
		this.w=w;
	}
	 
 	/** Обработчик кнопки выхода. */
 	public  ListenerExit listenerExit=new ListenerExit();
	    
    	/** Обработчик кнопки посчитать. */
    	public  ListenerCalculate listenerCalculate=new ListenerCalculate();
	    
    	/** Обработчик кнопки тип. */
    	public  ListenerType listenerType=new ListenerType();
		
		/** Обработчик кнопки инфа о разработчике. */
		public  ListenerInfa listenerInfa=new ListenerInfa();
	    
    	/**
    	 * Класс обработки кнопки тип.
    	 */
    	public class ListenerType implements ActionListener {
	        
        	/**
        	 * Обработчик кнопки тип.
        	 *
        	 * @param event
        	 */
        	@Override
	        public void actionPerformed(ActionEvent event) {
	            w.set.setType(w.type.getSelectedIndex());//запоминаем тип имущества в настройках
	        }
	    }
	    
    	/**
    	 * Класс обработки кнопки выхода.
    	 */
    	public class ListenerExit implements ActionListener {
	        
        	/**
        	 * Обработчик кнопки выхода.
        	 *
        	 * @param arg0
        	 */
        	@Override
	        public void actionPerformed(ActionEvent arg0) {
	            System.exit(1);
	        }
	    }
	    
    	/**
    	 * Класс обработки кнопки посчитать.
    	 */
    	public class ListenerCalculate implements ActionListener {
	        
        	/**
        	 * Обработчик кнопки посчитать.
        	 *
        	 * @param event
        	 */
        	@Override
	        public void actionPerformed(ActionEvent event) {
	            try{
	                w.set.setCost(w.input);
	            } catch (NumberFormatException e) {
	                w.output.setText("Ошибка введено не число");
	                w.input.setText("");
	                return;
	            }
	            if (w.set.CostOfProperty<0) {
		            w.output.setText("Ошибка число меньше нуля!");
	                w.input.setText("");
	                return;}
	            Calcalute c=new Calcalute();
	            w.output.setText(Float.toString(c.Cal(w.set)));
	        }
	    }
	
	/**
	 * Класс обработки кнопки инфы о разработчике.
	 */
	public class ListenerInfa implements ActionListener {
		
		/**
		 * Обработчик кнопки инфа о разработчике.
		 *
		 * @param event
		 */
		@Override
		public void actionPerformed(ActionEvent event) {
			JFrame main_GUI=new JFrame();
			JPanel main_panel= new JPanel();
				main_GUI.setTitle ("Разработчики");
				main_GUI.setBounds(0,0,400,200);
				main_GUI.setResizable(false);
				main_panel.setLayout(null);
				main_GUI.add(main_panel);
				JLabel info = new JLabel("Разработчики:");
				info.setBounds(0,0,400,30);
				main_panel.add(info);
				JLabel info2 = new JLabel("*Тимур Садриев - Номер зачетной книжки: 19130079");
				info2.setBounds(20,25,1000,30);
				main_panel.add(info2);
				JLabel info3 = new JLabel("*Максим Юняев - Номер зачетной книжки: 19130087");
				info3.setBounds(20,55,1000,30);
				main_panel.add(info3);
				JLabel info4 = new JLabel("*Игорь Гурьянов - Номер зачетной книжки: 19130545");
				info4.setBounds(20,85,1000,30);
				main_panel.add(info4);
				main_GUI.setVisible(true);
				main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			}
	}
}
