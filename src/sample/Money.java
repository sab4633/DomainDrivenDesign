package sample;

import java.util.Objects;

public class Money {
    //fields
    private int dollars;
    private int cents;
    //constructors
    public Money(int dollars, int cents){
        this.dollars = dollars;
        this.cents = cents;
    }


    //methods
    public int getDollars(){
        return this.dollars;
    }

    public int getCents(){
        return this.cents;
    }

    public Money add(Money otherMoney){
        Money sum = new Money(this.dollars + otherMoney.getDollars(),
                this.cents+ otherMoney.getCents());
        return sum;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == this) return true;
        if (!(obj instanceof Money)) return false;
        final Money that = (Money) obj;
        return (this.dollars == that.getDollars() && this.cents == that.getCents());
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.dollars,this.cents);
    }
}
