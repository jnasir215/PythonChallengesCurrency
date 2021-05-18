import java.text.DecimalFormat;

public class Solution {

    public String currency(double value) {
        DecimalFormat df = new DecimalFormat("$0.00");
        return df.format(value);
    }
}
