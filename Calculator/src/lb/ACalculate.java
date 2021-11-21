package lb;

public abstract class ACalculate {
	public static float polis=0;//итоговая стоимость
    protected  float[][] koefficiets;  //коэффициенты для расчета
    public abstract  float Cal(Setting s);
}
