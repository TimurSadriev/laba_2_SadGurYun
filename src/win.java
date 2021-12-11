package src;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// TODO: Auto-generated Javadoc
/**
 * Основной класс программы с интерфейсом
 */
public class win {
	    
    	/** The set. */
    	public Setting set =new Setting();//значения выбранных параметров для расчета
	    
    	/** The lissteners class. */
    	private LisstenersClass lisstenersClass=new LisstenersClass(this);
	    
    	/** The buttons. */
    	private  JRadioButton[] buttons =new JRadioButton[7]; //массив для кнопок параметров
	    
    	/** The main GUI. */
    	private  JFrame main_GUI=new JFrame();
	    
    	/** The main panel. */
    	private  JPanel main_panel= new JPanel();
	    
    	/** The type. */
    	protected JComboBox type;
	    
    	/** The button exit. */
    	private  JButton button_exit = new JButton("Выход");
		
		/** The button infa. */
		private  JButton button_infa = new JButton("Разработчики");
	    
    	/** The button calculate. */
    	private  JButton button_calculate = new JButton("Рассчитать");
	    
    	/** The info 1. */
    	private  JLabel info1 = new JLabel("Введите стоимость имущества");
	    
    	/** The output. */
    	protected JTextField output= new JTextField("", 20);
	    
    	/** The input. */
    	protected  JTextField input = new JTextField("", 20);

	    /**
    	 * Instantiates a new win.
    	 */
    	public  win() {
	        button_calculate.addActionListener(lisstenersClass.listenerCalculate);
	        output.setEditable(false);
	        main_GUI.setTitle ("Калькулятор");
	        main_GUI.setBounds(0,0,400,500);
	        main_GUI.setResizable(false);

	        main_panel.setLayout(null);
	        main_GUI.add(main_panel);
	        for(int i = 0; i < 7; i++) {
	            buttons[i] = new JRadioButton();
	            buttons[i].setBounds(20,50+20*i,200,30);
	            int n=i;
	            /*buttons[i].addActionListener(new ActionListener() {
	                @Override
	                public void actionPerformed(ActionEvent e) {
	                    if (buttons[n].isSelected())
	                        set.set(n);
	                    else  set.reset(n);
	                }
	            });*/
	            buttons[i].addActionListener((ActionEvent e)-> {
	                    if (buttons[n].isSelected())
	                        set.set(n);
	                    else  set.reset(n);
	                });
	            main_panel.add(buttons[i]);
	        }
	        buttons[0].setText("Пожар");
	        buttons[1].setText("Терроризм");
	        buttons[2].setText("Взрыв");
	        buttons[3].setText("Удар молнией");
	        buttons[4].setText("Повреждения водой");
	        buttons[5].setText("Противоправные действия третих лиц");
	        buttons[6].setText("Падение небесных тел");


	        JLabel info = new JLabel("Расчет стоимости полиса страхования на 1 год");
	        info.setBounds(0,0,400,30);
	        main_panel.add(info);

	        button_exit.setBounds(20,400,100,40);
	        button_exit.addActionListener(lisstenersClass.listenerExit);
	        main_panel.add(button_exit);

	        button_calculate.setBounds(20,230,150,40);
	        main_panel.add(button_calculate);

			button_infa.setBounds(140,400,140,40);
			button_infa.addActionListener(lisstenersClass.listenerInfa);
			main_panel.add(button_infa);

	        JLabel info2 = new JLabel("Вид имущества");
	        info2.setBounds(20,25,120,30);
	        main_panel.add(info2);
	        String[] s= {"Движимое", "Недвижимое"};
	        type=new JComboBox(s);
	        type.addActionListener(lisstenersClass.listenerType);

	        type.setBounds(120,30,120,25);
	        main_panel.add(type);
	        info1.setBounds(20,200,200,30);
	        main_panel.add(info1);

	        input.setBounds(220,200,100,30);
	        main_panel.add(input);

	        output.setBounds(20,280,300,100);
	        main_panel.add(output);
	        Image logo = new Image(); //загрузка картинки
	    	logo.setSize(180, 100);
	    	logo.setLocation(200, 0);
	    	main_panel.add(logo);

	        main_GUI.setVisible(true);
	        main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    }
	    
    	/**
    	 * The main method.
    	 *
    	 * @param args the arguments
    	 */
    	public static void main(String[] args) {
	        win app=new win();
	    }
}