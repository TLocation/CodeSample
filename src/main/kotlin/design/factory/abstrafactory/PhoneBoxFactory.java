package design.factory.abstrafactory;

import com.location.java.design.factory.statics.Phone;

public interface PhoneBoxFactory {
    Charging createChrging();
    Phone createPhone();
}
