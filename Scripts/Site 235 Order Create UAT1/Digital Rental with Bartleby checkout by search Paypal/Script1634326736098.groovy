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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://unh.uat1.helixbeta.com/')

WebUI.maximizeWindow()

WebUI.mouseOver(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/button_Sign In  Create Account'))

WebUI.setText(findTestObject('Object Repository/Page_Apparel, Gifts  Textbooks  University _aa7f9e/input_Email address_j_username'), 
    findTestData('Site 235/Helix Accounts').getValue(1, 3))

WebUI.setText(findTestObject('Object Repository/Page_Apparel, Gifts  Textbooks  University _aa7f9e/input_Password_j_password'), 
    findTestData('Site 235/Helix Accounts').getValue(2, 3))

WebUI.click(findTestObject('Object Repository/Page_Apparel, Gifts  Textbooks  University _aa7f9e/a_Sign In'))

WebUI.setText(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/input_Enter your search details'), 
    findTestData('Bartleby').getValue(1, 4), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/input_Enter your search details'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Search Bartleby  UNH/a_Homework done fast. Homework done right'))

WebUI.click(findTestObject('Page_Professional Cooking  UNH/span_Learn and Write Bundle 29.99 5 Month Non-recurring_sub-check'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Site 235/i want bartleby Add to cart'))

WebUI.setText(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/input_Enter your search details'), 
    findTestData('Site 235/New Test Data').getValue(1, 16))

WebUI.sendKeys(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/input_Enter your search details'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Digital Systems Principles and Applications  UNH/span_Digital Rental'))

WebUI.click(findTestObject('Page_Basic Biomechanics  UNH/a_Add to cart'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Complete Solfeggi for Tuba  UNH/a_Buy again'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Page_Apparel, Gifts  Textbooks  UNH/span_0 items'))

WebUI.click(findTestObject('Object Repository/Page_Apparel, Gifts  Textbooks  University _aa7f9e/a_view cart (1 item)'))

WebUI.click(findTestObject('Page_Your Shopping Cart  University of Michigan Campus Bookstore/button_Proceed To Checkout'))

not_run: WebUI.click(findTestObject('Page_Your Shopping Cart  UNH/a_No Thanks, Ill  Go It Alone'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_Checkout  UNH School Information/button_Continue'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_Checkout  UNH/svg'))

WebUI.click(findTestObject('Page_Checkout  UNH/span_Apply'))

WebUI.click(findTestObject('Page_Log in to your PayPal account/button_Accept Cookies'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Page_Log in to your PayPal account/input_Email or mobile number_login_email'), findTestData(
        'Paypal accounts').getValue(1, 2))

WebUI.click(findTestObject('Page_Log in to your PayPal account/button_Next'))

WebUI.setText(findTestObject('Page_Log in to your PayPal account/input_Password_login_password'), findTestData('Paypal accounts').getValue(
        2, 2))

WebUI.click(findTestObject('Page_Log in to your PayPal account/button_Log In'))

WebUI.click(findTestObject('Page_Log in to your PayPal account/button_Accept Cookies'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_PayPal Checkout - Review your payment/button_Agree  Continue'))

WebUI.click(findTestObject('Page_Checkout  UNH Paypal/a_Proceed To Checkout'))

WebUI.click(findTestObject('Page_Checkout  University of Michigan Campus Bookstore/div_I agree with the BN Rental Terms and Conditions_control__indicator'))

WebUI.click(findTestObject('Page_Checkout  University of Michigan Rental/button_CONTINUE'))

not_run: WebUI.click(findTestObject('Page_Checkout  University of Michigan Campus Bookstore/button_Place Order'))

