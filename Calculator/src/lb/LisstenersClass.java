package lb;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static lb.win.*;

public class LisstenersClass {
	win w;
	LisstenersClass(win w){
		this.w=w;
	}
	 public  ListenerExit listenerExit=new ListenerExit();
	    public  ListenerCalculate listenerCalculate=new ListenerCalculate();
	    public  ListenerType listenerType=new ListenerType();
	    public class ListenerType implements ActionListener {
	        @Override
	        public void actionPerformed(ActionEvent event) {
	            w.set.setType(w.type.getSelectedIndex());//запоминаем тип имущества в настройках
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
	                w.set.setCost(w.input);
	            } catch (NumberFormatException e) {
	                w.output.setText("Ошибка введено не число");
	                w.input.setText("");
	                return;
	            }
	            Calcalute c=new Calcalute();
	            w.output.setText(Float.toString(c.Cal(w.set)));
	        }
	    }
}
