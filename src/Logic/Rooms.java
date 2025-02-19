package Logic;
// Generated Mar 23, 2023 11:57:26 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Rooms generated by hbm2java
 */
public class Rooms  implements java.io.Serializable {


     private String roomId;
     private Users users;
     private String roomeName;
     private String roomPassword;
     private Date chatStartTime;
     private Set subscriptionses = new HashSet(0);
     private Set chatses = new HashSet(0);

    public Rooms() {
    }

	
    public Rooms(String roomId) {
        this.roomId = roomId;
    }
    public Rooms(String roomId, Users users, String roomeName, String roomPassword, Date chatStartTime, Set subscriptionses, Set chatses) {
       this.roomId = roomId;
       this.users = users;
       this.roomeName = roomeName;
       this.roomPassword = roomPassword;
       this.chatStartTime = chatStartTime;
       this.subscriptionses = subscriptionses;
       this.chatses = chatses;
    }
   
    public String getRoomId() {
        return this.roomId;
    }
    
    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }
    public Users getUsers() {
        return this.users;
    }
    
    public void setUsers(Users users) {
        this.users = users;
    }
    public String getRoomeName() {
        return this.roomeName;
    }
    
    public void setRoomeName(String roomeName) {
        this.roomeName = roomeName;
    }
    public String getRoomPassword() {
        return this.roomPassword;
    }
    
    public void setRoomPassword(String roomPassword) {
        this.roomPassword = roomPassword;
    }
    public Date getChatStartTime() {
        return this.chatStartTime;
    }
    
    public void setChatStartTime(Date chatStartTime) {
        this.chatStartTime = chatStartTime;
    }
    public Set getSubscriptionses() {
        return this.subscriptionses;
    }
    
    public void setSubscriptionses(Set subscriptionses) {
        this.subscriptionses = subscriptionses;
    }
    public Set getChatses() {
        return this.chatses;
    }
    
    public void setChatses(Set chatses) {
        this.chatses = chatses;
    }




}


