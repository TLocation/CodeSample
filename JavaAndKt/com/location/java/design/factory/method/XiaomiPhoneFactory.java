package com.location.java.design.factory.method;

import com.location.java.design.factory.statics.Phone;
import com.location.java.design.factory.statics.XiaomiPhone;

public class XiaomiPhoneFactory implements IPhoneFactory{
    @Override
    public Phone createPhone() {
        return new XiaomiPhone();
    }
}
