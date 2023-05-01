package Models;

public class RegisterModel {

    private String mobile;
    private String name;
    private String username;
    private String password;
    private String gender;
    private int age;
    private String address;

    public RegisterModel(String mobile, String name, String username, String password, String gender, int age, String address) throws Exception {
        if (name.isEmpty()) {
            throw new Exception("name must not be empty");
        }

        if (username.isEmpty()) {
            throw new Exception("Username is empty");
        }

        if (password.length() < 8 || password.length() > 16) {
            throw new Exception("Password Must be Between 8-16");
        }

        if (mobile.isEmpty() || mobile.length() > 11) {
            throw new Exception("Pls Enter a correct Mobile Number");
        }

        if (!(age > 0)) {
            throw new Exception("Age must be gratter then 0");
        }

        if (gender.isEmpty()) {
            throw new Exception("Gender must be selected");
        }

        if (address.isEmpty()) {
            throw new Exception("address is empty");
        }

        this.mobile = mobile;
        this.name = name;
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public void setMobile(String mobile) throws Exception {
        if (mobile == null || mobile.equals("") || mobile.length() > 11) {
            throw new Exception("Pls Enter a correct Mobile Number");
        }
        this.mobile = mobile;
    }

    public void setName(String name) throws Exception {
        if (name.isEmpty()) {
            throw new Exception("name must not be empty");
        }
        this.name = name;
    }

    public void setUsername(String username) throws Exception {
        if (username.isEmpty()) {
            throw new Exception("Username is empty");
        }
        this.username = username;
    }

    public void setPassword(String password) throws Exception {
        if (password.length() < 8 || password.length() > 16) {
            throw new Exception("Password Must be Between 8-16");
        }

        this.password = password;
    }

    public void setGender(String gender) throws Exception {
        if (gender.isEmpty()) {
            throw new Exception("Gender must be selected");
        }
        this.gender = gender;
    }

    public void setAge(int age) throws Exception {
        if (!(age > 0)) {
            throw new Exception("Age must be gratter then 0");
        }
        this.age = age;
    }

    public void setAddress(String address) throws Exception {
        if (address.isEmpty()) {
            throw new Exception("address is empty");
        }
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

}
