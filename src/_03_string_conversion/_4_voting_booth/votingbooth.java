package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class votingbooth {
public static void main(String[] args) {
	
	String Answer = JOptionPane.showInputDialog("How old are you?");
	int AnswerInt = Integer.parseInt(Answer);
	
	
	if (AnswerInt >= 18) {
		JOptionPane.showInputDialog("Who should the next president be?");
	}
	else if(AnswerInt <= 18) {
		JOptionPane.showMessageDialog(null,"Nobody cares what you think.");
	}
	
	
	
	
}
}
