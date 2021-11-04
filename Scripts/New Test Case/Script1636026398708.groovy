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

WebUI.mouseOver(findTestObject('Site 235/course materials and textbooks'))

WebUI.click(findTestObject('Site 235/find course materials'))

WebUI.selectOptionByValue(findTestObject('Page_CPCC 8008/campus select'), Cato, false)

WebUI.click(findTestObject('8010 Cato/Term 8010'))

WebUI.click(findTestObject('8010 Cato/Term List/Fall 2021'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('8010 Cato/Department 8010'))

WebUI.click(findTestObject('8010 Cato/Fall 2021/BIO'))

WebUI.click(findTestObject('8010 Cato/Course 8010'))

WebUI.click(findTestObject('8010 Cato/Fall 2021/200'))

WebUI.click(findTestObject('8010 Cato/Section 8010'))

WebUI.click(findTestObject('8010 Cato/Fall 2021/E'))

WebUI.click(findTestObject('8010 Cato/Page_CPCC/a_Retrieve Materials_button 8010'))

