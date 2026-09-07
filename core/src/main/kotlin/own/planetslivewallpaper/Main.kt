package own.planetslivewallpaper

import com.badlogic.gdx.Application
import com.badlogic.gdx.Application.ApplicationType
import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.OrthographicCamera
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.utils.ScreenUtils
import com.badlogic.gdx.utils.viewport.FitViewport


class Main : ApplicationAdapter() {
    //1,080px × 2,404px
    var windowWidth: Int = 1000
    var windowHeight: Int = 1000
    var scale: Float = 1f
    var background: Texture? = null
    var alien3: Texture? = null
    var alien4: Texture? = null
    var asteroid1: Texture? = null
    var asteroid2: Texture? = null
    var asteroid3: Texture? = null
    var asteroid4: Texture? = null
    var asteroid5: Texture? = null
    var bluemouse: Texture? = null
    var element1: Texture? = null
    var element10: Texture? = null
    var element11: Texture? = null
    var element12: Texture? = null
    var element13: Texture? = null
    var element14: Texture? = null
    var element15: Texture? = null
    var element16: Texture? = null
    var element17: Texture? = null
    var element18: Texture? = null
    var element19: Texture? = null
    var element2: Texture? = null
    var element20: Texture? = null
    var element21: Texture? = null
    var element22: Texture? = null
    var element23: Texture? = null
    var element24: Texture? = null
    var element25: Texture? = null
    var element26: Texture? = null
    var element27: Texture? = null
    var element28: Texture? = null
    var element29: Texture? = null
    var element3: Texture? = null
    var element30: Texture? = null
    var element31: Texture? = null
    var element4: Texture? = null
    var element5: Texture? = null
    var element6: Texture? = null
    var element7: Texture? = null
    var element8: Texture? = null
    var element9: Texture? = null
    var firefly: Texture? = null
    var largemoon: Texture? = null
    var light: Texture? = null
    var lightoff: Texture? = null
    var lighton: Texture? = null
    var moon: Texture? = null
    var pixelfly: Texture? = null
    var planet1: Texture? = null
    var planet10: Texture? = null
    var planet11: Texture? = null
    var planet12: Texture? = null
    var planet13: Texture? = null
    var planet2: Texture? = null
    var planet3: Texture? = null
    var planet4: Texture? = null
    var planet5: Texture? = null
    var planet6: Texture? = null
    var planet7: Texture? = null
    var planet8: Texture? = null
    var planet9: Texture? = null
    var star32: Texture? = null
    var tinyufo: Texture? = null


    var alien3r: TextureRegion? = null
    var alien4r: TextureRegion? = null
    var asteroid1r: TextureRegion? = null
    var asteroid2r: TextureRegion? = null
    var asteroid3r: TextureRegion? = null
    var asteroid4r: TextureRegion? = null
    var asteroid5r: TextureRegion? = null
    var bluemouser: TextureRegion? = null
    var element1r: TextureRegion? = null
    var element10r: TextureRegion? = null
    var element11r: TextureRegion? = null
    var element12r: TextureRegion? = null
    var element13r: TextureRegion? = null
    var element14r: TextureRegion? = null
    var element15r: TextureRegion? = null
    var element16r: TextureRegion? = null
    var element17r: TextureRegion? = null
    var element18r: TextureRegion? = null
    var element19r: TextureRegion? = null
    var element2r: TextureRegion? = null
    var element20r: TextureRegion? = null
    var element21r: TextureRegion? = null
    var element22r: TextureRegion? = null
    var element23r: TextureRegion? = null
    var element24r: TextureRegion? = null
    var element25r: TextureRegion? = null
    var element26r: TextureRegion? = null
    var element27r: TextureRegion? = null
    var element28r: TextureRegion? = null
    var element29r: TextureRegion? = null
    var element3r: TextureRegion? = null
    var element30r: TextureRegion? = null
    var element31r: TextureRegion? = null
    var element4r: TextureRegion? = null
    var element5r: TextureRegion? = null
    var element6r: TextureRegion? = null
    var element7r: TextureRegion? = null
    var element8r: TextureRegion? = null
    var element9r: TextureRegion? = null
    var fireflyr: TextureRegion? = null
    var largemoonr: TextureRegion? = null
    var lightr: TextureRegion? = null
    var lightoffr: TextureRegion? = null
    var lightonr: TextureRegion? = null
    var moonr: TextureRegion? = null
    var pixelflyr: TextureRegion? = null
    var planet1r: TextureRegion? = null
    var planet10r: TextureRegion? = null
    var planet11r: TextureRegion? = null
    var planet12r: TextureRegion? = null
    var planet13r: TextureRegion? = null
    var planet2r: TextureRegion? = null
    var planet3r: TextureRegion? = null
    var planet4r: TextureRegion? = null
    var planet5r: TextureRegion? = null
    var planet6r: TextureRegion? = null
    var planet7r: TextureRegion? = null
    var planet8r: TextureRegion? = null
    var planet9r: TextureRegion? = null
    var star32r: TextureRegion? = null
    var tinyufor: TextureRegion? = null


