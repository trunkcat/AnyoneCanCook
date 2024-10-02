package restaurantgame.Cook;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.FitViewport;

public class Main extends Game {

    FitViewport viewport;
    SpriteBatch batch;

    @Override
    public void create() {
        this.setScreen(new GameScreen(this));
        batch = new SpriteBatch();

        viewport = new FitViewport(800, 480);
    }

    public void render(){
        super.render();
    }


    public void resize(int width, int height){
        viewport.update(width, height, true);
        System.out.println(width + " " + height);
    }

    public void dispose(){
        batch.dispose();
    }
}
