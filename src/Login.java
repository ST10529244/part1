
public class Login {
     

    public String firstName;
    public String lastName;
    public String username;
    public String password;
    public String phoneNumber;

    // check username
    public boolean checkUsername(String username) {
        if (username.contains("_") && username.length() <= 5) {
            return true;
        } else {
            return false;
        }
    }

    // check password
    public boolean checkPassword(String password) {
        //we use boolean to chec if what the user his enter is true or false

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
        // so here we check the code step by step using char
        //so we use (if statsment) to copare
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            }
            if (Character.isLowerCase(c)) {
                hasLower = true;
            }
            if (Character.isDigit(c)) {
                hasNumber = true;
            }
            if (!Character.isLetterOrDigit(c)) {
                hasSpecial = true;
            }
        }

        if (password.length() > 8 && hasUpper && hasLower && hasNumber && hasSpecial) {
            return true;
        } else {
            return false;
        }
    }

    // check phone number
    public boolean checkPhoneNumber(String phoneNumber) {
        if (phoneNumber.startsWith("+27")) {
            return true;
        } else {
            return false;
        }
    }

    // register user
    public String registerUser(String fName, String lName, String user, String pass, String phone) {

        if (checkUsername(user) == false) {
            return "Username must contain '_' and be no more than 5 characters.";
        }

        if (checkPassword(pass) == false) {
            return "Password must be >8 characters and include uppercase, lowercase, number, and special character.";
        }

        if (checkPhoneNumber(phone) == false) {
            return "Phone number must start with +27.";
        }
        // here we store the variables in to the real variables 
        firstName = fName;
        lastName = lName;
        username = user;
        password = pass;
        phoneNumber = phone;
        //so if all the input macthes the questions the code will return the (Registration successful!)
        return "Registration successful!";
    }

    // login user
    public boolean loginUser(String user, String pass) {
        //so here if the user have entered all the things we need the loginUser to check only the username and password
        if (user.equals(username) && pass.equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    public String returnLoginStatus(boolean status) {
        // this is the feedback of the user is information
        if (status == true) {
            return "Welcome " + firstName + " " + lastName + "! You have successfully logged in.";
        } else {
            //so if the user entered wrong stuff the code will return a else message
            return "Login failed. Incorrect username or password.";
        }
    }
}
