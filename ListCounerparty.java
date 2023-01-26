import java.util.List;
import java.util.Scanner;

public class ListCounerparty {
    private List<Counerparty> counerpartys;
    private int index;
    private Scanner sc = new Scanner(System.in);

    public ListCounerparty(List<Counerparty> counerpartys) {
        this.counerpartys = counerpartys;
    }

    public void find(String name) {
        for (Counerparty counerparty : counerpartys) {
            if (counerparty.getName().equals(name)) {
                System.out.println(counerparty.getCommunication()); ;
            }
        }
    }

    public void addCounerpaty(String name) {
        Counerparty newCounerparty = new Counerparty(name, null);
        counerpartys.add(newCounerparty);
    }

    public void removeCounerparty(int index) {
        counerpartys.remove(index);
    }

    public void getList() {
        index = 1;
        for (Counerparty counerparty : counerpartys) {
            System.out.println((index++) + ". " + counerparty.getName());
        }

    }

    public void addCommunity(String name) {
        
        for (Counerparty counerparty : counerpartys) {

            if (counerparty.getName().equals(name)) {
                switch (sc.nextLine()) {
                    case "1":
                    System.out.println("Введите адресс - ");
                        counerparty.getCommunication().addAdress(sc.nextLine());
                        break;
                
                    case "2":
                    System.out.println("Введите телефон - ");
                        counerparty.getCommunication().addPhone(sc.nextInt());
                        break;

                    case "3":
                    System.out.println("Введите email - ");
                        counerparty.getCommunication().addEmail(sc.nextLine());
                        break;

                    case "4":
                    System.out.println("Введите адресс ник в telegram - ");
                        counerparty.getCommunication().addNikTelegram(sc.nextLine());
                        break;

                    case "5":
                    System.out.println("Введите адресс VK - ");
                        counerparty.getCommunication().addAdressVk(sc.nextLine());
                        break;
                }

            }
    }
    }
    public void removeCommunity(String name) {
        for (Counerparty counerparty : counerpartys) {
            if (counerparty.getName().equals(name)) {
                switch (sc.nextLine()) {
                    case "1":
                        counerparty.getCommunication().removeAllAdress();
                        break;
                
                    case "2":
                        counerparty.getCommunication().removeAllPhone();
                        break;

                    case "3":
                        counerparty.getCommunication().removeAllEmail();
                        break;

                    case "4":
                        counerparty.getCommunication().removeTelegrem();
                        break;

                    case "5":
                        counerparty.getCommunication().removeVk();
                        break;
                }

            }
        }
    }

}