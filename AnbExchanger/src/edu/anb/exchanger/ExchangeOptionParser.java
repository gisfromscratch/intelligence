package edu.anb.exchanger;

/**
 * Parses the options for the exchanger.
 * 
 * @author J.T.
 *
 */
class ExchangeOptionParser {
	
	boolean hasOption(String[] arguments, ExchangeArgumentType argumentType) {
		for (String argument : arguments) {
			if (argument.startsWith(argumentType.getPrefix())) {
				return true;
			}
		}
		return false;
	}
	
	String getOption(String[] arguments, ExchangeArgumentType argumentType) {
		return getOption(arguments, String.format("%s=", argumentType.getPrefix()));
	}
	
	private String getOption(String[] arguments, String optionPrefix) {
		for (String argument : arguments) {
			if (argument.startsWith(optionPrefix)) {
				return getSuffix(argument, optionPrefix);
			}
		}
		
		return null;
	}
	
	private String getSuffix(String value, String prefix) {
		String[] splitted = value.split(prefix);
		if (2 != splitted.length) {
			return null;
		}
		
		return splitted[1];
	}
}
