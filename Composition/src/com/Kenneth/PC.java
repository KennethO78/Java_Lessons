package com.Kenneth;

/**
 * Created by Kenneth on 5/25/2016.
 */
public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        //Fancy grapics
        monitor.drawPixelAt(1200, 50, "yellow");
    }

}