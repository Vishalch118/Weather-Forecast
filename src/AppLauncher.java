import javax.swing.*;

public class AppLauncher {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                // display our weather forecast system gui
                new WeatherAppGui().setVisible(true);
            }
        });
    }
}