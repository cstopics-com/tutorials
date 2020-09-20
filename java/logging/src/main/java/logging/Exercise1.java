package logging;

public class Exercise1 {

	static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(Exercise1.class);
	
	public static void main( String[] args ) throws Exception {
	
		logger.info("This is an info message");
		logger.error("This is an error message");
		logger.debug("Here is a debug message");
	}
	 
}
