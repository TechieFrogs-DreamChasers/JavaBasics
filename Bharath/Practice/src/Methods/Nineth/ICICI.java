package Methods.Nineth;

public class ICICI extends RBI{

    private double mi_int_Rate;
    private double ma_int_Rate;
    private double min_Balance;
    private double max_with_limit;

    public ICICI() {
        this.mi_int_Rate = 4.0;
        this.ma_int_Rate = 8.0;
        this.min_Balance = RBI.MIN_BALANCE;
        this.max_with_limit = RBI.MAX_WITHDRAWAL;
    }

    public double getMi_int_Rate() {
        return mi_int_Rate;
    }

    public double getMa_int_Rate() {
        return ma_int_Rate;
    }

    public double getMin_Balance() {
        return min_Balance;
    }

    public double getMax_with_limit() {
        return max_with_limit;
    }

    @Override
    public double getInterestRate() {
        return ma_int_Rate;
    }

    @Override
    public double getWithdrawalLimit() {
        return max_with_limit;
    }

    @Override
    public double getMaxInterestRate() {
        return ma_int_Rate;
    }

    @Override
    public double getMinBalance() {
        return min_Balance;
    }
    
}
