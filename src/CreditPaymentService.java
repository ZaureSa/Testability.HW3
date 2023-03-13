public class CreditPaymentService {

    public int calculate (int summ, int year) {

        double mIr = 0.0999/12;
        int numPer = year * 12;
        double coefficient =((mIr * Math.pow ((1+mIr),numPer)) / (Math.pow ((1+mIr),numPer) -1));
        double result = (int) (summ * coefficient);

        return (int)result;
    }
}
