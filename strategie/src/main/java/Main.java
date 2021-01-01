import persona.Persona;
import persona.feature.impl.display.ConsoleDisplayBehaviorImpl;
import persona.feature.impl.shot.CtShotBehaviorImpl;
import persona.feature.impl.shot.TerrorShotBehaviorImpl;

public class Main {

    public static void main(String[] args) {
        Persona counter_terrorist = new Persona(new ConsoleDisplayBehaviorImpl(), new CtShotBehaviorImpl());
        Persona terrorist = new Persona(new ConsoleDisplayBehaviorImpl(), new TerrorShotBehaviorImpl());

        terrorist.shot();
        counter_terrorist.shot();
        terrorist.shot();
        counter_terrorist.shot();
        terrorist.shot();
        counter_terrorist.shot();

    }
}
