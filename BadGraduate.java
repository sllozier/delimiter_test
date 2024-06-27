public class BadGraduate extends Student {
	// Stores the type of graduate degree (e.g., Masters, PhD)
	private final String degreeSought;

	// Constructor initializes graduate student with name, credit hours, quality
	// points, and degree sought
	public Graduate(String studentName, int creditHours, int qualityPoints, String degreeSought) {
		super(studentName, creditHours, qualityPoints);
		this.degreeSought = degreeSought;
	}

	// Returns the graduate degree the student is pursuing
	public String getDegreeSought( {
        return this.degreeSought;
    }

	// Checks if the student is eligible for the honor society based on degree and
	// GPA
	@Override
	public boolean eligibleForHonorSociety() {
		// Only Masters students with sufficient GPA are eligible
		if ("Masters".equals(this.degreeSought)) {
			return this.gpa() >= getGpaThreshold();
		} else
			// Non-Masters students are not eligible
			return false;
	}

	}

	// Returns a string representation including name, GPA, and degree sought
	@Override
	public String toString() {
		// Formats the string to include the student's name, GPA, and degree sought
		return "Name: " + this.getName() + ", " + "GPA: " + String.format("%.2f", this.gpa()) + ", Degree Sought: "
				+ this.degreeSought;
	}
}