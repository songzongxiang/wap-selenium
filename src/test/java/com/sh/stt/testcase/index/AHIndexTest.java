package com.sh.stt.testcase.index;

import com.sh.stt.base.BaseTest;
import com.sh.stt.common.BasePage;
import com.sh.stt.common.PageCommon;
import com.sh.stt.data.WAPData;
import com.sh.stt.page.IndexPage;
import com.sh.stt.locator.IndexLocator;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

/**
 * 安徽首页 页面测试用例
 */
@Feature("安徽首页")
@Slf4j
public class AHIndexTest extends BaseTest {

    //浏览器页面基类
    public BasePage bp;
    //页面操作方法
    public PageCommon pc;
    //首页页面对象
    public IndexPage indexPage;

    @BeforeMethod
    public void beforeMethod() {
        bp = new BasePage(driver);
        pc = new PageCommon(driver);
        indexPage = new IndexPage(driver);
        bp.currentHandle = driver.getWindowHandle(); //获取当前handle
        bp.get(WAPData.AH_INDEX_URL);
        log.info("进入 安徽首页 页面");
    }

    /**
     * 主广告区--轮播图
     */
    @Story("主广告区--轮播图")
    @Test
    public void advBannerListTest() {
        log.info("主广告区");
        //获取所有text的List集合
        List<String> listString = indexPage.advBannerList();
        for (int i = 0; i < listString.size() ; i++) {
            int count = Collections.frequency(listString, listString.get(i));
            System.out.println("外链统计：" + count + "个");
            bp.executeScript("arguments[0].click();", bp.findElement(By.xpath("//img[@title='"+listString.get(i)+"']")));
            bp.back();
        }
    }

    /**
     * 快捷专区
     */
    @Story("快捷专区")
    @Test
    public void quickListTest() {
        log.info("快捷专区");
        //获取所有text的List集合
        List<String> listString = indexPage.quickList();
        for (int i = 0; i < listString.size() ; i++) {
            int count = Collections.frequency(listString, listString.get(i));
            System.out.println("外链统计：" + count + "个");
            bp.executeScript("arguments[0].click();", bp.findElement(By.xpath("//*[contains(text(),'"+listString.get(i)+"')]")));
            bp.back();
        }
    }

    /**
     * 通栏广告
     */
    @Story("通栏广告")
    @Test
    public void tlAdvListTest() {
        log.info("通栏广告");
        //获取所有text的List集合
        List<String> listString = indexPage.tlAdvList();
        for (int i = 0; i < listString.size() ; i++) {
            int count = Collections.frequency(listString, listString.get(i));
            System.out.println("外链统计：" + count + "个");
            bp.executeScript("arguments[0].click();", bp.findElement(By.xpath("//img[@title='"+listString.get(i)+"']")));
            bp.back();
        }
    }

    /**
     * 全家享
     */
    @Story("全家享")
    @Test
    public void familyShareListTest() {
        log.info("全家享");
        //获取所有text的List集合
        List<String> listString = indexPage.familyShareList();
        for (int i = 0; i < listString.size() ; i++) {
            int count = Collections.frequency(listString, listString.get(i));
            System.out.println("外链统计：" + count + "个");
            bp.executeScript("arguments[0].click();", bp.findElement(By.xpath("//*[contains(text(),'"+listString.get(i)+"')]")));
            bp.switchNextHandle();
        }
    }

    /**
     * 终端推荐
     */
    @Story("终端推荐")
    @Test
    public void terminalRecomListTest() {
        log.info("终端推荐");
        //下拉到页面底部
        bp.scrollToBottom();
        //获取所有text的List集合
        List<String> listString = indexPage.terminalRecomList();
        for (int i = 0; i < listString.size() ; i++) {
            int count = Collections.frequency(listString, listString.get(i));
            System.out.println("外链统计：" + count + "个");
            bp.executeScript("arguments[0].click();", bp.findElement(By.xpath("//*[contains(text(),'"+listString.get(i)+"')]")));
            bp.switchNextHandle();
        }
    }

    /**
     * 业务推荐
     */
    @Story("业务推荐")
    @Test
    public void serviceRecomListTest() {
        log.info("业务推荐");
        //下拉到页面底部
        bp.scrollToBottom();
        //获取所有text的List集合
        List<String> listString = indexPage.serviceRecomList();
        for (int i = 0; i < listString.size() ; i++) {
            int count = Collections.frequency(listString, listString.get(i));
            System.out.println("外链统计：" + count + "个");
            bp.executeScript("arguments[0].click();", bp.findElement(By.xpath("//*[contains(text(),'"+listString.get(i)+"')]")));
            bp.switchNextHandle();
        }
    }

    /**
     * 号卡推荐--左侧
     */
    @Story("号卡推荐--左侧")
    @Test
    public void cardRecomLeftTest() {
        log.info("号卡推荐--左侧");
        //下拉到页面底部
        bp.scrollToBottom();
        //判断元素是否存在
        if (pc.isElementExist(IndexLocator.LEFT_CARD_BUTTON, 2)) {
            //下拉到页面底部
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
            bp.executeScript("arguments[0].click();", bp.findElement(IndexLocator.LEFT_CARD_BUTTON));
            bp.switchNextHandle();
        }
    }

    /**
     * 号卡推荐--右侧
     */
    @Story("号卡推荐--右侧")
    @Test
    public void cardRecomRightListTest() {
        log.info("号卡推荐--右侧");
        //下拉到页面底部
        bp.scrollToBottom();
        //获取所有text的List集合
        List<String> listString = indexPage.cardRecomRightList();
        for (int i = 0; i < listString.size() ; i++) {
            int count = Collections.frequency(listString, listString.get(i));
            System.out.println("外链统计：" + count + "个");
            bp.executeScript("arguments[0].click();", bp.findElement(By.xpath("//*[contains(text(),'"+listString.get(i)+"')]")));
            bp.switchNextHandle();
        }
    }

    /**
     * 特色专区
     */
    @Story("特色专区")
    @Test
    public void featureListTest() {
        log.info("特色专区");
        //下拉到页面底部
        bp.scrollToBottom();
        //获取所有text的List集合
        List<String> listString = indexPage.featureList();
        for (int i = 0; i < listString.size() ; i++) {
            int count = Collections.frequency(listString, listString.get(i));
            System.out.println("外链统计：" + count + "个");
            bp.executeScript("arguments[0].click();", bp.findElement(By.xpath("//*[contains(text(),'"+listString.get(i)+"')]")));
            bp.switchNextHandle();
        }
    }

}
