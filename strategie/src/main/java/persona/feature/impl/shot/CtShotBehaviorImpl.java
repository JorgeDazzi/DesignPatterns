package persona.feature.impl.shot;

import persona.feature.IShotBehavior;

public class CtShotBehaviorImpl implements IShotBehavior {

    private final String bg = "\u001B[44m";

    @Override
    public String shot() {
        return "                               "+bg+"<<<<<<<<<<<<<<<<<<━╤デ╦︻(▀̿̿Ĺ̯̿̿▀̿ ̿)"+reset;
    }
}
