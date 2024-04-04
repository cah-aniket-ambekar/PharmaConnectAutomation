package login

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class login {
	@Keyword
	def loginpage() {
		WebUI.openBrowser('')

		//stage
		String kinrayUrl = GlobalVariable.KinrayStage
		String kinrayUsername = GlobalVariable.KinrayUserName
		String kinrayPwd = GlobalVariable.KinrayPwd

		//stage
		WebUI.navigateToUrl(kinrayUrl)
		//username
		WebUI.setText(findTestObject('Object Repository/Page_Kinray Weblink/loginkinray/input_Username_username'), kinrayUsername)
		//pwd
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Kinray Weblink/loginkinray/input_Password_password'), kinrayPwd)
		//click on login btn
		WebUI.click(findTestObject('Object Repository/Page_Kinray Weblink/loginkinray/input_Remember me_okta-signin-submit'))

		WebUI.maximizeWindow()

		WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Kinray Weblink/loginkinray/popup'), 15)

		WebUI.refresh()
	}
}
