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

'Set viewport size 703x347'
WebUI.setViewPortSize(1024, 768)

WebUI.navigateToUrl('https://capstone-lms-alterra.netlify.app/login')

WebUI.setText(findTestObject('Object Repository/Web_Object_User/Object_Auth/Object_Logout/Page_React App/input_Your Email_email'), 
    'danny_choi@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Web_Object_User/Object_Auth/Object_Logout/Page_React App/input_Password_password'), 
    'bHvWYdjKrG00TDoHEsg6TQ==')

WebUI.sendKeys(findTestObject('Object Repository/Web_Object_User/Object_Auth/Object_Logout/Page_React App/input_Password_password'), 
    Keys.chord(Keys.ENTER))

WebUI.setEncryptedText(findTestObject('Object Repository/Web_Object_User/Object_Auth/Object_Logout/Page_React App/input_Password_password'), 
    'xNkrJvNrtLW0TvWRZfr2pg==')

WebUI.click(findTestObject('Object Repository/Web_Object_User/Object_Auth/Object_Logout/Page_React App/button_Login'))

WebUI.verifyElementText(findTestObject('Web_Object_User/Object_Auth/Object_Login Web/verify_userloginweb'), 'Danny Chois')

WebUI.delay(3)

