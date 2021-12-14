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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://erqa.uathbncollege.com/home?storeId=863')

WebUI.click(findTestObject('Page_Rental Quick App  Home Page/button_Rental Check-In'))

WebUI.click(findTestObject('Page_Rental Quick App  Home Page/input_Customer Phone Number_searchCriteria'))

WebUI.setText(findTestObject('Page_Rental Quick App  Home Page/input_Order Number_OrderId'), '00919040')

WebUI.click(findTestObject('Page_Rental Quick App  Home Page/button_Search'))

WebUI.click(findTestObject('Page_Rental Quick App  Home Page/Arrow Select'))

WebUI.click(findTestObject('Page_Rental Quick App  Home Page/button_Select'))

WebUI.selectOptionByValue(findTestObject('Page_Rental Quick App  Home Page/select_SaleableNon-SaleablePurchase 17.35'), 
    'Saleable', false)

WebUI.click(findTestObject('Page_Rental Quick App  Home Page/button_Complete'))

WebUI.click(findTestObject('Page_Rental Quick App  Home Page/Payment Details Complete Button'), FailureHandling.OPTIONAL)

WebUI.delay(1)

Robot robot = new Robot()

Thread.sleep(1000)

robot.keyPress(KeyEvent.VK_TAB)

robot.keyRelease(KeyEvent.VK_TAB)

robot.keyPress(KeyEvent.VK_TAB)

robot.keyRelease(KeyEvent.VK_TAB)

robot.keyPress(KeyEvent.VK_TAB)

robot.keyRelease(KeyEvent.VK_TAB)

robot.keyPress(KeyEvent.VK_TAB)

robot.keyRelease(KeyEvent.VK_TAB)

robot.keyPress(KeyEvent.VK_TAB)

robot.keyRelease(KeyEvent.VK_TAB)

Thread.sleep(1000)

robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)

WebUI.delay(5)

WebUI.closeBrowser()

