package com.lockedme;

public class LockedMe {

public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
		FileOperations.createMainFolderIfNotPresent("main");
		
		MenuOptions.printWelcomeScreen("LockedMe", "Sayandip Guha");
		
		HandleOptions.handleWelcomeScreenInput();
	}

	
}
