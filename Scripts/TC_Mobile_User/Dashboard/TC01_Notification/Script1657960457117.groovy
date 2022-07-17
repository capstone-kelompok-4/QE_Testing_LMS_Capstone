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

Mobile.tap(findTestObject('Mobile_Object_User/Object_Dashboard/icon_notification'), 0)

Mobile.tap(findTestObject('Mobile_Object_User/Object_Dashboard/training3_to_scroll'), 0)

Mobile.tap(findTestObject('Mobile_Object_User/Object_Dashboard/training1_to_scroll'), 0)

Mobile.tap(findTestObject('Mobile_Object_User/Object_Dashboard/card_course_reactjs'), 0)

Mobile.tap(findTestObject('Mobile_Object_User/Object_Dashboard/btn_add_rating'), 0)

Mobile.tap(findTestObject('Mobile_Object_User/Object_Dashboard/btn_course'), 0)

Mobile.tap(findTestObject('Mobile_Object_User/Object_Dashboard/scroll_to_reading_material'), 0)

Mobile.tap(findTestObject('Mobile_Object_User/Object_Dashboard/btn_mulai_belajar'), 0)

