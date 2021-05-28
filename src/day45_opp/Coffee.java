package day45_opp;

public class Coffee {
    /**
     * can be 0 - 100 as a preecentage
     */
    int amount;
    String type;

    @Override
    public String toString() {
        return "Coffee{" +
                "amount=" + amount +
                ", type='" + type + '\'' +
                '}';
    }

    public void refile() {
        amount = 100;
    }

    public void drink(int someAmount) {
        amount -= someAmount;
    }
    public  int getAmount() {
        return  amount;
    }
    public void setType(String newType) {
        type = newType;

    }

    public String getType() {
        return type;
    }
}
