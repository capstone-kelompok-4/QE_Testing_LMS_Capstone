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

WebUI.callTestCase(findTestCase('TC_Web_User/Auth/TC01_Login Web'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web_Object_User/Object_Course_Overview/nav_to_course'))

WebUI.click(findTestObject('Web_Object_User/Object_Course_Overview/select_course_react'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Web_Object_User/Object_Report/Page_React App/h4_START COURSE'))

WebUI.click(findTestObject('Object Repository/Web_Object_User/Object_Report/Page_React App/img_Section5 Global State Management_Detail_fb97af'))

WebUI.click(findTestObject('Web_Object_User/Object_Course_Overview/Page_React App/button_Section 1 Bootstrap'))

WebUI.click(findTestObject('Web_Object_User/Object_Course_Overview/Page_React App/button_Section 2 Components  Templates'))

WebUI.click(findTestObject('Web_Object_User/Object_Course_Overview/next_material_course_slide'))

WebUI.delay(2)

WebUI.click(findTestObject('Web_Object_User/Object_Course_Overview/checklist_completed course'))

WebUI.click(findTestObject('Web_Object_User/Object_Course_Overview/next_material_course_quiz'))

WebUI.callTestCase(findTestCase('TC_Web_User/Course_Overview/TC05_Select_Material_Quiz'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('TC_Web_User/Course_Overview/TC07_Select_Material_Video'), [:], FailureHandling.STOP_ON_FAILURE)

