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

WebUI.verifyElementPresent(findTestObject('Web_Object_User/Object_Course_Overview/verify_quiz'), 0)

WebUI.verifyElementPresent(findTestObject('Web_Object_User/Object_Course_Overview/verify_form_quiz'), 0)

WebUI.click(findTestObject('Object Repository/Web_Object_User/Object_Course_Overview/Page_React App/div_B'))

WebUI.click(findTestObject('Object Repository/Web_Object_User/Object_Course_Overview/Page_React App/div_C'))

WebUI.click(findTestObject('Object Repository/Web_Object_User/Object_Course_Overview/Page_React App/div_C'))

WebUI.click(findTestObject('Object Repository/Web_Object_User/Object_Course_Overview/Page_React App/div_C'))

WebUI.rightClick(findTestObject('Object Repository/Web_Object_User/Object_Course_Overview/Page_React App/span_Kirim'))

WebUI.delay(2)

WebUI.click(findTestObject('Web_Object_User/Object_Course_Overview/next_course_material_video'))

