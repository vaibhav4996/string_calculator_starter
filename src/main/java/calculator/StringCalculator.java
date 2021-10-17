package calculator;

import java.util.ArrayList;
import java.util.List;

class StringCalculator {

	public int calculate(String text) {
        List<String> negatives = new ArrayList<String>();

        if (text == null || text.isEmpty()) {
            return 0;
        }
        char customDelimiter = getCustomDelimiter(text.split("\n")[0]);

        String[] chuncks = (customDelimiter == ',') ? 
                                text.split(",|\n") : text.split("\n|" + customDelimiter);
        int total = 0;
        int skipFirstLines = (customDelimiter == ',') ? 0 : 2;
        for (String item : chuncks) {
            if (skipFirstLines > 0) {
                --skipFirstLines;
            } else {
                int num = Integer.parseInt(item);
                if (num < 0) {
                    negatives.add(item);
                }
                total += num;
            }
        }
	

	private char getCustomDelimiter(String string) {
		// TODO Auto-generated method stub
		return 0;
	}