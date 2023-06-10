package design.factory.method;

import com.location.java.design.factory.statics.MeizuPhone;
import com.location.java.design.factory.statics.Phone;

public class MeizuPhoneFactory implements IPhoneFactory{
    @Override
    public Phone createPhone() {
        return new MeizuPhone();
    }
}
