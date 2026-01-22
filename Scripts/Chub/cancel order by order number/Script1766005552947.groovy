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

WebUI.navigateToUrl('https://apps.commercehub.com/account/login?service=https%3A%2F%2Fbncpt3160.pt.commercehub.com%2Fdsm%2FgotoGenericSearchResults.do')

WebUI.click(findTestObject('chub/email address'))

WebUI.setText(findTestObject('chub/email address'), 'jbergen@bncollege.com')

WebUI.click(findTestObject('chub/sign in continue button'))

WebUI.click(findTestObject('chub/password'))

WebUI.setText(findTestObject('chub/password'), 'Mixxers43!!')

WebUI.click(findTestObject('chub/sign in continue button'))

WebUI.click(findTestObject('chub/d and h'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('chub/search for dropdown menu'))

WebUI.sendKeys(findTestObject('chub/search for dropdown menu'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('chub/search for input box'))

WebUI.setText(findTestObject('chub/search for input box'), '00564053')

WebUI.click(findTestObject('chub/search go button'))

WebUI.click(findTestObject('chub/order number column'))

WebUI.click(findTestObject('chub/action drpdown'))

WebUI.sendKeys(findTestObject('chub/action drpdown'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('chub/action go button'))

WebUI.click(findTestObject('chub/autofill button'))

WebUI.click(findTestObject('chub/cancel qty field'))

WebUI.setText(findTestObject('chub/cancel qty field'), '1')

WebUI.click(findTestObject('chub/cancellation reason'))

WebUI.sendKeys(findTestObject('chub/cancellation reason'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('chub/submit button'))

