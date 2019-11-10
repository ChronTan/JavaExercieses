package Task1;

public class Pesron {

    private String name;
    private String address;

    public Pesron(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName()
    {

        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Pesron[" +
                "name= '" + name + '\'' +
                ", address= '" + address + '\'' +
                ']';
    }
}
