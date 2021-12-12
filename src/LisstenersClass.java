/*
 * 
 */
package src;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

// TODO: Auto-generated Javadoc
/**
 * The Class LisstenersClass.
 */
public class LisstenersClass {
	
	/** The w. */
	win w;
	
	/**
	 * Instantiates a new lissteners class.
	 *
	 * @param w the w
	 */
	LisstenersClass(win w){
		this.w=w;
	}
	 
 	/** The listener exit. */
 	public  ListenerExit listenerExit=new ListenerExit();
	    
    	/** The listener calculate. */
    	public  ListenerCalculate listenerCalculate=new ListenerCalculate();
	    
    	/** The listener type. */
    	public  ListenerType listenerType=new ListenerType();
		
		/** The listener infa. */
		public  ListenerInfa listenerInfa=new ListenerInfa();
	    
    	/**
    	 * The Class ListenerType.
    	 */
    	public class ListenerType implements ActionListener {
	        
        	/**
        	 * Action performed.
        	 *
        	 * @param event the event
        	 */
        	@Override
	        public void actionPerformed(ActionEvent event) {
	            w.set.setType(w.type.getSelectedIndex());//запоминаем тип имущества в настройках
	        }
	    }
	    
    	/**
    	 * The Class ListenerExit.
    	 */
    	public class ListenerExit implements ActionListener {
	        
        	/**
        	 * Action performed.
        	 *
        	 * @param arg0 the arg 0
        	 */
        	@Override
	        public void actionPerformed(ActionEvent arg0) {
	            System.exit(1);
	        }
	    }
	    
    	/**
    	 * The Class ListenerCalculate.
    	 */
    	public class ListenerCalculate implements ActionListener {
	        
        	/**
        	 * Action performed.
        	 *
        	 * @param event the event
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
	 * The Class ListenerInfa.
	 */
	public class ListenerInfa implements ActionListener {
		
		/**
		 * Action performed.
		 *
		 * @param event the event
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
