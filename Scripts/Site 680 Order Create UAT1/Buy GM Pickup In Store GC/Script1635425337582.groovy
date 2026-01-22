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

WebUI.navigateToUrl('https://michigan.uat1.helixbeta.com/Categories/School-Supplies-ArtTech/Writing-Instruments/Pens/Carded/Pilot-Precise-V5-Stick-Rolling-Ball-Pen-Extra-Fine-0-5mm-7Pack-Assorted/p/359118881', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/button_Sign In  Create Account'))

WebUI.click(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/input_Email address_email'))

WebUI.setText(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/input_Email address_email'), 
    'jbergen@bncollege.com')

WebUI.click(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/input_Password_password'))

WebUI.setText(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/input_Password_password'), 
    'Newpass1!')

WebUI.click(findTestObject('Site 680 objects/user account sign in button'))

WebUI.click(findTestObject('Site 680 objects/add to cart GM'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Site 680 objects/buy again button'), FailureHandling.OPTIONAL)

WebUI.delay(1)

WebUI.click(findTestObject('Site 680 objects/Mini Cart'))

WebUI.click(findTestObject('Site 680 objects/shipping cart proceed to checkout'))

WebUI.click(findTestObject('Site 680 objects/book condition proceed to checkout'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Site 680 objects/pickup info continue button'))

WebUI.delay(2)

WebUI.click(findTestObject('Site 680 objects/coop close'))

WebUI.click(findTestObject('Site 680 objects/gift card payment option'))

WebUI.click(findTestObject('Site 680 objects/gift card number field'))

WebUI.setText(findTestObject('Site 680 objects/gift card number field'), '7777474937762584')

WebUI.click(findTestObject('Site 680 objects/gift card pin number'))

WebUI.setText(findTestObject('Site 680 objects/gift card pin number'), '05825290')

WebUI.click(findTestObject('Site 680 objects/apply gift card button'))

WebUI.click(findTestObject('Site 680 objects/payment info proceed to checkout'))

not_run: WebUI.click(findTestObject('Site 680 objects/place order button'))

