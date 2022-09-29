package com.location.java.design;

import com.location.java.design.daili.BannerShopStore;
import com.location.java.design.daili.ProxyFactory;
import com.location.java.design.daili.ShopStore;
import com.location.java.design.factory.abstrafactory.Charging;
import com.location.java.design.factory.abstrafactory.MeizuPhoneBoxFactory;
import com.location.java.design.factory.abstrafactory.PhoneBoxFactory;
import com.location.java.design.factory.abstrafactory.XiaomiPhoneBoxFactory;
import com.location.java.design.factory.method.IPhoneFactory;
import com.location.java.design.factory.method.MeizuPhoneFactory;
import com.location.java.design.factory.method.XiaomiPhoneFactory;
import com.location.java.design.factory.statics.Phone;
import com.location.java.design.factory.statics.PhoneFactory;
import com.location.java.design.zerenlian.sample.java.AInterceptor;
import com.location.java.design.zerenlian.sample.java.BInterceptor;
import com.location.java.design.zerenlian.sample.java.CInterceptor;
import com.location.java.design.zerenlian.sample.java.ChinClient;
import design.zerenlian.Request;
import design.zerenlian.Response;
import org.junit.Test;

public class Main {


    /**
     * 责任链模式
     */
    @Test
    public void testZeRenLian(){
        ChinClient client = new ChinClient();
        client.addInterceptor(new AInterceptor());
        client.addInterceptor(new BInterceptor());
        client.addInterceptor(new CInterceptor());
        Response response = client.proceed(new Request("拦截器", 260));
        System.out.println(response.getBody());
    }

    /**
     * 代理模式
     */
    @Test
    public void daili() {
        ProxyFactory proxy = new ProxyFactory();
        ShopStore shopStore = new BannerShopStore();
        ShopStore proxyService = proxy.createProxy(shopStore);
        proxyService.payBanner(3);
        ShopStore shopStoreProxy = proxy.createShopStoreProxy(shopStore);
        System.out.println("shopStoreProxy.payBanner(3) = " + shopStoreProxy.payBanner(3));

    }

    /**
     * 静态工厂模式
     * 通过 {@link PhoneFactory#createPhone(PhoneFactory.PhoneType)}函数创建实际的手机对象
     * 如果需要再增加一个手如果需要再增加一个手机机 则需要修改{@link PhoneFactory}的函数
     */
    @Test
    public void staticFactory(){
        Phone meizuPhone = PhoneFactory.createPhone(PhoneFactory.PhoneType.MEIZU);
        Phone xiaomiPhone = PhoneFactory.createPhone(PhoneFactory.PhoneType.XIAOMI);
        meizuPhone.open();
        xiaomiPhone.open();
    }

    /**
     * 方法工厂模式
     * @see IPhoneFactory
     * @see MeizuPhoneFactory
     * @see XiaomiPhoneFactory
     */
    @Test
    public  void methodFactory(){
        IPhoneFactory xiaomiFactory = new XiaomiPhoneFactory();
        IPhoneFactory meizuFactory = new MeizuPhoneFactory();
        Phone xiaomiPhone = xiaomiFactory.createPhone();
        Phone meizuPhone = meizuFactory.createPhone();
        xiaomiPhone.open();
        meizuPhone.open();
    }

    /**
     * 抽象工厂模式
     * @see Charging
     * @see PhoneBoxFactory
     */
    @Test
    public void abstractFactory(){
        PhoneBoxFactory xiaomiPhoneBox = new XiaomiPhoneBoxFactory();
        PhoneBoxFactory meizuPhoneBox = new MeizuPhoneBoxFactory();
        xiaomiPhoneBox.createPhone().open();
        xiaomiPhoneBox.createChrging().charg();
        meizuPhoneBox.createPhone().open();
        meizuPhoneBox.createChrging().charg();
    }
}
