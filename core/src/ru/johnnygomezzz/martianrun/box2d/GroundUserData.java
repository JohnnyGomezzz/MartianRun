package ru.johnnygomezzz.martianrun.box2d;

import ru.johnnygomezzz.martianrun.enums.UserDataType;

public class GroundUserData extends UserData {

    public GroundUserData(float width, float height) {
        super(width, height);
        userDataType = UserDataType.GROUND;
    }

}
