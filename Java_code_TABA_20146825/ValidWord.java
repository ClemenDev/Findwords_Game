
public class ValidWord{

	private String [] wordsList = {"algorithm", "application", "backup", "bit", "buffer", "bandwidth", "broadband", "bug", "binary", "browser",
	"bus", "cache", "command", "computer", "cookie", "compiler", "cyberspace", "compress", "configure", "datebase", "digital", "data", "debug",
	"desktop", "disk", "domain", "decompress", "develpment", "download", "dynamic", "email", "encryption", "firewall", "flowchart", "file", "folder",
	"graphics", "hyperlink", "host", "hardware", "icon", "inbox", "internet", "kernel", "keyword", "keyboard", "laptop", "login", "logic", "malware",
	"motherboard", "mouse", "mainframe", "memory", "monitor", "multimedia", "network", "node", "offline", "online", "path", "process", "protocol",
	"password", "phishing", "platform", "program", "portal", "privacy", "programmer", "queue", "resolution", "root", "restore", "router", "reboot",
	"runtime", "screen", "security", "shell", "snapshot", "spam", "screenshot", "server", "script", "software", "spreadsheet", "storage", "syntax",
	"table", "template", "thread", "terminal", "username", "virtual", "virus", "web", "website", "window", "wireless"};

	private String wordGiven;

	//constructors
	public ValidWord(){}

	//method to validate words inputted by the user/player
	public boolean validateWordGiven(String letterPlayer){
		boolean isCorrect = false;

		for (int i = 0; i < wordsList.length; i++){
			String letter = wordsList[i];

			//inputs valid as lower case and upper case
			if(letter.toLowerCase().equals(letterPlayer.toLowerCase())) {
				isCorrect=true;
			}
		}
		return isCorrect;
	}
}