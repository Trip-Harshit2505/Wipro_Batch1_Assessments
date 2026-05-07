package Day3_Assessment;

class Vote{
	private int userId;
	private boolean hasVoted = false;
	
	public void setUser(int userId) {
		this.userId = userId;
	}
	
	public void castVote() {
		if (!hasVoted) {
            System.out.println("Vote cast by user: " + userId);
            hasVoted = true;
        } else {
            System.err.println("User " + userId + " has already voted.");
        }
	}
}

public class ElectionEx {

	public static void main(String[] args) {
		Vote v = new Vote();
		v.setUser(101);
		v.castVote();
		v.castVote();
	}

}