    var batch: SpriteBatch? = null
    var camera: OrthographicCamera? = null
    var viewport: FitViewport? = null

    var alien3s: ArrayList<Planet> = ArrayList<Planet>()
    var alien4s: ArrayList<Planet> = ArrayList<Planet>()
    var asteroid1s: ArrayList<Planet> = ArrayList<Planet>()
    var asteroid2s: ArrayList<Planet> = ArrayList<Planet>()
    var asteroid3s: ArrayList<Planet> = ArrayList<Planet>()
    var asteroid4s: ArrayList<Planet> = ArrayList<Planet>()
    var asteroid5s: ArrayList<Planet> = ArrayList<Planet>()
    var bluemouses: ArrayList<Planet> = ArrayList<Planet>()
    var element1s: ArrayList<Planet> = ArrayList<Planet>()
    var element10s: ArrayList<Planet> = ArrayList<Planet>()
    var element11s: ArrayList<Planet> = ArrayList<Planet>()
    var element12s: ArrayList<Planet> = ArrayList<Planet>()
    var element13s: ArrayList<Planet> = ArrayList<Planet>()
    var element14s: ArrayList<Planet> = ArrayList<Planet>()
    var element15s: ArrayList<Planet> = ArrayList<Planet>()
    var element16s: ArrayList<Planet> = ArrayList<Planet>()
    var element17s: ArrayList<Planet> = ArrayList<Planet>()
    var element18s: ArrayList<Planet> = ArrayList<Planet>()
    var element19s: ArrayList<Planet> = ArrayList<Planet>()
    var element2s: ArrayList<Planet> = ArrayList<Planet>()
    var element20s: ArrayList<Planet> = ArrayList<Planet>()
    var element21s: ArrayList<Planet> = ArrayList<Planet>()
    var element22s: ArrayList<Planet> = ArrayList<Planet>()
    var element23s: ArrayList<Planet> = ArrayList<Planet>()
    var element24s: ArrayList<Planet> = ArrayList<Planet>()
    var element25s: ArrayList<Planet> = ArrayList<Planet>()
    var element26s: ArrayList<Planet> = ArrayList<Planet>()
    var element27s: ArrayList<Planet> = ArrayList<Planet>()
    var element28s: ArrayList<Planet> = ArrayList<Planet>()
    var element29s: ArrayList<Planet> = ArrayList<Planet>()
    var element3s: ArrayList<Planet> = ArrayList<Planet>()
    var element30s: ArrayList<Planet> = ArrayList<Planet>()
    var element31s: ArrayList<Planet> = ArrayList<Planet>()
    var element4s: ArrayList<Planet> = ArrayList<Planet>()
    var element5s: ArrayList<Planet> = ArrayList<Planet>()
    var element6s: ArrayList<Planet> = ArrayList<Planet>()
    var element7s: ArrayList<Planet> = ArrayList<Planet>()
    var element8s: ArrayList<Planet> = ArrayList<Planet>()
    var element9s: ArrayList<Planet> = ArrayList<Planet>()
    var fireflys: ArrayList<Planet> = ArrayList<Planet>()
    var largemoons: ArrayList<Planet> = ArrayList<Planet>()
    var lights: ArrayList<Planet> = ArrayList<Planet>()
    var lightoffs: ArrayList<Planet> = ArrayList<Planet>()
    var lightons: ArrayList<Planet> = ArrayList<Planet>()
    var moons: ArrayList<Planet> = ArrayList<Planet>()
    var pixelflys: ArrayList<Planet> = ArrayList<Planet>()
    var planet1s: ArrayList<Planet> = ArrayList<Planet>()
    var planet10s: ArrayList<Planet> = ArrayList<Planet>()
    var planet11s: ArrayList<Planet> = ArrayList<Planet>()
    var planet12s: ArrayList<Planet> = ArrayList<Planet>()
    var planet13s: ArrayList<Planet> = ArrayList<Planet>()
    var planet2s: ArrayList<Planet> = ArrayList<Planet>()
    var planet3s: ArrayList<Planet> = ArrayList<Planet>()
    var planet4s: ArrayList<Planet> = ArrayList<Planet>()
    var planet5s: ArrayList<Planet> = ArrayList<Planet>()
    var planet6s: ArrayList<Planet> = ArrayList<Planet>()
    var planet7s: ArrayList<Planet> = ArrayList<Planet>()
    var planet8s: ArrayList<Planet> = ArrayList<Planet>()
    var planet9s: ArrayList<Planet> = ArrayList<Planet>()
    var star32s: ArrayList<Planet> = ArrayList<Planet>()
    var tinyufos: ArrayList<Planet> = ArrayList<Planet>()

