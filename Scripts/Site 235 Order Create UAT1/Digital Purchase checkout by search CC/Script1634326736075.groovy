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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://unh.uat1.helixbeta.com/')

WebUI.mouseOver(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/button_Sign In  Create Account'))

WebUI.setText(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/input_Email address_j_username'), 
    findTestData('Site 235/Helix Accounts').getValue(1, 2))

WebUI.setText(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/input_Password_j_password'), 
    findTestData('Site 235/Helix Accounts').getValue(2, 2))

WebUI.click(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/a_Sign In'))

WebUI.setText(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/input_Enter your search details'), 
    findTestData('Site 235/New Test Data').getValue(1, 16))

WebUI.sendKeys(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/input_Enter your search details'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Site 863/span_Digital Purchase_863'))

WebUI.click(findTestObject('Page_Basic Biomechanics  UNH/a_Add to cart'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_Complete Solfeggi for Tuba  UNH/a_Buy again'), FailureHandling.OPTIONAL)

WebUI.mouseOver(findTestObject('Page_Apparel, Gifts  Textbooks  UNH/span_0 items'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_University of Michigan Campus Bookstore/a_view cart'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_Your Shopping Cart  University of Michigan Campus Bookstore/button_Proceed To Checkout'), 
    FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Page_Your Shopping Cart  UNH/a_No Thanks, Ill  Go It Alone'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_Checkout  UNH School Information/button_Continue'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('COOP pop up/co_op_box_Close'), FailureHandling.OPTIONAL)

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

WebUI.click(findTestObject('Page_Checkout  University of Michigan Campus Bookstore/button_Place Order'))

