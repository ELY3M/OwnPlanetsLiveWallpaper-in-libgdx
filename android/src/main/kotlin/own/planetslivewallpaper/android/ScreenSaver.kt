package own.planetslivewallpaper.android

public class ScreenSaver extends AndroidDaydream {
    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setInteractive(true);

        AndroidApplicationConfiguration cfg = new AndroidApplicationConfiguration();
        initialize(new Main(), cfg);
    }
}
