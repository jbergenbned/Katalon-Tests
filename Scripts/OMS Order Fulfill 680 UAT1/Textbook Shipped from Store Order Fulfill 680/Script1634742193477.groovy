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

WebUI.setText(findTestObject('Site 235/Page_IBM Store Engagement/input_Not Started_pick_shipmentOrderBarcodeScanner'), '1005848041')

WebUI.sendKeys(findTestObject('Site 235/Page_IBM Store Engagement/input_Not Started_pick_shipmentOrderBarcodeScanner'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_IBM Store Engagement/span_Pick All'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_IBM Store Engagement/span_Finish Pick'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_IBM Store Engagement/span_Process Transaction'), FailureHandling.OPTIONAL)

WebUI.delay(5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Site 235/Page_IBM Store Engagement/Finish Payment Button'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Site 680 objects/start customer pickup button'))

WebUI.click(findTestObject('Site 680 objects/past due rental close button'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Site 680 objects/pack order button'))

WebUI.click(findTestObject('Site 680 objects/pack all button'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_IBM Store Engagement/input weight'))

WebUI.clearText(findTestObject('Page_IBM Store Engagement/input weight'))

WebUI.setText(findTestObject('Page_IBM Store Engagement/input weight'), '1')

WebUI.click(findTestObject('Site 680 objects/pack hamburger menu'))

WebUI.click(findTestObject('Site 680 objects/update tracking option'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_IBM Store Engagement/input_Tracking'))

WebUI.setText(findTestObject('Page_IBM Store Engagement/input_Tracking'), '1Z1F98Y70320711511')

WebUI.click(findTestObject('Site 680 objects/tracking number save button'))

not_run: WebUI.click(findTestObject('Site 680 objects/print packing slip'), FailureHandling.OPTIONAL)

WebUI.delay(2)

Robot robot = new Robot()

robot.delay(2000)

robot.keyPress(KeyEvent.VK_ESCAPE)

robot.keyRelease(KeyEvent.VK_ESCAPE)

WebUI.click(findTestObject('Site 680 objects/finish pack button'))

WebUI.delay(2)

WebUI.click(findTestObject('Site 680 objects/pack done button'))

