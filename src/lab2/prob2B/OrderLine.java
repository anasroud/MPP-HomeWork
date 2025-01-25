package lab2.prob2B;

public class OrderLine {
    int lineNum;

    public OrderLine(int lineNum, Order order) {
        this.lineNum = lineNum;
    }

    @Override
    public String toString() {
        return "Line Number" + lineNum;
    }
}
