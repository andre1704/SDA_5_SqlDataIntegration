package enums;

/**
 * Created by RENT on 2017-02-20.
 */
public enum State {
    ARIZONA("ARIZONA"),WASZYNGTON("WASZYNGTON");
    State(String name){
        this.name=name;
    }
    private String name;
    public String getName(){
        return name;
    }
    public static State getState(String s){
        for(State state:State.values()){
            if(state.name.equals(s))
                return state;
        }throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        String s1="ARIZONA";
        String s2="WASZYNGTON";
        State state=State.getState(s1);

    }
}
