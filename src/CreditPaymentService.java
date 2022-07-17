public class CreditPaymentService {
    public double calculate(double k, double p, double m){
        double result;
        double r;
        //double k = 1_000_000;//сумма
        //double p = 9.99;//ставка
       // double m = 2;//срок в годах
        double pp = p / 100 / 12;//ежемесечная проц ставка
        double mm = m *12;//срок в месяцах
        double step = 1 + pp;//1+i
        double st = Math.pow(step, mm);// возведение в степень
        double s = st - 1;// степень -1
        double l =  pp / s;
        double i = pp + l;

        return result = k * i ;

    }

}
