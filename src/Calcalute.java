package src;

// TODO: Auto-generated Javadoc
/**
 * The Class Calcalute.
 */
public class Calcalute extends ACalculate{
    
    /**
     * Instantiates a new calcalute.
     */
    Calcalute() {
        koefficiets= new float[][]{
                {0.0029f, 0.0005f, 0.00004f, 0.00006f, 0.0004f, 0.0001f, 0.000015f},
                {0.002f, 0.0006f, 0.0001f, 0.000017f, 0.0007f, 0.0001f, 0.00005f}}; //коэффициенты для расчета
    };
    
    /**
     * Instantiates a new calcalute.
     *
     * @param x the x
     */
    public Calcalute(float x[][]) {
    	for (int i=0;i<2;i++)
    	{for(int j=0;j<7;j++)
    	{koefficiets[i][j]=x[i][j];
    	};
    	};
    }
    
    /**
     * Cal.
     *
     * @param s the s
     * @return the float
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
