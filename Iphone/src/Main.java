//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Iphone iphone2007 = new Iphone();

        // Testando funcionalidades
        iphone2007.makeCall("Steve Jobs");
        iphone2007.play();
        iphone2007.openUrl("http://apple.com");
        iphone2007.createPlaylist("Classic Rock");
    }
}