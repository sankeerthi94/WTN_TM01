package services;
import screens.FileOptionsScreen;
import screens.Screen;
import screens.Welcome;

public class ScreenService {
	
 public static Welcome Welcome = new Welcome();
    public static FileOptionsScreen FileOptionsScreen = new FileOptionsScreen();
    
    public static Screen CurrentScreen = Welcome;
 
    public static Screen getCurrentScreen() {
        return CurrentScreen;
    }

    public static void setCurrentScreen(Screen currentScreen) {
        CurrentScreen = currentScreen;
    }  
}