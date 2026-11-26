package tickets;

public class Main {
    public static void main(String[] args) {

        Ticket standard = new Ticket(
                "Summer Concert", "Alice", 80);

        StudentTicket student = new StudentTicket(
                "Summer Concert", "Bob", 80, "S12345");

        VIPTicket vip = new VIPTicket(
                "Summer Concert", "Charlie", 80);

        System.out.println("Event: " + standard.getEventName());

        System.out.println("Standard Ticket - " + standard.getHolderName()
                + ": €" + standard.calculatePrice());

        System.out.println("Student Ticket - " + student.getHolderName()
                + ": €" + student.calculatePrice());

        System.out.println("VIP Ticket - " + vip.getHolderName()
                + ": €" + vip.calculatePrice());

        System.out.println("Student ID: " + student.getStudentId());

        System.out.println("Benefits: " + vip.getBenefits());
    }
}