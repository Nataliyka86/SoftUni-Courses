package MilitaryElite_06;

public class SpecialisedSoldierImpl extends SoldierImpl{
    private Corps corps;
    public SpecialisedSoldierImpl(String id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    public Corps getCorps() {
        return corps;
    }
}
