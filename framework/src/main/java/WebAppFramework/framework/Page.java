package WebAppFramework.framework;

public class Page extends SuperAction{
	
	public static void LoadPage(String url) {
		
		driver.get(url);
		
	}
	
	public static String getTitle() {
		try {
		return driver.getTitle();}
		catch(Throwable th) {
			
		}
		return null;
	}
	
	public static void RefreshPage() {
		
		driver.navigate().refresh();
		
	}

}
