package Services;


public class ElectionMock implements IElection{
	@Override
	public String getCandidateByParty(String party) {
		return "Elmer Homero";
	}
	
	@Override
	public int getNumberOfVotesByParty(String party) {
		return 10;
	}
	
}
