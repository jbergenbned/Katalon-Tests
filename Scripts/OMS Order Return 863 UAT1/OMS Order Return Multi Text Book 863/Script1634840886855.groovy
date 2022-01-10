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

WebUI.openBrowser(findTestData('Site 680/Order fulfill sites').getValue(1, 3))

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_IBM Store Engagement/input_User ID_username'), findTestData('Site 680/Order fulfill sites').getValue(
        3, 4))

WebUI.setText(findTestObject('Site 235/Page_IBM Store Engagement/input_Password_password'), findTestData('Site 680/Order fulfill sites').getValue(
        4, 4))

WebUI.click(findTestObject('Page_IBM Store Engagement/span_Login'))

WebUI.delay(5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_IBM Store Engagement/li_Return Products'))

WebUI.setText(findTestObject('Page_IBM Store Engagement/input_Select box clear_returns_ORDER_scanField'), '00819217')

WebUI.sendKeys(findTestObject('Page_IBM Store Engagement/input_Select box clear_returns_ORDER_scanField'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Site 235/Page_IBM Store Engagement/button_Add to Return 0'))

WebUI.click(findTestObject('Site 235/Page_IBM Store Engagement/button_Add to Return 1'))

WebUI.click(findTestObject('Site 235/Page_IBM Store Engagement/button_Added_Return_Continue'))

WebUI.click(findTestObject('Site 235/Page_IBM Store Engagement/button_All_Products_Return_OK'))

WebUI.click(findTestObject('Site 235/Page_IBM Store Engagement/button_Process Refund'))

WebUI.delay(1)

WebUI.click(findTestObject('Site 235/Page_IBM Store Engagement/button_Refund'))

WebUI.click(findTestObject('Site 235/Page_IBM Store Engagement/button_Return_Confirm_Yes'), FailureHandling.OPTIONAL)

WebUI.delay(1)

WebUI.click(findTestObject('Site 235/Page_IBM Store Engagement/button_Done'))

WebUI.closeBrowser()

