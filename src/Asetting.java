package src;
import javax.swing.*;
import java.io.IOException;
public abstract class Asetting extends Exception{
	 public abstract void setCost(JTextField field) throws NumberFormatException;
	    public abstract void set(int x);
	    public abstract void setType(int x);
	    public abstract void reset(int x);
	    public abstract int get(int x);
}
