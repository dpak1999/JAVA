public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car rangeRover = new Car();

        porsche.setModel("Carrera");
        porsche.setColor("Black");
        porsche.setEngine("12 valve boxer");
        porsche.setDoors(2);

        rangeRover.setModel("Evoque");
        rangeRover.setColor("White");
        rangeRover.setEngine("4 cylinder s14");
        rangeRover.setDoors(5);

        System.out.println("Model is " + porsche.getModel());
        System.out.println("Doors are " + porsche.getDoors());
        System.out.println("Color is " + porsche.getColor());
        System.out.println("Engine is " + porsche.getEngine());

        System.out.println("Model is " + rangeRover.getModel());
        System.out.println("Doors are " + rangeRover.getDoors());
        System.out.println("Color is " + rangeRover.getColor());
        System.out.println("Engine is " + rangeRover.getEngine());

    }
}
