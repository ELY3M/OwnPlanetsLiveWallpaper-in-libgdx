package own.planetslivewallpaper

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.math.MathUtils
import kotlin.math.cos
import kotlin.math.sin
import kotlin.random.Random

class Planet(windowWidth: Int, windowHeight: Int, image: Texture) {
    var x: Float = MathUtils.random(0, windowWidth).toFloat()
    var y: Float = MathUtils.random(0, windowHeight).toFloat()

    // Direction components (normalized-ish: -1..1)
    private var xDir: Float = 0f
    private var yDir: Float = 0f

    var width: Int = image.width
    var height: Int = image.height

    // Keep as Float for smooth rotation
    var rotation: Float = 0f
    var clockwise: Boolean = Random.nextBoolean()

    init {
        randomizeDirection()
    }

    private fun randomizeDirection() {
        val angle = Random.nextFloat() * (Math.PI * 2f).toFloat()
        xDir = cos(angle)
        yDir = sin(angle)
    }

    fun update(windowWidth: Int, windowHeight: Int) {
        val delta = Gdx.graphics.deltaTime

        // Move with frame-rate independence
        x += xDir * SPEED_MULTIPLIER * delta
        y += yDir * SPEED_MULTIPLIER * delta

        var bounced = false

        if (x < -BOUNDARY_MARGIN) {
            x = -BOUNDARY_MARGIN
            bounced = true
        } else if (x > windowWidth + BOUNDARY_MARGIN) {
            x = windowWidth + BOUNDARY_MARGIN
            bounced = true
        }

        if (y < -BOUNDARY_MARGIN) {
            y = -BOUNDARY_MARGIN
            bounced = true
        } else if (y > windowHeight + BOUNDARY_MARGIN) {
            y = windowHeight + BOUNDARY_MARGIN
            bounced = true
        }

        // Only change direction on boundary hit (not every frame)
        if (bounced) {
            randomizeDirection()
            clockwise = Random.nextBoolean()
        }

        // Smooth frame-rate independent rotation
        if (clockwise) {
            rotation -= ROTATION_SPEED * delta
        } else {
            rotation += ROTATION_SPEED * delta
        }
    }

    fun draw(batch: SpriteBatch, region: TextureRegion?, scale: Float) {
        batch.enableBlending()
        batch.draw(region, x, y, width / 2f, height / 2f, width.toFloat(), height.toFloat(), scale, scale, rotation, clockwise)

    }

    companion object {
        // Tune this value: lower = slower
        // 30f = slow drift, 60f = medium, 100f = faster
        private const val SPEED_MULTIPLIER = 15f   // try 10f..40f
        private const val ROTATION_SPEED = 30f     // degrees/second
        private const val BOUNDARY_MARGIN = 50f

    }
}
