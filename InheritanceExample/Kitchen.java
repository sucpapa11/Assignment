package InheritanceExample;

public class Kitchen extends Home {

    public Kitchen(String roomtype,int num_of_lights ) {
        super("Kitchen", 1);
    }

    public void numOfLights() {
        System.out.println("Room Name is :" + roomtype);
        System.out.println("Number of lights:" + num_of_lights);
    }

}






