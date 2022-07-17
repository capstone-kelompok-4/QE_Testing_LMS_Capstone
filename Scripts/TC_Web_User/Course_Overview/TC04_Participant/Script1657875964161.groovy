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

WebUI.scrollToElement(findTestObject('Web_Object_User/Object_Course_Overview/title_courseoverview'), 0)

WebUI.click(findTestObject('Web_Object_User/Object_Course_Overview/select_course_react'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Web_Object_User/Object_Report/Page_React App/h4_START COURSE'))

WebUI.click(findTestObject('Object Repository/Web_Object_User/Object_Report/Page_React App/img_Section5 Global State Management_Detail_fb97af'))

WebUI.click(findTestObject('Object Repository/Web_Object_User/Object_Report/Page_React App/p_Participants'))

WebUI.verifyElementText(findTestObject('Web_Object_User/Object_Course_Overview/verify_1min'), '1min ago')

WebUI.setText(findTestObject('Object Repository/Web_Object_User/Object_Report/Page_React App/input_1'), 'front')

WebUI.verifyElementText(findTestObject('Web_Object_User/Object_Course_Overview/verify_frontend'), 'Frontend Developer')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Web_Object_User/Object_Report/Page_React App/input_1_2'), 'Danny')

WebUI.verifyElementText(findTestObject('Web_Object_User/Object_Course_Overview/verify_search_name'), 'Danny Chois')

WebUI.delay(2)

WebUI.click(findTestObject('Web_Object_User/Object_Dashboard/Object_Back To Home'))

