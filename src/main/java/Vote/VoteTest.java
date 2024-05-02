package Vote;

public class VoteTest {
    public static void main(String[] args) {
        VoterService voterService= new VoterService();
        voterService.getVote();
        System.out.println(voterService);
    }
}
