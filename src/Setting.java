/*
 * 
 */
package src;

import javax.swing.*;

// TODO: Auto-generated Javadoc
/**
 * @author IgorGuryanov
 * @version 228
 * Класс с настройками.
 */
public class Setting extends Asetting{
    
    /** Тип имущества. */
    public int TypeOfProperty;
    
    /** Стоимость имущества. */
    public float CostOfProperty;
    
    /** Массив сохраняющий параметры пользователя из кнопок (от чего страховать). */
    private int[] p=new int [7];
    
    /**
     * Установить стоимость.
     *
     * @param field Передаётся поле стоимости
     * @throws NumberFormatException Числовой формат исключения
     */
    @Override
    public void setCost(JTextField field) throws NumberFormatException {
        try {
            CostOfProperty = Float.parseFloat(field.getText());
        } catch (NumberFormatException nfe) {
            throw new NumberFormatException();
        }
    }
    
    /**
     * Установливаем параметры.
     *
     * @param x Передаётся номер параметра.
     */
    @Override
    public void set(int x) {
        p[x]=1;
    }

    /**
     * Устанавливаем типы.
     *
     * @param x Передаётся тип
     */
    @Override
    public void setType(int x) {
        TypeOfProperty=x;
    }

    /**
     * Сбрасывает параметр.
     *
     * @param x Передаётся номер параметра
     */
    @Override
    public void reset(int x) {
        p[x]=0;
    }

    /**
     * Получаем параметр.
     *
     * @param x Передаётся номер параметра
     * @return int Значение параметра
     */
    @Override
    public int get(int x) {
        return p[x];
    }
}