    override fun create() {
        print("create()\n")
        windowWidth = Gdx.app.graphics.width
        windowHeight = Gdx.app.graphics.height

        print("Gdx.app.graphics.width: ${Gdx.app.graphics.width}  Gdx.app.graphics.height: ${Gdx.app.graphics.height}\n")
        print("windowWidth: $windowWidth  windowHeight: $windowHeight\n")

        if (Gdx.app.type == ApplicationType.Android) {
            scale = 3f
        } else if (Gdx.app.type == ApplicationType.iOS) {
            scale = 3f
        } else if (Gdx.app.type == ApplicationType.Desktop) {
            scale = 1f
        } else if (Gdx.app.type == ApplicationType.WebGL) {
            scale = 1f
        }

        print("Gdx.app.getType():  ${Gdx.app.type}  scale: $scale")

        background = Texture("background-test.png")
        alien3 = Texture("alien3.png")
        alien4 = Texture("alien4.png")
        asteroid1 = Texture("asteroid1.png")
        asteroid2 = Texture("asteroid2.png")
        asteroid3 = Texture("asteroid3.png")
        asteroid4 = Texture("asteroid4.png")
        asteroid5 = Texture("asteroid5.png")
        bluemouse = Texture("bluemouse.png")
        element1 = Texture("element1.png")
        element10 = Texture("element10.png")
        element11 = Texture("element11.png")
        element12 = Texture("element12.png")
        element13 = Texture("element13.png")
        element14 = Texture("element14.png")
        element15 = Texture("element15.png")
        element16 = Texture("element16.png")
        element17 = Texture("element17.png")
        element18 = Texture("element18.png")
        element19 = Texture("element19.png")
        element2 = Texture("element2.png")
        element20 = Texture("element20.png")
        element21 = Texture("element21.png")
        element22 = Texture("element22.png")
        element23 = Texture("element23.png")
        element24 = Texture("element24.png")
        element25 = Texture("element25.png")
        element26 = Texture("element26.png")
        element27 = Texture("element27.png")
        element28 = Texture("element28.png")
        element29 = Texture("element29.png")
        element3 = Texture("element3.png")
        element30 = Texture("element30.png")
        element31 = Texture("element31.png")
        element4 = Texture("element4.png")
        element5 = Texture("element5.png")
        element6 = Texture("element6.png")
        element7 = Texture("element7.png")
        element8 = Texture("element8.png")
        element9 = Texture("element9.png")
        firefly = Texture("firefly.png")
        largemoon = Texture("largemoon.png")
        light = Texture("light.png")
        lightoff = Texture("lightoff.png")
        lighton = Texture("lighton.png")
        moon = Texture("moon.png")
        pixelfly = Texture("pixelfly.png")
        planet1 = Texture("planet1.png")
        planet10 = Texture("planet10.png")
        planet11 = Texture("planet11.png")
        planet12 = Texture("planet12.png")
        planet13 = Texture("planet13.png")
        planet2 = Texture("planet2.png")
        planet3 = Texture("planet3.png")
        planet4 = Texture("planet4.png")
        planet5 = Texture("planet5.png")
        planet6 = Texture("planet6.png")
        planet7 = Texture("planet7.png")
        planet8 = Texture("planet8.png")
        planet9 = Texture("planet9.png")
        star32 = Texture("star32.png")
        tinyufo = Texture("tinyufo.png")


        alien3r = TextureRegion(alien3)
        alien4r = TextureRegion(alien4)
        asteroid1r = TextureRegion(asteroid1)
        asteroid2r = TextureRegion(asteroid2)
        asteroid3r = TextureRegion(asteroid3)
        asteroid4r = TextureRegion(asteroid4)
        asteroid5r = TextureRegion(asteroid5)
        bluemouser = TextureRegion(bluemouse)
        element1r = TextureRegion(element1)
        element10r = TextureRegion(element10)
        element11r = TextureRegion(element11)
        element12r = TextureRegion(element12)
        element13r = TextureRegion(element13)
        element14r = TextureRegion(element14)
        element15r = TextureRegion(element15)
        element16r = TextureRegion(element16)
        element17r = TextureRegion(element17)
        element18r = TextureRegion(element18)
        element19r = TextureRegion(element19)
        element2r = TextureRegion(element2)
        element20r = TextureRegion(element20)
        element21r = TextureRegion(element21)
        element22r = TextureRegion(element22)
        element23r = TextureRegion(element23)
        element24r = TextureRegion(element24)
        element25r = TextureRegion(element25)
        element26r = TextureRegion(element26)
        element27r = TextureRegion(element27)
        element28r = TextureRegion(element28)
        element29r = TextureRegion(element29)
        element3r = TextureRegion(element3)
        element30r = TextureRegion(element30)
        element31r = TextureRegion(element31)
        element4r = TextureRegion(element4)
        element5r = TextureRegion(element5)
        element6r = TextureRegion(element6)
        element7r = TextureRegion(element7)
        element8r = TextureRegion(element8)
        element9r = TextureRegion(element9)
        fireflyr = TextureRegion(firefly)
        largemoonr = TextureRegion(largemoon)
        lightr = TextureRegion(light)
        lightoffr = TextureRegion(lightoff)
        lightonr = TextureRegion(lighton)
        moonr = TextureRegion(moon)
        pixelflyr = TextureRegion(pixelfly)
        planet1r = TextureRegion(planet1)
        planet10r = TextureRegion(planet10)
        planet11r = TextureRegion(planet11)
        planet12r = TextureRegion(planet12)
        planet13r = TextureRegion(planet13)
        planet2r = TextureRegion(planet2)
        planet3r = TextureRegion(planet3)
        planet4r = TextureRegion(planet4)
        planet5r = TextureRegion(planet5)
        planet6r = TextureRegion(planet6)
        planet7r = TextureRegion(planet7)
        planet8r = TextureRegion(planet8)
        planet9r = TextureRegion(planet9)
        star32r = TextureRegion(star32)
        tinyufor = TextureRegion(tinyufo)


        // create the camera and the SpriteBatch
        camera = OrthographicCamera(windowWidth.toFloat(), windowHeight.toFloat())
        viewport = FitViewport(windowWidth.toFloat(), windowHeight.toFloat(), camera)
        batch = SpriteBatch()


        if (Gdx.app.type == ApplicationType.Android || Gdx.app.type == ApplicationType.iOS) {
            for (i in 0..15) {
                element1s.add(Planet(windowWidth, windowHeight, element1!!))
            }
            for (i in 0..6) {
                element2s.add(Planet(windowWidth, windowHeight, element2!!))
            }
            for (i in 0..1) {
                element3s.add(Planet(windowWidth, windowHeight, element3!!))
            }
            for (i in 0..1) {
                element4s.add(Planet(windowWidth, windowHeight, element4!!))
            }
            for (i in 0..1) {
                element5s.add(Planet(windowWidth, windowHeight, element5!!))
            }
            for (i in 0..1) {
                element6s.add(Planet(windowWidth, windowHeight, element6!!))
            }
            for (i in 0..1) {
                element7s.add(Planet(windowWidth, windowHeight, element7!!))
            }
            for (i in 0..1) {
                element8s.add(Planet(windowWidth, windowHeight, element8!!))
            }
            for (i in 0..1) {
                element9s.add(Planet(windowWidth, windowHeight, element9!!))
            }
            for (i in 0..1) {
                element10s.add(Planet(windowWidth, windowHeight, element10!!))
            }
            for (i in 0..1) {
                element10s.add(Planet(windowWidth, windowHeight, element11!!))
            }
            for (i in 0..1) {
                element10s.add(Planet(windowWidth, windowHeight, element12!!))
            }
            for (i in 0..1) {
                element10s.add(Planet(windowWidth, windowHeight, element13!!))
            }
            for (i in 0..1) {
                element10s.add(Planet(windowWidth, windowHeight, element14!!))
            }
            for (i in 0..1) {
                element10s.add(Planet(windowWidth, windowHeight, element15!!))
            }
            for (i in 0..1) {
                element10s.add(Planet(windowWidth, windowHeight, element16!!))
            }
            for (i in 0..1) {
                bluemouses.add(Planet(windowWidth, windowHeight, bluemouse!!))
            }
            for (i in 0..1) {
                star32s.add(Planet(windowWidth, windowHeight, star32!!))
            }
            for (i in 0..1) {
                moons.add(Planet(windowWidth, windowHeight, moon!!))
            }
            for (i in 0..1) {
                largemoons.add(Planet(windowWidth, windowHeight, largemoon!!))
            }
            for (i in 0..1) {
                fireflys.add(Planet(windowWidth, windowHeight, firefly!!))
            }
            for (i in 0..1) {
                lights.add(Planet(windowWidth, windowHeight, light!!))
            }
            for (i in 0..1) {
                lightons.add(Planet(windowWidth, windowHeight, lighton!!))
            }
            for (i in 0..1) {
                lightoffs.add(Planet(windowWidth, windowHeight, lightoff!!))
            }
            for (i in 0..1) {
                pixelflys.add(Planet(windowWidth, windowHeight, pixelfly!!))
            }
            for (i in 0..1) {
                tinyufos.add(Planet(windowWidth, windowHeight, tinyufo!!))
            }
            for (i in 0..1) {
                alien3s.add(Planet(windowWidth, windowHeight, alien3!!))
            }
            for (i in 0..1) {
                alien4s.add(Planet(windowWidth, windowHeight, alien4!!))
            }
            for (i in 0..1) {
                asteroid1s.add(Planet(windowWidth, windowHeight, asteroid1!!))
            }
            for (i in 0..1) {
                asteroid1s.add(Planet(windowWidth, windowHeight, asteroid2!!))
            }
            for (i in 0..1) {
                asteroid1s.add(Planet(windowWidth, windowHeight, asteroid3!!))
            }
            for (i in 0..1) {
                asteroid1s.add(Planet(windowWidth, windowHeight, asteroid4!!))
            }
            for (i in 0..1) {
                asteroid1s.add(Planet(windowWidth, windowHeight, asteroid5!!))
            }
        }

        if (Gdx.app.type == ApplicationType.Desktop || Gdx.app.type == ApplicationType.WebGL) {
            for (i in 0..59) {
                element1s.add(Planet(windowWidth, windowHeight, element1!!))
            }
            for (i in 0..14) {
                element2s.add(Planet(windowWidth, windowHeight, element2!!))
            }
            for (i in 0..4) {
                element3s.add(Planet(windowWidth, windowHeight, element3!!))
            }
            for (i in 0..4) {
                element4s.add(Planet(windowWidth, windowHeight, element4!!))
            }
            for (i in 0..4) {
                element5s.add(Planet(windowWidth, windowHeight, element5!!))
            }
            for (i in 0..4) {
                element6s.add(Planet(windowWidth, windowHeight, element6!!))
            }
            for (i in 0..4) {
                element7s.add(Planet(windowWidth, windowHeight, element7!!))
            }
            for (i in 0..4) {
                element8s.add(Planet(windowWidth, windowHeight, element8!!))
            }
            for (i in 0..4) {
                element9s.add(Planet(windowWidth, windowHeight, element9!!))
            }
            for (i in 0..4) {
                element10s.add(Planet(windowWidth, windowHeight, element10!!))
            }
            for (i in 0..4) {
                element10s.add(Planet(windowWidth, windowHeight, element11!!))
            }
            for (i in 0..4) {
                element10s.add(Planet(windowWidth, windowHeight, element12!!))
            }
            for (i in 0..4) {
                element10s.add(Planet(windowWidth, windowHeight, element13!!))
            }
            for (i in 0..4) {
                element10s.add(Planet(windowWidth, windowHeight, element14!!))
            }
            for (i in 0..4) {
                element10s.add(Planet(windowWidth, windowHeight, element15!!))
            }
            for (i in 0..4) {
                element10s.add(Planet(windowWidth, windowHeight, element16!!))
            }
            for (i in 0..2) {
                bluemouses.add(Planet(windowWidth, windowHeight, bluemouse!!))
            }
            for (i in 0..2) {
                star32s.add(Planet(windowWidth, windowHeight, star32!!))
            }
            for (i in 0..2) {
                moons.add(Planet(windowWidth, windowHeight, moon!!))
            }
            for (i in 0..2) {
                largemoons.add(Planet(windowWidth, windowHeight, largemoon!!))
            }
            for (i in 0..2) {
                fireflys.add(Planet(windowWidth, windowHeight, firefly!!))
            }
            for (i in 0..2) {
                lights.add(Planet(windowWidth, windowHeight, light!!))
            }
            for (i in 0..2) {
                lightons.add(Planet(windowWidth, windowHeight, lighton!!))
            }
            for (i in 0..2) {
                lightoffs.add(Planet(windowWidth, windowHeight, lightoff!!))
            }
            for (i in 0..2) {
                pixelflys.add(Planet(windowWidth, windowHeight, pixelfly!!))
            }
            for (i in 0..2) {
                tinyufos.add(Planet(windowWidth, windowHeight, tinyufo!!))
            }
            for (i in 0..2) {
                alien3s.add(Planet(windowWidth, windowHeight, alien3!!))
            }
            for (i in 0..2) {
                alien4s.add(Planet(windowWidth, windowHeight, alien4!!))
            }
            for (i in 0..1) {
                asteroid1s.add(Planet(windowWidth, windowHeight, asteroid1!!))
            }
            for (i in 0..1) {
                asteroid1s.add(Planet(windowWidth, windowHeight, asteroid2!!))
            }
            for (i in 0..1) {
                asteroid1s.add(Planet(windowWidth, windowHeight, asteroid3!!))
            }
            for (i in 0..1) {
                asteroid1s.add(Planet(windowWidth, windowHeight, asteroid4!!))
            }
            for (i in 0..1) {
                asteroid1s.add(Planet(windowWidth, windowHeight, asteroid5!!))
            }
        }










    }

