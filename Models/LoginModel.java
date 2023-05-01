
package Models;

public class LoginModel {

    private String userName;
    private String password;

    public LoginModel(String userName, String password) throws Exception {
        if (userName.isEmpty()) {
            throw new Exception("Username is empty");
        }

        if (password.length() < 8 || password.length() > 16) {
            throw new Exception("Password Must be Between 8-16");
        }
        this.userName = userName;
        this.password = password;
    }

    public void setPassword(String password) throws Exception {
        if (password.length() < 8 || password.length() > 16) {
            throw new Exception("Password Must be Between 8-16");
        }
        this.password = password;
    }

    public void setUserName(String userName) throws Exception {
        if (userName.isEmpty()) {
            throw new Exception("Username is empty");
        }
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

}
