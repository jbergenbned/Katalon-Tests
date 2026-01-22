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

WebUI.navigateToUrl('https://helix-reports-non-prod.bnedloudcloud.com/login')

WebUI.click(findTestObject('helix reports/login username'))

WebUI.setText(findTestObject('helix reports/login username'), 'jbergen@bncollege.com')

WebUI.click(findTestObject('helix reports/password'))

WebUI.setEncryptedText(findTestObject('helix reports/password'), 'sXgvmPwHuWxjI2gua7XmJg==')

WebUI.click(findTestObject('helix reports/login button'))

WebUI.delay(3)

WebUI.click(findTestObject('helix reports/hamburger menu'))

WebUI.click(findTestObject('helix reports/rental reports menu option'))

WebUI.click(findTestObject('Page_Helix Reports/input_From Date_input-78'))

WebUI.setText(findTestObject('Page_Helix Reports/input_From Date_input-78'), '2025-11-08')

WebUI.click(findTestObject('Page_Helix Reports/input_To Date_input-81'))

WebUI.setText(findTestObject('Page_Helix Reports/input_To Date_input-81'), '2026-01-17')

