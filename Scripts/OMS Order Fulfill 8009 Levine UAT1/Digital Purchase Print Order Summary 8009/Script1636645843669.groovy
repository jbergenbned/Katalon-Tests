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
        3, 10))

WebUI.setText(findTestObject('Site 235/Page_IBM Store Engagement/input_Password_password'), findTestData('Site 680/Order fulfill sites').getValue(
        4, 10))

WebUI.click(findTestObject('Page_IBM Store Engagement/span_Login'))

WebUI.click(findTestObject('Page_IBM Store Engagement/input_Select Store_extnStoreDropdown'))

Robot robot = new Robot()

Thread.sleep(1000)

robot.keyPress(KeyEvent.VK_DOWN)

robot.keyRelease(KeyEvent.VK_DOWN)

robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)

WebUI.click(findTestObject('Site 235/Page_IBM Store Engagement/button_Login to Store_8008'))

WebUI.click(findTestObject('Page_IBM Store Engagement/select_store_left'))

WebUI.click(findTestObject('Object Repository/Page_IBM Store Engagement/span_Hofstra University Bookstore_app-glyph_738071'))

WebUI.setText(findTestObject('Object Repository/Page_IBM Store Engagement/input_Select box clear_global-search_ORDER__473b34'), 
    '00873121')

WebUI.sendKeys(findTestObject('Object Repository/Page_IBM Store Engagement/input_Select box clear_global-search_ORDER__473b34'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Site 235/Page_IBM Store Engagement/button_View Products'))

WebUI.click(findTestObject('Site 235/Page_IBM Store Engagement/button_Print Order Summary'))

not_run: WebUI.delay(2)

WebUI.switchToWindowIndex(1)

WebUI.executeJavaScript('return document.querySelector("body > print-preview-app").shadowRoot.querySelector("#sidebar").shadowRoot.querySelector("print-preview-button-strip").shadowRoot.querySelector("div > cr-button.action-button")', 
    []).click()

not_run: WebUI.delay(2)

Thread.sleep(1000)

robot.keyPress(KeyEvent.VK_8)

robot.keyRelease(KeyEvent.VK_8)

robot.keyPress(KeyEvent.VK_0)

robot.keyRelease(KeyEvent.VK_0)

robot.keyPress(KeyEvent.VK_0)

robot.keyRelease(KeyEvent.VK_0)

robot.keyPress(KeyEvent.VK_9)

robot.keyRelease(KeyEvent.VK_9)

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

robot.keyPress(KeyEvent.VK_SPACE)

robot.keyRelease(KeyEvent.VK_SPACE)

robot.keyPress(KeyEvent.VK_S)

robot.keyRelease(KeyEvent.VK_S)

robot.keyPress(KeyEvent.VK_U)

robot.keyRelease(KeyEvent.VK_U)

robot.keyPress(KeyEvent.VK_M)

robot.keyRelease(KeyEvent.VK_M)

robot.keyPress(KeyEvent.VK_M)

robot.keyRelease(KeyEvent.VK_M)

robot.keyPress(KeyEvent.VK_A)

robot.keyRelease(KeyEvent.VK_A)

robot.keyPress(KeyEvent.VK_R)

robot.keyRelease(KeyEvent.VK_R)

robot.keyPress(KeyEvent.VK_Y)

robot.keyRelease(KeyEvent.VK_Y)

robot.keyPress(KeyEvent.VK_TAB)

Thread.sleep(500)

robot.keyPress(KeyEvent.VK_TAB)

Thread.sleep(500)

robot.keyPress(KeyEvent.VK_TAB)

Thread.sleep(500)

robot.keyPress(KeyEvent.VK_ENTER)

WebUI.switchToDefaultContent()

WebUI.delay(1)

WebUI.closeBrowser()

