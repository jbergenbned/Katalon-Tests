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
        3, 2))

WebUI.setText(findTestObject('Site 235/Page_IBM Store Engagement/input_Password_password'), findTestData('Site 680/Order fulfill sites').getValue(
        4, 2))

WebUI.click(findTestObject('Page_IBM Store Engagement/span_Login'))

WebUI.delay(5, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Site 235/Page_IBM Store Engagement/input_Not Started_pick_shipmentOrderBarcodeScanner'), '1005778070')

WebUI.sendKeys(findTestObject('Site 235/Page_IBM Store Engagement/input_Not Started_pick_shipmentOrderBarcodeScanner'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_IBM Store Engagement/span_Pick All'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_IBM Store Engagement/span_Finish Pick'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_IBM Store Engagement/span_Process Transaction'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Site 235/Page_IBM Store Engagement/Finish Payment Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Site 680 objects/start customer pickup button'))

WebUI.click(findTestObject('Site 680 objects/past due rental close button'))

WebUI.click(findTestObject('Site 680 objects/finish pickup button'))

WebUI.click(findTestObject('Site 680 objects/confirm all products picked up yes button'))

WebUI.click(findTestObject('Site 680 objects/pickup order processed OK button'))

WebUI.click(findTestObject('Site 680 objects/pickup done button'))

not_run: WebUI.click(findTestObject('Site 680 objects/New Print Pickup Label'))

not_run: WebUI.switchToWindowIndex(1)

not_run: WebUI.executeJavaScript('return document.querySelector("body > print-preview-app").shadowRoot.querySelector("#sidebar").shadowRoot.querySelector("print-preview-button-strip").shadowRoot.querySelector("div > cr-button.action-button")', 
    []).click()

not_run: WebUI.delay(3)

not_run: Robot robot = new Robot()

not_run: Thread.sleep(1000)

not_run: robot.keyPress(KeyEvent.VK_6)

not_run: robot.keyRelease(KeyEvent.VK_6)

not_run: robot.keyPress(KeyEvent.VK_8)

not_run: robot.keyRelease(KeyEvent.VK_8)

not_run: robot.keyPress(KeyEvent.VK_0)

not_run: robot.keyRelease(KeyEvent.VK_0)

not_run: robot.keyPress(KeyEvent.VK_SPACE)

not_run: robot.keyRelease(KeyEvent.VK_SPACE)

not_run: robot.keyPress(KeyEvent.VK_P)

not_run: robot.keyRelease(KeyEvent.VK_P)

not_run: robot.keyPress(KeyEvent.VK_U)

not_run: robot.keyRelease(KeyEvent.VK_U)

not_run: robot.keyPress(KeyEvent.VK_SPACE)

not_run: robot.keyRelease(KeyEvent.VK_SPACE)

not_run: robot.keyPress(KeyEvent.VK_L)

not_run: robot.keyRelease(KeyEvent.VK_L)

not_run: robot.keyPress(KeyEvent.VK_A)

not_run: robot.keyRelease(KeyEvent.VK_A)

not_run: robot.keyPress(KeyEvent.VK_B)

not_run: robot.keyRelease(KeyEvent.VK_B)

not_run: robot.keyPress(KeyEvent.VK_E)

not_run: robot.keyRelease(KeyEvent.VK_E)

not_run: robot.keyPress(KeyEvent.VK_L)

not_run: robot.keyRelease(KeyEvent.VK_L)

not_run: robot.keyPress(KeyEvent.VK_TAB)

not_run: Thread.sleep(500)

not_run: robot.keyPress(KeyEvent.VK_TAB)

not_run: Thread.sleep(500)

not_run: robot.keyPress(KeyEvent.VK_TAB)

not_run: Thread.sleep(500)

not_run: robot.keyPress(KeyEvent.VK_ENTER)

not_run: WebUI.switchToDefaultContent()

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Site 235/Page_IBM Store Engagement/button_Start Customer Pickup'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Site 235/Page_IBM Store Engagement/button_Print Runner Slip'), FailureHandling.OPTIONAL)

not_run: WebUI.switchToWindowIndex(1, FailureHandling.OPTIONAL)

not_run: WebUI.executeJavaScript('return document.querySelector("body > print-preview-app").shadowRoot.querySelector("#sidebar").shadowRoot.querySelector("print-preview-button-strip").shadowRoot.querySelector("div > cr-button.action-button")', 
    []).click()

not_run: WebUI.delay(3)

not_run: Thread.sleep(1000)

not_run: robot.keyPress(KeyEvent.VK_6)

not_run: robot.keyRelease(KeyEvent.VK_6)

not_run: robot.keyPress(KeyEvent.VK_8)

not_run: robot.keyRelease(KeyEvent.VK_8)

not_run: robot.keyPress(KeyEvent.VK_0)

not_run: robot.keyRelease(KeyEvent.VK_0)

not_run: robot.keyPress(KeyEvent.VK_SPACE)

not_run: robot.keyRelease(KeyEvent.VK_SPACE)

not_run: robot.keyPress(KeyEvent.VK_R)

not_run: robot.keyRelease(KeyEvent.VK_R)

not_run: robot.keyPress(KeyEvent.VK_U)

not_run: robot.keyRelease(KeyEvent.VK_U)

not_run: robot.keyPress(KeyEvent.VK_N)

not_run: robot.keyRelease(KeyEvent.VK_N)

not_run: robot.keyPress(KeyEvent.VK_N)

not_run: robot.keyRelease(KeyEvent.VK_N)

not_run: robot.keyPress(KeyEvent.VK_E)

not_run: robot.keyRelease(KeyEvent.VK_E)

