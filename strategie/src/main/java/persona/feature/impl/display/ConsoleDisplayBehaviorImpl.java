package persona.feature.impl.display;

import persona.feature.IDisplayBehavior;

public class ConsoleDisplayBehaviorImpl implements IDisplayBehavior {
    @Override
    public void display(String info) {
        System.out.println(info);
    }
}
