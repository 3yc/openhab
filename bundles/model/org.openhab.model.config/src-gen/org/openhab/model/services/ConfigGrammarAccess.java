/*
* generated by Xtext
*/

package org.openhab.model.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class ConfigGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Assignment cItemsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cItemsItemParserRuleCall_0 = (RuleCall)cItemsAssignment.eContents().get(0);
		
		//Model:
		//	items+=Item*;
		public ParserRule getRule() { return rule; }

		//items+=Item*
		public Assignment getItemsAssignment() { return cItemsAssignment; }

		//Item
		public RuleCall getItemsItemParserRuleCall_0() { return cItemsItemParserRuleCall_0; }
	}

	public class ItemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Item");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cNormalItemParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cGroupItemParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Item:
		//	NormalItem | GroupItem;
		public ParserRule getRule() { return rule; }

		//NormalItem | GroupItem
		public Alternatives getAlternatives() { return cAlternatives; }

		//NormalItem
		public RuleCall getNormalItemParserRuleCall_0() { return cNormalItemParserRuleCall_0; }

		//GroupItem
		public RuleCall getGroupItemParserRuleCall_1() { return cGroupItemParserRuleCall_1; }
	}

	public class GroupItemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "GroupItem");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGroupKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cLabelAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLabelSTRINGTerminalRuleCall_2_0 = (RuleCall)cLabelAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cLessThanSignKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cIconAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final Alternatives cIconAlternatives_3_1_0 = (Alternatives)cIconAssignment_3_1.eContents().get(0);
		private final RuleCall cIconIDTerminalRuleCall_3_1_0_0 = (RuleCall)cIconAlternatives_3_1_0.eContents().get(0);
		private final RuleCall cIconSTRINGTerminalRuleCall_3_1_0_1 = (RuleCall)cIconAlternatives_3_1_0.eContents().get(1);
		private final Keyword cGreaterThanSignKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cLeftParenthesisKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cGroupsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cGroupsGroupItemCrossReference_4_1_0 = (CrossReference)cGroupsAssignment_4_1.eContents().get(0);
		private final RuleCall cGroupsGroupItemIDTerminalRuleCall_4_1_0_1 = (RuleCall)cGroupsGroupItemCrossReference_4_1_0.eContents().get(1);
		private final Group cGroup_4_2 = (Group)cGroup_4.eContents().get(2);
		private final Keyword cCommaKeyword_4_2_0 = (Keyword)cGroup_4_2.eContents().get(0);
		private final Assignment cGroupsAssignment_4_2_1 = (Assignment)cGroup_4_2.eContents().get(1);
		private final CrossReference cGroupsGroupItemCrossReference_4_2_1_0 = (CrossReference)cGroupsAssignment_4_2_1.eContents().get(0);
		private final RuleCall cGroupsGroupItemIDTerminalRuleCall_4_2_1_0_1 = (RuleCall)cGroupsGroupItemCrossReference_4_2_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_4_3 = (Keyword)cGroup_4.eContents().get(3);
		
		//GroupItem:
		//	"Group" name=ID label=STRING? ("<" icon=(ID | STRING) ">")? ("(" groups+=[GroupItem] ("," groups+=[GroupItem])* ")")?;
		public ParserRule getRule() { return rule; }

		//"Group" name=ID label=STRING? ("<" icon=(ID | STRING) ">")? ("(" groups+=[GroupItem] ("," groups+=[GroupItem])* ")")?
		public Group getGroup() { return cGroup; }

		//"Group"
		public Keyword getGroupKeyword_0() { return cGroupKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//label=STRING?
		public Assignment getLabelAssignment_2() { return cLabelAssignment_2; }

		//STRING
		public RuleCall getLabelSTRINGTerminalRuleCall_2_0() { return cLabelSTRINGTerminalRuleCall_2_0; }

		//("<" icon=(ID | STRING) ">")?
		public Group getGroup_3() { return cGroup_3; }

		//"<"
		public Keyword getLessThanSignKeyword_3_0() { return cLessThanSignKeyword_3_0; }

		//icon=(ID | STRING)
		public Assignment getIconAssignment_3_1() { return cIconAssignment_3_1; }

		//ID | STRING
		public Alternatives getIconAlternatives_3_1_0() { return cIconAlternatives_3_1_0; }

		//ID
		public RuleCall getIconIDTerminalRuleCall_3_1_0_0() { return cIconIDTerminalRuleCall_3_1_0_0; }

		//STRING
		public RuleCall getIconSTRINGTerminalRuleCall_3_1_0_1() { return cIconSTRINGTerminalRuleCall_3_1_0_1; }

		//">"
		public Keyword getGreaterThanSignKeyword_3_2() { return cGreaterThanSignKeyword_3_2; }

		//("(" groups+=[GroupItem] ("," groups+=[GroupItem])* ")")?
		public Group getGroup_4() { return cGroup_4; }

		//"("
		public Keyword getLeftParenthesisKeyword_4_0() { return cLeftParenthesisKeyword_4_0; }

		//groups+=[GroupItem]
		public Assignment getGroupsAssignment_4_1() { return cGroupsAssignment_4_1; }

		//[GroupItem]
		public CrossReference getGroupsGroupItemCrossReference_4_1_0() { return cGroupsGroupItemCrossReference_4_1_0; }

		//ID
		public RuleCall getGroupsGroupItemIDTerminalRuleCall_4_1_0_1() { return cGroupsGroupItemIDTerminalRuleCall_4_1_0_1; }

		//("," groups+=[GroupItem])*
		public Group getGroup_4_2() { return cGroup_4_2; }

		//","
		public Keyword getCommaKeyword_4_2_0() { return cCommaKeyword_4_2_0; }

		//groups+=[GroupItem]
		public Assignment getGroupsAssignment_4_2_1() { return cGroupsAssignment_4_2_1; }

		//[GroupItem]
		public CrossReference getGroupsGroupItemCrossReference_4_2_1_0() { return cGroupsGroupItemCrossReference_4_2_1_0; }

		//ID
		public RuleCall getGroupsGroupItemIDTerminalRuleCall_4_2_1_0_1() { return cGroupsGroupItemIDTerminalRuleCall_4_2_1_0_1; }

		//")"
		public Keyword getRightParenthesisKeyword_4_3() { return cRightParenthesisKeyword_4_3; }
	}

	public class NormalItemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NormalItem");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Alternatives cTypeAlternatives_0_0 = (Alternatives)cTypeAssignment_0.eContents().get(0);
		private final Keyword cTypeSwitchKeyword_0_0_0 = (Keyword)cTypeAlternatives_0_0.eContents().get(0);
		private final Keyword cTypeRollerblindKeyword_0_0_1 = (Keyword)cTypeAlternatives_0_0.eContents().get(1);
		private final Keyword cTypeMeasurementKeyword_0_0_2 = (Keyword)cTypeAlternatives_0_0.eContents().get(2);
		private final Keyword cTypeStringKeyword_0_0_3 = (Keyword)cTypeAlternatives_0_0.eContents().get(3);
		private final Keyword cTypeDimmerKeyword_0_0_4 = (Keyword)cTypeAlternatives_0_0.eContents().get(4);
		private final Keyword cTypeContactKeyword_0_0_5 = (Keyword)cTypeAlternatives_0_0.eContents().get(5);
		private final RuleCall cTypeIDTerminalRuleCall_0_0_6 = (RuleCall)cTypeAlternatives_0_0.eContents().get(6);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cLabelAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLabelSTRINGTerminalRuleCall_2_0 = (RuleCall)cLabelAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cLessThanSignKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cIconAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final Alternatives cIconAlternatives_3_1_0 = (Alternatives)cIconAssignment_3_1.eContents().get(0);
		private final RuleCall cIconIDTerminalRuleCall_3_1_0_0 = (RuleCall)cIconAlternatives_3_1_0.eContents().get(0);
		private final RuleCall cIconSTRINGTerminalRuleCall_3_1_0_1 = (RuleCall)cIconAlternatives_3_1_0.eContents().get(1);
		private final Keyword cGreaterThanSignKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cLeftParenthesisKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cGroupsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cGroupsGroupItemCrossReference_4_1_0 = (CrossReference)cGroupsAssignment_4_1.eContents().get(0);
		private final RuleCall cGroupsGroupItemIDTerminalRuleCall_4_1_0_1 = (RuleCall)cGroupsGroupItemCrossReference_4_1_0.eContents().get(1);
		private final Group cGroup_4_2 = (Group)cGroup_4.eContents().get(2);
		private final Keyword cCommaKeyword_4_2_0 = (Keyword)cGroup_4_2.eContents().get(0);
		private final Assignment cGroupsAssignment_4_2_1 = (Assignment)cGroup_4_2.eContents().get(1);
		private final CrossReference cGroupsGroupItemCrossReference_4_2_1_0 = (CrossReference)cGroupsAssignment_4_2_1.eContents().get(0);
		private final RuleCall cGroupsGroupItemIDTerminalRuleCall_4_2_1_0_1 = (RuleCall)cGroupsGroupItemCrossReference_4_2_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_4_3 = (Keyword)cGroup_4.eContents().get(3);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cLeftCurlyBracketKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cBindingsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cBindingsBindingParserRuleCall_5_1_0 = (RuleCall)cBindingsAssignment_5_1.eContents().get(0);
		private final Group cGroup_5_2 = (Group)cGroup_5.eContents().get(2);
		private final Keyword cCommaKeyword_5_2_0 = (Keyword)cGroup_5_2.eContents().get(0);
		private final Assignment cBindingsAssignment_5_2_1 = (Assignment)cGroup_5_2.eContents().get(1);
		private final RuleCall cBindingsBindingParserRuleCall_5_2_1_0 = (RuleCall)cBindingsAssignment_5_2_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_3 = (Keyword)cGroup_5.eContents().get(3);
		
		//NormalItem:
		//	type=("Switch" | "Rollerblind" | "Measurement" | "String" | "Dimmer" | "Contact" | ID) name=ID label=STRING? ("<"
		//	icon=(ID | STRING) ">")? ("(" groups+=[GroupItem] ("," groups+=[GroupItem])* ")")? ("{" bindings+=Binding (","
		//	bindings+=Binding)* "}")*;
		public ParserRule getRule() { return rule; }

		//type=("Switch" | "Rollerblind" | "Measurement" | "String" | "Dimmer" | "Contact" | ID) name=ID label=STRING? ("<"
		//icon=(ID | STRING) ">")? ("(" groups+=[GroupItem] ("," groups+=[GroupItem])* ")")? ("{" bindings+=Binding (","
		//bindings+=Binding)* "}")*
		public Group getGroup() { return cGroup; }

		//type=("Switch" | "Rollerblind" | "Measurement" | "String" | "Dimmer" | "Contact" | ID)
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }

		//"Switch" | "Rollerblind" | "Measurement" | "String" | "Dimmer" | "Contact" | ID
		public Alternatives getTypeAlternatives_0_0() { return cTypeAlternatives_0_0; }

		//"Switch"
		public Keyword getTypeSwitchKeyword_0_0_0() { return cTypeSwitchKeyword_0_0_0; }

		//"Rollerblind"
		public Keyword getTypeRollerblindKeyword_0_0_1() { return cTypeRollerblindKeyword_0_0_1; }

		//"Measurement"
		public Keyword getTypeMeasurementKeyword_0_0_2() { return cTypeMeasurementKeyword_0_0_2; }

		//"String"
		public Keyword getTypeStringKeyword_0_0_3() { return cTypeStringKeyword_0_0_3; }

		//"Dimmer"
		public Keyword getTypeDimmerKeyword_0_0_4() { return cTypeDimmerKeyword_0_0_4; }

		//"Contact"
		public Keyword getTypeContactKeyword_0_0_5() { return cTypeContactKeyword_0_0_5; }

		//ID
		public RuleCall getTypeIDTerminalRuleCall_0_0_6() { return cTypeIDTerminalRuleCall_0_0_6; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//label=STRING?
		public Assignment getLabelAssignment_2() { return cLabelAssignment_2; }

		//STRING
		public RuleCall getLabelSTRINGTerminalRuleCall_2_0() { return cLabelSTRINGTerminalRuleCall_2_0; }

		//("<" icon=(ID | STRING) ">")?
		public Group getGroup_3() { return cGroup_3; }

		//"<"
		public Keyword getLessThanSignKeyword_3_0() { return cLessThanSignKeyword_3_0; }

		//icon=(ID | STRING)
		public Assignment getIconAssignment_3_1() { return cIconAssignment_3_1; }

		//ID | STRING
		public Alternatives getIconAlternatives_3_1_0() { return cIconAlternatives_3_1_0; }

		//ID
		public RuleCall getIconIDTerminalRuleCall_3_1_0_0() { return cIconIDTerminalRuleCall_3_1_0_0; }

		//STRING
		public RuleCall getIconSTRINGTerminalRuleCall_3_1_0_1() { return cIconSTRINGTerminalRuleCall_3_1_0_1; }

		//">"
		public Keyword getGreaterThanSignKeyword_3_2() { return cGreaterThanSignKeyword_3_2; }

		//("(" groups+=[GroupItem] ("," groups+=[GroupItem])* ")")?
		public Group getGroup_4() { return cGroup_4; }

		//"("
		public Keyword getLeftParenthesisKeyword_4_0() { return cLeftParenthesisKeyword_4_0; }

		//groups+=[GroupItem]
		public Assignment getGroupsAssignment_4_1() { return cGroupsAssignment_4_1; }

		//[GroupItem]
		public CrossReference getGroupsGroupItemCrossReference_4_1_0() { return cGroupsGroupItemCrossReference_4_1_0; }

		//ID
		public RuleCall getGroupsGroupItemIDTerminalRuleCall_4_1_0_1() { return cGroupsGroupItemIDTerminalRuleCall_4_1_0_1; }

		//("," groups+=[GroupItem])*
		public Group getGroup_4_2() { return cGroup_4_2; }

		//","
		public Keyword getCommaKeyword_4_2_0() { return cCommaKeyword_4_2_0; }

		//groups+=[GroupItem]
		public Assignment getGroupsAssignment_4_2_1() { return cGroupsAssignment_4_2_1; }

		//[GroupItem]
		public CrossReference getGroupsGroupItemCrossReference_4_2_1_0() { return cGroupsGroupItemCrossReference_4_2_1_0; }

		//ID
		public RuleCall getGroupsGroupItemIDTerminalRuleCall_4_2_1_0_1() { return cGroupsGroupItemIDTerminalRuleCall_4_2_1_0_1; }

		//")"
		public Keyword getRightParenthesisKeyword_4_3() { return cRightParenthesisKeyword_4_3; }

		//("{" bindings+=Binding ("," bindings+=Binding)* "}")*
		public Group getGroup_5() { return cGroup_5; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_0() { return cLeftCurlyBracketKeyword_5_0; }

		//bindings+=Binding
		public Assignment getBindingsAssignment_5_1() { return cBindingsAssignment_5_1; }

		//Binding
		public RuleCall getBindingsBindingParserRuleCall_5_1_0() { return cBindingsBindingParserRuleCall_5_1_0; }

		//("," bindings+=Binding)*
		public Group getGroup_5_2() { return cGroup_5_2; }

		//","
		public Keyword getCommaKeyword_5_2_0() { return cCommaKeyword_5_2_0; }

		//bindings+=Binding
		public Assignment getBindingsAssignment_5_2_1() { return cBindingsAssignment_5_2_1; }

		//Binding
		public RuleCall getBindingsBindingParserRuleCall_5_2_1_0() { return cBindingsBindingParserRuleCall_5_2_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_3() { return cRightCurlyBracketKeyword_5_3; }
	}

	public class BindingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Binding");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTypeIDTerminalRuleCall_0_0 = (RuleCall)cTypeAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cConfigurationAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cConfigurationSTRINGTerminalRuleCall_2_0 = (RuleCall)cConfigurationAssignment_2.eContents().get(0);
		
		//Binding:
		//	type=ID "=" configuration=STRING;
		public ParserRule getRule() { return rule; }

		//type=ID "=" configuration=STRING
		public Group getGroup() { return cGroup; }

		//type=ID
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }

		//ID
		public RuleCall getTypeIDTerminalRuleCall_0_0() { return cTypeIDTerminalRuleCall_0_0; }

		//"="
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }

		//configuration=STRING
		public Assignment getConfigurationAssignment_2() { return cConfigurationAssignment_2; }

		//STRING
		public RuleCall getConfigurationSTRINGTerminalRuleCall_2_0() { return cConfigurationSTRINGTerminalRuleCall_2_0; }
	}
	
	
	private ModelElements pModel;
	private ItemElements pItem;
	private GroupItemElements pGroupItem;
	private NormalItemElements pNormalItem;
	private BindingElements pBinding;
	
	private final GrammarProvider grammarProvider;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public ConfigGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammarProvider = grammarProvider;
		this.gaTerminals = gaTerminals;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	items+=Item*;
	public ModelElements getModelAccess() {
		return (pModel != null) ? pModel : (pModel = new ModelElements());
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//Item:
	//	NormalItem | GroupItem;
	public ItemElements getItemAccess() {
		return (pItem != null) ? pItem : (pItem = new ItemElements());
	}
	
	public ParserRule getItemRule() {
		return getItemAccess().getRule();
	}

	//GroupItem:
	//	"Group" name=ID label=STRING? ("<" icon=(ID | STRING) ">")? ("(" groups+=[GroupItem] ("," groups+=[GroupItem])* ")")?;
	public GroupItemElements getGroupItemAccess() {
		return (pGroupItem != null) ? pGroupItem : (pGroupItem = new GroupItemElements());
	}
	
	public ParserRule getGroupItemRule() {
		return getGroupItemAccess().getRule();
	}

	//NormalItem:
	//	type=("Switch" | "Rollerblind" | "Measurement" | "String" | "Dimmer" | "Contact" | ID) name=ID label=STRING? ("<"
	//	icon=(ID | STRING) ">")? ("(" groups+=[GroupItem] ("," groups+=[GroupItem])* ")")? ("{" bindings+=Binding (","
	//	bindings+=Binding)* "}")*;
	public NormalItemElements getNormalItemAccess() {
		return (pNormalItem != null) ? pNormalItem : (pNormalItem = new NormalItemElements());
	}
	
	public ParserRule getNormalItemRule() {
		return getNormalItemAccess().getRule();
	}

	//Binding:
	//	type=ID "=" configuration=STRING;
	public BindingElements getBindingAccess() {
		return (pBinding != null) ? pBinding : (pBinding = new BindingElements());
	}
	
	public ParserRule getBindingRule() {
		return getBindingAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" | "n" |
	//	"f" | "r" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}