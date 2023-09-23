package JavaProject2;

public class Task12 {
    private String user;
    private String password;
    private String email;

    public Task12(String user, String password, String email) {
        setUser(user);
        setPassword(password);
        setEmail(email);

    }
    public void setUser(String userName) {

        if (!userName.isEmpty() && userName.length() > 6) {
            this.user = userName;
        } else {
            System.out.println("Not valid username");
        }
    }
    public void setPassword(String password) {

        if (!password.isEmpty() && password.length() > 6 && password != user) {
            this.password = password;
        } else {
            System.out.println("Not valid password");
        }
    }

    public void setEmail(String email) {

        if (email.contains("yahoo")) {
            this.email = email;
        } else {
            System.out.println("not an accepted email provider");
        }
    }

    public String getUsername() {
        return user;
    }

    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }


    public static void main(String[] args) {
        Task12 r = new Task12("SMWAFA123","pass123","solwafa@yahoo.com");
        System.out.println("User is " + r.getUsername());
        System.out.println("Password is " + r.getPassword());
        System.out.println("Email is " + r.getEmail());


    }


}

