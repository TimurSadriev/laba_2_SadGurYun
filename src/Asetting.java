/*
 * 
 */
package src;
import javax.swing.*;
import java.io.IOException;
// TODO: Auto-generated Javadoc

/**
 * @author yunyaev
 * @version 2.0
 * Абстрактный класс настроек наследует класс исключений.
 */
public abstract class Asetting extends Exception{
	 
 	/**
 	 * Абстрактный метод обрабатывает исключения.
 	 *
 	 * @param field - поле ввода стоимости
 	 * @throws NumberFormatException the number format exception
 	 */
 	public abstract void setCost(JTextField field) throws NumberFormatException;
	    
    	/**
    	 * Абстрактный метод устанавливает значение переменной.
    	 *
    	 * @param x - значение стоимости недвижимости
    	 */
    	public abstract void set(int x);
	    
    	/**
    	 * Абстрактный метод присваивает переменной новый тип.
    	 *
    	 * @param x - значение стоимости недвижимости
    	 */
    	public abstract void setType(int x);
	    
    	/**
    	 * Абстрактный метод сбрасывает значение переменной.
    	 *
    	 * @param x - значение стоимости недвижимости
    	 */
    	public abstract void reset(int x);
	    
    	/**
    	 * Абстрактный метод получает значение переменной.
    	 *
    	 * @param x - значение стоимости недвижимости
    	 * @return int возвращает значение переменной
    	 */
    	public abstract int get(int x);
}
