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

WebUI.verifyElementPresent(findTestObject('Object Repository/Web_Object_User/Object_Course_Overview/Page_React App/h3_My Course'), 
    0)

WebUI.verifyElementText(findTestObject('Web_Object_User/Object_Course_Overview/verify_flutter'), 'Mastering Mobile Development With Flutter')

WebUI.verifyElementText(findTestObject('Web_Object_User/Object_Course_Overview/verify_react'), 'Mastering Frontend Development with React.Js')

WebUI.verifyElementText(findTestObject('Web_Object_User/Object_Course_Overview/verify_uiuxdesigner'), 'UI/UX Research & Design')

WebUI.verifyElementText(findTestObject('Web_Object_User/Object_Course_Overview/verify_angular'), 'Mastering Frontend Development with Angular')

WebUI.callTestCase(findTestCase('TC_Web_User/Course_Overview/TC03_All_Course'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('TC_Web_User/Course_Overview/TC04_Participant'), [:], FailureHandling.STOP_ON_FAILURE)

