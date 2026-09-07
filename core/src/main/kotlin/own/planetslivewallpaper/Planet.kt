package own.planetslivewallpaper

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.math.MathUtils


class Planet(windowWidth: Int, windowHeight: Int, image: Texture) {
    var x: Float
    var y: Float
    var xSpeed: Float = 1f
    var ySpeed: Float = 1f
    var Width: Int
    var Height: Int
    var rotation: Int = 0
    var clockwise: Boolean = false

    init {
        this.x = MathUtils.random(0, windowWidth).toFloat()
        this.y = MathUtils.random(0, windowHeight).toFloat()

        // Base direction/speed

        Width = image.width
        Height = image.height
    }

    fun update(windowWidth: Int, windowHeight: Int) {
        val delta = Gdx.graphics.deltaTime

        // Frame-rate independent movement
        x += xSpeed * SPEED_MULTIPLIER * delta
        y += ySpeed * SPEED_MULTIPLIER * delta

        if (x < -50 || x > windowWidth + 50) {
            xSpeed = -xSpeed
            clockwise = true
        }
        if (y < -50 || y > windowHeight + 50) {
            ySpeed = -ySpeed
            clockwise = false
        }

        // Frame-rate independent rotation
        if (!clockwise) {
            rotation += (ROTATION_SPEED * delta).toInt()
        } else {
            rotation -= (ROTATION_SPEED * delta).toInt()
        }
    }

    fun draw(batch: SpriteBatch, imager: TextureRegion?) {
        batch.enableBlending()
        batch.draw(imager, x, y, Width / 2f, Height / 2f, Width.toFloat(), Height.toFloat(), 1.0f, 1.0f, rotation.toFloat(), clockwise)
    }

    companion object {
        // Tune this value: lower = slower
        // 30f = slow drift, 60f = medium, 100f = faster
        private const val SPEED_MULTIPLIER = 8f //35f;
        private const val ROTATION_SPEED = 60f // degrees per second
    }
}
