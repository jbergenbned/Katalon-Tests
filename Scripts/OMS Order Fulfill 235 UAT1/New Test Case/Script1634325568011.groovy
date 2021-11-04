import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.StringSelection as StringSelection

WebUI.openBrowser(findTestData('Site 680/Order fulfill sites').getValue(1, 2))

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_IBM Store Engagement/input_User ID_username'), findTestData('Site 680/Order fulfill sites').getValue(
        3, 3))

WebUI.setText(findTestObject('Page_IBM Store Engagement/input_Password_password'), findTestData('Site 680/Order fulfill sites').getValue(
        4, 3))

WebUI.click(findTestObject('Page_IBM Store Engagement/span_Login'))

WebUI.setText(findTestObject('Page_IBM Store Engagement Pack/input_Not Started_pack_shipmentOrderBarcodeScanner'), '00819319')

WebUI.sendKeys(findTestObject('Page_IBM Store Engagement Pack/input_Not Started_pack_shipmentOrderBarcodeScanner'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Page_IBM Store Engagement/div_Print Packing Slip'))

WebUI.switchToWindowIndex(1)

WebUI.executeJavaScript('return document.querySelector("body > print-preview-app").shadowRoot.querySelector("#sidebar").shadowRoot.querySelector("print-preview-button-strip").shadowRoot.querySelector("div > cr-button.action-button")', 
    []).click()

Robot robot = new Robot();

Thread.sleep(1000)

robot.keyPress(KeyEvent.VK_S)

robot.keyRelease(KeyEvent.VK_S)

robot.keyPress(KeyEvent.VK_I)

robot.keyRelease(KeyEvent.VK_I)

robot.keyPress(KeyEvent.VK_T)

robot.keyRelease(KeyEvent.VK_T)

robot.keyPress(KeyEvent.VK_E)

robot.keyRelease(KeyEvent.VK_E)

robot.keyPress(KeyEvent.VK_SPACE)

robot.keyRelease(KeyEvent.VK_SPACE)

robot.keyPress(KeyEvent.VK_2)

robot.keyRelease(KeyEvent.VK_2)

robot.keyPress(KeyEvent.VK_3)

robot.keyRelease(KeyEvent.VK_3)

robot.keyPress(KeyEvent.VK_5)

robot.keyRelease(KeyEvent.VK_5)

robot.keyPress(KeyEvent.VK_SPACE)

robot.keyRelease(KeyEvent.VK_SPACE)

robot.keyPress(KeyEvent.VK_O)

robot.keyRelease(KeyEvent.VK_O)

robot.keyPress(KeyEvent.VK_R)

robot.keyRelease(KeyEvent.VK_R)

robot.keyPress(KeyEvent.VK_D)

robot.keyRelease(KeyEvent.VK_D)

robot.keyPress(KeyEvent.VK_E)

robot.keyRelease(KeyEvent.VK_E)

robot.keyPress(KeyEvent.VK_R)

robot.keyRelease(KeyEvent.VK_R)

robot.keyPress(KeyEvent.VK_TAB)

Thread.sleep(1000)

robot.keyPress(KeyEvent.VK_TAB)

Thread.sleep(1000)

robot.keyPress(KeyEvent.VK_TAB)

Thread.sleep(1000)

robot.keyPress(KeyEvent.VK_ENTER)

















