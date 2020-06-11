package com.sh.stt.testcase.yh;

import com.sh.stt.base.BaseTest;
import com.sh.stt.common.BasePage;
import com.sh.stt.data.WAPData;
import com.sh.stt.page.YHPage;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

/**
 * 天津优惠 页面测试用例
 */
@Feature("天津优惠")
@Slf4j
public class TJYHTest extends BaseTest {

    //浏览器页面基类
    public BasePage bp;
    //慈善基金会页面对象
    public YHPage yhPage;

    @BeforeClass
    public void beforeClass() {
        bp = new BasePage(driver);
        yhPage = new YHPage(driver);
        bp.currentHandle = driver.getWindowHandle(); //获取当前handle
        bp.get(WAPData.TJ_YH_URL);
        log.info("进入 天津优惠 页面");
    }

    /**
     * 优惠内容
     */
    @Story("优惠内容")
    @Test
    public void yhContentListTest() {
        //获取所有text的List集合
        List<String> listString = yhPage.yhContentList();
        for (int i = 0; i < listString.size() ; i++) {
            int count = Collections.frequency(listString, listString.get(i));
            System.out.println("外链统计：" + count + "个");
            bp.executeScript("arguments[0].click();", bp.findElement(By.xpath("//*[contains(text(),'"+listString.get(i)+"')]")));
            bp.switchNextHandle();
        }
    }

}
