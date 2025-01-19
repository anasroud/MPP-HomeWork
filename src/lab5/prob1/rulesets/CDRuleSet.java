package lab5.prob1.rulesets;

import java.awt.Component;

import lab5.prob1.gui.CDWindow;

/**
 * Rules:
 *  1. All fields must be nonempty 
 *  2. Price must be a floating point number with two decimal places 
 *  3. Price must be a number greater than 0.49. 
 */

public class CDRuleSet implements RuleSet {

	@Override
	public void applyRules(Component component) throws RuleException {
		CDWindow cdWindow = (CDWindow) component;
		String priceStr = cdWindow.getPriceValue().trim();
		String title = cdWindow.getTitleValue().trim();

		if (priceStr.isEmpty() || title.isEmpty()) {
			throw new RuleException("All fields must be nonempty.");
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
