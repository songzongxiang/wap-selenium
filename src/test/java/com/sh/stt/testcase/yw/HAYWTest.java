package com.sh.stt.testcase.yw;

import com.sh.stt.base.BaseTest;
import com.sh.stt.common.BasePage;
import com.sh.stt.data.WAPData;
import com.sh.stt.page.YWPage;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

/**
 * 河南业务列表 页面测试用例
 */
@Feature("河南业务列表")
@Slf4j
public class HAYWTest extends BaseTest {

    //浏览器页面基类
    public BasePage bp;
    //业务列表页面对象
    public YWPage ywPage;

    @BeforeClass
    public void beforeClass() {
        bp = new BasePage(driver);
        ywPage = new YWPage(driver);
        bp.currentHandle = driver.getWindowHandle(); //获取当前handle
        bp.get(WAPData.HA_YW_URL);
        log.info("进入 河南业务列表 页面");
    }

    /**
     * 业务列表内容
     */
    @Story("业务列表内容")
    @Test
    public void ywContentListTest() {
        //获取所有text的List集合
        List<String> listString = ywPage.ywContentList();
        for (int i = 0; i < listString.size() ; i++) {
            int count = Collections.frequency(listString, listString.get(i));
            System.out.println("外链统计：" + count + "个");
            bp.executeScript("arguments[0].click();", bp.findElement(By.xpath("//a[@href='"+listString.get(i)+"']")));
            bp.switchNextHandle();
        }
    }

}
