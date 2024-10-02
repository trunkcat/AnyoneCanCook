package restaurantgame.Cook;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.ScreenUtils;

public class GameScreen implements Screen {
    private Main restaurant;
    private Texture background;
    private Texture counterTexture;

    @Override
    public void show() {
    }

   public GameScreen(Main restaurant) {
        this.restaurant = restaurant;
        background = new Texture("background.png");
        counterTexture = new Texture("table.png");
    }
    @Override
    public void render(float v) {
        ScreenUtils.clear(Color.BLACK);
        restaurant.batch.setProjectionMatrix(restaurant.viewport.getCamera().combined);

        restaurant.batch.begin();
        restaurant.batch.draw(
            background,
            0, 0,
            background.getWidth() * 0.5f,
            background.getHeight() * 0.5f
        );
        restaurant.batch.draw(
            counterTexture,
            (restaurant.viewport.getWorldWidth() / 2) - (counterTexture.getWidth() * 11f) / 2,
            (restaurant.viewport.getWorldHeight() / 2) - (counterTexture.getHeight() * 7f) /2 - 75f,
            counterTexture.getWidth() * 11f,
            counterTexture.getHeight() * 7f
        );
        restaurant.batch.end();
    }

    @Override
    public void resize(int i, int i1) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
