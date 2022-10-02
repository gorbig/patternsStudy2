package week3ObserverPatterns.First;

import java.util.List;

public interface SubscriberTemplate {
    public void handleTheEmail(List<String> macVacancies);
}
