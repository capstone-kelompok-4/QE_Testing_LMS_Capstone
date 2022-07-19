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

WebUI.click(findTestObject('Web_Object_User/Object_Course_Overview/nav_to_course'))

WebUI.click(findTestObject('Web_Object_User/Object_Course_Overview/read_more_req_intro_web'))

WebUI.click(findTestObject('Object Repository/Web_Object_User/Object_Course_Overview/Page_React App/h4_SEND REQUEST'))

WebUI.click(findTestObject('Object Repository/Web_Object_User/Object_Course_Overview/Page_React App/input_Request Variant_reqVariant'))

WebUI.setText(findTestObject('Object Repository/Web_Object_User/Object_Course_Overview/Page_React App/textarea_I want to Join This course'), 
    'I want to Join This course')

WebUI.click(findTestObject('Object Repository/Web_Object_User/Object_Course_Overview/Page_React App/button_Submit'))

WebUI.verifyElementText(findTestObject('Web_Object_User/Object_Course_Overview/verify_toast_success'), 'Success!')

WebUI.click(findTestObject('Object Repository/Web_Object_User/Object_Course_Overview/Page_React App/button_OK'))

WebUI.verifyElementPresent(findTestObject('Page_React App/h4_WAITING APPROVAL'), 0)

WebUI.click(findTestObject('Web_Object_User/Object_Dashboard/Object_Back To Home'))

WebUI.click(findTestObject('Web_Object_User/Object_Course_Overview/nav_to_course'))

