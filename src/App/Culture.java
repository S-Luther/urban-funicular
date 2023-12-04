package App;
public interface Culture {
    public enum stance{
        AGGRESSIVE,
        DEFENSIVE,
        BALANCED
    }

    stance strategy();
    stance diplomacy();
    String cultureName();
    
}
