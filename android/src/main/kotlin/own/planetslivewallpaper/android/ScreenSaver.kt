package own.planetslivewallpaper.android

/*
import com.badlogic.gdx.backends.android.AndroidApplicationBase
import com.badlogic.gdx.backends.android.AndroidApplication
import android.service.dreams.DreamService
import com.badlogic.gdx.ApplicationListener
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration
import com.badlogic.gdx.backends.android.AndroidGraphics
import own.planetslivewallpaper.Main


class Screensaver : DreamService(), ApplicationListener {

    private lateinit var graphics: AndroidGraphics
    private lateinit var listener: ApplicationListener
    private val config = AndroidApplicationConfiguration()

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()

        // Enable user interaction if your screensaver is interactive
        isInteractive = false
        // Request fullscreen window layout
        isFullscreen = true

        // Initialize libGDX configuration
        config.useGL30 = false

        // Initialize the graphics surface manually
       ///graphics = AndroidGraphics(, config, config.resolutionStrategy)

        // Bind the service life cycle into the view hierarchy
        //setContentView(graphics.view)

        //initialize(Main(), config)
        val config = AndroidApplicationConfiguration()
        listener = Main()

        // Manually initialize the view instead of calling initialize()
        val view = initializeForView(listener, config)
        setContentView(view)

    }

    override fun onDreamingStarted() {
        super.onDreamingStarted()
        // Resume game loops or engines here if needed
    }

    override fun onDreamingStopped() {
        super.onDreamingStopped()
        // Pause resource allocations safely
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        // Clear GL references and contexts safely
    }


    // --- libGDX ApplicationListener Lifecycle Methods ---
    override fun create() {
        //val config = AndroidApplicationConfiguration()
        //initialize(Main(), config)
        // Initialize shaders, textures, or cameras here
    }

    override fun resize(width: Int, height: Int) {}

    override fun render() {
        // Clear screen and draw your canvas
        // Example: Gdx.gl.glClearColor(0f, 0f, 0f, 1f)
    }

    override fun pause() {}

    override fun resume() {}

    override fun dispose() {}

}
*/


import android.service.dreams.DreamService
import android.view.View
import com.badlogic.gdx.ApplicationListener
import com.badlogic.gdx.backends.android.AndroidApplication
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration
import own.planetslivewallpaper.Main

class Screensaver : DreamService() {

    private lateinit var Listener: ApplicationListener

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()

        isInteractive = false
        isFullscreen = true

        val config = AndroidApplicationConfiguration()
        Listener = Main() // Replace with your main game class

        // Create an anonymous AndroidApplication delegate to call initializeForView
        val appDelegate = object : AndroidApplication() {
            fun createGdxView(): View {
                // Now initializeForView can be successfully called here
                return initializeForView(Listener, config)
            }
        }

        // Fetch the generated surface view and apply it to the DreamService
        val gdxView = appDelegate.createGdxView()
        setContentView(gdxView)
    }
}

