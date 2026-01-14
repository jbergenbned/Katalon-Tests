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
        3, 2))

WebUI.setText(findTestObject('Site 235/Page_IBM Store Engagement/input_Password_password'), findTestData('Site 680/Order fulfill sites').getValue(
        4, 2))

WebUI.click(findTestObject('Page_IBM Store Engagement/span_Login'))

WebUI.delay(5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Site 680 objects/oms global search'))

WebUI.setText(findTestObject('Site 680 objects/oms global search input'), '1005807002')

WebUI.sendKeys(findTestObject('Site 680 objects/oms global search input'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Site 680 objects/order summary hamburger menu'))

WebUI.click(findTestObject('Site 680 objects/appease customer option'))

WebUI.click(findTestObject('Site 680 objects/select reason code'))

WebUI.selectOptionByValue(findTestObject('Site 680 objects/select reason code'), '50', false)

WebUI.click(findTestObject('Site 680 objects/select reason code'))

WebUI.click(findTestObject('Site 680 objects/appease amount input box'))

WebUI.enhancedClick(findTestObject('Site 680 objects/select product tick box for appease'))

WebUI.click(findTestObject('Site 680 objects/appease amount input box'))

WebUI.sendKeys(findTestObject('Site 680 objects/appease amount input box'), Keys.chord(Keys.BACK_SPACE, Keys.BACK_SPACE, 
        Keys.BACK_SPACE, Keys.BACK_SPACE))

WebUI.setText(findTestObject('Site 680 objects/appease amount input box'), '1.00')

