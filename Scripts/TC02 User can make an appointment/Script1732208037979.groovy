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

WebUI.comment('Go to the URL and click make appointment button')

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/HomePage/Make appointment button'))

WebUI.comment('Input valid username and password then click Login')

CustomKeywords.'demoKatalon.UserLoginApplication.UserLogin'('John Doe', 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

//WebUI.setText(findTestObject('Object Repository/Login form/Username textbox'), 'John Doe')
//WebUI.setEncryptedText(findTestObject('Object Repository/Login form/Password textbox'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')
//WebUI.click(findTestObject('Object Repository/Login form/Login button'))
WebUI.comment('Verify the appointment confirmation is displayed ')

WebUI.verifyElementVisible(findTestObject('Make appointment/h2_Make Appointment'))

WebUI.comment('Input all fields with valid data')

WebUI.selectOptionByValue(findTestObject('Make appointment/Facility selection box'), 'Seoul CURA Healthcare Center', false)

WebUI.click(findTestObject('Object Repository/Make appointment/Apply checkbox'))

WebUI.uncheck(findTestObject('Make appointment/Apply checkbox'))

WebUI.click(findTestObject('Make appointment/Healthcare Program Option', [('text') : 'Medicaid']))

WebUI.click(findTestObject('Object Repository/Make appointment/Visit Date textbox'))

WebUI.click(findTestObject('Object Repository/Make appointment/td_1'))

WebUI.setText(findTestObject('Object Repository/Make appointment/Comment textbox'), 'My comment')

WebUI.comment('Click the Book Appointment button')

WebUI.click(findTestObject('Object Repository/Make appointment/Book Appointment button'))

WebUI.comment('Verify the appointment confirmation is displayed')

WebUI.verifyElementVisible(findTestObject('Appointment summary/h2 Appointment Confirmation'))

WebUI.verifyElementVisible(findTestObject('Appointment summary/p Please be informed that'))

String text = WebUI.getText(findTestObject('Appointment summary/p_Tokyo CURA Healthcare Center'))

//System.out.println(text)
WebUI.verifyMatch(text, 'Seoul CURA Healthcare Center', false)

WebUI.verifyElementText(findTestObject('Appointment summary/p_Yes'), 'Yes')

WebUI.verifyElementText(findTestObject('Object Repository/Appointment summary/p_Medicare'), 'Medicare')

String date = WebUI.getText(findTestObject('Appointment summary/p_01112024'))

System.out.println(date)

WebUI.verifyMatch(date, '^\\d{2}/\\d{2}/\\d{4}$', true)

WebUI.verifyElementText(findTestObject('Object Repository/Appointment summary/p_My comment'), 'My comment')

WebUI.closeBrowser()

