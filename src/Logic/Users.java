package Logic;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Users implements Serializable {
   
    private String userId;
    private String userName;
    private String email;
    private String nickName;
    private String password;
    private String profileImage;
     private Set roomses = new HashSet(0);
     private Set chatses = new HashSet(0);
     private Set subscriptionses = new HashSet(0);

    public Users() {
    }

	
    public Users(String userId) {
        this.userId = userId;
    }
    public Users(String userId, String userName, String email, String nickName, String password, String profileImage, Set roomses, Set chatses, Set subscriptionses) {
       this.userId = userId;
       this.userName = userName;
       this.email = email;
       this.nickName = nickName;
       this.password = password;
       this.profileImage = profileImage;
       this.roomses = roomses;
       this.chatses = chatses;
       this.subscriptionses = subscriptionses;
    }
   
    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNickName() {
        return this.nickName;
    }
    
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getProfileImage() {
        return this.profileImage;
    }
    
    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }
    public Set getRoomses() {
        return this.roomses;
    }
    
    public void setRoomses(Set roomses) {
        this.roomses = roomses;
    }
    public Set getChatses() {
        return this.chatses;
    }
    
    public void setChatses(Set chatses) {
        this.chatses = chatses;
    }
    public Set getSubscriptionses() {
        return this.subscriptionses;
    }
    
    public void setSubscriptionses(Set subscriptionses) {
        this.subscriptionses = subscriptionses;
    }




}


