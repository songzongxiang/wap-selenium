package com.sh.stt.page;

import com.sh.stt.common.PageCommon;
import com.sh.stt.locator.YHLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 优惠 页面对象
 */
public class YHPage extends PageCommon {

    /**
     * 构造器
     *
     * @param driver 驱动
     */
    public YHPage(WebDriver driver) {
        super(driver);
    }

    /**
     * 获取所有优惠内容的List集合
     */
    public List<String> yhContentList(){
        List<String> listString = new ArrayList<String>();
        //判断元素是否存在
        if (isElementExist(YHLocator.YH_CONTENT_LIST, 2)){
            //获取所有列表
            List<WebElement> listElement = findElements(YHLocator.YH_CONTENT_LIST);
            for (WebElement element:listElement) {
                //判断元素是否显示--解决页面style="display: none;"
                if(element.isDisplayed() == true){
                    listString.add(element.getText());
                }
            }
        }
        return listString;
    }

}
