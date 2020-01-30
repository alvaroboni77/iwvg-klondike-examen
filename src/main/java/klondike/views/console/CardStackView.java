package klondike.views.console;

import klondike.controllers.Controller;
import klondike.models.Card;
import klondike.utils.IO;

public abstract class CardStackView {

    protected final Controller controller;

    private final String title;

    private final int number;

    CardStackView(Controller controller, String title, int number) {
        this.controller = controller;
        this.title = title;
        this.number = number;
    }

    protected void writeln(Card card) {
        IO.write(title);
        IO.write("(" + number + ") ");
        if (card == null) {
            IO.writeln(Message.EMPTY);
        }
        else{
            new CardView(card).writeln();
        }
    }

    public abstract void writeln();
}
