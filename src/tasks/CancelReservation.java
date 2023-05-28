package tasks;

import data.TimerHandler;
import mediatheque.Document;

import java.util.TimerTask;

public class CancelReservation extends TimerTask {
    private final Document document;

    public CancelReservation(Document document) {
        this.document = document;
    }

    @Override
    public void run() {
        document.retour();
        TimerHandler.removeFromReservations(document);
        cancel();
    }
}
