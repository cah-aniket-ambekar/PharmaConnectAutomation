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
CustomKeywords.'login.ParMedlogin.loginpage'()

'Click on the search box of ParMed app'
WebUI.click(findTestObject('ParMed_Objects/HomePage/HomeSearch'))

'Input the item id to search'
WebUI.setText(findTestObject('ParMed_Objects/HomePage/HomeSearch'), ItemId)

'Click on the search btn'
WebUI.click(findTestObject('ParMed_Objects/HomePage/HomeSearchBtn'))

'Input the quantity'
WebUI.setText(findTestObject('ParMed_Objects/HomePage/TxtAddQty'), Qty)

'Add the item to cart'
WebUI.click(findTestObject('ParMed_Objects/HomePage/BtnAddQty'))

'Proceed to checkout'
WebUI.click(findTestObject('ParMed_Objects/HomePage/HomeCheckOut'))

'Validate the item id in cart'
WebUI.verifyElementText(findTestObject('ParMed_Objects/Cart/TxtCartItem'), ItemId)

'Click on check out button'
WebUI.enhancedClick(findTestObject('ParMed_Objects/Cart/ParmedCheckOut'))

'Validate the item id in order review page'
WebUI.verifyElementText(findTestObject('ParMed_Objects/Cart/TxtCartItem'), ItemId)

'Click on submit order button'
WebUI.click(findTestObject('ParMed_Objects/Cart/BtnSubmit'))

'Click on confirm submit order button'
WebUI.click(findTestObject('ParMed_Objects/Cart/ConfirmSubmitBtn'))



