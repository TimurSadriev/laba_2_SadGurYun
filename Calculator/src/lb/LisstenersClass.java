package lb;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static lb.win.*;

public class LisstenersClass {
	 public  ListenerExit listenerExit=new ListenerExit();
	    public  ListenerCalculate listenerCalculate=new ListenerCalculate();
	    public  ListenerType listenerType=new ListenerType();
	    public class ListenerType implements ActionListener {
	        @Override
	        public void actionPerformed(ActionEvent event) {
	            win.app.set.setType(win.app.type.getSelectedIndex());//запоминаем тип имущества в настройках
	        }
	    }
	    public class ListenerExit implements ActionListener {
	        @Override
	        public void actionPerformed(ActionEvent arg0) {
	            System.exit(1);
	        }
	    }
	    public class ListenerCalculate implements ActionListener {
	        @Override
	        public void actionPerformed(ActionEvent event) {
	            try{
	                win.app.set.setCost(win.app.input);
	            } catch (NumberFormatException e) {
	                win.app.output.setText("Ошибка введено не число");
	                win.app.input.setText("");
	                return;
	            }
	            Calcalute c=new Calcalute();
	            win.app.output.setText(Float.toString(c.Cal(win.app.set)));
	        }
	    }
}
