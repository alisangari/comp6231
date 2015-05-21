import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/**
 * @author Alexandre Hudon
 * @date 18/09/2013
 * RMI-Tutorial, COMP 6231 - Text Scrambler Server
 * This class needs to be modified by the students in order to define it as a Java RMI Server.
 * Provides the implementation of the TextScramblerInterface.
 */
public class TextScramblerServerImplementation extends UnicastRemoteObject implements TextScramblerServerInterface 
{
	public TextScramblerServerImplementation() throws RemoteException {
		// TODO Auto-generated constructor stub
	}
	@Override //Return input text as-is.
	public String testInputText(String inputText) {
		
		return "Your input text is: " + inputText;
	}

	@Override //Return the string reversed.
	public String reverse(String inputText) {
		String reversedInput = "";
		for(int i=0; i<inputText.length();i++)
		{
			reversedInput=reversedInput+inputText.charAt((inputText.length()-1)-i);
		}
		return "Result: "+reversedInput;
	}

	@Override //Return the string scrambled.
	public String scramble(String inputText) {
		String scrambledInput="";

		for(int i=0; i<inputText.length();i++)
		{
			if(i%2==0)
			{
				scrambledInput=scrambledInput+inputText.charAt(i);
			}
			else
			{
				scrambledInput=inputText.charAt(i)+scrambledInput;
			}
		}
		return "Result: "+scrambledInput;
	}
}
