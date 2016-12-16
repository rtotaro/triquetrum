/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.triquetrum.commands.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.xbase.services.XtypeGrammarAccess;

@Singleton
public class TqclGrammarAccess extends AbstractGrammarElementFinder {
	
	public class TriquetrumScriptElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.triquetrum.commands.Tqcl.TriquetrumScript");
		private final Assignment cCommandsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cCommandsCommandParserRuleCall_0 = (RuleCall)cCommandsAssignment.eContents().get(0);
		
		//TriquetrumScript:
		//	commands+=Command*;
		@Override public ParserRule getRule() { return rule; }
		
		//commands+=Command*
		public Assignment getCommandsAssignment() { return cCommandsAssignment; }
		
		//Command
		public RuleCall getCommandsCommandParserRuleCall_0() { return cCommandsCommandParserRuleCall_0; }
	}
	public class CommandElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.triquetrum.commands.Tqcl.Command");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cInsertParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cConnectParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Command:
		//	Insert | Connect;
		@Override public ParserRule getRule() { return rule; }
		
		//Insert | Connect
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Insert
		public RuleCall getInsertParserRuleCall_0() { return cInsertParserRuleCall_0; }
		
		//Connect
		public RuleCall getConnectParserRuleCall_1() { return cConnectParserRuleCall_1; }
	}
	public class InsertElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.triquetrum.commands.Tqcl.Insert");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInsertKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cObjAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cObjQualifiedNameParserRuleCall_1_0 = (RuleCall)cObjAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cAsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cAliasAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cAliasNamedObjParserRuleCall_2_1_0 = (RuleCall)cAliasAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cWithKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cParametersAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cParametersParameterParserRuleCall_3_1_0 = (RuleCall)cParametersAssignment_3_1.eContents().get(0);
		
		//Insert:
		//	"insert" obj=QualifiedName ("as" alias=NamedObj)? ("with" parameters+=Parameter*)?;
		@Override public ParserRule getRule() { return rule; }
		
		//"insert" obj=QualifiedName ("as" alias=NamedObj)? ("with" parameters+=Parameter*)?
		public Group getGroup() { return cGroup; }
		
		//"insert"
		public Keyword getInsertKeyword_0() { return cInsertKeyword_0; }
		
		//obj=QualifiedName
		public Assignment getObjAssignment_1() { return cObjAssignment_1; }
		
		//QualifiedName
		public RuleCall getObjQualifiedNameParserRuleCall_1_0() { return cObjQualifiedNameParserRuleCall_1_0; }
		
		//("as" alias=NamedObj)?
		public Group getGroup_2() { return cGroup_2; }
		
		//"as"
		public Keyword getAsKeyword_2_0() { return cAsKeyword_2_0; }
		
		//alias=NamedObj
		public Assignment getAliasAssignment_2_1() { return cAliasAssignment_2_1; }
		
		//NamedObj
		public RuleCall getAliasNamedObjParserRuleCall_2_1_0() { return cAliasNamedObjParserRuleCall_2_1_0; }
		
		//("with" parameters+=Parameter*)?
		public Group getGroup_3() { return cGroup_3; }
		
		//"with"
		public Keyword getWithKeyword_3_0() { return cWithKeyword_3_0; }
		
		//parameters+=Parameter*
		public Assignment getParametersAssignment_3_1() { return cParametersAssignment_3_1; }
		
		//Parameter
		public RuleCall getParametersParameterParserRuleCall_3_1_0() { return cParametersParameterParserRuleCall_3_1_0; }
	}
	public class ParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.triquetrum.commands.Tqcl.Parameter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameQualifiedNameParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueSTRINGTerminalRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//Parameter:
		//	name=QualifiedName "=" value=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//name=QualifiedName "=" value=STRING
		public Group getGroup() { return cGroup; }
		
		//name=QualifiedName
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_0_0() { return cNameQualifiedNameParserRuleCall_0_0; }
		
		//"="
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }
		
		//value=STRING
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_2_0() { return cValueSTRINGTerminalRuleCall_2_0; }
	}
	public class NamedObjElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.triquetrum.commands.Tqcl.NamedObj");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameQualifiedNameParserRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//NamedObj:
		//	name=QualifiedName;
		@Override public ParserRule getRule() { return rule; }
		
		//name=QualifiedName
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_0() { return cNameQualifiedNameParserRuleCall_0; }
	}
	public class ConnectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.triquetrum.commands.Tqcl.Connect");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cConnectKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cFromAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cFromNamedObjParserRuleCall_1_0 = (RuleCall)cFromAssignment_1.eContents().get(0);
		private final Keyword cToKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cToAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cToNamedObjParserRuleCall_3_0 = (RuleCall)cToAssignment_3.eContents().get(0);
		
		//Connect:
		//	"connect" from=NamedObj "to" to=NamedObj;
		@Override public ParserRule getRule() { return rule; }
		
		//"connect" from=NamedObj "to" to=NamedObj
		public Group getGroup() { return cGroup; }
		
		//"connect"
		public Keyword getConnectKeyword_0() { return cConnectKeyword_0; }
		
		//from=NamedObj
		public Assignment getFromAssignment_1() { return cFromAssignment_1; }
		
		//NamedObj
		public RuleCall getFromNamedObjParserRuleCall_1_0() { return cFromNamedObjParserRuleCall_1_0; }
		
		//"to"
		public Keyword getToKeyword_2() { return cToKeyword_2; }
		
		//to=NamedObj
		public Assignment getToAssignment_3() { return cToAssignment_3; }
		
		//NamedObj
		public RuleCall getToNamedObjParserRuleCall_3_0() { return cToNamedObjParserRuleCall_3_0; }
	}
	
	
	private final TriquetrumScriptElements pTriquetrumScript;
	private final CommandElements pCommand;
	private final InsertElements pInsert;
	private final ParameterElements pParameter;
	private final NamedObjElements pNamedObj;
	private final ConnectElements pConnect;
	
	private final Grammar grammar;
	
	private final XtypeGrammarAccess gaXtype;

	@Inject
	public TqclGrammarAccess(GrammarProvider grammarProvider,
			XtypeGrammarAccess gaXtype) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaXtype = gaXtype;
		this.pTriquetrumScript = new TriquetrumScriptElements();
		this.pCommand = new CommandElements();
		this.pInsert = new InsertElements();
		this.pParameter = new ParameterElements();
		this.pNamedObj = new NamedObjElements();
		this.pConnect = new ConnectElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.triquetrum.commands.Tqcl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public XtypeGrammarAccess getXtypeGrammarAccess() {
		return gaXtype;
	}

	
	//TriquetrumScript:
	//	commands+=Command*;
	public TriquetrumScriptElements getTriquetrumScriptAccess() {
		return pTriquetrumScript;
	}
	
	public ParserRule getTriquetrumScriptRule() {
		return getTriquetrumScriptAccess().getRule();
	}
	
	//Command:
	//	Insert | Connect;
	public CommandElements getCommandAccess() {
		return pCommand;
	}
	
	public ParserRule getCommandRule() {
		return getCommandAccess().getRule();
	}
	
	//Insert:
	//	"insert" obj=QualifiedName ("as" alias=NamedObj)? ("with" parameters+=Parameter*)?;
	public InsertElements getInsertAccess() {
		return pInsert;
	}
	
	public ParserRule getInsertRule() {
		return getInsertAccess().getRule();
	}
	
	//Parameter:
	//	name=QualifiedName "=" value=STRING;
	public ParameterElements getParameterAccess() {
		return pParameter;
	}
	
	public ParserRule getParameterRule() {
		return getParameterAccess().getRule();
	}
	
	//NamedObj:
	//	name=QualifiedName;
	public NamedObjElements getNamedObjAccess() {
		return pNamedObj;
	}
	
	public ParserRule getNamedObjRule() {
		return getNamedObjAccess().getRule();
	}
	
	//Connect:
	//	"connect" from=NamedObj "to" to=NamedObj;
	public ConnectElements getConnectAccess() {
		return pConnect;
	}
	
	public ParserRule getConnectRule() {
		return getConnectAccess().getRule();
	}
	
	//JvmTypeReference:
	//	JvmParameterizedTypeReference => ({JvmGenericArrayTypeReference.componentType=current} ArrayBrackets)*
	//	| XFunctionTypeRef;
	public XtypeGrammarAccess.JvmTypeReferenceElements getJvmTypeReferenceAccess() {
		return gaXtype.getJvmTypeReferenceAccess();
	}
	
	public ParserRule getJvmTypeReferenceRule() {
		return getJvmTypeReferenceAccess().getRule();
	}
	
	//ArrayBrackets:
	//	'[' ']';
	public XtypeGrammarAccess.ArrayBracketsElements getArrayBracketsAccess() {
		return gaXtype.getArrayBracketsAccess();
	}
	
	public ParserRule getArrayBracketsRule() {
		return getArrayBracketsAccess().getRule();
	}
	
	//XFunctionTypeRef:
	//	('(' (paramTypes+=JvmTypeReference (',' paramTypes+=JvmTypeReference)*)? ')')? '=>' returnType=JvmTypeReference;
	public XtypeGrammarAccess.XFunctionTypeRefElements getXFunctionTypeRefAccess() {
		return gaXtype.getXFunctionTypeRefAccess();
	}
	
	public ParserRule getXFunctionTypeRefRule() {
		return getXFunctionTypeRefAccess().getRule();
	}
	
	//JvmParameterizedTypeReference:
	//	type=[JvmType|QualifiedName] (=> '<' arguments+=JvmArgumentTypeReference (',' arguments+=JvmArgumentTypeReference)*
	//	'>' (=> ({JvmInnerTypeReference.outer=current} '.') type=[JvmType|ValidID] (=> '<' arguments+=JvmArgumentTypeReference
	//	(',' arguments+=JvmArgumentTypeReference)* '>')?)*)?;
	public XtypeGrammarAccess.JvmParameterizedTypeReferenceElements getJvmParameterizedTypeReferenceAccess() {
		return gaXtype.getJvmParameterizedTypeReferenceAccess();
	}
	
	public ParserRule getJvmParameterizedTypeReferenceRule() {
		return getJvmParameterizedTypeReferenceAccess().getRule();
	}
	
	//JvmArgumentTypeReference JvmTypeReference:
	//	JvmTypeReference | JvmWildcardTypeReference
	public XtypeGrammarAccess.JvmArgumentTypeReferenceElements getJvmArgumentTypeReferenceAccess() {
		return gaXtype.getJvmArgumentTypeReferenceAccess();
	}
	
	public ParserRule getJvmArgumentTypeReferenceRule() {
		return getJvmArgumentTypeReferenceAccess().getRule();
	}
	
	//JvmWildcardTypeReference:
	//	{JvmWildcardTypeReference} '?' (constraints+=JvmUpperBound constraints+=JvmUpperBoundAnded*
	//	| constraints+=JvmLowerBound constraints+=JvmLowerBoundAnded*)?;
	public XtypeGrammarAccess.JvmWildcardTypeReferenceElements getJvmWildcardTypeReferenceAccess() {
		return gaXtype.getJvmWildcardTypeReferenceAccess();
	}
	
	public ParserRule getJvmWildcardTypeReferenceRule() {
		return getJvmWildcardTypeReferenceAccess().getRule();
	}
	
	//JvmUpperBound:
	//	'extends' typeReference=JvmTypeReference;
	public XtypeGrammarAccess.JvmUpperBoundElements getJvmUpperBoundAccess() {
		return gaXtype.getJvmUpperBoundAccess();
	}
	
	public ParserRule getJvmUpperBoundRule() {
		return getJvmUpperBoundAccess().getRule();
	}
	
	//JvmUpperBoundAnded JvmUpperBound:
	//	'&' typeReference=JvmTypeReference
	public XtypeGrammarAccess.JvmUpperBoundAndedElements getJvmUpperBoundAndedAccess() {
		return gaXtype.getJvmUpperBoundAndedAccess();
	}
	
	public ParserRule getJvmUpperBoundAndedRule() {
		return getJvmUpperBoundAndedAccess().getRule();
	}
	
	//JvmLowerBound:
	//	'super' typeReference=JvmTypeReference;
	public XtypeGrammarAccess.JvmLowerBoundElements getJvmLowerBoundAccess() {
		return gaXtype.getJvmLowerBoundAccess();
	}
	
	public ParserRule getJvmLowerBoundRule() {
		return getJvmLowerBoundAccess().getRule();
	}
	
	//JvmLowerBoundAnded JvmLowerBound:
	//	'&' typeReference=JvmTypeReference
	public XtypeGrammarAccess.JvmLowerBoundAndedElements getJvmLowerBoundAndedAccess() {
		return gaXtype.getJvmLowerBoundAndedAccess();
	}
	
	public ParserRule getJvmLowerBoundAndedRule() {
		return getJvmLowerBoundAndedAccess().getRule();
	}
	
	//JvmTypeParameter:
	//	name=ValidID (constraints+=JvmUpperBound constraints+=JvmUpperBoundAnded*)?;
	public XtypeGrammarAccess.JvmTypeParameterElements getJvmTypeParameterAccess() {
		return gaXtype.getJvmTypeParameterAccess();
	}
	
	public ParserRule getJvmTypeParameterRule() {
		return getJvmTypeParameterAccess().getRule();
	}
	
	//QualifiedName:
	//	ValidID ('.' ValidID)*;
	public XtypeGrammarAccess.QualifiedNameElements getQualifiedNameAccess() {
		return gaXtype.getQualifiedNameAccess();
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}
	
	//QualifiedNameWithWildcard:
	//	QualifiedName '.' '*';
	public XtypeGrammarAccess.QualifiedNameWithWildcardElements getQualifiedNameWithWildcardAccess() {
		return gaXtype.getQualifiedNameWithWildcardAccess();
	}
	
	public ParserRule getQualifiedNameWithWildcardRule() {
		return getQualifiedNameWithWildcardAccess().getRule();
	}
	
	//ValidID:
	//	ID;
	public XtypeGrammarAccess.ValidIDElements getValidIDAccess() {
		return gaXtype.getValidIDAccess();
	}
	
	public ParserRule getValidIDRule() {
		return getValidIDAccess().getRule();
	}
	
	//XImportSection:
	//	importDeclarations+=XImportDeclaration+;
	public XtypeGrammarAccess.XImportSectionElements getXImportSectionAccess() {
		return gaXtype.getXImportSectionAccess();
	}
	
	public ParserRule getXImportSectionRule() {
		return getXImportSectionAccess().getRule();
	}
	
	//XImportDeclaration:
	//	'import' (static?='static' extension?='extension'? importedType=[JvmDeclaredType|QualifiedNameInStaticImport]
	//	(wildcard?='*' | memberName=ValidID) | importedType=[JvmDeclaredType|QualifiedName] |
	//	importedNamespace=QualifiedNameWithWildcard) ';'?;
	public XtypeGrammarAccess.XImportDeclarationElements getXImportDeclarationAccess() {
		return gaXtype.getXImportDeclarationAccess();
	}
	
	public ParserRule getXImportDeclarationRule() {
		return getXImportDeclarationAccess().getRule();
	}
	
	//QualifiedNameInStaticImport:
	//	(ValidID '.')+;
	public XtypeGrammarAccess.QualifiedNameInStaticImportElements getQualifiedNameInStaticImportAccess() {
		return gaXtype.getQualifiedNameInStaticImportAccess();
	}
	
	public ParserRule getQualifiedNameInStaticImportRule() {
		return getQualifiedNameInStaticImportAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '$' | '_') ('a'..'z' | 'A'..'Z' | '$' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaXtype.getIDRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"'? |
	//	"'" ('\\' . | !('\\' | "'"))* "'"?;
	public TerminalRule getSTRINGRule() {
		return gaXtype.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaXtype.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaXtype.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaXtype.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaXtype.getANY_OTHERRule();
	}
}