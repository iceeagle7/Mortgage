package Mortgage;

public class Bank {
    protected double Sum;
    protected double Percent;
    protected double LeftSum;

    public Bank(double sum, double percent) {
        Sum = sum;
        Percent = percent;
        LeftSum = 0;
    }

    public int CalculateYear(double monthSum) {
        int year = 0;
        int sum = 0;
        while(sum < Sum) {
            for(int i = 0; i < 12; i++) {
                sum += monthSum;
            }
            LeftSum += ((Sum * Percent) / 100);
            year++;
        }

        return year;
    }
}
