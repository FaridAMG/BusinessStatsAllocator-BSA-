package source;

import org.dizitart.no2.Nitrite;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class DatabaseManager {

	@SuppressWarnings("unused")
	private Nitrite DataBase;

	public DatabaseManager() {
		super();
		DataBase = Nitrite.builder()
				.compressed()
		        .filePath(System.getProperty("user.dir")+"/src/main/resources/test.db")
		        .openOrCreate("user", "password");
	}
	
	public void tryMe() {
		
	}
	
}
