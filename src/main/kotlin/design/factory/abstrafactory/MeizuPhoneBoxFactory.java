package design.factory.abstrafactory;

import com.location.java.design.factory.statics.MeizuPhone;
import com.location.java.design.factory.statics.Phone;

public class MeizuPhoneBoxFactory implements  PhoneBoxFactory{
    @Override
    public Charging createChrging() {
        return new CommonCharging();
    }

    @Override
    public Phone createPhone() {
        return new MeizuPhone();
    }
}
