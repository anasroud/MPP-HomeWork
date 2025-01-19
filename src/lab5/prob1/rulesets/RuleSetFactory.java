package lab5.prob1.rulesets;

import java.awt.Component;
import java.util.HashMap;

import lab5.prob1.gui.BookWindow;
import lab5.prob1.gui.CDWindow;


final public class RuleSetFactory {
	private RuleSetFactory(){}
	static HashMap<Class<? extends Component>, RuleSet> map = new HashMap<>();

	public static RuleSet getRuleSet(Component component) {
		if (component instanceof BookWindow) {
			return new BookRuleSet();
		} else if (component instanceof CDWindow) {
			return new CDRuleSet();
		}
		throw new IllegalArgumentException("No RuleSet found for the given component.");
	}
}
