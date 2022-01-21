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

WebUI.setText(findTestObject('Object Repository/Page_Apparel, Gifts  Textbooks  University _aa7f9e/input_Email address_j_username'), 
    findTestData('Site 235/Helix Accounts').getValue(1, 2))

WebUI.setText(findTestObject('Object Repository/Page_Apparel, Gifts  Textbooks  University _aa7f9e/input_Password_j_password'), 
    findTestData('Site 235/Helix Accounts').getValue(2, 2))

WebUI.click(findTestObject('Object Repository/Page_Apparel, Gifts  Textbooks  University _aa7f9e/a_Sign In'))

not_run: WebUI.mouseOver(findTestObject('Site 235/course materials and textbooks'))

not_run: WebUI.click(findTestObject('Site 235/find course materials'))

not_run: WebUI.click(findTestObject('Page_CPCC 8008/campus select'))

not_run: WebUI.click(findTestObject('Page_CPCC 8008/Central'))

WebUI.setText(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/input_Enter your search details'), 
    findTestData('8000 Multi Campus/8000 Central Campus Data').getValue(1, 6), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/input_Enter your search details'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Site 435/span_New Print_435'))

WebUI.click(findTestObject('Page_Earthquake Nation  University of Michigan Campus Bookstore/a_Add to cart'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_Complete Solfeggi for Tuba  UNH/a_Buy again'), FailureHandling.OPTIONAL)

WebUI.mouseOver(findTestObject('Page_Apparel, Gifts  Textbooks  UNH/span_0 items'))

WebUI.click(findTestObject('Page_University of Michigan Campus Bookstore/a_view cart (1 item)master'))

WebUI.click(findTestObject('Page_Your Shopping Cart  University of Michigan Campus Bookstore/label_Ship to Address'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_Your Shopping Cart  University of Michigan Campus Bookstore/button_Proceed To Checkout'))

WebUI.click(findTestObject('Shipping Method/button_Continue'))

WebUI.click(findTestObject('Page_Checkout  UNH/span_Financial Aid'))

WebUI.click(findTestObject('Page_Checkout  UNH/div_Internal Provider_control__indicator'))

WebUI.setText(findTestObject('Page_Checkout  UNH/input_Student ID Number_primaryProviderStudentId'), findTestData('Site 235/SFA Accounts').getValue(
        1, 6))

WebUI.click(findTestObject('Page_Checkout  UNH/button_Apply SFA Funds'))

WebUI.click(findTestObject('Page_Checkout  UNH/Proceed to Checkout'))

not_run: WebUI.click(findTestObject('Page_Checkout  University of Michigan Campus Bookstore/button_Place Order'))

