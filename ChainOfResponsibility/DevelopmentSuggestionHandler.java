public class DevelopmentSuggestionHandler extends FeedbackHandler {
    @Override
    protected boolean canHandle(FeedbackMessage message) {
        return message.getType() == MessageType.DEV_SUGGESTION;
    }

    @Override
    protected void handle(FeedbackMessage message) {
        System.out.println("Development suggestion received from: " + message.getSenderEmail() + " - " + message.getContent());
    }
}
