package InheritanceExample;

public class LivingRoom extends Home {

    public LivingRoom(String roomtype,int num_of_lights) {

        super("LivingRoom", 5);
    }

    public void numOfLights() {
        System.out.println("Room Name is :" + roomtype);
        System.out.println("Number of lights:" + num_of_lights);
    }
}