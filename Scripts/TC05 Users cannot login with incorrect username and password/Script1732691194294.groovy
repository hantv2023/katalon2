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

WebUI.comment('Go to the URL and click make appointment button')

//WebUI.openBrowser('')
//WebUI.navigateToUrl(GlobalVariable.URL)
//WebUI.maximizeWindow()
WebUI.click(findTestObject('Object Repository/HomePage/Make appointment button'))

WebUI.comment('Input invalid username and password then click Login')

CustomKeywords.'demoKatalon.UserLoginApplication.UserLogin'(username, password)

//WebUI.setText(findTestObject('Object Repository/Login form/Username textbox'), 'John Doe')
//WebUI.setEncryptedText(findTestObject('Object Repository/Login form/Password textbox'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')
//WebUI.click(findTestObject('Object Repository/Login form/Login button'))
WebUI.comment('Verify  an error message displayed ')

WebUI.verifyTextPresent('Login failed! Please ensure the username and password are valid.', false)

