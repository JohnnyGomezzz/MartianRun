package ru.johnnygomezzz.martianrun.box2d;

import com.badlogic.gdx.math.Vector2;

import ru.johnnygomezzz.martianrun.enums.UserDataType;
import ru.johnnygomezzz.martianrun.stages.GameStage;
import ru.johnnygomezzz.martianrun.utils.Constants;

public class EnemyUserData extends UserData {

    private Vector2 linearVelocity;
    private String[] textureRegions;

    public EnemyUserData(float width, float height, String[] textureRegions) {
        super(width, height);
        userDataType = UserDataType.ENEMY;
        if (GameStage.stadya == 1) {
            linearVelocity = Constants.ENEMY_LINEAR_VELOCITY2;
        } else {
            linearVelocity = Constants.ENEMY_LINEAR_VELOCITY;
        }
        this.textureRegions = textureRegions;
    }

    public void setLinearVelocity(Vector2 linearVelocity) {
        this.linearVelocity = linearVelocity;
    }

    public Vector2 getLinearVelocity() {
        return linearVelocity;
    }

    public String[] getTextureRegions() {
        return textureRegions;
    }
}
