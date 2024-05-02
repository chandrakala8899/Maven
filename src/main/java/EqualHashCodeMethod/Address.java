package EqualHashCodeMethod;

import java.util.Objects;

public class Address {
    public String flatNo;
    public String area;

    public String pincode;
    public String state;
    public String country;


    public boolean equals(Object obj){
        Address y = (Address) obj;
        return this.area.equals(y.area) && this.flatNo.equals(y.flatNo) &&
               this.area.equals(y.area) &&
                this.state.equals(y.state)&&
                this.country.equals(y.country) &&
               this.pincode.equals(y.pincode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flatNo, area, pincode, state, country);
    }
}
