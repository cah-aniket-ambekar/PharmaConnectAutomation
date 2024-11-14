import com.kms.katalon.core.annotation.Keyword

public class FileUtils{

	//@Keyword
	public FileUtils(String filePath) {
	}
	
	
	//return content of text file as String
	@Keyword
	def String getTextFileContent(String filePath) {


		File file = new File(filePath)
		String fileContents = file.getText()
		//logic to read content
		return fileContents;
	}
}

