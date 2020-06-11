package com.sh.stt.page;

import com.sh.stt.common.PageCommon;
import com.sh.stt.locator.YWLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 业务列表 页面对象
 */
public class YWPage extends PageCommon {

    /**
     * 构造器
     *
     * @param driver 驱动
     */
    public YWPage(WebDriver driver) {
        super(driver);
    }

    /**
     * 获取所有业务列表内容的List集合
     */
    public List<String> ywContentList() {
        List<String> listString = new ArrayList<String>();
        //判断元素是否存在
        if (isElementExist(YWLocator.YW_CONTENT_LIST, 2)){
            //获取所有列表
            List<WebElement> listElement = findElements(YWLocator.YW_CONTENT_LIST);
            for (WebElement element:listElement) {
                //判断元素是否显示--解决页面style="display: none;"
                if(element.isDisplayed() == true){
                    listString.add(element.getAttribute("href"));
                }
            }
        }
        return listString;
    }

}
