import java.nio.file.Path
import java.nio.file.Paths
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.util.KeywordUtil



public class FileReaderTxt {

	String fileName;
	String fileType;
	String filePath;

	@Keyword
	public String FileUtilsReader(String fileName) {


		//return content of text file as String
		String fileLocation = getCurrentDirectory(fileName);
		File file = new File(fileLocation)
		String fileContents = file.getText()
		println "content is "+fileContents
		//logic to read content
		return fileContents;
	}

	@Keyword
	public String getCurrentDirectory(String path) {

		Path directoryPath = Paths.get(RunConfiguration.getProjectDir()+path)
		String downloadDirectory = directoryPath.toString()
		KeywordUtil.logInfo("Default download folder path "+downloadDirectory)
		return downloadDirectory
	}
}


