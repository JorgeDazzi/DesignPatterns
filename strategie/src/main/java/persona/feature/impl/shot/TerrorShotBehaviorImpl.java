package persona.feature.impl.shot;

import persona.feature.IShotBehavior;

public class TerrorShotBehaviorImpl implements IShotBehavior {

    private final String bg = "\u001B[41m";

    @Override
    public String shot() {
        return bg+"(•̪●)=/̵/’̿̿ ̿ ̿ ̿ ̿ >>>>>>>>>>>>>>>>>>"+reset;
    }
}
