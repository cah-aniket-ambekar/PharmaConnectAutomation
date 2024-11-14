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

'Click on the shop menu'
WebUI.click(findTestObject('ParMed_Objects/Menus/ShopMenu'))

'Click on the promotions sub menu'
WebUI.enhancedClick(findTestObject('ParMed_Objects/MenuShop/Dispil'))

'Verify the header text'
WebUI.verifyElementText(findTestObject('ParMed_Objects/MenuShop/HeaderDispilPage'), "Search results for 'dispill'")

'Verify the item text present in page'
WebUI.verifyElementText(findTestObject('ParMed_Objects/Dispil/DispilItem'), "DISPILL MOUNTING TRAY 32CELLS")




