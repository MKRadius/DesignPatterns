import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FeedbackHandler compensationClaimHandler = new ClaimHandler();
        FeedbackHandler contactRequestHandler = new ContactRequestHandler();
        FeedbackHandler developmentSuggestionHandler = new DevelopmentSuggestionHandler();
        FeedbackHandler generalFeedbackHandler = new GeneralFeedbackHandler();

        compensationClaimHandler.setNextHandler(contactRequestHandler);
        contactRequestHandler.setNextHandler(developmentSuggestionHandler);
        developmentSuggestionHandler.setNextHandler(generalFeedbackHandler);

        List<FeedbackMessage> messages = new ArrayList<>();
        messages.add(new FeedbackMessage(MessageType.CLAIM, "Claim", "aaa@aaa.com"));
        messages.add(new FeedbackMessage(MessageType.CONTACT_REQUEST, "Contact", "bbb@bbb.com"));
        messages.add(new FeedbackMessage(MessageType.DEV_SUGGESTION, "Development", "ccc@ccc.com"));
        messages.add(new FeedbackMessage(MessageType.GENERAL_FEEDBACK, "Good service", "ddd@ddd.com"));

        for (FeedbackMessage message : messages) {
            System.out.println("Processing feedback message...");
            compensationClaimHandler.handleFeedback(message);
            System.out.println();
        }
    }
}
