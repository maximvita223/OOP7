import java.util.List;
import java.util.Scanner;

public class ListCounerparty {
    private List<Counerparty> counerpartys;
    private int index;

    public ListCounerparty(List<Counerparty> counerpartys) {
        this.counerpartys = counerpartys;
    }

    public Communication find(String name) {
        for (Counerparty counerparty : counerpartys) {
            if (counerparty.getName().equals(name)) {
                return counerparty.getCommunication();
            }
        }
        return null;
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
/*
нужно переписать добавление и удаление 
1 - убрать с Communication add и remove добавить get для всего
2 - переписать сюда add и remove для каждого вида связи или написать новый класс добавления и удаления
3 - посмотреть что получилось и решилась ли проблема со сканнером
*/ 
    public void addCommunity(String name, int commun) {
        Scanner sc = new Scanner(System.in);
        for (Counerparty counerparty : counerpartys) {
            if (counerparty.getName().equals(name)) {
                if (commun == 1) {
                    counerparty.getCommunication().addAdress(sc.nextLine());
                }
                if (commun == 2) {
                    counerparty.getCommunication().addPhone(sc.nextInt());
                }
                if (commun == 3) {
                    counerparty.getCommunication().addEmail(sc.nextLine());
                }
                if (commun == 4) {
                    counerparty.getCommunication().addNikTelegram(sc.nextLine());
                }
                if (commun == 5) {
                    counerparty.getCommunication().addAdressVk(sc.nextLine());
                }

            }
        }
        sc.close();
    }
    public void removeCommunity(String name, int commun){
        for (Counerparty counerparty : counerpartys) {
            if (counerparty.getName().equals(name)) {
                if (commun == 1) {
                    counerparty.getCommunication().removeAllAdress();;
                }
                if (commun == 2) {
                    counerparty.getCommunication().removeAllPhone();;
                }
                if (commun == 3) {
                    counerparty.getCommunication().removeAllEmail();;
                }
                if (commun == 4) {
                    counerparty.getCommunication().removeTelegrem();;
                }
                if (commun == 5) {
                    counerparty.getCommunication().removeVk();;
                }

            }
        }
    }

    @Override
    public String toString() {
        return counerpartys.toString();
    }
    
}
