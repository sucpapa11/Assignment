package InheritanceExample;

import javax.net.ssl.HostnameVerifier;

public class BedRoom extends Home {


    public BedRoom(String roomtype, int num_of_lights) {
        super("Bedroom", 2);
    }


        //  super("Bedroom",2);

              public void numOfLights(){
                  System.out.println("Room Name is :" + roomtype);
                  System.out.println("Number of lights:"+ num_of_lights);

              }

    }
















