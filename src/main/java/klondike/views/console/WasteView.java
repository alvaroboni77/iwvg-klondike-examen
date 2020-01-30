package klondike.views.console;

import klondike.controllers.Controller;
import klondike.utils.IO;

public class WasteView extends CardStackView {


    public WasteView(Controller controller) {
        super(controller, Message.WASTE_TITLE, controller.sizeWaste());
    }

    public void writeln() {
        super.writeln(this.controller.peekWaste());
    }
}
