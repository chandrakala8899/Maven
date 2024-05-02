package EqualHashCodeMethod;

public class EqualHashcodeTest {
    public static void main (String [] args){

        Address a= new Address();
        a.flatNo = "2-164";
        a.area = "Manopad";
        a.pincode= "509125";
        a.state = "TG";
        a.country= "India";

        Address  b = new Address();
        b.flatNo = "2-164";
        b.area = "Manopad";
        b.pincode= "509125";
        b.state = "TG";
        b.country= "India";

        Address  c = new Address();
        c.flatNo = "2-164";
        c.area = "Manopad";
        c.pincode= "509125";
        c.state = "TG";
        c.country= "India";

        System.out.println(a.equals(a));
        System.out.println(b.equals(a));
        System.out.println(a.equals(c));

        System.out.println("A HashCode : " + a.hashCode());
        System.out.println("B HashCode : " + b.hashCode());
        System.out.println("C HashCode : " + c.hashCode());

    }
}
