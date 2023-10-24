import java.util.Random;

public class CredentialService {
    private Employee employee;

    public CredentialService(Employee employee) {
        this.employee = employee;
    }

    public String generatePassword() {
        String characters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*()_+";
        StringBuilder password = new StringBuilder();
        Random rand = new Random();

        for (int i = 0; i < 8; i++) {
            int randomIndex = rand.nextInt(characters.length());
            password.append(characters.charAt(randomIndex));
        }

        return password.toString();
    }

    public String generateEmailAddress(String department) {
        String company = "abc.com";
        String email = employee.getFirstName().toLowerCase() + employee.getLastName().toLowerCase() + "@" + department + "." + company;
        return email;
    }

    public void showCredentials(String department) {
        String email = generateEmailAddress(department);
        String password = generatePassword();

        System.out.println("Dear " + employee.getFirstName() + ", your generated credentials are as follows:");
        System.out.println("Email ---> " + email);
        System.out.println("Password ---> " + password);
    }
}
