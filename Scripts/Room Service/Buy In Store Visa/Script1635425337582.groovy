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

WebUI.openBrowser('', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('https://clemson-roomservice.uat1.helixbeta.com/Necessities/Heaters-and-Humidifiers/Room-Service-TEST-91/p/698464501', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/button_Sign In  Create Account'))

WebUI.click(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/input_Email address_email'))

WebUI.setText(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/input_Email address_email'), 
    'jbergen@bncollege.com')

WebUI.click(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/input_Password_password'))

WebUI.setText(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/input_Password_password'), 
    'Newpass1!')

WebUI.click(findTestObject('Page_Apparel, Gifts  Textbooks  Clemson University Room Service/a_Sign In  Create Account_submitLoginHeaderForm'))

WebUI.delay(2)

WebUI.click(findTestObject('Room Service/add to your shipment button'))

WebUI.click(findTestObject('Room Service/Room Service Mini cart'))

WebUI.click(findTestObject('Room Service/your cart proceed to checkout'))

WebUI.click(findTestObject('Room Service/campus room number'))

WebUI.setText(findTestObject('Room Service/campus room number'), '2')

WebUI.click(findTestObject('Room Service/student first name'))

WebUI.setText(findTestObject('Room Service/student first name'), 'joe')

WebUI.click(findTestObject('Room Service/student last name'))

WebUI.setText(findTestObject('Room Service/student last name'), 'bee')

WebUI.click(findTestObject('Room Service/student email'))

WebUI.setText(findTestObject('Room Service/student email'), 'jbergen@bncollege.com')

WebUI.click(findTestObject('Room Service/student phone'))

WebUI.setText(findTestObject('Room Service/student phone'), '5555555555')

WebUI.click(findTestObject('Room Service/student info continue button'))

WebUI.click(findTestObject('Site 680 objects/credit debit payment option'))

WebUI.click(findTestObject('Site 680 objects/saved payment method'))

WebUI.click(findTestObject('Site 680 objects/visa'))

WebUI.click(findTestObject('Site 680 objects/cc cvc'))

WebUI.setText(findTestObject('Site 680 objects/cc cvc'), '737')

WebUI.click(findTestObject('Site 680 objects/apply cc'))

WebUI.click(findTestObject('Site 680 objects/payment info proceed to checkout'))

not_run: WebUI.click(findTestObject('Site 680 objects/place order button'))

