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

'Login to Kinray application'
CustomKeywords.'login.login.loginpage'()

'Click on invoice menu'
WebUI.click(findTestObject('Page_Kinray Weblink/Invoice/poinv'))

'Click and load invoice history'
WebUI.click(findTestObject('Page_Kinray Weblink/Invoice/invoicehistory'))

'Click on the search text box'
WebUI.click(findTestObject('Page_Kinray Weblink/Invoice/searchinvoice'))

'Search the invoice by number'
WebUI.setText(findTestObject('Page_Kinray Weblink/Invoice/searchinvoice'), InvoiceNum)

'Click on search button'
WebUI.click(findTestObject('Page_Kinray Weblink/Invoice/btnsearchinv'))

'Load invoice history details on click of invoice link'
WebUI.click(findTestObject('Page_Kinray Weblink/Invoice/invoicelnk'))

//WebUI.getText(findTestObject('Page_Kinray Weblink/Invoice/getinvicetxt'))

'Validate invoice number in invoice history details'
WebUI.verifyElementText(findTestObject('Page_Kinray Weblink/Invoice/getinvicetxt'), InvoiceNum)

'Close browser'
WebUI.closeBrowser()

