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

WebUI.scrollToElement(findTestObject('Web_Object_User/Object_Profile/return_name_acc'), 0)

WebUI.click(findTestObject('Web_Object_User/Object_Profile/nav_change_pwd'))

WebUI.setText(findTestObject('Object Repository/Web_Object_User/Object_Profile/Page_React App/input_Current Password_currentPassword'), 
    'danny123')

WebUI.setText(findTestObject('Object Repository/Web_Object_User/Object_Profile/Page_React App/input_New Password_newPassword'), 
    'danny421')

WebUI.setText(findTestObject('Object Repository/Web_Object_User/Object_Profile/Page_React App/input_Confirm Password_confirmPassword'), 
    'danny421')

WebUI.click(findTestObject('Object Repository/Web_Object_User/Object_Profile/Page_React App/button_Save'))

WebUI.click(findTestObject('Object Repository/Web_Object_User/Object_Profile/Page_React App/h2_Success'))

WebUI.verifyElementText(findTestObject('Web_Object_User/Object_Profile/nav_change_pwd'), 'Success!')

WebUI.verifyElementText(findTestObject('Web_Object_User/Object_Profile/verify_success'), 'Password Successfully Changed')

WebUI.delay(2)

WebUI.click(findTestObject('Web_Object_User/Object_Profile/btn_ok_change_pwd'))

WebUI.click(findTestObject('Web_Object_User/Object_Course_Overview/nav_to_course'))

