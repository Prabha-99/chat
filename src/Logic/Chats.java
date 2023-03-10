package Logic;
// Generated Mar 10, 2023 7:51:49 AM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.Date;


public class Chats  implements Serializable {


     private String chatId;
     private Rooms rooms;
     private Users users;
     private String content;
     private String chatLink;
     private Date startTime;
     private Date endTime;

    public Chats() {
    }

	
    public Chats(String chatId) {
        this.chatId = chatId;
    }
    public Chats(String chatId, Rooms rooms, Users users, String content, String chatLink, Date startTime, Date endTime) {
       this.chatId = chatId;
       this.rooms = rooms;
       this.users = users;
       this.content = content;
       this.chatLink = chatLink;
       this.startTime = startTime;
       this.endTime = endTime;
    }
   
    public String getChatId() {
        return this.chatId;
    }
    
    public void setChatId(String chatId) {
        this.chatId = chatId;
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
    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    public String getChatLink() {
        return this.chatLink;
    }
    
    public void setChatLink(String chatLink) {
        this.chatLink = chatLink;
    }
    public Date getStartTime() {
        return this.startTime;
    }
    
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
    public Date getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }




}


