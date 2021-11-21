package lb;

public class Calcalute extends ACalculate{
    Calcalute() {
        koefficiets= new float[][]{
                {0.0029f, 0.0005f, 0.00004f, 0.00006f, 0.0004f, 0.0001f, 0.000015f},
                {0.002f, 0.0006f, 0.0001f, 0.000017f, 0.0007f, 0.0001f, 0.00005f}}; //коэффициенты для расчета
    };

    @Override
    public  float Cal(Setting s) {
        float sum = 0;
        for (int i = 0; i < 7; i++) {
            sum = sum + s.CostOfProperty *s.p[i] * koefficiets[s.TypeOfProperty][i];
        }
        polis=sum;
        return sum;
    }
}
