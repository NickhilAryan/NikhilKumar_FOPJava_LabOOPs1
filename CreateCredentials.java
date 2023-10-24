import java.util.Scanner;

public class CreateCredentials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter the last name: ");
        String lastName = scanner.nextLine();

        Employee employee = new Employee(firstName, lastName);

        System.out.println("Please enter the department from the following:");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");

        int department = scanner.nextInt();
        String departmentCode = "";

        switch (department) {
            case 1:
                departmentCode = "tech";
                break;
            case 2:
                departmentCode = "admin";
                break;
            case 3:
                departmentCode = "hr";
                break;
            case 4:
                departmentCode = "legal";
                break;
            default:
                System.out.println("Invalid department selection. Please choose a valid department (1-4).");
                scanner.close();
                return;
        }

        CredentialService credentialService = new CredentialService(employee);
        credentialService.showCredentials(departmentCode);

        scanner.close();
    }
}
