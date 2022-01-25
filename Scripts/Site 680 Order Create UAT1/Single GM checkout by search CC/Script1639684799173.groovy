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

WebUI.navigateToUrl('https://michigan.uat1.helixbeta.com/Categories/School-Supplies-ArtTech/Art-Supplies/Paints--Mediums/Art--Drafting-Pencils/General-Pencil-Charcoal-Pencil-4B/p/303561')

WebUI.mouseOver(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/button_Sign In  Create Account'))

WebUI.setText(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/input_Email address_j_username'), 
    findTestData('Site 235/Helix Accounts').getValue(1, 2))

WebUI.setText(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/input_Password_j_password'), 
    findTestData('Site 235/Helix Accounts').getValue(2, 2))

WebUI.click(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/a_Sign In'))

WebUI.click(findTestObject('Page_Sharpie Pen 2 Pack Black  University of Michigan Campus Bookstore/span_Ship to Address_checkmark PDP'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_Sharpie Pen 2 Pack Black  University of Michigan Campus Bookstore/button_Add to cart PDP GM'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_Complete Solfeggi for Tuba  UNH/a_Buy again'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_Earthquake Nation  University of Michigan Campus Bookstore/a_Add to cart'), FailureHandling.OPTIONAL)

WebUI.mouseOver(findTestObject('Site 680 objects/cart hover'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_University of Michigan Campus Bookstore/a_view cart (1 item)master'))

WebUI.click(findTestObject('Page_Your Shopping Cart  University of Michigan Campus Bookstore/button_Proceed To Checkout'))

WebUI.click(findTestObject('Page_Your Shopping Cart  UNH/a_No Thanks, Ill  Go It Alone'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Shipping Method/button_Continue'))

WebUI.click(findTestObject('COOP pop up/co_op_box_Close'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_Checkout  University of Michigan Campus Bookstore/button_Saved Payment Methods New'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('COOP pop up/co_op_box_Close'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_Checkout  UNH/span_Use This Payment Method Joe Visa'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('COOP pop up/co_op_box_Close'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Page_Checkout  University of Michigan Campus Bookstore/input_Enter CSV_regularPaymentCsv'), 
    '123', FailureHandling.OPTIONAL)

Robot robot = new Robot()

robot.keyPress(KeyEvent.VK_TAB)

robot.keyRelease(KeyEvent.VK_TAB)

robot.keyPress(KeyEvent.VK_TAB)

robot.keyRelease(KeyEvent.VK_TAB)

robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)

WebUI.click(findTestObject('COOP pop up/co_op_box_Close'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Payment Info Proceed to Checkout/a_Proceed to Checkout'))

not_run: WebUI.click(findTestObject('Page_Checkout  University of Michigan Campus Bookstore/button_Place Order'))

