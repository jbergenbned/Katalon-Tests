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

WebUI.click(findTestObject('Page_CPCC 8008/campus select'))

WebUI.click(findTestObject('Page_CPCC 8008/Central'))

WebUI.setText(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/input_Enter your search details'), 
    findTestData('8000 Multi Campus/8000 Central Campus Data').getValue(1, 7))

WebUI.sendKeys(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/input_Enter your search details'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('8008/Digital Purchase Radio Button 8008'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Basic Biomechanics  UNH/a_Add to cart'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_Complete Solfeggi for Tuba  UNH/a_Buy again'), FailureHandling.OPTIONAL)

WebUI.mouseOver(findTestObject('Page_Apparel, Gifts  Textbooks  UNH/span_0 items'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_University of Michigan Campus Bookstore/a_view cart'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Your Shopping Cart  University of Michigan Campus Bookstore/button_Proceed To Checkout'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_Your Shopping Cart  UNH/a_No Thanks, Ill  Go It Alone'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('8008/School Information Continue 8008'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Checkout  UNH/button_Saved Payment Methods'))

WebUI.click(findTestObject('Page_Checkout  UNH/span_Use This Payment Method Joe Visa'))

WebUI.setText(findTestObject('Page_Checkout  University of Michigan Campus Bookstore/input_Enter CSV_regularPaymentCsv'), 
    '123', FailureHandling.OPTIONAL)

Robot robot = new Robot()

robot.keyPress(KeyEvent.VK_TAB)

robot.keyRelease(KeyEvent.VK_TAB)

robot.keyPress(KeyEvent.VK_TAB)

robot.keyRelease(KeyEvent.VK_TAB)

robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)

WebUI.click(findTestObject('Payment Info Proceed to Checkout/a_Proceed to Checkout'))

not_run: WebUI.click(findTestObject('Page_Checkout  University of Michigan Campus Bookstore/button_Place Order'))

