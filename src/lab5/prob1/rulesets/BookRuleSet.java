package lab5.prob1.rulesets;

import java.awt.Component;

import lab5.prob1.gui.*;

/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places 
 * 6. Price must be a number greater than 0.49.
 *
 */
public class BookRuleSet implements RuleSet {

	@Override
	public void applyRules(Component component) throws RuleException {
		BookWindow bookWindow = (BookWindow) component;
		String isbn = bookWindow.getIsbnValue().trim();
		String priceStr = bookWindow.getPriceValue().trim();
		String title = bookWindow.getTitleValue().trim();

		if (isbn.isEmpty() || priceStr.isEmpty() || title.isEmpty()) {
			throw new RuleException("All fields must be nonempty.");
		}

		if (isbn.length() != 10 && isbn.length() != 13) {
			throw new RuleException("ISBN must consist of 10 or 13 characters.");
		}

		for (char c : isbn.toCharArray()) {
			if (!Character.isDigit(c)) {
				throw new RuleException("ISBN must be numeric.");
			}
		}

		if (isbn.length() == 10) {
			if (isbn.charAt(0) != '0' && isbn.charAt(0) != '1') {
				throw new RuleException("If ISBN has length 10, the first digit must be 0 or 1.");
			}
		}

		if (isbn.length() == 13) {
			String prefix = isbn.substring(0, 3);
			if (!prefix.equals("978") && !prefix.equals("979")) {
				throw new RuleException("If ISBN has length 13, the first 3 digits must be 978 or 979.");
			}
		}

		double price;
		try {
			price = Double.parseDouble(priceStr);
		} catch (NumberFormatException e) {
			throw new RuleException("Price must be a valid floating-point number.");
		}

		if (price <= 0.49) {
			throw new RuleException("Price must be greater than 0.49.");
		}

		if (!priceStr.contains(".") || priceStr.split("\\.")[1].length() != 2) {
			throw new RuleException("Price must have two decimal places.");
		}
	}
}
