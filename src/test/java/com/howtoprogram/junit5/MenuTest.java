package com.howtoprogram.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import Services.Election;
import Services.ElectionMock;
import Services.IElection;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MenuTest {

	@Test
	public void getCandidateNameByPartyTest(){
		
		IElection election=new ElectionMock();
			
		String candidateName=election.getCandidateByParty("Axity");
			
	    int numberOfVotes=election.getNumberOfVotesByParty("Axity");
		
	    assertEquals("Elmer Homero", candidateName);
	    assertEquals(10, numberOfVotes);
			
		}

	@Test
	public void getCandidateNameByPartyTestMockito(){
		
		IElection election= mock(Election.class);
		
		when(election.getCandidateByParty("Otra cosa")).thenReturn("Arturo");
		when(election.getNumberOfVotesByParty("")).thenReturn(0);
		
		String candidateName=election.getCandidateByParty("Otra cosa");
			
	    int numberOfVotes=election.getNumberOfVotesByParty("Axity");
		
	    assertEquals("Arturo", candidateName);
	    assertEquals(0, numberOfVotes);
		}
	
	}

