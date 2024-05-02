package Vote;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;

public class VoterService {

    public  boolean getVote(){
        Voter voter1 = new Voter();
        voter1.name= "Chandu";
        voter1.status="true";
        voter1.voterID= UUID.randomUUID().toString();

        Voter voter2 = new Voter();
        voter2.name= "Geetha";
        voter2.status="true";
        voter2.voterID= UUID.randomUUID().toString();

        Voter voter3 = new Voter();
        voter3.name= "Sahasra";
        voter3.status="true";
        voter3.voterID= UUID.randomUUID().toString();

        List<Voter> voterList= new ArrayList<>();
        voterList.add(voter1);
        voterList.add(voter2);
        voterList.add(voter3);

        Predicate<Voter>voterPredicate= (voter -> voter.name.equals("Geetha"));

        Iterator<Voter>voterIterator=voterList.iterator();

        for(;voterIterator.hasNext();){
            Voter voter= voterIterator.next();
            if(voterPredicate.test(voter)){
                System.out.println("u r Eligible For Vote :" +voter.name);

            }else {
                System.out.println("Not Eligible For Vote :" +voter.name);
            }

        }
        return true;
    }
}
