package com.sh.stt.page;

import com.sh.stt.common.PageCommon;
import com.sh.stt.locator.IndexLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 首页 页面对象
 */
public class IndexPage extends PageCommon {


    /**
     * 构造器
     *
     * @param driver 驱动
     */
    public IndexPage(WebDriver driver) {
        super(driver);
    }

    /**
     * 获取所有主广告区--轮播图的List集合
     */
    public List<String> advBannerList(){
        List<String> listString = new ArrayList<String>();
        //判断元素是否存在
        if (isElementExist(IndexLocator.ADV_BANNER_LIST, 2)){
            //获取所有列表
            List<WebElement> listElement = findElements(IndexLocator.ADV_BANNER_LIST);
            for (WebElement element:listElement) {
                listString.add(element.getAttribute("title"));
            }
        }
        return listString;
    }

    /**
     * 获取所有快捷专区的List集合
     */
    public List<String> quickList(){
        List<String> listString = new ArrayList<String>();
        //判断元素是否存在
        if (isElementExist(IndexLocator.QUICK_LIST, 2)){
            //获取所有列表
            List<WebElement> listElement = findElements(IndexLocator.QUICK_LIST);
            for (WebElement element:listElement) {
                //判断元素是否显示--解决页面style="display: none;"
                if(element.isDisplayed() == true){
                    listString.add(element.getText());
                }
            }
        }
        return listString;
    }

    /**
     * 获取所有通栏广告的List集合
     */
    public List<String> tlAdvList(){
        List<String> listString = new ArrayList<String>();
        //判断元素是否存在
        if (isElementExist(IndexLocator.TL_ADV_LIST, 2)){
            //获取所有列表
            List<WebElement> listElement = findElements(IndexLocator.TL_ADV_LIST);
            for (WebElement element:listElement) {
                //判断元素是否显示--解决页面style="display: none;"
                if(element.isDisplayed() == true){
                    listString.add(element.getAttribute("title"));
                    System.out.println(element.getAttribute("title"));
                }
            }
        }
        return listString;
    }

    /**
     * 获取所有全家享的List集合
     */
    public List<String> familyShareList(){
        List<String> listString = new ArrayList<String>();
        //判断元素是否存在
        if (isElementExist(IndexLocator.FAMILY_SHARE_LIST, 2)){
            //获取所有列表
            List<WebElement> listElement = findElements(IndexLocator.FAMILY_SHARE_LIST);
            for (WebElement element:listElement) {
                //判断元素是否显示--解决页面style="display: none;"
                if(element.isDisplayed() == true){
                    listString.add(element.getText());
                }
            }
        }
        return listString;
    }

    /**
     * 获取所有终端推荐的List集合
     */
    public List<String> terminalRecomList() {
        List<String> listString = new ArrayList<String>();
        //判断元素是否存在
        if (isElementExist(IndexLocator.TERMINAL_LIST, 2)){
            //获取所有列表
            List<WebElement> listElement = findElements(IndexLocator.TERMINAL_LIST);
            for (WebElement element:listElement) {
                //判断元素是否显示--解决页面style="display: none;"
                if(element.isDisplayed() == true){
                    listString.add(element.getText());
                }
            }
        }
        return listString;
    }

    /**
     * 获取所有业务推荐的List集合
     */
    public List<String> serviceRecomList(){
        List<String> listString = new ArrayList<String>();
        //判断元素是否存在
        if (isElementExist(IndexLocator.SERVICE_LIST, 2)){
            //获取所有列表
            List<WebElement> listElement = findElements(IndexLocator.SERVICE_LIST);
            for (WebElement element:listElement) {
                //判断元素是否显示--解决页面style="display: none;"
                if(element.isDisplayed() == true){
                    listString.add(element.getText());
                }
            }
        }
        return listString;
    }

    /**
     * 获取所有号卡推荐--右侧的List集合
     */
    public List<String> cardRecomRightList(){
        List<String> listString = new ArrayList<String>();
        //判断元素是否存在
        if (isElementExist(IndexLocator.RIGHT_CARD_LIST, 2)){
            //获取所有列表
            List<WebElement> listElement = findElements(IndexLocator.RIGHT_CARD_LIST);
            for (WebElement element:listElement) {
                //判断元素是否显示--解决页面style="display: none;"
                if(element.isDisplayed() == true){
                    listString.add(element.getText());
                }
            }
        }
        return listString;
    }

    /**
     * 获取所有特色专区的List集合
     */
    public List<String> featureList(){
        List<String> listString = new ArrayList<String>();
        //判断元素是否存在
        if (isElementExist(IndexLocator.FEATURE_LIST, 2)){
            //获取所有列表
            List<WebElement> listElement = findElements(IndexLocator.FEATURE_LIST);
            for (WebElement element:listElement) {
                //判断元素是否显示--解决页面style="display: none;"
                if(element.isDisplayed() == true){
                    listString.add(element.getText());
                }
            }
        }
        return listString;
    }

    /**
     * 获取所有猜你喜欢的List集合
     */
    public List<String> guessList() {
        List<String> listString = new ArrayList<String>();
        //判断元素是否存在
        if (isElementExist(IndexLocator.GUESS_LIST, 2)){
            //获取所有列表
            List<WebElement> listElement = findElements(IndexLocator.GUESS_LIST);
            for (WebElement element:listElement) {
                //判断元素是否显示--解决页面style="display: none;"
//                if(element.isDisplayed() == true){
                    listString.add(element.getAttribute("class"));
                    System.out.println(element.getAttribute("class"));
//                }
            }
        }
        return listString;
    }

}
