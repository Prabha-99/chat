
package Logic;

import Client.ChatClient;
import interfaces.mainInterface;


public class MessageSender implements Runnable{
    
    
    private ChatClient client;
    private mainInterface mi;

    public MessageSender(ChatClient client,mainInterface mi) { //Constructor Injection
        this.client = client;
        this.mi = mi;
    }
    
    
    
    

    @Override
    public void run() {
        
         try{
             
             ChatClient client = new ChatClient("Jenna");
             
             while(true){
                 String chatContent;//Local variable
                 chatContent=mi.getChatField().getText();//Storing the text which user types in the chatField
                 client.sendMessage(chatContent);//sending that content through client's 'sendMessage' method
             }
         }catch(Exception e){
         }
    }
    
}
