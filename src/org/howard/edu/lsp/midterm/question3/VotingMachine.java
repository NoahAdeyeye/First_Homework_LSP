package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;
import java.util.Map;

public class VotingMachine {
    private Map<String, Integer> candidates = new HashMap<>();

    // Add a candidate to the list

    //a) void addCandidate(String name)	/* Add a candidate with the name to the list */
    public void addCandidate(String name) {
        candidates.put(name, 0);
    }

    // Cast a vote for the candidate

    //b) void castVote(String name) 	/* Cast a vote to the candidate with the name */ 
    public void castVote(String name) {
        if (candidates.containsKey(name)) {
            candidates.put(name, candidates.get(name) + 1);
        }
    }

    // Return the number of votes for each candidate

    //c) String toString() 		/* Print out the number of votes each candidate has received. The order does not matter */ 

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            result.append("Candidate: ").append(entry.getKey()).append(", Votes: ").append(entry.getValue()).append("\n");
        }
        return result.toString();
    }
}


