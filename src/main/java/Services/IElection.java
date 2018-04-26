package Services;

public interface IElection {
	
	String getCandidateByParty(String party);
	
	int getNumberOfVotesByParty(String party);

}
