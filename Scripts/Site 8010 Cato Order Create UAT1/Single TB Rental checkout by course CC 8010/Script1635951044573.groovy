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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://cpcc.uat1.helixbeta.com/cart')

WebUI.mouseOver(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/button_Sign In  Create Account'))

WebUI.setText(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/input_Email address_j_username'), 
    findTestData('Site 235/Helix Accounts').getValue(1, 2))

WebUI.setText(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/input_Password_j_password'), 
    findTestData('Site 235/Helix Accounts').getValue(2, 2))

WebUI.click(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/a_Sign In'))

WebUI.mouseOver(findTestObject('Site 235/course materials and textbooks'))

WebUI.click(findTestObject('Site 235/find course materials'))

WebUI.selectOptionByValue(findTestObject('Page_CPCC 8008/campus select'), Cato, false)

WebUI.click(findTestObject('Page_CPCC 8008 Cato/span_Select_select2-selection__arrow'))

WebUI.click(findTestObject('8010 Cato/Page_CPCC/li_Fall - Winter 21'))

WebUI.click(findTestObject('Page_CPCC 8008 Cato/span_Select_Dept'))

WebUI.click(findTestObject('8010 Cato/Page_CPCC/span_FRE'))

WebUI.click(findTestObject('Page_CPCC 8008 Cato/span_Select_Course'))

WebUI.click(findTestObject('8010 Cato/Page_CPCC/span_200_FRE'))

WebUI.click(findTestObject('Page_CPCC 8008/span_Select_Section'))

WebUI.click(findTestObject('8010 Cato/Page_CPCC/span_2_FRE'))

WebUI.click(findTestObject('8010 Cato/Page_CPCC/span_2_FRE'))

WebUI.click(findTestObject('8010 Cato/Page_CPCC/a_Retrieve Materials_button 8010'))

WebUI.scrollToElement(findTestObject('8010 Cato/Page_CPCC/New Print Rental Book'), 0)

WebUI.click(findTestObject('8010 Cato/Page_CPCC/New Print Rental Book'))

WebUI.click(findTestObject('Page_RAPID ACLS  University of Michigan Campus Bookstore/span_New Print Rental'))

WebUI.click(findTestObject('Page_CPCC 8008/Add to Cart'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_CPCC 8008 Cato/Buy Again'), FailureHandling.OPTIONAL)

WebUI.mouseOver(findTestObject('Site 680 objects/cart hover'))

WebUI.click(findTestObject('Object Repository/Page_Complete Solfeggi for Tuba  UNH/a_view cart (1 item)'))

WebUI.click(findTestObject('Page_Your Shopping Cart  University of Michigan Campus Bookstore/button_Proceed To Checkout'))

WebUI.click(findTestObject('Shipping Method/button_Continue'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Site 680 objects/Rental Books Saved Payment Button'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_Checkout  UNH/button_Saved Payment Methods'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Checkout  UNH/span_Use This Payment Method Joe Visa'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.setText(findTestObject('Page_Checkout  University of Michigan Campus Bookstore/input_Enter CSV_regularPaymentCsv'), 
    '123', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Checkout  UNH/button_Apply Credit Card 235 Visa Joe'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Payment Info Proceed to Checkout/a_Proceed to Checkout'))

WebUI.click(findTestObject('Page_Checkout  University of Michigan Campus Bookstore/div_I agree with the BN Rental Terms and Conditions_control__indicator'))

WebUI.click(findTestObject('Page_Checkout  University of Michigan Rental/button_CONTINUE'))

WebUI.click(findTestObject('Page_Checkout  University of Michigan Campus Bookstore/button_Place Order'))

