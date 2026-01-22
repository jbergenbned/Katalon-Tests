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

WebUI.delay(5)

WebUI.click(findTestObject('Site 680 objects/find course materials'))

WebUI.click(findTestObject('Page_University of Michigan Campus Bookstore/term'))

WebUI.click(findTestObject('Page_University of Michigan Campus Bookstore/Spring 2025'))

WebUI.click(findTestObject('Page_University of Michigan Campus Bookstore/department'))

WebUI.click(findTestObject('Page_University of Michigan Campus Bookstore/department select'))

WebUI.click(findTestObject('Page_University of Michigan Campus Bookstore/course'))

WebUI.click(findTestObject('Page_University of Michigan Campus Bookstore/course select'))

WebUI.click(findTestObject('Page_University of Michigan Campus Bookstore/section'))

WebUI.click(findTestObject('Page_University of Michigan Campus Bookstore/section select 1 Normal'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_University of Michigan Campus Bookstore/retrieve materials'))

WebUI.delay(2)

WebUI.click(findTestObject('Site 680 objects/Digital Purchase course lookup'))

WebUI.click(findTestObject('Site 680 objects/add to cart'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Site 680 objects/buy again course lookup'), FailureHandling.OPTIONAL)

WebUI.delay(1)

WebUI.click(findTestObject('Site 680 objects/Mini Cart'))

WebUI.click(findTestObject('Site 680 objects/shipping cart proceed to checkout'))

WebUI.click(findTestObject('Site 680 objects/book condition proceed to checkout'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Site 680 objects/pickup info continue button'))

WebUI.delay(2)

WebUI.click(findTestObject('Site 680 objects/coop close'))

WebUI.click(findTestObject('Site 680 objects/paypal payment option'))

WebUI.click(findTestObject('Site 680 objects/apply paypal button'))

WebUI.click(findTestObject('Site 680 objects/paypal email address input'))

WebUI.setText(findTestObject('Site 680 objects/paypal email address input'), 'bntest150@gmail.com')

WebUI.click(findTestObject('Site 680 objects/paypal next button'))

WebUI.click(findTestObject('Site 680 objects/paypal try another way link'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Site 680 objects/use password instead link'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Site 680 objects/paypal password field'))

WebUI.setText(findTestObject('Site 680 objects/paypal password field'), 'Welcome1')

WebUI.click(findTestObject('Site 680 objects/paypal login button'))

WebUI.click(findTestObject('Site 680 objects/paypal agree and continue'))

not_run: WebUI.click(findTestObject('Site 680 objects/place order button'))

