package org.howard.edu.lsp.midterm.question3;

class VotingMachineDriver {
    public static void main(String[] args) {
        VotingMachine vm = new VotingMachine();
        vm.addCandidate("Alsobrooks");
        vm.castVote("Alsobrooks");
        vm.addCandidate("Hogan");
        System.out.println(vm); /* prints out candidate and number of votes … your choice of format */
    }
}
