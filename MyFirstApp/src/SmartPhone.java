import java.util.ArrayList;
import java.util.List;

public class SmartPhone {
    public String series;
    public double price;

    public static void main(String[] args) {
        SmartPhone samsung = new SmartPhone();
        samsung.series = "Galaxy Z Flip 6";
        samsung.price = 2399.99;

        SmartPhone iphone = new SmartPhone();
        iphone.series ="iPhone 15 Pro Max";
        iphone.price=4299.99;

        List<SmartPhone> phones = new ArrayList<>();//->
        phones.add(samsung);
        phones.add(iphone);

        for (SmartPhone phone : phones) {
            System.out.println(phone.series);
            System.out.println(phone.price);
        }
    }
}