not_run: robot.keyPress(KeyEvent.VK_R)

not_run: robot.keyRelease(KeyEvent.VK_R)

not_run: robot.keyPress(KeyEvent.VK_SPACE)

not_run: robot.keyRelease(KeyEvent.VK_SPACE)

not_run: robot.keyPress(KeyEvent.VK_S)

not_run: robot.keyRelease(KeyEvent.VK_S)

not_run: robot.keyPress(KeyEvent.VK_L)

not_run: robot.keyRelease(KeyEvent.VK_L)

not_run: robot.keyPress(KeyEvent.VK_I)

not_run: robot.keyRelease(KeyEvent.VK_I)

not_run: robot.keyPress(KeyEvent.VK_P)

not_run: robot.keyRelease(KeyEvent.VK_P)

not_run: robot.keyPress(KeyEvent.VK_TAB)

not_run: Thread.sleep(500)

not_run: robot.keyPress(KeyEvent.VK_TAB)

not_run: Thread.sleep(500)

not_run: robot.keyPress(KeyEvent.VK_TAB)

not_run: Thread.sleep(500)

not_run: robot.keyPress(KeyEvent.VK_ENTER)

not_run: WebUI.switchToDefaultContent()

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Site 235/Page_IBM Store Engagement/button_Finish Pickup'))

not_run: WebUI.click(findTestObject('Site 235/Page_IBM Store Engagement/button_All_Products_Picked_Up_Yes'))

not_run: WebUI.click(findTestObject('Site 235/Page_IBM Store Engagement/button_Pickup_Order_Processed_Success_OK'))

not_run: WebUI.click(findTestObject('Site 235/Page_IBM Store Engagement/button_Pickup_Done'))

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Object Repository/Page_IBM Store Engagement/span_Hofstra University Bookstore_app-glyph_738071'))

not_run: WebUI.setText(findTestObject('Object Repository/Page_IBM Store Engagement/input_Select box clear_global-search_ORDER__473b34'), 
    '01052033')

not_run: WebUI.sendKeys(findTestObject('Object Repository/Page_IBM Store Engagement/input_Select box clear_global-search_ORDER__473b34'), 
    Keys.chord(Keys.ENTER))

not_run: WebUI.click(findTestObject('Site 235/Page_IBM Store Engagement/button_View Products'))

not_run: WebUI.click(findTestObject('Site 235/Page_IBM Store Engagement/button_Print Order Summary'))

not_run: WebUI.delay(2)

not_run: WebUI.switchToWindowIndex(1)

not_run: WebUI.executeJavaScript('return document.querySelector("body > print-preview-app").shadowRoot.querySelector("#sidebar").shadowRoot.querySelector("print-preview-button-strip").shadowRoot.querySelector("div > cr-button.action-button")', 
    []).click()

not_run: WebUI.delay(2)

not_run: Thread.sleep(1000)

not_run: robot.keyPress(KeyEvent.VK_6)

not_run: robot.keyRelease(KeyEvent.VK_6)

not_run: robot.keyPress(KeyEvent.VK_8)

not_run: robot.keyRelease(KeyEvent.VK_8)

not_run: robot.keyPress(KeyEvent.VK_0)

not_run: robot.keyRelease(KeyEvent.VK_0)

not_run: robot.keyPress(KeyEvent.VK_SPACE)

not_run: robot.keyRelease(KeyEvent.VK_SPACE)

not_run: robot.keyPress(KeyEvent.VK_O)

not_run: robot.keyRelease(KeyEvent.VK_O)

not_run: robot.keyPress(KeyEvent.VK_R)

not_run: robot.keyRelease(KeyEvent.VK_R)

not_run: robot.keyPress(KeyEvent.VK_D)

not_run: robot.keyRelease(KeyEvent.VK_D)

not_run: robot.keyPress(KeyEvent.VK_E)

not_run: robot.keyRelease(KeyEvent.VK_E)

not_run: robot.keyPress(KeyEvent.VK_R)

not_run: robot.keyRelease(KeyEvent.VK_R)

not_run: robot.keyPress(KeyEvent.VK_SPACE)

not_run: robot.keyRelease(KeyEvent.VK_SPACE)

not_run: robot.keyPress(KeyEvent.VK_S)

not_run: robot.keyRelease(KeyEvent.VK_S)

not_run: robot.keyPress(KeyEvent.VK_U)

not_run: robot.keyRelease(KeyEvent.VK_U)

not_run: robot.keyPress(KeyEvent.VK_M)

not_run: robot.keyRelease(KeyEvent.VK_M)

not_run: robot.keyPress(KeyEvent.VK_M)

not_run: robot.keyRelease(KeyEvent.VK_M)

not_run: robot.keyPress(KeyEvent.VK_A)

not_run: robot.keyRelease(KeyEvent.VK_A)

not_run: robot.keyPress(KeyEvent.VK_R)

not_run: robot.keyRelease(KeyEvent.VK_R)

not_run: robot.keyPress(KeyEvent.VK_Y)

not_run: robot.keyRelease(KeyEvent.VK_Y)

not_run: robot.keyPress(KeyEvent.VK_TAB)

not_run: Thread.sleep(500)

not_run: robot.keyPress(KeyEvent.VK_TAB)

not_run: Thread.sleep(500)

not_run: robot.keyPress(KeyEvent.VK_TAB)

not_run: Thread.sleep(500)

not_run: robot.keyPress(KeyEvent.VK_ENTER)

not_run: WebUI.switchToDefaultContent()

not_run: WebUI.delay(1)

not_run: WebUI.closeBrowser()

