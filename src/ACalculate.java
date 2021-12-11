/*
 * 
 */
package src;

// TODO: Auto-generated Javadoc
/**
 * The Class ACalculate.
 */
public abstract class ACalculate {
	
	/** The polis. */
	public static float polis=0;//итоговая стоимость
    
    /** The koefficiets. */
    protected  float[][] koefficiets;  //коэффициенты для расчета
    
    /**
     * Cal.
     *
     * @param s the s
     * @return the float
     */
    public abstract  float Cal(Setting s);
}
