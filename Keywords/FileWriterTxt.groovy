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
import java.nio.file.Path
import java.nio.file.Paths
import internal.GlobalVariable

public class FileWriterTxt {

	@Keyword
	public List FileUtilsWrite(String fileName) {

		FileReaderTxt j=new FileReaderTxt()
		//
		//
		String f=	j.getCurrentDirectory(fileName)
		//		File newFile = new File(f)
		//		newFile.createNewFile()
		//
		List <String>ff=new ArrayList<>()
		ff.add("jgs")
		ff.add("jgsjhdjhd")
		ff.add("dnbjdbnjdn")
		ff.add("bd")
		ff.add("jkjskgs")
		//
		//		String gg=newFile.write(ff)
		FileWriter FW = new FileWriter(f);
		BufferedWriter BW = new BufferedWriter(FW);

		for(int i=0;i<ff.size();i++) {

			BW.write(ff.get(i)); //Writing In To File.
			BW.newLine();
		}
		//To write next string on new line.
		//		BW.write("This Is Second Line."); //Writing In To File.
		BW.close();
		return ff
		//	List<String> lines = Arrays.asList("The first line", "The second line");
	}
}
