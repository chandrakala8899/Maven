package ObjectPractice;

public class Test {
    public static void main (String[] args ){
        State state = new State();
        Country country = new Country();
        country.countryName= "india";
        country.countryCode = "+91";
        country.countryCapital= "New Delhi";
        country.currency = "Ruppee";
        country.state= state;

        state.stateName ="Telangana";
        state.stateCM = "Revanth Reddy";
        state.language = "Telugu";
        state.country= country;
        System.out.println(country.state.stateName);
        System.out.println(country.state.stateCM);
        System.out.println(country.state.language);

        System.out.println(state.country.countryName);
        System.out.println(state.country.countryCode);
        System.out.println(state.country.currency);

    }
}
