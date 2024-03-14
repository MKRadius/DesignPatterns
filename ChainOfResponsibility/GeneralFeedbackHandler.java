public class GeneralFeedbackHandler extends FeedbackHandler {
    @Override
    protected boolean canHandle(FeedbackMessage message) {
        return message.getType() == MessageType.GENERAL_FEEDBACK;
    }

    @Override
    protected void handle(FeedbackMessage message) {
        System.out.println("General feedback received from: " + message.getSenderEmail() + " - " + message.getContent());
    }
}
