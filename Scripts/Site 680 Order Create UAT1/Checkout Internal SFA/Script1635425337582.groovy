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

WebUI.navigateToUrl('https://michigan.uat1.helixbeta.com/', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/button_Sign In  Create Account'))

WebUI.click(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/input_Email address_email'))

WebUI.setText(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/input_Email address_email'), 
    'jbergen@bncollege.com')

WebUI.click(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/input_Password_password'))

WebUI.setText(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/input_Password_password'), 
    'Newpass1!')

WebUI.click(findTestObject('Site 680 objects/user account sign in button'))

WebUI.click(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/input_Enter your search details'))

WebUI.setText(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/input_Enter your search details'), 
    findTestData('Site 680/Site 680 Text Book').getValue(1, 89), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/input_Enter your search details'), 
    Keys.chord(Keys.ENTER), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Site 680 objects/course info submit button'))

WebUI.delay(2)

WebUI.click(findTestObject('Site 680 objects/new print book'))

WebUI.click(findTestObject('Site 680 objects/add to cart'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Site 680 objects/Mini Cart'))

not_run: WebUI.click(findTestObject('Page_Earthquake Nation  University of Michigan Campus Bookstore/a_Add to cart'), FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Page_TEST BOOK 1  University of Michigan Campus Bookstore/a_Buy again'), FailureHandling.OPTIONAL)

not_run: WebUI.mouseOver(findTestObject('Page_Apparel, Gifts  Textbooks  UNH/span_0 items'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_University of Michigan Campus Bookstore/a_view cart (1 item)master'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_Your Shopping Cart  University of Michigan Campus Bookstore/label_Ship to Address'), 
    FailureHandling.OPTIONAL)

not_run: WebUI.setText(findTestObject('Page_Your Shopping Cart  University of Michigan Campus Bookstore/input_Enter Promo Code_voucherCode'), 
    'save60', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_Your Shopping Cart  University of Michigan Campus Bookstore/button_Add'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_Your Shopping Cart  University of Michigan Campus Bookstore/button_Proceed To Checkout'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_Your Shopping Cart  UNH/a_No Thanks, Ill  Go It Alone'), FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Shipping Method/button_Continue'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('COOP pop up/co_op_box_Close'), FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Page_Checkout  University of Michigan Campus Bookstore/span_ASCA SFA Only'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_Checkout  UNH/div_Internal Provider_control__indicator'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.setText(findTestObject('Site 680 objects/Student ID Number NEW'), findTestData('Site 235/SFA Accounts').getValue(
        1, 8), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_Checkout  UNH/button_Apply SFA Funds'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('COOP pop up/co_op_box_Close'), FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Page_Checkout  UNH/Proceed to Checkout'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_Checkout  University of Michigan Campus Bookstore/button_Place Order'), FailureHandling.CONTINUE_ON_FAILURE)

