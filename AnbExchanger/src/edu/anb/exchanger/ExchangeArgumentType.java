package edu.anb.exchanger;

/**
 * Defines the type of arguments.
 * 
 * @author J.T.
 *
 */
enum ExchangeArgumentType {
	InputFile ("-f"),
	EntityType ("-e"),
	Icon ("-i"),
	IdAttribute ("-id"),
	Header ("-head"),
	Separator ("-sep"),
	LabelAttribute ("-l");
	
	private final String argumentPrefix;
	
	private ExchangeArgumentType(String prefix) {
		argumentPrefix = prefix;
	}
	
	String getPrefix() {
		return argumentPrefix;
	}
}
