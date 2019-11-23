package day5;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.event.KeyEvent;

public class StringSelection {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		//code for the copy task
	//	StringSelection = new StringSelection("C:\\Users\\Nilesh\\Desktop\\website\\image\\logo.jpg");
		Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
	//	clip.setContents(selection, selection);
		
		Robot r = new Robot();
		
		//open the notepad file
		Runtime runtime = Runtime.getRuntime();
		//runtime.exec("C:\\Windows\\system\\notepad.exe");
		Thread.sleep(2000);
		//
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
	}

}
