import java.util.ArrayList;
public class VoteProcessor {
	int pope;
	int edward;
	String winner;
	String calculateElectionWinner(ArrayList<String> votes) {
		ArrayList<String> lowerCaseVotes = new ArrayList<String>();
		for (int i = 0; i < votes.size(); i++) {
			lowerCaseVotes.add(votes.get(i).toLowerCase());
			if (lowerCaseVotes.get(i).equals("pope francis")) {
				pope++;
			}
			if (lowerCaseVotes.get(i).equals("edward snowden")) {
				edward++;
			}
		}
		if (pope > edward) {
			winner = "pope francis";
		}
		if (edward > pope) {
			winner = "edward snowden";
		}
		if (edward == pope) {
			winner = "TIE";
		}
		return winner;
	}
}
