import java.util.Scanner;

public class ResumeBuilder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Enter your email address: ");
        String email = input.nextLine();

        System.out.println("Enter your phone number: ");
        String phone = input.nextLine();

        System.out.println("Enter your summary: ");
        String summary = input.nextLine();

        System.out.println("Enter your work experience: ");
        String experience = input.nextLine();

        System.out.println("Enter your education: ");
        String education = input.nextLine();

        System.out.println("Enter your skills: ");
        String skills = input.nextLine();

        System.out.println("Enter any certifications: ");
        String certifications = input.nextLine();

        // Create the resume
        Resume resume = new Resume(name, email, phone, summary, experience, education, skills, certifications);

        // Display the resume
        System.out.println(resume);
    }
}

class Resume {
    private String name;
    private String email;
    private String phone;
    private String summary;
    private String experience;
    private String education;
    private String skills;
    private String certifications;

    public Resume(String name, String email, String phone, String summary, String experience, String education, String skills, String certifications) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.summary = summary;
        this.experience = experience;
        this.education = education;
        this.skills = skills;
        this.certifications = certifications;
    }

    public String toString() {
        String resumeString = "";

        resumeString += "Name: " + name + "\n";
        resumeString += "Email: " + email + "\n";
        resumeString += "Phone: " + phone + "\n\n";
        resumeString += "Summary:\n" + summary + "\n\n";
        resumeString += "Work Experience:\n" + experience + "\n\n";
        resumeString += "Education:\n" + education + "\n\n";
        resumeString += "Skills:\n" + skills + "\n\n";
        resumeString += "Certifications:\n" + certifications + "\n\n";

        return resumeString;
    }
}
