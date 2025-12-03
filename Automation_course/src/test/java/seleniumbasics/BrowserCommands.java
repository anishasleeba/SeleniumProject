package seleniumbasics;

public class BrowserCommands extends Base{
	
	public void browserCommands() {
		
//		String title =driver.getTitle();
//		System.out.println(title);   //get title of current page
		
//		String currenturl = driver.getCurrentUrl();
//		System.out.println(currenturl);    //get url of current page
		
		String pagesource= driver.getPageSource();
		System.out.println(pagesource);    //get the html source code for current page

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserCommands browsercommands =new BrowserCommands();
		browsercommands.initialiseBrowser();
		browsercommands.browserCommands();
		browsercommands.close();
	}

}
