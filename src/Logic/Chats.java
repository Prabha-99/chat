package Logic;



import java.util.Date;


public class Chats  implements java.io.Serializable {


     private String chatId;
     private String chatLink;
     private Date startTime;
     private Date endTime;

    public Chats() {
    }

	
    public Chats(String chatId) {
        this.chatId = chatId;
    }
    public Chats(String chatId, String chatLink, Date startTime, Date endTime) {
       this.chatId = chatId;
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


