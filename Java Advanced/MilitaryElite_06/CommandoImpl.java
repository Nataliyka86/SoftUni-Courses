package MilitaryElite_06;

import java.util.Set;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {

    public CommandoImpl(String id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    @Override
    public Set<Mission> getMissions() {
        return null;
    }
}
