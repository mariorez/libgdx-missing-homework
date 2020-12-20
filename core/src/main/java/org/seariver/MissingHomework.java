package org.seariver;

import org.seariver.screen.MenuScreen;

public class MissingHomework extends BaseGame {

    @Override
    public void create() {
        super.create();
        setActiveScreen(new MenuScreen());
    }
}
