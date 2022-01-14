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

WebUI.navigateToUrl('https://faber.uat1.helixbeta.com/')

WebUI.mouseOver(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/button_Sign In  Create Account'))

WebUI.setText(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/input_Email address_j_username'), 
    findTestData('Site 235/Helix Accounts').getValue(1, 2))

WebUI.setText(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/input_Password_j_password'), 
    findTestData('Site 235/Helix Accounts').getValue(2, 2))

WebUI.click(findTestObject('Page_Apparel, Gifts  Textbooks  University of Michigan Campus Bookstore/a_Sign In'))

WebUI.mouseOver(findTestObject('Page_Apparel, Gifts  Textbooks  Faber College Bookstore/button_My Account'))

WebUI.click(findTestObject('Page_Apparel, Gifts  Textbooks  Faber College Bookstore/a_Profile'))

WebUI.click(findTestObject('Page_Update Forgotten Password  Faber College Bookstore/button_Change Password'))

WebUI.setText(findTestObject('Page_Update Forgotten Password  Faber College Bookstore/input_Current Password_currentPassword'), 
    '123')

WebUI.setText(findTestObject('Page_Update Forgotten Password  Faber College Bookstore/input_New Password_newPassword'), 
    '1234')

WebUI.setText(findTestObject('Page_Update Forgotten Password  Faber College Bookstore/input_Confirm New Password_checkNewPassword'), 
    '1234')

WebUI.click(findTestObject('Page_Update Profile  Faber College Bookstore/div_Change Password'))

WebUI.verifyTextPresent('Password does not meet minimum requirements.', false)

