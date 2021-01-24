package com.mmabas77.task1;

public class Model {
    int squadImage;
    String squadName;

    public Model(int image, String name) {
        this.squadImage = image;
        this.squadName = name;
    }

    public int getImage() {
        return squadImage;
    }


    public void setImage(int image) {
        this.squadImage = image;
    }

    public String getSquadName() {
        return squadName;
    }

    public void setSquadName(String squadName) {
        this.squadName = squadName;
    }
}
