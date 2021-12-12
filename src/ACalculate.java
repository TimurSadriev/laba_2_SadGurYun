/*
 * Абстрактный класс расчета.
 * @author yunyaev
 * @version 2.0
 */
package src;

// TODO: Auto-generated Javadoc
/**
 * @author yunyaev
 * @version 2.0
 * Абстрактный класс расчета.
 */
public abstract class ACalculate {
	
	/** Итоговая стоимость полиса. */
	public static float polis=0;//итоговая стоимость
    
    /** Коэффициенты для расчета полиса. */
    protected  float[][] koefficiets;  //коэффициенты для расчета
    
    /**
     * Абстрактный метод расчета стоимости.
     *
     * @param s Setting s - параметр настроек калькулятора
     * @return float Стоимость полиса
     */
    public abstract  float Cal(Setting s);
}
