//Name-Oliver Lu
//Student Number-101155667
public class BuddyInfo
{

    private String name;
    private String address;
    private int phoneNumber;

    public int getPhoneNumber() {
        return phoneNumber;
    }


    public BuddyInfo(String name, String address, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args){
        BuddyInfo bud= new BuddyInfo("Oliver Lu","ottawa",123456789);
        System.out.println("Hello " + bud.getName()+ "!");
    }
}