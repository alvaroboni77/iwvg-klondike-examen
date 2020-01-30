package klondike.views.console;

import klondike.controllers.Controller;
import klondike.utils.IO;

public class StockView extends CardStackView {

    public StockView(Controller controller) {
        super(controller, Message.STOCK_TITLE, controller.size());
    }

    public void writeln() {
        super.writeln(this.controller.peekStock());
    }
}
