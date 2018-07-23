package sg.edu.rp.c346.contactslist;

/**
 * Created by 16019829 on 23/7/2018.
 */

public class Contact_List {
    private String name;
    private String code;
    private String phone;

    public Contact_List(String name, String code, String phone) {
        this.name = name;
        this.code = code;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contact_List{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
