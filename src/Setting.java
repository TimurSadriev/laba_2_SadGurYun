package src;

import javax.swing.*;

public class Setting extends Asetting{
    public int TypeOfProperty;//тип имущества
    public float CostOfProperty;//стоимость имущества
    private int[] p=new int [7];//массив сохраняющий параметры пользователя из кнопок (от чего страховать)
    @Override
    public void setCost(JTextField field) throws NumberFormatException {
        try {
            CostOfProperty = Float.parseFloat(field.getText());
        } catch (NumberFormatException nfe) {
            throw new NumberFormatException();
        }
    }
    @Override
    public void set(int x) {
        p[x]=1;
    }

    @Override
    public void setType(int x) {
        TypeOfProperty=x;
    }

    @Override
    public void reset(int x) {
        p[x]=0;
    }

    @Override
    public int get(int x) {
        return p[x];
    }
}