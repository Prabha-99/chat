package Logic;

import java.io.Serializable;



public class Subscriptions  implements Serializable {


     private String subId;
     private Rooms rooms;
     private Users users;

    public Subscriptions() {
    }

	
    public Subscriptions(String subId) {
        this.subId = subId;
    }
    public Subscriptions(String subId, Rooms rooms, Users users) {
       this.subId = subId;
       this.rooms = rooms;
       this.users = users;
    }
   
    public String getSubId() {
        return this.subId;
    }
    
    public void setSubId(String subId) {
        this.subId = subId;
    }
    public Rooms getRooms() {
        return this.rooms;
    }
    
    public void setRooms(Rooms rooms) {
        this.rooms = rooms;
    }
    public Users getUsers() {
        return this.users;
    }
    
    public void setUsers(Users users) {
        this.users = users;
    }




}


