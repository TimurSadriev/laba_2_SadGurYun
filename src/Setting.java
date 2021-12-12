/*
 * 
 */
package src;

import javax.swing.*;

// TODO: Auto-generated Javadoc
/**
 * The Class Setting.
 */
public class Setting extends Asetting{
    
    /** The Type of property. */
    public int TypeOfProperty;//тип имущества
    
    /** The Cost of property. */
    public float CostOfProperty;//стоимость имущества
    
    /** The p. */
    private int[] p=new int [7];//массив сохраняющий параметры пользователя из кнопок (от чего страховать)
    
    /**
     * Sets the cost.
     *
     * @param field the new cost
     * @throws NumberFormatException the number format exception
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
     * Sets the.
     *
     * @param x the x
     */
    @Override
    public void set(int x) {
        p[x]=1;
    }

    /**
     * Sets the type.
     *
     * @param x the new type
     */
    @Override
    public void setType(int x) {
        TypeOfProperty=x;
    }

    /**
     * Reset.
     *
     * @param x the x
     */
    @Override
    public void reset(int x) {
        p[x]=0;
    }

    /**
     * Gets the.
     *
     * @param x the x
     * @return the int
     */
    @Override
    public int get(int x) {
        return p[x];
    }
}