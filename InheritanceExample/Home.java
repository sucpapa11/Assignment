package InheritanceExample;

public  class Home {

    String roomtype;
    int num_of_lights;

    public Home(String roomtype, int num_of_lights) {


        this.roomtype = roomtype;
        this.num_of_lights=num_of_lights;

    }

    public void numOfLights(){
        System.out.println("Number of Lights in " + roomtype+ " is : "+num_of_lights);
    }

}
