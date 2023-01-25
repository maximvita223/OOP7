public class Counerparty {
    private String name;
    private Communication communication;
    public Counerparty(String name, Communication communication) {
        this.name = name;
        this.communication = communication;
    }
    public String getName(){
        String copyName = name;
        return copyName;
    }
    public Communication getCommunication(){
        return communication;
    }
    @Override
    public String toString() {
        return "Counerparty name=" + name;
    }
    
}
