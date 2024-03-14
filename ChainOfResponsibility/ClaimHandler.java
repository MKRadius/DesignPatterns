public class ClaimHandler extends FeedbackHandler {
    @Override
    protected boolean canHandle(FeedbackMessage message) {
        return message.getType() == MessageType.CLAIM;
    }

    @Override
    protected void handle(FeedbackMessage message) {
        System.out.println("Compensation claim received from: " + message.getSenderEmail());
        // Handle compensation claim logic here
    }
}
