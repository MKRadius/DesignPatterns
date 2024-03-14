public class ContactRequestHandler extends FeedbackHandler {
    @Override
    protected boolean canHandle(FeedbackMessage message) {
        return message.getType() == MessageType.CONTACT_REQUEST;
    }

    @Override
    protected void handle(FeedbackMessage message) {
        System.out.println("Contact request received from: " + message.getSenderEmail());
        // Handle contact request logic here
    }
}