    override fun resize(width: Int, height: Int) {
        viewport!!.update(width, height, true)
        batch!!.setProjectionMatrix(camera!!.combined)
    }


    override fun render() {
        ScreenUtils.clear(0f, 0f, 0f, 1f)
        camera!!.update()
        batch!!.setProjectionMatrix(camera!!.combined)


        batch!!.begin()
        batch!!.enableBlending()
        batch!!.draw(background, 0f, 0f, windowWidth.toFloat(), windowHeight.toFloat())



        for (element in element1s) {
            element.update(windowWidth, windowHeight)
            element.draw(batch!!, element1r, scale)
        }
        for (element in element2s) {
            element.update(windowWidth, windowHeight)
            element.draw(batch!!, element2r, scale)
        }
        for (element in element3s) {
            element.update(windowWidth, windowHeight)
            element.draw(batch!!, element3r, scale)
        }
        for (element in element4s) {
            element.update(windowWidth, windowHeight)
            element.draw(batch!!, element4r, scale)
        }
        for (element in element5s) {
            element.update(windowWidth, windowHeight)
            element.draw(batch!!, element5r, scale)
        }
        for (element in element6s) {
            element.update(windowWidth, windowHeight)
            element.draw(batch!!, element6r, scale)
        }
        for (element in element7s) {
            element.update(windowWidth, windowHeight)
            element.draw(batch!!, element7r, scale)
        }
        for (element in element8s) {
            element.update(windowWidth, windowHeight)
            element.draw(batch!!, element8r, scale)
        }
        for (element in element9s) {
            element.update(windowWidth, windowHeight)
            element.draw(batch!!, element9r, scale)
        }
        for (element in element10s) {
            element.update(windowWidth, windowHeight)
            element.draw(batch!!, element10r, scale)
        }
        for (element in element11s) {
            element.update(windowWidth, windowHeight)
            element.draw(batch!!, element11r, scale)
        }
        for (element in element12s) {
            element.update(windowWidth, windowHeight)
            element.draw(batch!!, element12r, scale)
        }
        for (element in element13s) {
            element.update(windowWidth, windowHeight)
            element.draw(batch!!, element13r, scale)
        }
        for (element in element14s) {
            element.update(windowWidth, windowHeight)
            element.draw(batch!!, element14r, scale)
        }
        for (element in element15s) {
            element.update(windowWidth, windowHeight)
            element.draw(batch!!, element15r, scale)
        }
        for (element in element16s) {
            element.update(windowWidth, windowHeight)
            element.draw(batch!!, element16r, scale)
        }

        for (pixel in bluemouses) {
            pixel.update(windowWidth, windowHeight)
            pixel.draw(batch!!, bluemouser, scale)
        }
        for (pixel in star32s) {
            pixel.update(windowWidth, windowHeight)
            pixel.draw(batch!!, star32r, scale)
        }
        for (pixel in moons) {
            pixel.update(windowWidth, windowHeight)
            pixel.draw(batch!!, moonr, scale)
        }
        for (pixel in largemoons) {
            pixel.update(windowWidth, windowHeight)
            pixel.draw(batch!!, largemoonr, scale)
        }
        for (pixel in fireflys) {
            pixel.update(windowWidth, windowHeight)
            pixel.draw(batch!!, fireflyr, scale)
        }
        for (pixel in lights) {
            pixel.update(windowWidth, windowHeight)
            pixel.draw(batch!!, lightr, scale)
        }
        for (pixel in lightons) {
            pixel.update(windowWidth, windowHeight)
            pixel.draw(batch!!, lightonr, scale)
        }
        for (pixel in lightoffs) {
            pixel.update(windowWidth, windowHeight)
            pixel.draw(batch!!, lightoffr, scale)
        }
        for (pixel in pixelflys) {
            pixel.update(windowWidth, windowHeight)
            pixel.draw(batch!!, pixelflyr, scale)
        }

        for (ufo in tinyufos) {
            ufo.update(windowWidth, windowHeight)
            ufo.draw(batch!!, tinyufor, scale)
        }
        for (alien3 in alien3s) {
            alien3.update(windowWidth, windowHeight)
            alien3.draw(batch!!, alien3r, scale)
        }
        for (alien4 in alien4s) {
            alien4.update(windowWidth, windowHeight)
            alien4.draw(batch!!, alien4r, scale)
        }


        for (asteroid in asteroid1s) {
            asteroid.update(windowWidth, windowHeight)
            asteroid.draw(batch!!, asteroid1r, scale)
        }
        for (asteroid in asteroid2s) {
            asteroid.update(windowWidth, windowHeight)
            asteroid.draw(batch!!, asteroid2r, scale)
        }
        for (asteroid in asteroid3s) {
            asteroid.update(windowWidth, windowHeight)
            asteroid.draw(batch!!, asteroid3r, scale)
        }
        for (asteroid in asteroid4s) {
            asteroid.update(windowWidth, windowHeight)
            asteroid.draw(batch!!, asteroid4r, scale)
        }
        for (asteroid in asteroid5s) {
            asteroid.update(windowWidth, windowHeight)
            asteroid.draw(batch!!, asteroid5r, scale)
        }

        batch!!.end()
    }
}

