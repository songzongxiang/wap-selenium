package com.sh.stt.locator;

import org.openqa.selenium.By;

/**
 * 首页页面对象：元素定位
 */
public class IndexLocator {

    /**
     * 主广告区
     */
    public final static By ADV_BANNER_LIST = By.xpath(".//*[@id='carousel-example-generic']/div/div/a/img[not(@title='5G套餐更优惠')]");

    /**
     * 快捷专区
     */
    public final static By QUICK_LIST = By.xpath(".//*[@id='bootstrap']/div[1]/div/section[3]/section[1]/ul/li/a/span");

    /**
     * 通栏广告
     */
    public final static By TL_ADV_LIST = By.xpath(".//*[@id='bootstrap']/div[1]/div/section/section/a/img");

    /**
     * 全家享专区
     */
    public final static By FAMILY_SHARE_LIST = By.xpath(".//*[@id='bootstrap']/div[1]/div/section[3]/section[3]/ul/li/a/div/h3");

    /**
     * 终端推荐
     */
    public final static By TERMINAL_LIST = By.xpath(".//*[@id='Zclearfix']/li/a/dl/dd[2]");


    /**
     * 业务推荐
     */
    public final static By SERVICE_LIST = By.xpath(".//*[@id='Hclearfix']/li/a/div[1]/p");

    /**
     * 号卡推荐
     */
    //左侧
    public final static By LEFT_CARD_BUTTON = By.xpath(".//*[@id='yjson0']/a/p");
    //右侧
    public final static By RIGHT_CARD_LIST = By.xpath("//*[@class='right clearfix']/ul/li/a/div[1]/p");

    /**
     * 特色专区
     */
    public static final By FEATURE_LIST = By.xpath(".//*[@id='bootstrap']/div[1]/div/section[3]/section[8]/ul/li/a/div[1]/p");

    /**
     * 猜你喜欢
     */
    public static final By GUESS_LIST = By.xpath(".//*[@class='sec_con clearfix guess cnxh']/ul/li/a/h3");

}
