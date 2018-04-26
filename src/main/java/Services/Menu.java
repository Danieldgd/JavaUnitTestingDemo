package Services;

public class Menu {
	
	public static void main(String []args) {
		IElection election=new Election();
		
		String candidateName=election.getCandidateByParty("Axity");
		
		int numberOfVotes=election.getNumberOfVotesByParty("Axity");
		
		System.out.println(String.format("Name %s - Votes %d",candidateName,numberOfVotes)); 
	}

}
