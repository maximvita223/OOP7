import java.util.ArrayList;
import java.util.List;

public class Communication {
    private List<Integer> phone = new ArrayList<>();
    private List<String> email = new ArrayList<>();
    private List<String> adress = new ArrayList<>();
    private String adressVk;
    private String nikTelegram;

    public Communication() {
        
    }
    public void addPhone(int newPhone){
        phone.add(newPhone);
    }
    public void addEmail(String newEmail){
        email.add(newEmail);
    }
    public void addAdress(String newAdress){
        adress.add(newAdress);
    }
    public void addAdressVk(String newAdressVk){
        adressVk = newAdressVk;
    }
    public void addNikTelegram(String newNikTelegrem){
        nikTelegram = newNikTelegrem;
    }
    public void removeAllPhone(){
        phone.clear();
    }
    public void removeAllEmail(){
        email.clear();
    }
    public void removeAllAdress(){
        adress.clear();
    }
    public void removeVk(){
        adressVk = "";

    }
    public void removeTelegrem(){
        nikTelegram = "";
    }
    @Override
    public String toString() {
        return "Communication phone=" + phone + ", email=" + email + ", adress=" + adress + ", adressVk=" + adressVk
                + ", nikTelegram=" + nikTelegram;
    }
    
}
