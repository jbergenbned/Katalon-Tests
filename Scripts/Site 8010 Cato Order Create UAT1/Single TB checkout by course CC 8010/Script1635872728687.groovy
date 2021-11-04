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

WebUI.navigateToUrl('https://cpcc.uat1.helixbeta.com/cart')

WebUI.maximizeWindow()

WebUI.mouseOver(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/button_Sign In  Create Account'))

WebUI.setText(findTestObject('Object Repository/Page_Apparel, Gifts  Textbooks  University _aa7f9e/input_Email address_j_username'), 
    findTestData('Site 235/Helix Accounts').getValue(1, 2))

WebUI.setText(findTestObject('Object Repository/Page_Apparel, Gifts  Textbooks  University _aa7f9e/input_Password_j_password'), 
    findTestData('Site 235/Helix Accounts').getValue(2, 2))

WebUI.click(findTestObject('Object Repository/Page_Apparel, Gifts  Textbooks  University _aa7f9e/a_Sign In'))

WebUI.mouseOver(findTestObject('Site 235/course materials and textbooks'))

WebUI.click(findTestObject('Site 235/find course materials'))

WebUI.selectOptionByValue(findTestObject('Page_CPCC 8008/campus select'), Cato, false)

WebUI.click(findTestObject('Page_CPCC 8008 Cato/span_Select_select2-selection__arrow'))

WebUI.click(findTestObject('Page_CPCC 8008 Cato/li_Fall 2021'))

WebUI.click(findTestObject('Page_CPCC 8008 Cato/span_Select_Dept'))

WebUI.click(findTestObject('Page_CPCC 8008 Cato/span_BIO'))

WebUI.click(findTestObject('Page_CPCC 8008 Cato/span_Select_Course'))

WebUI.click(findTestObject('Page_CPCC 8008 Cato/span_200'))

WebUI.click(findTestObject('Page_CPCC 8008/span_Select_Section'))

WebUI.click(findTestObject('Page_CPCC 8008/span_B'))

WebUI.click(findTestObject('Page_CPCC 8008/span_Select_Section'))

WebUI.click(findTestObject('8010 Cato/Page_CPCC/a_Retrieve Materials_button 8010'))

WebUI.click(findTestObject('Page_CPCC 8008/label_39.95 human enhancement new'))

WebUI.click(findTestObject('Page_CPCC 8008/Add to Cart'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_CPCC 8008 Cato/Buy Again'), FailureHandling.OPTIONAL)

WebUI.mouseOver(findTestObject('Page_Apparel, Gifts  Textbooks  UNH/span_0 items'))

WebUI.click(findTestObject('Object Repository/Page_Apparel, Gifts  Textbooks  University _aa7f9e/a_view cart (1 item)'))

WebUI.click(findTestObject('Page_Your Shopping Cart  University of Michigan Campus Bookstore/button_Proceed To Checkout'))

WebUI.click(findTestObject('Shipping Method/button_Continue'))

WebUI.click(findTestObject('Page_Checkout  UNH/button_Saved Payment Methods'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_Checkout  UNH/span_Use This Payment Method Joe Visa'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Page_Checkout  University of Michigan Campus Bookstore/input_Enter CSV_regularPaymentCsv'), 
    '123', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_Checkout  UNH/button_Apply Credit Card 235 Visa Joe'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Payment Info Proceed to Checkout/a_Proceed to Checkout'))

WebUI.click(findTestObject('Page_Checkout  University of Michigan Campus Bookstore/button_Place Order'))

