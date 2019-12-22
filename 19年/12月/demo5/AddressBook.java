package demo5;

/*
* 第二题通信录类
*  */
public class AddressBook {
    private String name;
    private int gender;
    private int phone;
    private int mobile;
    private String address;
    private String mark;

    public AddressBook(String name, int gender, int phone, int mobile, String address, String mark) {
        this.name = name;
        this.gender = gender;
        this.phone = phone;
        this.mobile = mobile;
        this.address = address;
        this.mark = mark;
    }

    public AddressBook() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", phone=" + phone +
                ", mobile=" + mobile +
                ", address='" + address + '\'' +
                ", mark='" + mark + '\'' +
                "}\n";
    }
}
