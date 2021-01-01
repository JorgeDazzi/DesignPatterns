package persona;

import persona.feature.IDisplayBehavior;
import persona.feature.IShotBehavior;


public class Persona {
    private IDisplayBehavior iDisplayBehavior;
    private IShotBehavior iShotBehavior;

    public Persona(IDisplayBehavior iDisplayBehavior, IShotBehavior iShotBehavior) {
        this.iDisplayBehavior = iDisplayBehavior;
        this.iShotBehavior = iShotBehavior;
    }

    public void shot(){
        iDisplayBehavior.display(
                iShotBehavior.shot()
        );
    }
}
