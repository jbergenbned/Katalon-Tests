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

WebUI.openBrowser(findTestData('Site 680/Order fulfill sites').getValue(1, 3), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Page_IBM Store Engagement/input_User ID_username'), findTestData('Site 680/Order fulfill sites').getValue(
        3, 2), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Page_IBM Store Engagement/input_Password_password'), findTestData('Site 680/Order fulfill sites').getValue(
        4, 2), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_IBM Store Engagement/span_Login'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_IBM Store Engagement/li_Rental Orders'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Page_IBM Store Engagement/input_rental_search_box'), '01052033', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Page_IBM Store Engagement/input_rental_search_box'), Keys.chord(Keys.ENTER), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_IBM Store Engagement/button_Rental Check In'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_IBM Store Engagement/button_Click to decrease picked quantity by 1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_IBM Store Engagement/select_Select ConditionSALEABLENON-SALEABLEBUYOUTEND-OF-LIFE'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Page_IBM Store Engagement/select_Select ConditionSALEABLENON-SALEABLEBUYOUTEND-OF-LIFE'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_IBM Store Engagement/button_Finish Check In'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_IBM Store Engagement/button_Process Transaction Rental Return'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_IBM Store Engagement/button_Payment_Auth_OK_Rental_Return'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_IBM Store Engagement/button_Finish Payment_Rental_Return'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Site 680 objects/Rental Return Print Invoice'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.executeJavaScript('return document.querySelector("body > print-preview-app").shadowRoot.querySelector("#sidebar").shadowRoot.querySelector("print-preview-button-strip").shadowRoot.querySelector("div > cr-button.action-button")', 
    []).click()

WebUI.delay(1)

Robot robot = new Robot()

Thread.sleep(1000)

robot.keyPress(KeyEvent.VK_6)

robot.keyRelease(KeyEvent.VK_6)

robot.keyPress(KeyEvent.VK_8)

robot.keyRelease(KeyEvent.VK_8)

robot.keyPress(KeyEvent.VK_0)

robot.keyRelease(KeyEvent.VK_0)

robot.keyPress(KeyEvent.VK_SPACE)

robot.keyRelease(KeyEvent.VK_SPACE)

robot.keyPress(KeyEvent.VK_R)

robot.keyRelease(KeyEvent.VK_R)

robot.keyPress(KeyEvent.VK_E)

robot.keyRelease(KeyEvent.VK_E)

robot.keyPress(KeyEvent.VK_N)

robot.keyRelease(KeyEvent.VK_N)

robot.keyPress(KeyEvent.VK_T)

robot.keyRelease(KeyEvent.VK_T)

robot.keyPress(KeyEvent.VK_A)

robot.keyRelease(KeyEvent.VK_A)

robot.keyPress(KeyEvent.VK_L)

robot.keyRelease(KeyEvent.VK_L)

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

WebUI.switchToDefaultContent(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_IBM Store Engagement/button_Done_Rental_Return'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

