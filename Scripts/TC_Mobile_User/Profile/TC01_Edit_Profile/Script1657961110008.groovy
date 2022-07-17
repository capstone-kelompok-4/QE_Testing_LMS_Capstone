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

WebUI.callTestCase(findTestCase('TC_Mobile_User/Auth/TC01_Login_user'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mobile_Object_User/Object_Profile/Change_Password/nav_profile'), 0)

Mobile.tap(findTestObject('Mobile_Object_User/Object_Profile/Edit_Profile/edit_profile'), 0)

Mobile.tap(findTestObject('Mobile_Object_User/Object_Profile/Edit_Profile/edit_input_fullname'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Mobile_Object_User/Object_Profile/Edit_Profile/edit_input_fullname'), 'Hans  ', 0)

Mobile.scrollToText('City')

Mobile.tap(findTestObject('Mobile_Object_User/Object_Profile/Edit_Profile/edit)_input_province'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Mobile_Object_User/Object_Profile/Edit_Profile/edit)_input_province'), 'London', 0)

Mobile.tap(findTestObject('Mobile_Object_User/Object_Profile/Edit_Profile/edit_zip'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Mobile_Object_User/Object_Profile/Edit_Profile/edit_zip'), '20000', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Mobile_Object_User/Object_Profile/Edit_Profile/btn_simpan_edit_profile'), 0)

Mobile.tap(findTestObject('Mobile_Object_User/Object_Profile/btn_back_profile'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

