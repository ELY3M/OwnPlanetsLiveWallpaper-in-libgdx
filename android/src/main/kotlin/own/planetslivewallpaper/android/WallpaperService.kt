package own.planetslivewallpaper.android

import android.util.Log
import com.badlogic.gdx.ApplicationListener
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration
import com.badlogic.gdx.backends.android.AndroidLiveWallpaperService
import own.planetslivewallpaper.Main


class WallpaperService : AndroidLiveWallpaperService() {

   companion object {
      private const val TAG = "WallpaperService"
   }

   override fun onCreateApplication() {
      super.onCreateApplication()

      Log.i( TAG, "onCreateApplication()" )

      val config = AndroidApplicationConfiguration()
      val listener: ApplicationListener = Main()

      initialize(listener, config)

   }


/*
   class MyLiveWallpaperListener : AndroidWallpaperListener, ApplicationListener {
      private var batch: SpriteBatch? = null
      private var img: Texture? = null

      override fun offsetChange(
         xOffset: Float,
         yOffset: Float,
         xOffsetStep: Float,
         yOffsetStep: Float,
         xPixelOffset: Int,
         yPixelOffset: Int
      ) {
         Log.i(TAG,"AndroidWallpaperListener: offsetChange(xOffset:$xOffset yOffset:$yOffset xOffsetSteep:$xOffsetStep yOffsetStep:$yOffsetStep xPixelOffset:$xPixelOffset yPixelOffset:$yPixelOffset)")
      }

      override fun previewStateChange(isPreview: Boolean) {
         Log.i(TAG, "AndroidWallpaperListener: previewStateChange(isPreview:$isPreview)")
      }

      override fun iconDropped(x: Int, y: Int) {
         Log.i(TAG, "AndroidWallpaperListener:  iconDropped ($x, $y)")
      }

      override fun create() {
         Log.i(TAG, "ApplicationListener: create")

         batch = SpriteBatch()
         img = Texture("background.png")
      }

      override fun resize(width: Int, height: Int) {
         Log.i(TAG, "ApplicationListener: resize")
      }

      override fun render() {
         Log.i(TAG, "ApplicationListener: render")

         ScreenUtils.clear(0f, 0f, 1f, 1f)
         batch!!.begin()
         batch!!.draw(img, 0f, 0f)
         batch!!.end()



      }

      override fun pause() {
         Log.i(TAG, "ApplicationListener: pause")
      }

      override fun resume() {
         Log.i(TAG, "ApplicationListener: resume")
      }

      override fun dispose() {
         Log.i(TAG, "ApplicationListener: dispose")
      }
   }
*/

}
