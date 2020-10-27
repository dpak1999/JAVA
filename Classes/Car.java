public class Car {
//    model,engine,color,doors
    int doors;
    String model;
    String engine;
    String color;

//    get(r) --- access
//    set(r) --- allocate

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

}
