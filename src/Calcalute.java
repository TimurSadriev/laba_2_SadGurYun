/*
 * 
 */
package src;

// TODO: Auto-generated Javadoc
/**
 * Класс c вычислениями.
 * @author IgorGuryanov
 * @version 228
 */
public class Calcalute extends ACalculate{
    
    /**
     * Пустой конструктор инициализиует коэффициенты
     */
    Calcalute() {
        koefficiets= new float[][]{
                {0.029f, 0.005f, 0.0004f, 0.0006f, 0.004f, 0.001f, 0.00015f},
                {0.02f, 0.006f, 0.001f, 0.00017f, 0.007f, 0.001f, 0.0005f}}; //коэффициенты для расчета
    };
    
    /**
     * Конструктор, принимающий коэффициенты
     * 
     * @param массив коэффициентов x
     */
    public Calcalute(float x[][]) {
    	for (int i=0;i<2;i++)
    	{for(int j=0;j<7;j++)
    	{koefficiets[i][j]=x[i][j];
    	};
    	};
    }
    
    /**
     * Основная функция рассчёта стоимости.
     *
     * @param {@link Setting} передаём настройки в функцию 
     * @return возвращает стоимость полиса
     */
    @Override
    public  float Cal(Setting s) {
        float sum = 0;
        for (int i = 0; i < 7; i++) {
            sum = sum + s.CostOfProperty *s.get(i) * koefficiets[s.TypeOfProperty][i];
        }
        polis=sum;
        return sum;
    }
}
