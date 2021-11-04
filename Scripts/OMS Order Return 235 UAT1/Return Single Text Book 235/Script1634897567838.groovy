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
import org.openqa.selenium.Keys as Keys
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.StringSelection as StringSelection

WebUI.openBrowser(findTestData('Site 680/Order fulfill sites').getValue(1, 3))

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_IBM Store Engagement/input_User ID_username'), findTestData('Site 680/Order fulfill sites').getValue(
        3, 3))

WebUI.setText(findTestObject('Page_IBM Store Engagement/input_Password_password'), findTestData('Site 680/Order fulfill sites').getValue(
        4, 3))

WebUI.click(findTestObject('Page_IBM Store Engagement/span_Login'))

WebUI.delay(5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_IBM Store Engagement/li_Return Products'))

WebUI.setText(findTestObject('Page_IBM Store Engagement/input_Select box clear_returns_ORDER_scanField'), '00784207')

WebUI.sendKeys(findTestObject('Page_IBM Store Engagement/input_Select box clear_returns_ORDER_scanField'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_IBM Store Engagement/button_Add to Return 0'))

WebUI.click(findTestObject('Page_IBM Store Engagement/button_Added_Return_Continue'))

WebUI.click(findTestObject('Page_IBM Store Engagement/button_Add_Return_Reason_OK'))

WebUI.click(findTestObject('Page_IBM Store Engagement/button_Process Refund'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_IBM Store Engagement/button_Refund'))

WebUI.click(findTestObject('Page_IBM Store Engagement/button_Return_Confirm_Yes'), FailureHandling.OPTIONAL)

WebUI.delay(1)

WebUI.click(findTestObject('Page_IBM Store Engagement/button_Print_Return_Receipt'))

WebUI.switchToWindowIndex(1)

WebUI.executeJavaScript('return document.querySelector("body > print-preview-app").shadowRoot.querySelector("#sidebar").shadowRoot.querySelector("print-preview-button-strip").shadowRoot.querySelector("div > cr-button.action-button")', 
    []).click()

WebUI.delay(2)

Robot robot = new Robot()

Thread.sleep(1000)

robot.keyPress(KeyEvent.VK_2)

robot.keyRelease(KeyEvent.VK_2)

robot.keyPress(KeyEvent.VK_3)

robot.keyRelease(KeyEvent.VK_3)

robot.keyPress(KeyEvent.VK_5)

robot.keyRelease(KeyEvent.VK_5)

robot.keyPress(KeyEvent.VK_SPACE)

robot.keyRelease(KeyEvent.VK_SPACE)

robot.keyPress(KeyEvent.VK_R)

robot.keyRelease(KeyEvent.VK_R)

robot.keyPress(KeyEvent.VK_E)

robot.keyRelease(KeyEvent.VK_E)

robot.keyPress(KeyEvent.VK_T)

robot.keyRelease(KeyEvent.VK_T)

robot.keyPress(KeyEvent.VK_U)

robot.keyRelease(KeyEvent.VK_U)

robot.keyPress(KeyEvent.VK_R)

robot.keyRelease(KeyEvent.VK_R)

robot.keyPress(KeyEvent.VK_N)

robot.keyRelease(KeyEvent.VK_N)

robot.keyPress(KeyEvent.VK_SPACE)

robot.keyRelease(KeyEvent.VK_SPACE)

robot.keyPress(KeyEvent.VK_S)

robot.keyRelease(KeyEvent.VK_S)

robot.keyPress(KeyEvent.VK_L)

robot.keyRelease(KeyEvent.VK_L)

robot.keyPress(KeyEvent.VK_I)

robot.keyRelease(KeyEvent.VK_I)

robot.keyPress(KeyEvent.VK_P)

robot.keyRelease(KeyEvent.VK_P)

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

Thread.sleep(500)

robot.keyPress(KeyEvent.VK_TAB)

Thread.sleep(500)

robot.keyPress(KeyEvent.VK_TAB)

Thread.sleep(500)

robot.keyPress(KeyEvent.VK_ENTER)

WebUI.switchToDefaultContent()

WebUI.delay(2)

WebUI.click(findTestObject('Page_IBM Store Engagement/button_Done'))

WebUI.closeBrowser()

