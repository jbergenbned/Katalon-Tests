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

WebUI.openBrowser('', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('https://michigan.uat1.helixbeta.com/Categories/School-Supplies-ArtTech/Batteries/Alkaline/AAA-Batterires/4Pk-AAA-Copper-Batteries/p/828124', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/button_Sign In  Create Account'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Apparel, Gifts  Textbooks  University _aa7f9e/input_Email address_j_username'), 
    findTestData('Site 235/Helix Accounts').getValue(1, 2), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Apparel, Gifts  Textbooks  University _aa7f9e/input_Password_j_password'), 
    findTestData('Site 235/Helix Accounts').getValue(2, 2), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Apparel, Gifts  Textbooks  University _aa7f9e/a_Sign In'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Sharpie Pen 2 Pack Black  University of Michigan Campus Bookstore/span_Ship to Address_checkmark PDP'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_Sharpie Pen 2 Pack Black  University of Michigan Campus Bookstore/button_Add to cart PDP GM'), 
    FailureHandling.OPTIONAL)

WebUI.mouseOver(findTestObject('Page_Apparel, Gifts  Textbooks  UNH/span_0 items'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_University of Michigan Campus Bookstore/a_view cart (1 item)master'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Your Shopping Cart  University of Michigan Campus Bookstore/button_Proceed To Checkout'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Shipping Method/button_Continue'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('COOP pop up/co_op_box_Close'), FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Robot robot = new Robot()

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

robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)

WebUI.click(findTestObject('Page_Checkout  UNH/span_Apply'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Log in to your PayPal account/button_Accept Cookies'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Page_Log in to your PayPal account/input_Email or mobile number_login_email'), findTestData(
        'Paypal accounts').getValue(1, 2), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Log in to your PayPal account/button_Next'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Page_Log in to your PayPal account/input_Password_login_password'), findTestData('Paypal accounts').getValue(
        2, 2), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Log in to your PayPal account/button_Log In'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Log in to your PayPal account/button_Accept Cookies'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_PayPal Checkout - Review your payment/button_Agree  Continue'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Checkout  UNH Paypal/a_Proceed To Checkout'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_Checkout  University of Michigan Campus Bookstore/button_Place Order'), FailureHandling.CONTINUE_ON_FAILURE)

