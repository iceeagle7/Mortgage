package Mortgage;

public class JusanBank extends Bank {
    private double MonthSum;

    public JusanBank(double sum, double monthSum) {
        super(sum, 7);
        MonthSum = monthSum;
    }

    public void Print() {
        System.out.println(this.Percent + "% interest rate"); /*пайыздык молшерлеме*/
        System.out.println(this.Sum + " full payment"); /*толык толем*/
        System.out.println(CalculateYear(MonthSum) + " :you have to pay for the year"); /*жыл толеу керексиз*/
        System.out.println(this.LeftSum + " overpayment"); /*артык толем*/
    }
}
