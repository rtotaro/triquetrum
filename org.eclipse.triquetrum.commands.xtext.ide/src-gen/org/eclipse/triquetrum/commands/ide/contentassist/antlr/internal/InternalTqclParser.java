package org.eclipse.triquetrum.commands.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.eclipse.triquetrum.commands.services.TqclGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalTqclParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'insert'", "'as'", "'with'", "'='", "'connect'", "'to'", "'['", "']'", "'=>'", "'('", "')'", "','", "'<'", "'>'", "'.'", "'?'", "'extends'", "'&'", "'super'", "'*'", "'import'", "';'", "'static'", "'extension'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__10=10;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=8;
    public static final int RULE_ANY_OTHER=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=6;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTqclParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTqclParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTqclParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTqcl.g"; }


    	private TqclGrammarAccess grammarAccess;

    	public void setGrammarAccess(TqclGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleTriquetrumScript"
    // InternalTqcl.g:54:1: entryRuleTriquetrumScript : ruleTriquetrumScript EOF ;
    public final void entryRuleTriquetrumScript() throws RecognitionException {
        try {
            // InternalTqcl.g:55:1: ( ruleTriquetrumScript EOF )
            // InternalTqcl.g:56:1: ruleTriquetrumScript EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTriquetrumScriptRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTriquetrumScript();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTriquetrumScriptRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTriquetrumScript"


    // $ANTLR start "ruleTriquetrumScript"
    // InternalTqcl.g:63:1: ruleTriquetrumScript : ( ( rule__TriquetrumScript__CommandsAssignment )* ) ;
    public final void ruleTriquetrumScript() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:67:2: ( ( ( rule__TriquetrumScript__CommandsAssignment )* ) )
            // InternalTqcl.g:68:2: ( ( rule__TriquetrumScript__CommandsAssignment )* )
            {
            // InternalTqcl.g:68:2: ( ( rule__TriquetrumScript__CommandsAssignment )* )
            // InternalTqcl.g:69:3: ( rule__TriquetrumScript__CommandsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTriquetrumScriptAccess().getCommandsAssignment()); 
            }
            // InternalTqcl.g:70:3: ( rule__TriquetrumScript__CommandsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==10||LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTqcl.g:70:4: rule__TriquetrumScript__CommandsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__TriquetrumScript__CommandsAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTriquetrumScriptAccess().getCommandsAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTriquetrumScript"


    // $ANTLR start "entryRuleCommand"
    // InternalTqcl.g:79:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // InternalTqcl.g:80:1: ( ruleCommand EOF )
            // InternalTqcl.g:81:1: ruleCommand EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalTqcl.g:88:1: ruleCommand : ( ( rule__Command__Alternatives ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:92:2: ( ( ( rule__Command__Alternatives ) ) )
            // InternalTqcl.g:93:2: ( ( rule__Command__Alternatives ) )
            {
            // InternalTqcl.g:93:2: ( ( rule__Command__Alternatives ) )
            // InternalTqcl.g:94:3: ( rule__Command__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getAlternatives()); 
            }
            // InternalTqcl.g:95:3: ( rule__Command__Alternatives )
            // InternalTqcl.g:95:4: rule__Command__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Command__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleInsert"
    // InternalTqcl.g:104:1: entryRuleInsert : ruleInsert EOF ;
    public final void entryRuleInsert() throws RecognitionException {
        try {
            // InternalTqcl.g:105:1: ( ruleInsert EOF )
            // InternalTqcl.g:106:1: ruleInsert EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleInsert();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInsertRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInsert"


    // $ANTLR start "ruleInsert"
    // InternalTqcl.g:113:1: ruleInsert : ( ( rule__Insert__Group__0 ) ) ;
    public final void ruleInsert() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:117:2: ( ( ( rule__Insert__Group__0 ) ) )
            // InternalTqcl.g:118:2: ( ( rule__Insert__Group__0 ) )
            {
            // InternalTqcl.g:118:2: ( ( rule__Insert__Group__0 ) )
            // InternalTqcl.g:119:3: ( rule__Insert__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertAccess().getGroup()); 
            }
            // InternalTqcl.g:120:3: ( rule__Insert__Group__0 )
            // InternalTqcl.g:120:4: rule__Insert__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Insert__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInsertAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInsert"


    // $ANTLR start "entryRuleParameter"
    // InternalTqcl.g:129:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalTqcl.g:130:1: ( ruleParameter EOF )
            // InternalTqcl.g:131:1: ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalTqcl.g:138:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:142:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalTqcl.g:143:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalTqcl.g:143:2: ( ( rule__Parameter__Group__0 ) )
            // InternalTqcl.g:144:3: ( rule__Parameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup()); 
            }
            // InternalTqcl.g:145:3: ( rule__Parameter__Group__0 )
            // InternalTqcl.g:145:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleNamedObj"
    // InternalTqcl.g:154:1: entryRuleNamedObj : ruleNamedObj EOF ;
    public final void entryRuleNamedObj() throws RecognitionException {
        try {
            // InternalTqcl.g:155:1: ( ruleNamedObj EOF )
            // InternalTqcl.g:156:1: ruleNamedObj EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedObjRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNamedObj();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamedObjRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNamedObj"


    // $ANTLR start "ruleNamedObj"
    // InternalTqcl.g:163:1: ruleNamedObj : ( ( rule__NamedObj__NameAssignment ) ) ;
    public final void ruleNamedObj() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:167:2: ( ( ( rule__NamedObj__NameAssignment ) ) )
            // InternalTqcl.g:168:2: ( ( rule__NamedObj__NameAssignment ) )
            {
            // InternalTqcl.g:168:2: ( ( rule__NamedObj__NameAssignment ) )
            // InternalTqcl.g:169:3: ( rule__NamedObj__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedObjAccess().getNameAssignment()); 
            }
            // InternalTqcl.g:170:3: ( rule__NamedObj__NameAssignment )
            // InternalTqcl.g:170:4: rule__NamedObj__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NamedObj__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamedObjAccess().getNameAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamedObj"


    // $ANTLR start "entryRuleConnect"
    // InternalTqcl.g:179:1: entryRuleConnect : ruleConnect EOF ;
    public final void entryRuleConnect() throws RecognitionException {
        try {
            // InternalTqcl.g:180:1: ( ruleConnect EOF )
            // InternalTqcl.g:181:1: ruleConnect EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConnect();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConnect"


    // $ANTLR start "ruleConnect"
    // InternalTqcl.g:188:1: ruleConnect : ( ( rule__Connect__Group__0 ) ) ;
    public final void ruleConnect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:192:2: ( ( ( rule__Connect__Group__0 ) ) )
            // InternalTqcl.g:193:2: ( ( rule__Connect__Group__0 ) )
            {
            // InternalTqcl.g:193:2: ( ( rule__Connect__Group__0 ) )
            // InternalTqcl.g:194:3: ( rule__Connect__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectAccess().getGroup()); 
            }
            // InternalTqcl.g:195:3: ( rule__Connect__Group__0 )
            // InternalTqcl.g:195:4: rule__Connect__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Connect__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnect"


    // $ANTLR start "entryRuleJvmTypeReference"
    // InternalTqcl.g:204:1: entryRuleJvmTypeReference : ruleJvmTypeReference EOF ;
    public final void entryRuleJvmTypeReference() throws RecognitionException {
        try {
            // InternalTqcl.g:205:1: ( ruleJvmTypeReference EOF )
            // InternalTqcl.g:206:1: ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmTypeReferenceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // InternalTqcl.g:213:1: ruleJvmTypeReference : ( ( rule__JvmTypeReference__Alternatives ) ) ;
    public final void ruleJvmTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:217:2: ( ( ( rule__JvmTypeReference__Alternatives ) ) )
            // InternalTqcl.g:218:2: ( ( rule__JvmTypeReference__Alternatives ) )
            {
            // InternalTqcl.g:218:2: ( ( rule__JvmTypeReference__Alternatives ) )
            // InternalTqcl.g:219:3: ( rule__JvmTypeReference__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmTypeReferenceAccess().getAlternatives()); 
            }
            // InternalTqcl.g:220:3: ( rule__JvmTypeReference__Alternatives )
            // InternalTqcl.g:220:4: rule__JvmTypeReference__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__JvmTypeReference__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmTypeReferenceAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleArrayBrackets"
    // InternalTqcl.g:229:1: entryRuleArrayBrackets : ruleArrayBrackets EOF ;
    public final void entryRuleArrayBrackets() throws RecognitionException {
        try {
            // InternalTqcl.g:230:1: ( ruleArrayBrackets EOF )
            // InternalTqcl.g:231:1: ruleArrayBrackets EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayBracketsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleArrayBrackets();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayBracketsRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArrayBrackets"


    // $ANTLR start "ruleArrayBrackets"
    // InternalTqcl.g:238:1: ruleArrayBrackets : ( ( rule__ArrayBrackets__Group__0 ) ) ;
    public final void ruleArrayBrackets() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:242:2: ( ( ( rule__ArrayBrackets__Group__0 ) ) )
            // InternalTqcl.g:243:2: ( ( rule__ArrayBrackets__Group__0 ) )
            {
            // InternalTqcl.g:243:2: ( ( rule__ArrayBrackets__Group__0 ) )
            // InternalTqcl.g:244:3: ( rule__ArrayBrackets__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayBracketsAccess().getGroup()); 
            }
            // InternalTqcl.g:245:3: ( rule__ArrayBrackets__Group__0 )
            // InternalTqcl.g:245:4: rule__ArrayBrackets__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArrayBrackets__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayBracketsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayBrackets"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // InternalTqcl.g:254:1: entryRuleXFunctionTypeRef : ruleXFunctionTypeRef EOF ;
    public final void entryRuleXFunctionTypeRef() throws RecognitionException {
        try {
            // InternalTqcl.g:255:1: ( ruleXFunctionTypeRef EOF )
            // InternalTqcl.g:256:1: ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // InternalTqcl.g:263:1: ruleXFunctionTypeRef : ( ( rule__XFunctionTypeRef__Group__0 ) ) ;
    public final void ruleXFunctionTypeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:267:2: ( ( ( rule__XFunctionTypeRef__Group__0 ) ) )
            // InternalTqcl.g:268:2: ( ( rule__XFunctionTypeRef__Group__0 ) )
            {
            // InternalTqcl.g:268:2: ( ( rule__XFunctionTypeRef__Group__0 ) )
            // InternalTqcl.g:269:3: ( rule__XFunctionTypeRef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getGroup()); 
            }
            // InternalTqcl.g:270:3: ( rule__XFunctionTypeRef__Group__0 )
            // InternalTqcl.g:270:4: rule__XFunctionTypeRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XFunctionTypeRef__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // InternalTqcl.g:279:1: entryRuleJvmParameterizedTypeReference : ruleJvmParameterizedTypeReference EOF ;
    public final void entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        try {
            // InternalTqcl.g:280:1: ( ruleJvmParameterizedTypeReference EOF )
            // InternalTqcl.g:281:1: ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // InternalTqcl.g:288:1: ruleJvmParameterizedTypeReference : ( ( rule__JvmParameterizedTypeReference__Group__0 ) ) ;
    public final void ruleJvmParameterizedTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:292:2: ( ( ( rule__JvmParameterizedTypeReference__Group__0 ) ) )
            // InternalTqcl.g:293:2: ( ( rule__JvmParameterizedTypeReference__Group__0 ) )
            {
            // InternalTqcl.g:293:2: ( ( rule__JvmParameterizedTypeReference__Group__0 ) )
            // InternalTqcl.g:294:3: ( rule__JvmParameterizedTypeReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup()); 
            }
            // InternalTqcl.g:295:3: ( rule__JvmParameterizedTypeReference__Group__0 )
            // InternalTqcl.g:295:4: rule__JvmParameterizedTypeReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // InternalTqcl.g:304:1: entryRuleJvmArgumentTypeReference : ruleJvmArgumentTypeReference EOF ;
    public final void entryRuleJvmArgumentTypeReference() throws RecognitionException {
        try {
            // InternalTqcl.g:305:1: ( ruleJvmArgumentTypeReference EOF )
            // InternalTqcl.g:306:1: ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // InternalTqcl.g:313:1: ruleJvmArgumentTypeReference : ( ( rule__JvmArgumentTypeReference__Alternatives ) ) ;
    public final void ruleJvmArgumentTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:317:2: ( ( ( rule__JvmArgumentTypeReference__Alternatives ) ) )
            // InternalTqcl.g:318:2: ( ( rule__JvmArgumentTypeReference__Alternatives ) )
            {
            // InternalTqcl.g:318:2: ( ( rule__JvmArgumentTypeReference__Alternatives ) )
            // InternalTqcl.g:319:3: ( rule__JvmArgumentTypeReference__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmArgumentTypeReferenceAccess().getAlternatives()); 
            }
            // InternalTqcl.g:320:3: ( rule__JvmArgumentTypeReference__Alternatives )
            // InternalTqcl.g:320:4: rule__JvmArgumentTypeReference__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__JvmArgumentTypeReference__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmArgumentTypeReferenceAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // InternalTqcl.g:329:1: entryRuleJvmWildcardTypeReference : ruleJvmWildcardTypeReference EOF ;
    public final void entryRuleJvmWildcardTypeReference() throws RecognitionException {
        try {
            // InternalTqcl.g:330:1: ( ruleJvmWildcardTypeReference EOF )
            // InternalTqcl.g:331:1: ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // InternalTqcl.g:338:1: ruleJvmWildcardTypeReference : ( ( rule__JvmWildcardTypeReference__Group__0 ) ) ;
    public final void ruleJvmWildcardTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:342:2: ( ( ( rule__JvmWildcardTypeReference__Group__0 ) ) )
            // InternalTqcl.g:343:2: ( ( rule__JvmWildcardTypeReference__Group__0 ) )
            {
            // InternalTqcl.g:343:2: ( ( rule__JvmWildcardTypeReference__Group__0 ) )
            // InternalTqcl.g:344:3: ( rule__JvmWildcardTypeReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getGroup()); 
            }
            // InternalTqcl.g:345:3: ( rule__JvmWildcardTypeReference__Group__0 )
            // InternalTqcl.g:345:4: rule__JvmWildcardTypeReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JvmWildcardTypeReference__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmWildcardTypeReferenceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // InternalTqcl.g:354:1: entryRuleJvmUpperBound : ruleJvmUpperBound EOF ;
    public final void entryRuleJvmUpperBound() throws RecognitionException {
        try {
            // InternalTqcl.g:355:1: ( ruleJvmUpperBound EOF )
            // InternalTqcl.g:356:1: ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmUpperBoundRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // InternalTqcl.g:363:1: ruleJvmUpperBound : ( ( rule__JvmUpperBound__Group__0 ) ) ;
    public final void ruleJvmUpperBound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:367:2: ( ( ( rule__JvmUpperBound__Group__0 ) ) )
            // InternalTqcl.g:368:2: ( ( rule__JvmUpperBound__Group__0 ) )
            {
            // InternalTqcl.g:368:2: ( ( rule__JvmUpperBound__Group__0 ) )
            // InternalTqcl.g:369:3: ( rule__JvmUpperBound__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmUpperBoundAccess().getGroup()); 
            }
            // InternalTqcl.g:370:3: ( rule__JvmUpperBound__Group__0 )
            // InternalTqcl.g:370:4: rule__JvmUpperBound__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JvmUpperBound__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmUpperBoundAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // InternalTqcl.g:379:1: entryRuleJvmUpperBoundAnded : ruleJvmUpperBoundAnded EOF ;
    public final void entryRuleJvmUpperBoundAnded() throws RecognitionException {
        try {
            // InternalTqcl.g:380:1: ( ruleJvmUpperBoundAnded EOF )
            // InternalTqcl.g:381:1: ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // InternalTqcl.g:388:1: ruleJvmUpperBoundAnded : ( ( rule__JvmUpperBoundAnded__Group__0 ) ) ;
    public final void ruleJvmUpperBoundAnded() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:392:2: ( ( ( rule__JvmUpperBoundAnded__Group__0 ) ) )
            // InternalTqcl.g:393:2: ( ( rule__JvmUpperBoundAnded__Group__0 ) )
            {
            // InternalTqcl.g:393:2: ( ( rule__JvmUpperBoundAnded__Group__0 ) )
            // InternalTqcl.g:394:3: ( rule__JvmUpperBoundAnded__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmUpperBoundAndedAccess().getGroup()); 
            }
            // InternalTqcl.g:395:3: ( rule__JvmUpperBoundAnded__Group__0 )
            // InternalTqcl.g:395:4: rule__JvmUpperBoundAnded__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JvmUpperBoundAnded__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmUpperBoundAndedAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // InternalTqcl.g:404:1: entryRuleJvmLowerBound : ruleJvmLowerBound EOF ;
    public final void entryRuleJvmLowerBound() throws RecognitionException {
        try {
            // InternalTqcl.g:405:1: ( ruleJvmLowerBound EOF )
            // InternalTqcl.g:406:1: ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmLowerBoundRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // InternalTqcl.g:413:1: ruleJvmLowerBound : ( ( rule__JvmLowerBound__Group__0 ) ) ;
    public final void ruleJvmLowerBound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:417:2: ( ( ( rule__JvmLowerBound__Group__0 ) ) )
            // InternalTqcl.g:418:2: ( ( rule__JvmLowerBound__Group__0 ) )
            {
            // InternalTqcl.g:418:2: ( ( rule__JvmLowerBound__Group__0 ) )
            // InternalTqcl.g:419:3: ( rule__JvmLowerBound__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmLowerBoundAccess().getGroup()); 
            }
            // InternalTqcl.g:420:3: ( rule__JvmLowerBound__Group__0 )
            // InternalTqcl.g:420:4: rule__JvmLowerBound__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JvmLowerBound__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmLowerBoundAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleJvmLowerBoundAnded"
    // InternalTqcl.g:429:1: entryRuleJvmLowerBoundAnded : ruleJvmLowerBoundAnded EOF ;
    public final void entryRuleJvmLowerBoundAnded() throws RecognitionException {
        try {
            // InternalTqcl.g:430:1: ( ruleJvmLowerBoundAnded EOF )
            // InternalTqcl.g:431:1: ruleJvmLowerBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmLowerBoundAndedRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleJvmLowerBoundAnded();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmLowerBoundAndedRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJvmLowerBoundAnded"


    // $ANTLR start "ruleJvmLowerBoundAnded"
    // InternalTqcl.g:438:1: ruleJvmLowerBoundAnded : ( ( rule__JvmLowerBoundAnded__Group__0 ) ) ;
    public final void ruleJvmLowerBoundAnded() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:442:2: ( ( ( rule__JvmLowerBoundAnded__Group__0 ) ) )
            // InternalTqcl.g:443:2: ( ( rule__JvmLowerBoundAnded__Group__0 ) )
            {
            // InternalTqcl.g:443:2: ( ( rule__JvmLowerBoundAnded__Group__0 ) )
            // InternalTqcl.g:444:3: ( rule__JvmLowerBoundAnded__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmLowerBoundAndedAccess().getGroup()); 
            }
            // InternalTqcl.g:445:3: ( rule__JvmLowerBoundAnded__Group__0 )
            // InternalTqcl.g:445:4: rule__JvmLowerBoundAnded__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JvmLowerBoundAnded__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmLowerBoundAndedAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJvmLowerBoundAnded"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalTqcl.g:454:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalTqcl.g:455:1: ( ruleQualifiedName EOF )
            // InternalTqcl.g:456:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalTqcl.g:463:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:467:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalTqcl.g:468:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalTqcl.g:468:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalTqcl.g:469:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalTqcl.g:470:3: ( rule__QualifiedName__Group__0 )
            // InternalTqcl.g:470:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalTqcl.g:479:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalTqcl.g:480:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalTqcl.g:481:1: ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalTqcl.g:488:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:492:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalTqcl.g:493:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalTqcl.g:493:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalTqcl.g:494:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // InternalTqcl.g:495:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalTqcl.g:495:4: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleValidID"
    // InternalTqcl.g:504:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // InternalTqcl.g:505:1: ( ruleValidID EOF )
            // InternalTqcl.g:506:1: ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidIDRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // InternalTqcl.g:513:1: ruleValidID : ( RULE_ID ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:517:2: ( ( RULE_ID ) )
            // InternalTqcl.g:518:2: ( RULE_ID )
            {
            // InternalTqcl.g:518:2: ( RULE_ID )
            // InternalTqcl.g:519:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleXImportDeclaration"
    // InternalTqcl.g:529:1: entryRuleXImportDeclaration : ruleXImportDeclaration EOF ;
    public final void entryRuleXImportDeclaration() throws RecognitionException {
        try {
            // InternalTqcl.g:530:1: ( ruleXImportDeclaration EOF )
            // InternalTqcl.g:531:1: ruleXImportDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXImportDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXImportDeclaration"


    // $ANTLR start "ruleXImportDeclaration"
    // InternalTqcl.g:538:1: ruleXImportDeclaration : ( ( rule__XImportDeclaration__Group__0 ) ) ;
    public final void ruleXImportDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:542:2: ( ( ( rule__XImportDeclaration__Group__0 ) ) )
            // InternalTqcl.g:543:2: ( ( rule__XImportDeclaration__Group__0 ) )
            {
            // InternalTqcl.g:543:2: ( ( rule__XImportDeclaration__Group__0 ) )
            // InternalTqcl.g:544:3: ( rule__XImportDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getGroup()); 
            }
            // InternalTqcl.g:545:3: ( rule__XImportDeclaration__Group__0 )
            // InternalTqcl.g:545:4: rule__XImportDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XImportDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXImportDeclaration"


    // $ANTLR start "entryRuleQualifiedNameInStaticImport"
    // InternalTqcl.g:554:1: entryRuleQualifiedNameInStaticImport : ruleQualifiedNameInStaticImport EOF ;
    public final void entryRuleQualifiedNameInStaticImport() throws RecognitionException {
        try {
            // InternalTqcl.g:555:1: ( ruleQualifiedNameInStaticImport EOF )
            // InternalTqcl.g:556:1: ruleQualifiedNameInStaticImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameInStaticImportRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedNameInStaticImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameInStaticImportRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedNameInStaticImport"


    // $ANTLR start "ruleQualifiedNameInStaticImport"
    // InternalTqcl.g:563:1: ruleQualifiedNameInStaticImport : ( ( ( rule__QualifiedNameInStaticImport__Group__0 ) ) ( ( rule__QualifiedNameInStaticImport__Group__0 )* ) ) ;
    public final void ruleQualifiedNameInStaticImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:567:2: ( ( ( ( rule__QualifiedNameInStaticImport__Group__0 ) ) ( ( rule__QualifiedNameInStaticImport__Group__0 )* ) ) )
            // InternalTqcl.g:568:2: ( ( ( rule__QualifiedNameInStaticImport__Group__0 ) ) ( ( rule__QualifiedNameInStaticImport__Group__0 )* ) )
            {
            // InternalTqcl.g:568:2: ( ( ( rule__QualifiedNameInStaticImport__Group__0 ) ) ( ( rule__QualifiedNameInStaticImport__Group__0 )* ) )
            // InternalTqcl.g:569:3: ( ( rule__QualifiedNameInStaticImport__Group__0 ) ) ( ( rule__QualifiedNameInStaticImport__Group__0 )* )
            {
            // InternalTqcl.g:569:3: ( ( rule__QualifiedNameInStaticImport__Group__0 ) )
            // InternalTqcl.g:570:4: ( rule__QualifiedNameInStaticImport__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameInStaticImportAccess().getGroup()); 
            }
            // InternalTqcl.g:571:4: ( rule__QualifiedNameInStaticImport__Group__0 )
            // InternalTqcl.g:571:5: rule__QualifiedNameInStaticImport__Group__0
            {
            pushFollow(FOLLOW_4);
            rule__QualifiedNameInStaticImport__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameInStaticImportAccess().getGroup()); 
            }

            }

            // InternalTqcl.g:574:3: ( ( rule__QualifiedNameInStaticImport__Group__0 )* )
            // InternalTqcl.g:575:4: ( rule__QualifiedNameInStaticImport__Group__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameInStaticImportAccess().getGroup()); 
            }
            // InternalTqcl.g:576:4: ( rule__QualifiedNameInStaticImport__Group__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==24) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // InternalTqcl.g:576:5: rule__QualifiedNameInStaticImport__Group__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__QualifiedNameInStaticImport__Group__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameInStaticImportAccess().getGroup()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameInStaticImport"


    // $ANTLR start "rule__Command__Alternatives"
    // InternalTqcl.g:585:1: rule__Command__Alternatives : ( ( ruleInsert ) | ( ruleConnect ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:589:1: ( ( ruleInsert ) | ( ruleConnect ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==10) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTqcl.g:590:2: ( ruleInsert )
                    {
                    // InternalTqcl.g:590:2: ( ruleInsert )
                    // InternalTqcl.g:591:3: ruleInsert
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getInsertParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleInsert();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getInsertParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTqcl.g:596:2: ( ruleConnect )
                    {
                    // InternalTqcl.g:596:2: ( ruleConnect )
                    // InternalTqcl.g:597:3: ruleConnect
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getConnectParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleConnect();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getConnectParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Alternatives"


    // $ANTLR start "rule__JvmTypeReference__Alternatives"
    // InternalTqcl.g:606:1: rule__JvmTypeReference__Alternatives : ( ( ( rule__JvmTypeReference__Group_0__0 ) ) | ( ruleXFunctionTypeRef ) );
    public final void rule__JvmTypeReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:610:1: ( ( ( rule__JvmTypeReference__Group_0__0 ) ) | ( ruleXFunctionTypeRef ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=18 && LA4_0<=19)) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTqcl.g:611:2: ( ( rule__JvmTypeReference__Group_0__0 ) )
                    {
                    // InternalTqcl.g:611:2: ( ( rule__JvmTypeReference__Group_0__0 ) )
                    // InternalTqcl.g:612:3: ( rule__JvmTypeReference__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getJvmTypeReferenceAccess().getGroup_0()); 
                    }
                    // InternalTqcl.g:613:3: ( rule__JvmTypeReference__Group_0__0 )
                    // InternalTqcl.g:613:4: rule__JvmTypeReference__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JvmTypeReference__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getJvmTypeReferenceAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTqcl.g:617:2: ( ruleXFunctionTypeRef )
                    {
                    // InternalTqcl.g:617:2: ( ruleXFunctionTypeRef )
                    // InternalTqcl.g:618:3: ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmTypeReference__Alternatives"


    // $ANTLR start "rule__JvmArgumentTypeReference__Alternatives"
    // InternalTqcl.g:627:1: rule__JvmArgumentTypeReference__Alternatives : ( ( ruleJvmTypeReference ) | ( ruleJvmWildcardTypeReference ) );
    public final void rule__JvmArgumentTypeReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:631:1: ( ( ruleJvmTypeReference ) | ( ruleJvmWildcardTypeReference ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID||(LA5_0>=18 && LA5_0<=19)) ) {
                alt5=1;
            }
            else if ( (LA5_0==25) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalTqcl.g:632:2: ( ruleJvmTypeReference )
                    {
                    // InternalTqcl.g:632:2: ( ruleJvmTypeReference )
                    // InternalTqcl.g:633:3: ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTqcl.g:638:2: ( ruleJvmWildcardTypeReference )
                    {
                    // InternalTqcl.g:638:2: ( ruleJvmWildcardTypeReference )
                    // InternalTqcl.g:639:3: ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmArgumentTypeReference__Alternatives"


    // $ANTLR start "rule__JvmWildcardTypeReference__Alternatives_2"
    // InternalTqcl.g:648:1: rule__JvmWildcardTypeReference__Alternatives_2 : ( ( ( rule__JvmWildcardTypeReference__Group_2_0__0 ) ) | ( ( rule__JvmWildcardTypeReference__Group_2_1__0 ) ) );
    public final void rule__JvmWildcardTypeReference__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:652:1: ( ( ( rule__JvmWildcardTypeReference__Group_2_0__0 ) ) | ( ( rule__JvmWildcardTypeReference__Group_2_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            else if ( (LA6_0==28) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTqcl.g:653:2: ( ( rule__JvmWildcardTypeReference__Group_2_0__0 ) )
                    {
                    // InternalTqcl.g:653:2: ( ( rule__JvmWildcardTypeReference__Group_2_0__0 ) )
                    // InternalTqcl.g:654:3: ( rule__JvmWildcardTypeReference__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getJvmWildcardTypeReferenceAccess().getGroup_2_0()); 
                    }
                    // InternalTqcl.g:655:3: ( rule__JvmWildcardTypeReference__Group_2_0__0 )
                    // InternalTqcl.g:655:4: rule__JvmWildcardTypeReference__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JvmWildcardTypeReference__Group_2_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getJvmWildcardTypeReferenceAccess().getGroup_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTqcl.g:659:2: ( ( rule__JvmWildcardTypeReference__Group_2_1__0 ) )
                    {
                    // InternalTqcl.g:659:2: ( ( rule__JvmWildcardTypeReference__Group_2_1__0 ) )
                    // InternalTqcl.g:660:3: ( rule__JvmWildcardTypeReference__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getJvmWildcardTypeReferenceAccess().getGroup_2_1()); 
                    }
                    // InternalTqcl.g:661:3: ( rule__JvmWildcardTypeReference__Group_2_1__0 )
                    // InternalTqcl.g:661:4: rule__JvmWildcardTypeReference__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JvmWildcardTypeReference__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getJvmWildcardTypeReferenceAccess().getGroup_2_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmWildcardTypeReference__Alternatives_2"


    // $ANTLR start "rule__XImportDeclaration__Alternatives_1"
    // InternalTqcl.g:669:1: rule__XImportDeclaration__Alternatives_1 : ( ( ( rule__XImportDeclaration__Group_1_0__0 ) ) | ( ( rule__XImportDeclaration__ImportedTypeAssignment_1_1 ) ) | ( ( rule__XImportDeclaration__ImportedNamespaceAssignment_1_2 ) ) );
    public final void rule__XImportDeclaration__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:673:1: ( ( ( rule__XImportDeclaration__Group_1_0__0 ) ) | ( ( rule__XImportDeclaration__ImportedTypeAssignment_1_1 ) ) | ( ( rule__XImportDeclaration__ImportedNamespaceAssignment_1_2 ) ) )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalTqcl.g:674:2: ( ( rule__XImportDeclaration__Group_1_0__0 ) )
                    {
                    // InternalTqcl.g:674:2: ( ( rule__XImportDeclaration__Group_1_0__0 ) )
                    // InternalTqcl.g:675:3: ( rule__XImportDeclaration__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXImportDeclarationAccess().getGroup_1_0()); 
                    }
                    // InternalTqcl.g:676:3: ( rule__XImportDeclaration__Group_1_0__0 )
                    // InternalTqcl.g:676:4: rule__XImportDeclaration__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XImportDeclaration__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXImportDeclarationAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTqcl.g:680:2: ( ( rule__XImportDeclaration__ImportedTypeAssignment_1_1 ) )
                    {
                    // InternalTqcl.g:680:2: ( ( rule__XImportDeclaration__ImportedTypeAssignment_1_1 ) )
                    // InternalTqcl.g:681:3: ( rule__XImportDeclaration__ImportedTypeAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXImportDeclarationAccess().getImportedTypeAssignment_1_1()); 
                    }
                    // InternalTqcl.g:682:3: ( rule__XImportDeclaration__ImportedTypeAssignment_1_1 )
                    // InternalTqcl.g:682:4: rule__XImportDeclaration__ImportedTypeAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XImportDeclaration__ImportedTypeAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXImportDeclarationAccess().getImportedTypeAssignment_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTqcl.g:686:2: ( ( rule__XImportDeclaration__ImportedNamespaceAssignment_1_2 ) )
                    {
                    // InternalTqcl.g:686:2: ( ( rule__XImportDeclaration__ImportedNamespaceAssignment_1_2 ) )
                    // InternalTqcl.g:687:3: ( rule__XImportDeclaration__ImportedNamespaceAssignment_1_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXImportDeclarationAccess().getImportedNamespaceAssignment_1_2()); 
                    }
                    // InternalTqcl.g:688:3: ( rule__XImportDeclaration__ImportedNamespaceAssignment_1_2 )
                    // InternalTqcl.g:688:4: rule__XImportDeclaration__ImportedNamespaceAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__XImportDeclaration__ImportedNamespaceAssignment_1_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXImportDeclarationAccess().getImportedNamespaceAssignment_1_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XImportDeclaration__Alternatives_1"


    // $ANTLR start "rule__XImportDeclaration__Alternatives_1_0_3"
    // InternalTqcl.g:696:1: rule__XImportDeclaration__Alternatives_1_0_3 : ( ( ( rule__XImportDeclaration__WildcardAssignment_1_0_3_0 ) ) | ( ( rule__XImportDeclaration__MemberNameAssignment_1_0_3_1 ) ) );
    public final void rule__XImportDeclaration__Alternatives_1_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:700:1: ( ( ( rule__XImportDeclaration__WildcardAssignment_1_0_3_0 ) ) | ( ( rule__XImportDeclaration__MemberNameAssignment_1_0_3_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTqcl.g:701:2: ( ( rule__XImportDeclaration__WildcardAssignment_1_0_3_0 ) )
                    {
                    // InternalTqcl.g:701:2: ( ( rule__XImportDeclaration__WildcardAssignment_1_0_3_0 ) )
                    // InternalTqcl.g:702:3: ( rule__XImportDeclaration__WildcardAssignment_1_0_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXImportDeclarationAccess().getWildcardAssignment_1_0_3_0()); 
                    }
                    // InternalTqcl.g:703:3: ( rule__XImportDeclaration__WildcardAssignment_1_0_3_0 )
                    // InternalTqcl.g:703:4: rule__XImportDeclaration__WildcardAssignment_1_0_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XImportDeclaration__WildcardAssignment_1_0_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXImportDeclarationAccess().getWildcardAssignment_1_0_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTqcl.g:707:2: ( ( rule__XImportDeclaration__MemberNameAssignment_1_0_3_1 ) )
                    {
                    // InternalTqcl.g:707:2: ( ( rule__XImportDeclaration__MemberNameAssignment_1_0_3_1 ) )
                    // InternalTqcl.g:708:3: ( rule__XImportDeclaration__MemberNameAssignment_1_0_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXImportDeclarationAccess().getMemberNameAssignment_1_0_3_1()); 
                    }
                    // InternalTqcl.g:709:3: ( rule__XImportDeclaration__MemberNameAssignment_1_0_3_1 )
                    // InternalTqcl.g:709:4: rule__XImportDeclaration__MemberNameAssignment_1_0_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XImportDeclaration__MemberNameAssignment_1_0_3_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXImportDeclarationAccess().getMemberNameAssignment_1_0_3_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XImportDeclaration__Alternatives_1_0_3"


    // $ANTLR start "rule__Insert__Group__0"
    // InternalTqcl.g:717:1: rule__Insert__Group__0 : rule__Insert__Group__0__Impl rule__Insert__Group__1 ;
    public final void rule__Insert__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:721:1: ( rule__Insert__Group__0__Impl rule__Insert__Group__1 )
            // InternalTqcl.g:722:2: rule__Insert__Group__0__Impl rule__Insert__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Insert__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Insert__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__0"


    // $ANTLR start "rule__Insert__Group__0__Impl"
    // InternalTqcl.g:729:1: rule__Insert__Group__0__Impl : ( 'insert' ) ;
    public final void rule__Insert__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:733:1: ( ( 'insert' ) )
            // InternalTqcl.g:734:1: ( 'insert' )
            {
            // InternalTqcl.g:734:1: ( 'insert' )
            // InternalTqcl.g:735:2: 'insert'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertAccess().getInsertKeyword_0()); 
            }
            match(input,10,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInsertAccess().getInsertKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__0__Impl"


    // $ANTLR start "rule__Insert__Group__1"
    // InternalTqcl.g:744:1: rule__Insert__Group__1 : rule__Insert__Group__1__Impl rule__Insert__Group__2 ;
    public final void rule__Insert__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:748:1: ( rule__Insert__Group__1__Impl rule__Insert__Group__2 )
            // InternalTqcl.g:749:2: rule__Insert__Group__1__Impl rule__Insert__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Insert__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Insert__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__1"


    // $ANTLR start "rule__Insert__Group__1__Impl"
    // InternalTqcl.g:756:1: rule__Insert__Group__1__Impl : ( ( rule__Insert__ObjAssignment_1 ) ) ;
    public final void rule__Insert__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:760:1: ( ( ( rule__Insert__ObjAssignment_1 ) ) )
            // InternalTqcl.g:761:1: ( ( rule__Insert__ObjAssignment_1 ) )
            {
            // InternalTqcl.g:761:1: ( ( rule__Insert__ObjAssignment_1 ) )
            // InternalTqcl.g:762:2: ( rule__Insert__ObjAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertAccess().getObjAssignment_1()); 
            }
            // InternalTqcl.g:763:2: ( rule__Insert__ObjAssignment_1 )
            // InternalTqcl.g:763:3: rule__Insert__ObjAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Insert__ObjAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInsertAccess().getObjAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__1__Impl"


    // $ANTLR start "rule__Insert__Group__2"
    // InternalTqcl.g:771:1: rule__Insert__Group__2 : rule__Insert__Group__2__Impl rule__Insert__Group__3 ;
    public final void rule__Insert__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:775:1: ( rule__Insert__Group__2__Impl rule__Insert__Group__3 )
            // InternalTqcl.g:776:2: rule__Insert__Group__2__Impl rule__Insert__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Insert__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Insert__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__2"


    // $ANTLR start "rule__Insert__Group__2__Impl"
    // InternalTqcl.g:783:1: rule__Insert__Group__2__Impl : ( ( rule__Insert__Group_2__0 )? ) ;
    public final void rule__Insert__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:787:1: ( ( ( rule__Insert__Group_2__0 )? ) )
            // InternalTqcl.g:788:1: ( ( rule__Insert__Group_2__0 )? )
            {
            // InternalTqcl.g:788:1: ( ( rule__Insert__Group_2__0 )? )
            // InternalTqcl.g:789:2: ( rule__Insert__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertAccess().getGroup_2()); 
            }
            // InternalTqcl.g:790:2: ( rule__Insert__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==11) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTqcl.g:790:3: rule__Insert__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Insert__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInsertAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__2__Impl"


    // $ANTLR start "rule__Insert__Group__3"
    // InternalTqcl.g:798:1: rule__Insert__Group__3 : rule__Insert__Group__3__Impl ;
    public final void rule__Insert__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:802:1: ( rule__Insert__Group__3__Impl )
            // InternalTqcl.g:803:2: rule__Insert__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Insert__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__3"


    // $ANTLR start "rule__Insert__Group__3__Impl"
    // InternalTqcl.g:809:1: rule__Insert__Group__3__Impl : ( ( rule__Insert__Group_3__0 )? ) ;
    public final void rule__Insert__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:813:1: ( ( ( rule__Insert__Group_3__0 )? ) )
            // InternalTqcl.g:814:1: ( ( rule__Insert__Group_3__0 )? )
            {
            // InternalTqcl.g:814:1: ( ( rule__Insert__Group_3__0 )? )
            // InternalTqcl.g:815:2: ( rule__Insert__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertAccess().getGroup_3()); 
            }
            // InternalTqcl.g:816:2: ( rule__Insert__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==12) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTqcl.g:816:3: rule__Insert__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Insert__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInsertAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__3__Impl"


    // $ANTLR start "rule__Insert__Group_2__0"
    // InternalTqcl.g:825:1: rule__Insert__Group_2__0 : rule__Insert__Group_2__0__Impl rule__Insert__Group_2__1 ;
    public final void rule__Insert__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:829:1: ( rule__Insert__Group_2__0__Impl rule__Insert__Group_2__1 )
            // InternalTqcl.g:830:2: rule__Insert__Group_2__0__Impl rule__Insert__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Insert__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Insert__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group_2__0"


    // $ANTLR start "rule__Insert__Group_2__0__Impl"
    // InternalTqcl.g:837:1: rule__Insert__Group_2__0__Impl : ( 'as' ) ;
    public final void rule__Insert__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:841:1: ( ( 'as' ) )
            // InternalTqcl.g:842:1: ( 'as' )
            {
            // InternalTqcl.g:842:1: ( 'as' )
            // InternalTqcl.g:843:2: 'as'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertAccess().getAsKeyword_2_0()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInsertAccess().getAsKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group_2__0__Impl"


    // $ANTLR start "rule__Insert__Group_2__1"
    // InternalTqcl.g:852:1: rule__Insert__Group_2__1 : rule__Insert__Group_2__1__Impl ;
    public final void rule__Insert__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:856:1: ( rule__Insert__Group_2__1__Impl )
            // InternalTqcl.g:857:2: rule__Insert__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Insert__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group_2__1"


    // $ANTLR start "rule__Insert__Group_2__1__Impl"
    // InternalTqcl.g:863:1: rule__Insert__Group_2__1__Impl : ( ( rule__Insert__AliasAssignment_2_1 ) ) ;
    public final void rule__Insert__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:867:1: ( ( ( rule__Insert__AliasAssignment_2_1 ) ) )
            // InternalTqcl.g:868:1: ( ( rule__Insert__AliasAssignment_2_1 ) )
            {
            // InternalTqcl.g:868:1: ( ( rule__Insert__AliasAssignment_2_1 ) )
            // InternalTqcl.g:869:2: ( rule__Insert__AliasAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertAccess().getAliasAssignment_2_1()); 
            }
            // InternalTqcl.g:870:2: ( rule__Insert__AliasAssignment_2_1 )
            // InternalTqcl.g:870:3: rule__Insert__AliasAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Insert__AliasAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInsertAccess().getAliasAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group_2__1__Impl"


    // $ANTLR start "rule__Insert__Group_3__0"
    // InternalTqcl.g:879:1: rule__Insert__Group_3__0 : rule__Insert__Group_3__0__Impl rule__Insert__Group_3__1 ;
    public final void rule__Insert__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:883:1: ( rule__Insert__Group_3__0__Impl rule__Insert__Group_3__1 )
            // InternalTqcl.g:884:2: rule__Insert__Group_3__0__Impl rule__Insert__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Insert__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Insert__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group_3__0"


    // $ANTLR start "rule__Insert__Group_3__0__Impl"
    // InternalTqcl.g:891:1: rule__Insert__Group_3__0__Impl : ( 'with' ) ;
    public final void rule__Insert__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:895:1: ( ( 'with' ) )
            // InternalTqcl.g:896:1: ( 'with' )
            {
            // InternalTqcl.g:896:1: ( 'with' )
            // InternalTqcl.g:897:2: 'with'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertAccess().getWithKeyword_3_0()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInsertAccess().getWithKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group_3__0__Impl"


    // $ANTLR start "rule__Insert__Group_3__1"
    // InternalTqcl.g:906:1: rule__Insert__Group_3__1 : rule__Insert__Group_3__1__Impl ;
    public final void rule__Insert__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:910:1: ( rule__Insert__Group_3__1__Impl )
            // InternalTqcl.g:911:2: rule__Insert__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Insert__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group_3__1"


    // $ANTLR start "rule__Insert__Group_3__1__Impl"
    // InternalTqcl.g:917:1: rule__Insert__Group_3__1__Impl : ( ( rule__Insert__ParametersAssignment_3_1 )* ) ;
    public final void rule__Insert__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:921:1: ( ( ( rule__Insert__ParametersAssignment_3_1 )* ) )
            // InternalTqcl.g:922:1: ( ( rule__Insert__ParametersAssignment_3_1 )* )
            {
            // InternalTqcl.g:922:1: ( ( rule__Insert__ParametersAssignment_3_1 )* )
            // InternalTqcl.g:923:2: ( rule__Insert__ParametersAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertAccess().getParametersAssignment_3_1()); 
            }
            // InternalTqcl.g:924:2: ( rule__Insert__ParametersAssignment_3_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTqcl.g:924:3: rule__Insert__ParametersAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Insert__ParametersAssignment_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInsertAccess().getParametersAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group_3__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalTqcl.g:933:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:937:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalTqcl.g:938:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Parameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalTqcl.g:945:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:949:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // InternalTqcl.g:950:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // InternalTqcl.g:950:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // InternalTqcl.g:951:2: ( rule__Parameter__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            }
            // InternalTqcl.g:952:2: ( rule__Parameter__NameAssignment_0 )
            // InternalTqcl.g:952:3: rule__Parameter__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalTqcl.g:960:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:964:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalTqcl.g:965:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Parameter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalTqcl.g:972:1: rule__Parameter__Group__1__Impl : ( '=' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:976:1: ( ( '=' ) )
            // InternalTqcl.g:977:1: ( '=' )
            {
            // InternalTqcl.g:977:1: ( '=' )
            // InternalTqcl.g:978:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getEqualsSignKeyword_1()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalTqcl.g:987:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:991:1: ( rule__Parameter__Group__2__Impl )
            // InternalTqcl.g:992:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalTqcl.g:998:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__ValueAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1002:1: ( ( ( rule__Parameter__ValueAssignment_2 ) ) )
            // InternalTqcl.g:1003:1: ( ( rule__Parameter__ValueAssignment_2 ) )
            {
            // InternalTqcl.g:1003:1: ( ( rule__Parameter__ValueAssignment_2 ) )
            // InternalTqcl.g:1004:2: ( rule__Parameter__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getValueAssignment_2()); 
            }
            // InternalTqcl.g:1005:2: ( rule__Parameter__ValueAssignment_2 )
            // InternalTqcl.g:1005:3: rule__Parameter__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Connect__Group__0"
    // InternalTqcl.g:1014:1: rule__Connect__Group__0 : rule__Connect__Group__0__Impl rule__Connect__Group__1 ;
    public final void rule__Connect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1018:1: ( rule__Connect__Group__0__Impl rule__Connect__Group__1 )
            // InternalTqcl.g:1019:2: rule__Connect__Group__0__Impl rule__Connect__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Connect__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Connect__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__Group__0"


    // $ANTLR start "rule__Connect__Group__0__Impl"
    // InternalTqcl.g:1026:1: rule__Connect__Group__0__Impl : ( 'connect' ) ;
    public final void rule__Connect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1030:1: ( ( 'connect' ) )
            // InternalTqcl.g:1031:1: ( 'connect' )
            {
            // InternalTqcl.g:1031:1: ( 'connect' )
            // InternalTqcl.g:1032:2: 'connect'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectAccess().getConnectKeyword_0()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectAccess().getConnectKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__Group__0__Impl"


    // $ANTLR start "rule__Connect__Group__1"
    // InternalTqcl.g:1041:1: rule__Connect__Group__1 : rule__Connect__Group__1__Impl rule__Connect__Group__2 ;
    public final void rule__Connect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1045:1: ( rule__Connect__Group__1__Impl rule__Connect__Group__2 )
            // InternalTqcl.g:1046:2: rule__Connect__Group__1__Impl rule__Connect__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Connect__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Connect__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__Group__1"


    // $ANTLR start "rule__Connect__Group__1__Impl"
    // InternalTqcl.g:1053:1: rule__Connect__Group__1__Impl : ( ( rule__Connect__FromAssignment_1 ) ) ;
    public final void rule__Connect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1057:1: ( ( ( rule__Connect__FromAssignment_1 ) ) )
            // InternalTqcl.g:1058:1: ( ( rule__Connect__FromAssignment_1 ) )
            {
            // InternalTqcl.g:1058:1: ( ( rule__Connect__FromAssignment_1 ) )
            // InternalTqcl.g:1059:2: ( rule__Connect__FromAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectAccess().getFromAssignment_1()); 
            }
            // InternalTqcl.g:1060:2: ( rule__Connect__FromAssignment_1 )
            // InternalTqcl.g:1060:3: rule__Connect__FromAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Connect__FromAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectAccess().getFromAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__Group__1__Impl"


    // $ANTLR start "rule__Connect__Group__2"
    // InternalTqcl.g:1068:1: rule__Connect__Group__2 : rule__Connect__Group__2__Impl rule__Connect__Group__3 ;
    public final void rule__Connect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1072:1: ( rule__Connect__Group__2__Impl rule__Connect__Group__3 )
            // InternalTqcl.g:1073:2: rule__Connect__Group__2__Impl rule__Connect__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Connect__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Connect__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__Group__2"


    // $ANTLR start "rule__Connect__Group__2__Impl"
    // InternalTqcl.g:1080:1: rule__Connect__Group__2__Impl : ( 'to' ) ;
    public final void rule__Connect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1084:1: ( ( 'to' ) )
            // InternalTqcl.g:1085:1: ( 'to' )
            {
            // InternalTqcl.g:1085:1: ( 'to' )
            // InternalTqcl.g:1086:2: 'to'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectAccess().getToKeyword_2()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectAccess().getToKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__Group__2__Impl"


    // $ANTLR start "rule__Connect__Group__3"
    // InternalTqcl.g:1095:1: rule__Connect__Group__3 : rule__Connect__Group__3__Impl ;
    public final void rule__Connect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1099:1: ( rule__Connect__Group__3__Impl )
            // InternalTqcl.g:1100:2: rule__Connect__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connect__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__Group__3"


    // $ANTLR start "rule__Connect__Group__3__Impl"
    // InternalTqcl.g:1106:1: rule__Connect__Group__3__Impl : ( ( rule__Connect__ToAssignment_3 ) ) ;
    public final void rule__Connect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1110:1: ( ( ( rule__Connect__ToAssignment_3 ) ) )
            // InternalTqcl.g:1111:1: ( ( rule__Connect__ToAssignment_3 ) )
            {
            // InternalTqcl.g:1111:1: ( ( rule__Connect__ToAssignment_3 ) )
            // InternalTqcl.g:1112:2: ( rule__Connect__ToAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectAccess().getToAssignment_3()); 
            }
            // InternalTqcl.g:1113:2: ( rule__Connect__ToAssignment_3 )
            // InternalTqcl.g:1113:3: rule__Connect__ToAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Connect__ToAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectAccess().getToAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__Group__3__Impl"


    // $ANTLR start "rule__JvmTypeReference__Group_0__0"
    // InternalTqcl.g:1122:1: rule__JvmTypeReference__Group_0__0 : rule__JvmTypeReference__Group_0__0__Impl rule__JvmTypeReference__Group_0__1 ;
    public final void rule__JvmTypeReference__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1126:1: ( rule__JvmTypeReference__Group_0__0__Impl rule__JvmTypeReference__Group_0__1 )
            // InternalTqcl.g:1127:2: rule__JvmTypeReference__Group_0__0__Impl rule__JvmTypeReference__Group_0__1
            {
            pushFollow(FOLLOW_10);
            rule__JvmTypeReference__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmTypeReference__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmTypeReference__Group_0__0"


    // $ANTLR start "rule__JvmTypeReference__Group_0__0__Impl"
    // InternalTqcl.g:1134:1: rule__JvmTypeReference__Group_0__0__Impl : ( ruleJvmParameterizedTypeReference ) ;
    public final void rule__JvmTypeReference__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1138:1: ( ( ruleJvmParameterizedTypeReference ) )
            // InternalTqcl.g:1139:1: ( ruleJvmParameterizedTypeReference )
            {
            // InternalTqcl.g:1139:1: ( ruleJvmParameterizedTypeReference )
            // InternalTqcl.g:1140:2: ruleJvmParameterizedTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmTypeReference__Group_0__0__Impl"


    // $ANTLR start "rule__JvmTypeReference__Group_0__1"
    // InternalTqcl.g:1149:1: rule__JvmTypeReference__Group_0__1 : rule__JvmTypeReference__Group_0__1__Impl ;
    public final void rule__JvmTypeReference__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1153:1: ( rule__JvmTypeReference__Group_0__1__Impl )
            // InternalTqcl.g:1154:2: rule__JvmTypeReference__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JvmTypeReference__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmTypeReference__Group_0__1"


    // $ANTLR start "rule__JvmTypeReference__Group_0__1__Impl"
    // InternalTqcl.g:1160:1: rule__JvmTypeReference__Group_0__1__Impl : ( ( rule__JvmTypeReference__Group_0_1__0 )* ) ;
    public final void rule__JvmTypeReference__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1164:1: ( ( ( rule__JvmTypeReference__Group_0_1__0 )* ) )
            // InternalTqcl.g:1165:1: ( ( rule__JvmTypeReference__Group_0_1__0 )* )
            {
            // InternalTqcl.g:1165:1: ( ( rule__JvmTypeReference__Group_0_1__0 )* )
            // InternalTqcl.g:1166:2: ( rule__JvmTypeReference__Group_0_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmTypeReferenceAccess().getGroup_0_1()); 
            }
            // InternalTqcl.g:1167:2: ( rule__JvmTypeReference__Group_0_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTqcl.g:1167:3: rule__JvmTypeReference__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__JvmTypeReference__Group_0_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmTypeReferenceAccess().getGroup_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmTypeReference__Group_0__1__Impl"


    // $ANTLR start "rule__JvmTypeReference__Group_0_1__0"
    // InternalTqcl.g:1176:1: rule__JvmTypeReference__Group_0_1__0 : rule__JvmTypeReference__Group_0_1__0__Impl ;
    public final void rule__JvmTypeReference__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1180:1: ( rule__JvmTypeReference__Group_0_1__0__Impl )
            // InternalTqcl.g:1181:2: rule__JvmTypeReference__Group_0_1__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JvmTypeReference__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmTypeReference__Group_0_1__0"


    // $ANTLR start "rule__JvmTypeReference__Group_0_1__0__Impl"
    // InternalTqcl.g:1187:1: rule__JvmTypeReference__Group_0_1__0__Impl : ( ( rule__JvmTypeReference__Group_0_1_0__0 ) ) ;
    public final void rule__JvmTypeReference__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1191:1: ( ( ( rule__JvmTypeReference__Group_0_1_0__0 ) ) )
            // InternalTqcl.g:1192:1: ( ( rule__JvmTypeReference__Group_0_1_0__0 ) )
            {
            // InternalTqcl.g:1192:1: ( ( rule__JvmTypeReference__Group_0_1_0__0 ) )
            // InternalTqcl.g:1193:2: ( rule__JvmTypeReference__Group_0_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmTypeReferenceAccess().getGroup_0_1_0()); 
            }
            // InternalTqcl.g:1194:2: ( rule__JvmTypeReference__Group_0_1_0__0 )
            // InternalTqcl.g:1194:3: rule__JvmTypeReference__Group_0_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__JvmTypeReference__Group_0_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmTypeReferenceAccess().getGroup_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmTypeReference__Group_0_1__0__Impl"


    // $ANTLR start "rule__JvmTypeReference__Group_0_1_0__0"
    // InternalTqcl.g:1203:1: rule__JvmTypeReference__Group_0_1_0__0 : rule__JvmTypeReference__Group_0_1_0__0__Impl rule__JvmTypeReference__Group_0_1_0__1 ;
    public final void rule__JvmTypeReference__Group_0_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1207:1: ( rule__JvmTypeReference__Group_0_1_0__0__Impl rule__JvmTypeReference__Group_0_1_0__1 )
            // InternalTqcl.g:1208:2: rule__JvmTypeReference__Group_0_1_0__0__Impl rule__JvmTypeReference__Group_0_1_0__1
            {
            pushFollow(FOLLOW_10);
            rule__JvmTypeReference__Group_0_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmTypeReference__Group_0_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmTypeReference__Group_0_1_0__0"


    // $ANTLR start "rule__JvmTypeReference__Group_0_1_0__0__Impl"
    // InternalTqcl.g:1215:1: rule__JvmTypeReference__Group_0_1_0__0__Impl : ( () ) ;
    public final void rule__JvmTypeReference__Group_0_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1219:1: ( ( () ) )
            // InternalTqcl.g:1220:1: ( () )
            {
            // InternalTqcl.g:1220:1: ( () )
            // InternalTqcl.g:1221:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0()); 
            }
            // InternalTqcl.g:1222:2: ()
            // InternalTqcl.g:1222:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmTypeReference__Group_0_1_0__0__Impl"


    // $ANTLR start "rule__JvmTypeReference__Group_0_1_0__1"
    // InternalTqcl.g:1230:1: rule__JvmTypeReference__Group_0_1_0__1 : rule__JvmTypeReference__Group_0_1_0__1__Impl ;
    public final void rule__JvmTypeReference__Group_0_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1234:1: ( rule__JvmTypeReference__Group_0_1_0__1__Impl )
            // InternalTqcl.g:1235:2: rule__JvmTypeReference__Group_0_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JvmTypeReference__Group_0_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmTypeReference__Group_0_1_0__1"


    // $ANTLR start "rule__JvmTypeReference__Group_0_1_0__1__Impl"
    // InternalTqcl.g:1241:1: rule__JvmTypeReference__Group_0_1_0__1__Impl : ( ruleArrayBrackets ) ;
    public final void rule__JvmTypeReference__Group_0_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1245:1: ( ( ruleArrayBrackets ) )
            // InternalTqcl.g:1246:1: ( ruleArrayBrackets )
            {
            // InternalTqcl.g:1246:1: ( ruleArrayBrackets )
            // InternalTqcl.g:1247:2: ruleArrayBrackets
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmTypeReferenceAccess().getArrayBracketsParserRuleCall_0_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleArrayBrackets();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmTypeReferenceAccess().getArrayBracketsParserRuleCall_0_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmTypeReference__Group_0_1_0__1__Impl"


    // $ANTLR start "rule__ArrayBrackets__Group__0"
    // InternalTqcl.g:1257:1: rule__ArrayBrackets__Group__0 : rule__ArrayBrackets__Group__0__Impl rule__ArrayBrackets__Group__1 ;
    public final void rule__ArrayBrackets__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1261:1: ( rule__ArrayBrackets__Group__0__Impl rule__ArrayBrackets__Group__1 )
            // InternalTqcl.g:1262:2: rule__ArrayBrackets__Group__0__Impl rule__ArrayBrackets__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__ArrayBrackets__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayBrackets__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayBrackets__Group__0"


    // $ANTLR start "rule__ArrayBrackets__Group__0__Impl"
    // InternalTqcl.g:1269:1: rule__ArrayBrackets__Group__0__Impl : ( '[' ) ;
    public final void rule__ArrayBrackets__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1273:1: ( ( '[' ) )
            // InternalTqcl.g:1274:1: ( '[' )
            {
            // InternalTqcl.g:1274:1: ( '[' )
            // InternalTqcl.g:1275:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayBracketsAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayBracketsAccess().getLeftSquareBracketKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayBrackets__Group__0__Impl"


    // $ANTLR start "rule__ArrayBrackets__Group__1"
    // InternalTqcl.g:1284:1: rule__ArrayBrackets__Group__1 : rule__ArrayBrackets__Group__1__Impl ;
    public final void rule__ArrayBrackets__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1288:1: ( rule__ArrayBrackets__Group__1__Impl )
            // InternalTqcl.g:1289:2: rule__ArrayBrackets__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayBrackets__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayBrackets__Group__1"


    // $ANTLR start "rule__ArrayBrackets__Group__1__Impl"
    // InternalTqcl.g:1295:1: rule__ArrayBrackets__Group__1__Impl : ( ']' ) ;
    public final void rule__ArrayBrackets__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1299:1: ( ( ']' ) )
            // InternalTqcl.g:1300:1: ( ']' )
            {
            // InternalTqcl.g:1300:1: ( ']' )
            // InternalTqcl.g:1301:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayBracketsAccess().getRightSquareBracketKeyword_1()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayBracketsAccess().getRightSquareBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayBrackets__Group__1__Impl"


    // $ANTLR start "rule__XFunctionTypeRef__Group__0"
    // InternalTqcl.g:1311:1: rule__XFunctionTypeRef__Group__0 : rule__XFunctionTypeRef__Group__0__Impl rule__XFunctionTypeRef__Group__1 ;
    public final void rule__XFunctionTypeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1315:1: ( rule__XFunctionTypeRef__Group__0__Impl rule__XFunctionTypeRef__Group__1 )
            // InternalTqcl.g:1316:2: rule__XFunctionTypeRef__Group__0__Impl rule__XFunctionTypeRef__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__XFunctionTypeRef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XFunctionTypeRef__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XFunctionTypeRef__Group__0"


    // $ANTLR start "rule__XFunctionTypeRef__Group__0__Impl"
    // InternalTqcl.g:1323:1: rule__XFunctionTypeRef__Group__0__Impl : ( ( rule__XFunctionTypeRef__Group_0__0 )? ) ;
    public final void rule__XFunctionTypeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1327:1: ( ( ( rule__XFunctionTypeRef__Group_0__0 )? ) )
            // InternalTqcl.g:1328:1: ( ( rule__XFunctionTypeRef__Group_0__0 )? )
            {
            // InternalTqcl.g:1328:1: ( ( rule__XFunctionTypeRef__Group_0__0 )? )
            // InternalTqcl.g:1329:2: ( rule__XFunctionTypeRef__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getGroup_0()); 
            }
            // InternalTqcl.g:1330:2: ( rule__XFunctionTypeRef__Group_0__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTqcl.g:1330:3: rule__XFunctionTypeRef__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XFunctionTypeRef__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XFunctionTypeRef__Group__0__Impl"


    // $ANTLR start "rule__XFunctionTypeRef__Group__1"
    // InternalTqcl.g:1338:1: rule__XFunctionTypeRef__Group__1 : rule__XFunctionTypeRef__Group__1__Impl rule__XFunctionTypeRef__Group__2 ;
    public final void rule__XFunctionTypeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1342:1: ( rule__XFunctionTypeRef__Group__1__Impl rule__XFunctionTypeRef__Group__2 )
            // InternalTqcl.g:1343:2: rule__XFunctionTypeRef__Group__1__Impl rule__XFunctionTypeRef__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__XFunctionTypeRef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XFunctionTypeRef__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XFunctionTypeRef__Group__1"


    // $ANTLR start "rule__XFunctionTypeRef__Group__1__Impl"
    // InternalTqcl.g:1350:1: rule__XFunctionTypeRef__Group__1__Impl : ( '=>' ) ;
    public final void rule__XFunctionTypeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1354:1: ( ( '=>' ) )
            // InternalTqcl.g:1355:1: ( '=>' )
            {
            // InternalTqcl.g:1355:1: ( '=>' )
            // InternalTqcl.g:1356:2: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XFunctionTypeRef__Group__1__Impl"


    // $ANTLR start "rule__XFunctionTypeRef__Group__2"
    // InternalTqcl.g:1365:1: rule__XFunctionTypeRef__Group__2 : rule__XFunctionTypeRef__Group__2__Impl ;
    public final void rule__XFunctionTypeRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1369:1: ( rule__XFunctionTypeRef__Group__2__Impl )
            // InternalTqcl.g:1370:2: rule__XFunctionTypeRef__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XFunctionTypeRef__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XFunctionTypeRef__Group__2"


    // $ANTLR start "rule__XFunctionTypeRef__Group__2__Impl"
    // InternalTqcl.g:1376:1: rule__XFunctionTypeRef__Group__2__Impl : ( ( rule__XFunctionTypeRef__ReturnTypeAssignment_2 ) ) ;
    public final void rule__XFunctionTypeRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1380:1: ( ( ( rule__XFunctionTypeRef__ReturnTypeAssignment_2 ) ) )
            // InternalTqcl.g:1381:1: ( ( rule__XFunctionTypeRef__ReturnTypeAssignment_2 ) )
            {
            // InternalTqcl.g:1381:1: ( ( rule__XFunctionTypeRef__ReturnTypeAssignment_2 ) )
            // InternalTqcl.g:1382:2: ( rule__XFunctionTypeRef__ReturnTypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeAssignment_2()); 
            }
            // InternalTqcl.g:1383:2: ( rule__XFunctionTypeRef__ReturnTypeAssignment_2 )
            // InternalTqcl.g:1383:3: rule__XFunctionTypeRef__ReturnTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XFunctionTypeRef__ReturnTypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XFunctionTypeRef__Group__2__Impl"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0__0"
    // InternalTqcl.g:1392:1: rule__XFunctionTypeRef__Group_0__0 : rule__XFunctionTypeRef__Group_0__0__Impl rule__XFunctionTypeRef__Group_0__1 ;
    public final void rule__XFunctionTypeRef__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1396:1: ( rule__XFunctionTypeRef__Group_0__0__Impl rule__XFunctionTypeRef__Group_0__1 )
            // InternalTqcl.g:1397:2: rule__XFunctionTypeRef__Group_0__0__Impl rule__XFunctionTypeRef__Group_0__1
            {
            pushFollow(FOLLOW_15);
            rule__XFunctionTypeRef__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XFunctionTypeRef__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XFunctionTypeRef__Group_0__0"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0__0__Impl"
    // InternalTqcl.g:1404:1: rule__XFunctionTypeRef__Group_0__0__Impl : ( '(' ) ;
    public final void rule__XFunctionTypeRef__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1408:1: ( ( '(' ) )
            // InternalTqcl.g:1409:1: ( '(' )
            {
            // InternalTqcl.g:1409:1: ( '(' )
            // InternalTqcl.g:1410:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XFunctionTypeRef__Group_0__0__Impl"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0__1"
    // InternalTqcl.g:1419:1: rule__XFunctionTypeRef__Group_0__1 : rule__XFunctionTypeRef__Group_0__1__Impl rule__XFunctionTypeRef__Group_0__2 ;
    public final void rule__XFunctionTypeRef__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1423:1: ( rule__XFunctionTypeRef__Group_0__1__Impl rule__XFunctionTypeRef__Group_0__2 )
            // InternalTqcl.g:1424:2: rule__XFunctionTypeRef__Group_0__1__Impl rule__XFunctionTypeRef__Group_0__2
            {
            pushFollow(FOLLOW_15);
            rule__XFunctionTypeRef__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XFunctionTypeRef__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XFunctionTypeRef__Group_0__1"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0__1__Impl"
    // InternalTqcl.g:1431:1: rule__XFunctionTypeRef__Group_0__1__Impl : ( ( rule__XFunctionTypeRef__Group_0_1__0 )? ) ;
    public final void rule__XFunctionTypeRef__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1435:1: ( ( ( rule__XFunctionTypeRef__Group_0_1__0 )? ) )
            // InternalTqcl.g:1436:1: ( ( rule__XFunctionTypeRef__Group_0_1__0 )? )
            {
            // InternalTqcl.g:1436:1: ( ( rule__XFunctionTypeRef__Group_0_1__0 )? )
            // InternalTqcl.g:1437:2: ( rule__XFunctionTypeRef__Group_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getGroup_0_1()); 
            }
            // InternalTqcl.g:1438:2: ( rule__XFunctionTypeRef__Group_0_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID||(LA14_0>=18 && LA14_0<=19)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTqcl.g:1438:3: rule__XFunctionTypeRef__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XFunctionTypeRef__Group_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getGroup_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XFunctionTypeRef__Group_0__1__Impl"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0__2"
    // InternalTqcl.g:1446:1: rule__XFunctionTypeRef__Group_0__2 : rule__XFunctionTypeRef__Group_0__2__Impl ;
    public final void rule__XFunctionTypeRef__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1450:1: ( rule__XFunctionTypeRef__Group_0__2__Impl )
            // InternalTqcl.g:1451:2: rule__XFunctionTypeRef__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XFunctionTypeRef__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XFunctionTypeRef__Group_0__2"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0__2__Impl"
    // InternalTqcl.g:1457:1: rule__XFunctionTypeRef__Group_0__2__Impl : ( ')' ) ;
    public final void rule__XFunctionTypeRef__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1461:1: ( ( ')' ) )
            // InternalTqcl.g:1462:1: ( ')' )
            {
            // InternalTqcl.g:1462:1: ( ')' )
            // InternalTqcl.g:1463:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XFunctionTypeRef__Group_0__2__Impl"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0_1__0"
    // InternalTqcl.g:1473:1: rule__XFunctionTypeRef__Group_0_1__0 : rule__XFunctionTypeRef__Group_0_1__0__Impl rule__XFunctionTypeRef__Group_0_1__1 ;
    public final void rule__XFunctionTypeRef__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1477:1: ( rule__XFunctionTypeRef__Group_0_1__0__Impl rule__XFunctionTypeRef__Group_0_1__1 )
            // InternalTqcl.g:1478:2: rule__XFunctionTypeRef__Group_0_1__0__Impl rule__XFunctionTypeRef__Group_0_1__1
            {
            pushFollow(FOLLOW_16);
            rule__XFunctionTypeRef__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XFunctionTypeRef__Group_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XFunctionTypeRef__Group_0_1__0"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0_1__0__Impl"
    // InternalTqcl.g:1485:1: rule__XFunctionTypeRef__Group_0_1__0__Impl : ( ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0 ) ) ;
    public final void rule__XFunctionTypeRef__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1489:1: ( ( ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0 ) ) )
            // InternalTqcl.g:1490:1: ( ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0 ) )
            {
            // InternalTqcl.g:1490:1: ( ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0 ) )
            // InternalTqcl.g:1491:2: ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getParamTypesAssignment_0_1_0()); 
            }
            // InternalTqcl.g:1492:2: ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0 )
            // InternalTqcl.g:1492:3: rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getParamTypesAssignment_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XFunctionTypeRef__Group_0_1__0__Impl"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0_1__1"
    // InternalTqcl.g:1500:1: rule__XFunctionTypeRef__Group_0_1__1 : rule__XFunctionTypeRef__Group_0_1__1__Impl ;
    public final void rule__XFunctionTypeRef__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1504:1: ( rule__XFunctionTypeRef__Group_0_1__1__Impl )
            // InternalTqcl.g:1505:2: rule__XFunctionTypeRef__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XFunctionTypeRef__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XFunctionTypeRef__Group_0_1__1"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0_1__1__Impl"
    // InternalTqcl.g:1511:1: rule__XFunctionTypeRef__Group_0_1__1__Impl : ( ( rule__XFunctionTypeRef__Group_0_1_1__0 )* ) ;
    public final void rule__XFunctionTypeRef__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1515:1: ( ( ( rule__XFunctionTypeRef__Group_0_1_1__0 )* ) )
            // InternalTqcl.g:1516:1: ( ( rule__XFunctionTypeRef__Group_0_1_1__0 )* )
            {
            // InternalTqcl.g:1516:1: ( ( rule__XFunctionTypeRef__Group_0_1_1__0 )* )
            // InternalTqcl.g:1517:2: ( rule__XFunctionTypeRef__Group_0_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getGroup_0_1_1()); 
            }
            // InternalTqcl.g:1518:2: ( rule__XFunctionTypeRef__Group_0_1_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==21) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalTqcl.g:1518:3: rule__XFunctionTypeRef__Group_0_1_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__XFunctionTypeRef__Group_0_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getGroup_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XFunctionTypeRef__Group_0_1__1__Impl"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0_1_1__0"
    // InternalTqcl.g:1527:1: rule__XFunctionTypeRef__Group_0_1_1__0 : rule__XFunctionTypeRef__Group_0_1_1__0__Impl rule__XFunctionTypeRef__Group_0_1_1__1 ;
    public final void rule__XFunctionTypeRef__Group_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1531:1: ( rule__XFunctionTypeRef__Group_0_1_1__0__Impl rule__XFunctionTypeRef__Group_0_1_1__1 )
            // InternalTqcl.g:1532:2: rule__XFunctionTypeRef__Group_0_1_1__0__Impl rule__XFunctionTypeRef__Group_0_1_1__1
            {
            pushFollow(FOLLOW_14);
            rule__XFunctionTypeRef__Group_0_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XFunctionTypeRef__Group_0_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XFunctionTypeRef__Group_0_1_1__0"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0_1_1__0__Impl"
    // InternalTqcl.g:1539:1: rule__XFunctionTypeRef__Group_0_1_1__0__Impl : ( ',' ) ;
    public final void rule__XFunctionTypeRef__Group_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1543:1: ( ( ',' ) )
            // InternalTqcl.g:1544:1: ( ',' )
            {
            // InternalTqcl.g:1544:1: ( ',' )
            // InternalTqcl.g:1545:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XFunctionTypeRef__Group_0_1_1__0__Impl"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0_1_1__1"
    // InternalTqcl.g:1554:1: rule__XFunctionTypeRef__Group_0_1_1__1 : rule__XFunctionTypeRef__Group_0_1_1__1__Impl ;
    public final void rule__XFunctionTypeRef__Group_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1558:1: ( rule__XFunctionTypeRef__Group_0_1_1__1__Impl )
            // InternalTqcl.g:1559:2: rule__XFunctionTypeRef__Group_0_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XFunctionTypeRef__Group_0_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XFunctionTypeRef__Group_0_1_1__1"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0_1_1__1__Impl"
    // InternalTqcl.g:1565:1: rule__XFunctionTypeRef__Group_0_1_1__1__Impl : ( ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1 ) ) ;
    public final void rule__XFunctionTypeRef__Group_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1569:1: ( ( ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1 ) ) )
            // InternalTqcl.g:1570:1: ( ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1 ) )
            {
            // InternalTqcl.g:1570:1: ( ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1 ) )
            // InternalTqcl.g:1571:2: ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getParamTypesAssignment_0_1_1_1()); 
            }
            // InternalTqcl.g:1572:2: ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1 )
            // InternalTqcl.g:1572:3: rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getParamTypesAssignment_0_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XFunctionTypeRef__Group_0_1_1__1__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group__0"
    // InternalTqcl.g:1581:1: rule__JvmParameterizedTypeReference__Group__0 : rule__JvmParameterizedTypeReference__Group__0__Impl rule__JvmParameterizedTypeReference__Group__1 ;
    public final void rule__JvmParameterizedTypeReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1585:1: ( rule__JvmParameterizedTypeReference__Group__0__Impl rule__JvmParameterizedTypeReference__Group__1 )
            // InternalTqcl.g:1586:2: rule__JvmParameterizedTypeReference__Group__0__Impl rule__JvmParameterizedTypeReference__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__JvmParameterizedTypeReference__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group__0"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group__0__Impl"
    // InternalTqcl.g:1593:1: rule__JvmParameterizedTypeReference__Group__0__Impl : ( ( rule__JvmParameterizedTypeReference__TypeAssignment_0 ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1597:1: ( ( ( rule__JvmParameterizedTypeReference__TypeAssignment_0 ) ) )
            // InternalTqcl.g:1598:1: ( ( rule__JvmParameterizedTypeReference__TypeAssignment_0 ) )
            {
            // InternalTqcl.g:1598:1: ( ( rule__JvmParameterizedTypeReference__TypeAssignment_0 ) )
            // InternalTqcl.g:1599:2: ( rule__JvmParameterizedTypeReference__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeAssignment_0()); 
            }
            // InternalTqcl.g:1600:2: ( rule__JvmParameterizedTypeReference__TypeAssignment_0 )
            // InternalTqcl.g:1600:3: rule__JvmParameterizedTypeReference__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group__0__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group__1"
    // InternalTqcl.g:1608:1: rule__JvmParameterizedTypeReference__Group__1 : rule__JvmParameterizedTypeReference__Group__1__Impl ;
    public final void rule__JvmParameterizedTypeReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1612:1: ( rule__JvmParameterizedTypeReference__Group__1__Impl )
            // InternalTqcl.g:1613:2: rule__JvmParameterizedTypeReference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group__1"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group__1__Impl"
    // InternalTqcl.g:1619:1: rule__JvmParameterizedTypeReference__Group__1__Impl : ( ( rule__JvmParameterizedTypeReference__Group_1__0 )? ) ;
    public final void rule__JvmParameterizedTypeReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1623:1: ( ( ( rule__JvmParameterizedTypeReference__Group_1__0 )? ) )
            // InternalTqcl.g:1624:1: ( ( rule__JvmParameterizedTypeReference__Group_1__0 )? )
            {
            // InternalTqcl.g:1624:1: ( ( rule__JvmParameterizedTypeReference__Group_1__0 )? )
            // InternalTqcl.g:1625:2: ( rule__JvmParameterizedTypeReference__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1()); 
            }
            // InternalTqcl.g:1626:2: ( rule__JvmParameterizedTypeReference__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTqcl.g:1626:3: rule__JvmParameterizedTypeReference__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JvmParameterizedTypeReference__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group__1__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1__0"
    // InternalTqcl.g:1635:1: rule__JvmParameterizedTypeReference__Group_1__0 : rule__JvmParameterizedTypeReference__Group_1__0__Impl rule__JvmParameterizedTypeReference__Group_1__1 ;
    public final void rule__JvmParameterizedTypeReference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1639:1: ( rule__JvmParameterizedTypeReference__Group_1__0__Impl rule__JvmParameterizedTypeReference__Group_1__1 )
            // InternalTqcl.g:1640:2: rule__JvmParameterizedTypeReference__Group_1__0__Impl rule__JvmParameterizedTypeReference__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__JvmParameterizedTypeReference__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1__0"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1__0__Impl"
    // InternalTqcl.g:1647:1: rule__JvmParameterizedTypeReference__Group_1__0__Impl : ( ( '<' ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1651:1: ( ( ( '<' ) ) )
            // InternalTqcl.g:1652:1: ( ( '<' ) )
            {
            // InternalTqcl.g:1652:1: ( ( '<' ) )
            // InternalTqcl.g:1653:2: ( '<' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0()); 
            }
            // InternalTqcl.g:1654:2: ( '<' )
            // InternalTqcl.g:1654:3: '<'
            {
            match(input,22,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1__0__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1__1"
    // InternalTqcl.g:1662:1: rule__JvmParameterizedTypeReference__Group_1__1 : rule__JvmParameterizedTypeReference__Group_1__1__Impl rule__JvmParameterizedTypeReference__Group_1__2 ;
    public final void rule__JvmParameterizedTypeReference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1666:1: ( rule__JvmParameterizedTypeReference__Group_1__1__Impl rule__JvmParameterizedTypeReference__Group_1__2 )
            // InternalTqcl.g:1667:2: rule__JvmParameterizedTypeReference__Group_1__1__Impl rule__JvmParameterizedTypeReference__Group_1__2
            {
            pushFollow(FOLLOW_20);
            rule__JvmParameterizedTypeReference__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1__1"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1__1__Impl"
    // InternalTqcl.g:1674:1: rule__JvmParameterizedTypeReference__Group_1__1__Impl : ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1 ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1678:1: ( ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1 ) ) )
            // InternalTqcl.g:1679:1: ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1 ) )
            {
            // InternalTqcl.g:1679:1: ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1 ) )
            // InternalTqcl.g:1680:2: ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsAssignment_1_1()); 
            }
            // InternalTqcl.g:1681:2: ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1 )
            // InternalTqcl.g:1681:3: rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1__1__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1__2"
    // InternalTqcl.g:1689:1: rule__JvmParameterizedTypeReference__Group_1__2 : rule__JvmParameterizedTypeReference__Group_1__2__Impl rule__JvmParameterizedTypeReference__Group_1__3 ;
    public final void rule__JvmParameterizedTypeReference__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1693:1: ( rule__JvmParameterizedTypeReference__Group_1__2__Impl rule__JvmParameterizedTypeReference__Group_1__3 )
            // InternalTqcl.g:1694:2: rule__JvmParameterizedTypeReference__Group_1__2__Impl rule__JvmParameterizedTypeReference__Group_1__3
            {
            pushFollow(FOLLOW_20);
            rule__JvmParameterizedTypeReference__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1__2"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1__2__Impl"
    // InternalTqcl.g:1701:1: rule__JvmParameterizedTypeReference__Group_1__2__Impl : ( ( rule__JvmParameterizedTypeReference__Group_1_2__0 )* ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1705:1: ( ( ( rule__JvmParameterizedTypeReference__Group_1_2__0 )* ) )
            // InternalTqcl.g:1706:1: ( ( rule__JvmParameterizedTypeReference__Group_1_2__0 )* )
            {
            // InternalTqcl.g:1706:1: ( ( rule__JvmParameterizedTypeReference__Group_1_2__0 )* )
            // InternalTqcl.g:1707:2: ( rule__JvmParameterizedTypeReference__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_2()); 
            }
            // InternalTqcl.g:1708:2: ( rule__JvmParameterizedTypeReference__Group_1_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==21) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTqcl.g:1708:3: rule__JvmParameterizedTypeReference__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__JvmParameterizedTypeReference__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1__2__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1__3"
    // InternalTqcl.g:1716:1: rule__JvmParameterizedTypeReference__Group_1__3 : rule__JvmParameterizedTypeReference__Group_1__3__Impl rule__JvmParameterizedTypeReference__Group_1__4 ;
    public final void rule__JvmParameterizedTypeReference__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1720:1: ( rule__JvmParameterizedTypeReference__Group_1__3__Impl rule__JvmParameterizedTypeReference__Group_1__4 )
            // InternalTqcl.g:1721:2: rule__JvmParameterizedTypeReference__Group_1__3__Impl rule__JvmParameterizedTypeReference__Group_1__4
            {
            pushFollow(FOLLOW_21);
            rule__JvmParameterizedTypeReference__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1__3"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1__3__Impl"
    // InternalTqcl.g:1728:1: rule__JvmParameterizedTypeReference__Group_1__3__Impl : ( '>' ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1732:1: ( ( '>' ) )
            // InternalTqcl.g:1733:1: ( '>' )
            {
            // InternalTqcl.g:1733:1: ( '>' )
            // InternalTqcl.g:1734:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1__3__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1__4"
    // InternalTqcl.g:1743:1: rule__JvmParameterizedTypeReference__Group_1__4 : rule__JvmParameterizedTypeReference__Group_1__4__Impl ;
    public final void rule__JvmParameterizedTypeReference__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1747:1: ( rule__JvmParameterizedTypeReference__Group_1__4__Impl )
            // InternalTqcl.g:1748:2: rule__JvmParameterizedTypeReference__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1__4"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1__4__Impl"
    // InternalTqcl.g:1754:1: rule__JvmParameterizedTypeReference__Group_1__4__Impl : ( ( rule__JvmParameterizedTypeReference__Group_1_4__0 )* ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1758:1: ( ( ( rule__JvmParameterizedTypeReference__Group_1_4__0 )* ) )
            // InternalTqcl.g:1759:1: ( ( rule__JvmParameterizedTypeReference__Group_1_4__0 )* )
            {
            // InternalTqcl.g:1759:1: ( ( rule__JvmParameterizedTypeReference__Group_1_4__0 )* )
            // InternalTqcl.g:1760:2: ( rule__JvmParameterizedTypeReference__Group_1_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_4()); 
            }
            // InternalTqcl.g:1761:2: ( rule__JvmParameterizedTypeReference__Group_1_4__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==24) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalTqcl.g:1761:3: rule__JvmParameterizedTypeReference__Group_1_4__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__JvmParameterizedTypeReference__Group_1_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1__4__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_2__0"
    // InternalTqcl.g:1770:1: rule__JvmParameterizedTypeReference__Group_1_2__0 : rule__JvmParameterizedTypeReference__Group_1_2__0__Impl rule__JvmParameterizedTypeReference__Group_1_2__1 ;
    public final void rule__JvmParameterizedTypeReference__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1774:1: ( rule__JvmParameterizedTypeReference__Group_1_2__0__Impl rule__JvmParameterizedTypeReference__Group_1_2__1 )
            // InternalTqcl.g:1775:2: rule__JvmParameterizedTypeReference__Group_1_2__0__Impl rule__JvmParameterizedTypeReference__Group_1_2__1
            {
            pushFollow(FOLLOW_19);
            rule__JvmParameterizedTypeReference__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_2__0"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_2__0__Impl"
    // InternalTqcl.g:1782:1: rule__JvmParameterizedTypeReference__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1786:1: ( ( ',' ) )
            // InternalTqcl.g:1787:1: ( ',' )
            {
            // InternalTqcl.g:1787:1: ( ',' )
            // InternalTqcl.g:1788:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_2__0__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_2__1"
    // InternalTqcl.g:1797:1: rule__JvmParameterizedTypeReference__Group_1_2__1 : rule__JvmParameterizedTypeReference__Group_1_2__1__Impl ;
    public final void rule__JvmParameterizedTypeReference__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1801:1: ( rule__JvmParameterizedTypeReference__Group_1_2__1__Impl )
            // InternalTqcl.g:1802:2: rule__JvmParameterizedTypeReference__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_2__1"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_2__1__Impl"
    // InternalTqcl.g:1808:1: rule__JvmParameterizedTypeReference__Group_1_2__1__Impl : ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1 ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1812:1: ( ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1 ) ) )
            // InternalTqcl.g:1813:1: ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1 ) )
            {
            // InternalTqcl.g:1813:1: ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1 ) )
            // InternalTqcl.g:1814:2: ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsAssignment_1_2_1()); 
            }
            // InternalTqcl.g:1815:2: ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1 )
            // InternalTqcl.g:1815:3: rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsAssignment_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_2__1__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4__0"
    // InternalTqcl.g:1824:1: rule__JvmParameterizedTypeReference__Group_1_4__0 : rule__JvmParameterizedTypeReference__Group_1_4__0__Impl rule__JvmParameterizedTypeReference__Group_1_4__1 ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1828:1: ( rule__JvmParameterizedTypeReference__Group_1_4__0__Impl rule__JvmParameterizedTypeReference__Group_1_4__1 )
            // InternalTqcl.g:1829:2: rule__JvmParameterizedTypeReference__Group_1_4__0__Impl rule__JvmParameterizedTypeReference__Group_1_4__1
            {
            pushFollow(FOLLOW_5);
            rule__JvmParameterizedTypeReference__Group_1_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4__0"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4__0__Impl"
    // InternalTqcl.g:1836:1: rule__JvmParameterizedTypeReference__Group_1_4__0__Impl : ( ( rule__JvmParameterizedTypeReference__Group_1_4_0__0 ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1840:1: ( ( ( rule__JvmParameterizedTypeReference__Group_1_4_0__0 ) ) )
            // InternalTqcl.g:1841:1: ( ( rule__JvmParameterizedTypeReference__Group_1_4_0__0 ) )
            {
            // InternalTqcl.g:1841:1: ( ( rule__JvmParameterizedTypeReference__Group_1_4_0__0 ) )
            // InternalTqcl.g:1842:2: ( rule__JvmParameterizedTypeReference__Group_1_4_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_4_0()); 
            }
            // InternalTqcl.g:1843:2: ( rule__JvmParameterizedTypeReference__Group_1_4_0__0 )
            // InternalTqcl.g:1843:3: rule__JvmParameterizedTypeReference__Group_1_4_0__0
            {
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1_4_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4__0__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4__1"
    // InternalTqcl.g:1851:1: rule__JvmParameterizedTypeReference__Group_1_4__1 : rule__JvmParameterizedTypeReference__Group_1_4__1__Impl rule__JvmParameterizedTypeReference__Group_1_4__2 ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1855:1: ( rule__JvmParameterizedTypeReference__Group_1_4__1__Impl rule__JvmParameterizedTypeReference__Group_1_4__2 )
            // InternalTqcl.g:1856:2: rule__JvmParameterizedTypeReference__Group_1_4__1__Impl rule__JvmParameterizedTypeReference__Group_1_4__2
            {
            pushFollow(FOLLOW_18);
            rule__JvmParameterizedTypeReference__Group_1_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4__1"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4__1__Impl"
    // InternalTqcl.g:1863:1: rule__JvmParameterizedTypeReference__Group_1_4__1__Impl : ( ( rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1 ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1867:1: ( ( ( rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1 ) ) )
            // InternalTqcl.g:1868:1: ( ( rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1 ) )
            {
            // InternalTqcl.g:1868:1: ( ( rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1 ) )
            // InternalTqcl.g:1869:2: ( rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeAssignment_1_4_1()); 
            }
            // InternalTqcl.g:1870:2: ( rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1 )
            // InternalTqcl.g:1870:3: rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1
            {
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeAssignment_1_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4__1__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4__2"
    // InternalTqcl.g:1878:1: rule__JvmParameterizedTypeReference__Group_1_4__2 : rule__JvmParameterizedTypeReference__Group_1_4__2__Impl ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1882:1: ( rule__JvmParameterizedTypeReference__Group_1_4__2__Impl )
            // InternalTqcl.g:1883:2: rule__JvmParameterizedTypeReference__Group_1_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4__2"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4__2__Impl"
    // InternalTqcl.g:1889:1: rule__JvmParameterizedTypeReference__Group_1_4__2__Impl : ( ( rule__JvmParameterizedTypeReference__Group_1_4_2__0 )? ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1893:1: ( ( ( rule__JvmParameterizedTypeReference__Group_1_4_2__0 )? ) )
            // InternalTqcl.g:1894:1: ( ( rule__JvmParameterizedTypeReference__Group_1_4_2__0 )? )
            {
            // InternalTqcl.g:1894:1: ( ( rule__JvmParameterizedTypeReference__Group_1_4_2__0 )? )
            // InternalTqcl.g:1895:2: ( rule__JvmParameterizedTypeReference__Group_1_4_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_4_2()); 
            }
            // InternalTqcl.g:1896:2: ( rule__JvmParameterizedTypeReference__Group_1_4_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalTqcl.g:1896:3: rule__JvmParameterizedTypeReference__Group_1_4_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JvmParameterizedTypeReference__Group_1_4_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4__2__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4_0__0"
    // InternalTqcl.g:1905:1: rule__JvmParameterizedTypeReference__Group_1_4_0__0 : rule__JvmParameterizedTypeReference__Group_1_4_0__0__Impl ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1909:1: ( rule__JvmParameterizedTypeReference__Group_1_4_0__0__Impl )
            // InternalTqcl.g:1910:2: rule__JvmParameterizedTypeReference__Group_1_4_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1_4_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4_0__0"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4_0__0__Impl"
    // InternalTqcl.g:1916:1: rule__JvmParameterizedTypeReference__Group_1_4_0__0__Impl : ( ( rule__JvmParameterizedTypeReference__Group_1_4_0_0__0 ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1920:1: ( ( ( rule__JvmParameterizedTypeReference__Group_1_4_0_0__0 ) ) )
            // InternalTqcl.g:1921:1: ( ( rule__JvmParameterizedTypeReference__Group_1_4_0_0__0 ) )
            {
            // InternalTqcl.g:1921:1: ( ( rule__JvmParameterizedTypeReference__Group_1_4_0_0__0 ) )
            // InternalTqcl.g:1922:2: ( rule__JvmParameterizedTypeReference__Group_1_4_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_4_0_0()); 
            }
            // InternalTqcl.g:1923:2: ( rule__JvmParameterizedTypeReference__Group_1_4_0_0__0 )
            // InternalTqcl.g:1923:3: rule__JvmParameterizedTypeReference__Group_1_4_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1_4_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4_0__0__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4_0_0__0"
    // InternalTqcl.g:1932:1: rule__JvmParameterizedTypeReference__Group_1_4_0_0__0 : rule__JvmParameterizedTypeReference__Group_1_4_0_0__0__Impl rule__JvmParameterizedTypeReference__Group_1_4_0_0__1 ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1936:1: ( rule__JvmParameterizedTypeReference__Group_1_4_0_0__0__Impl rule__JvmParameterizedTypeReference__Group_1_4_0_0__1 )
            // InternalTqcl.g:1937:2: rule__JvmParameterizedTypeReference__Group_1_4_0_0__0__Impl rule__JvmParameterizedTypeReference__Group_1_4_0_0__1
            {
            pushFollow(FOLLOW_21);
            rule__JvmParameterizedTypeReference__Group_1_4_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1_4_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4_0_0__0"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4_0_0__0__Impl"
    // InternalTqcl.g:1944:1: rule__JvmParameterizedTypeReference__Group_1_4_0_0__0__Impl : ( () ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1948:1: ( ( () ) )
            // InternalTqcl.g:1949:1: ( () )
            {
            // InternalTqcl.g:1949:1: ( () )
            // InternalTqcl.g:1950:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getJvmInnerTypeReferenceOuterAction_1_4_0_0_0()); 
            }
            // InternalTqcl.g:1951:2: ()
            // InternalTqcl.g:1951:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getJvmInnerTypeReferenceOuterAction_1_4_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4_0_0__0__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4_0_0__1"
    // InternalTqcl.g:1959:1: rule__JvmParameterizedTypeReference__Group_1_4_0_0__1 : rule__JvmParameterizedTypeReference__Group_1_4_0_0__1__Impl ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1963:1: ( rule__JvmParameterizedTypeReference__Group_1_4_0_0__1__Impl )
            // InternalTqcl.g:1964:2: rule__JvmParameterizedTypeReference__Group_1_4_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1_4_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4_0_0__1"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4_0_0__1__Impl"
    // InternalTqcl.g:1970:1: rule__JvmParameterizedTypeReference__Group_1_4_0_0__1__Impl : ( '.' ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1974:1: ( ( '.' ) )
            // InternalTqcl.g:1975:1: ( '.' )
            {
            // InternalTqcl.g:1975:1: ( '.' )
            // InternalTqcl.g:1976:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getFullStopKeyword_1_4_0_0_1()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getFullStopKeyword_1_4_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4_0_0__1__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4_2__0"
    // InternalTqcl.g:1986:1: rule__JvmParameterizedTypeReference__Group_1_4_2__0 : rule__JvmParameterizedTypeReference__Group_1_4_2__0__Impl rule__JvmParameterizedTypeReference__Group_1_4_2__1 ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1990:1: ( rule__JvmParameterizedTypeReference__Group_1_4_2__0__Impl rule__JvmParameterizedTypeReference__Group_1_4_2__1 )
            // InternalTqcl.g:1991:2: rule__JvmParameterizedTypeReference__Group_1_4_2__0__Impl rule__JvmParameterizedTypeReference__Group_1_4_2__1
            {
            pushFollow(FOLLOW_19);
            rule__JvmParameterizedTypeReference__Group_1_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1_4_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4_2__0"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4_2__0__Impl"
    // InternalTqcl.g:1998:1: rule__JvmParameterizedTypeReference__Group_1_4_2__0__Impl : ( ( '<' ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2002:1: ( ( ( '<' ) ) )
            // InternalTqcl.g:2003:1: ( ( '<' ) )
            {
            // InternalTqcl.g:2003:1: ( ( '<' ) )
            // InternalTqcl.g:2004:2: ( '<' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_4_2_0()); 
            }
            // InternalTqcl.g:2005:2: ( '<' )
            // InternalTqcl.g:2005:3: '<'
            {
            match(input,22,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4_2__0__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4_2__1"
    // InternalTqcl.g:2013:1: rule__JvmParameterizedTypeReference__Group_1_4_2__1 : rule__JvmParameterizedTypeReference__Group_1_4_2__1__Impl rule__JvmParameterizedTypeReference__Group_1_4_2__2 ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2017:1: ( rule__JvmParameterizedTypeReference__Group_1_4_2__1__Impl rule__JvmParameterizedTypeReference__Group_1_4_2__2 )
            // InternalTqcl.g:2018:2: rule__JvmParameterizedTypeReference__Group_1_4_2__1__Impl rule__JvmParameterizedTypeReference__Group_1_4_2__2
            {
            pushFollow(FOLLOW_20);
            rule__JvmParameterizedTypeReference__Group_1_4_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1_4_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4_2__1"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4_2__1__Impl"
    // InternalTqcl.g:2025:1: rule__JvmParameterizedTypeReference__Group_1_4_2__1__Impl : ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1 ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2029:1: ( ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1 ) ) )
            // InternalTqcl.g:2030:1: ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1 ) )
            {
            // InternalTqcl.g:2030:1: ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1 ) )
            // InternalTqcl.g:2031:2: ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsAssignment_1_4_2_1()); 
            }
            // InternalTqcl.g:2032:2: ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1 )
            // InternalTqcl.g:2032:3: rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsAssignment_1_4_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4_2__1__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4_2__2"
    // InternalTqcl.g:2040:1: rule__JvmParameterizedTypeReference__Group_1_4_2__2 : rule__JvmParameterizedTypeReference__Group_1_4_2__2__Impl rule__JvmParameterizedTypeReference__Group_1_4_2__3 ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2044:1: ( rule__JvmParameterizedTypeReference__Group_1_4_2__2__Impl rule__JvmParameterizedTypeReference__Group_1_4_2__3 )
            // InternalTqcl.g:2045:2: rule__JvmParameterizedTypeReference__Group_1_4_2__2__Impl rule__JvmParameterizedTypeReference__Group_1_4_2__3
            {
            pushFollow(FOLLOW_20);
            rule__JvmParameterizedTypeReference__Group_1_4_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1_4_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4_2__2"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4_2__2__Impl"
    // InternalTqcl.g:2052:1: rule__JvmParameterizedTypeReference__Group_1_4_2__2__Impl : ( ( rule__JvmParameterizedTypeReference__Group_1_4_2_2__0 )* ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2056:1: ( ( ( rule__JvmParameterizedTypeReference__Group_1_4_2_2__0 )* ) )
            // InternalTqcl.g:2057:1: ( ( rule__JvmParameterizedTypeReference__Group_1_4_2_2__0 )* )
            {
            // InternalTqcl.g:2057:1: ( ( rule__JvmParameterizedTypeReference__Group_1_4_2_2__0 )* )
            // InternalTqcl.g:2058:2: ( rule__JvmParameterizedTypeReference__Group_1_4_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_4_2_2()); 
            }
            // InternalTqcl.g:2059:2: ( rule__JvmParameterizedTypeReference__Group_1_4_2_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==21) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalTqcl.g:2059:3: rule__JvmParameterizedTypeReference__Group_1_4_2_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__JvmParameterizedTypeReference__Group_1_4_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_4_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4_2__2__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4_2__3"
    // InternalTqcl.g:2067:1: rule__JvmParameterizedTypeReference__Group_1_4_2__3 : rule__JvmParameterizedTypeReference__Group_1_4_2__3__Impl ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2071:1: ( rule__JvmParameterizedTypeReference__Group_1_4_2__3__Impl )
            // InternalTqcl.g:2072:2: rule__JvmParameterizedTypeReference__Group_1_4_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1_4_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4_2__3"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4_2__3__Impl"
    // InternalTqcl.g:2078:1: rule__JvmParameterizedTypeReference__Group_1_4_2__3__Impl : ( '>' ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2082:1: ( ( '>' ) )
            // InternalTqcl.g:2083:1: ( '>' )
            {
            // InternalTqcl.g:2083:1: ( '>' )
            // InternalTqcl.g:2084:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_4_2_3()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_4_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4_2__3__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4_2_2__0"
    // InternalTqcl.g:2094:1: rule__JvmParameterizedTypeReference__Group_1_4_2_2__0 : rule__JvmParameterizedTypeReference__Group_1_4_2_2__0__Impl rule__JvmParameterizedTypeReference__Group_1_4_2_2__1 ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2098:1: ( rule__JvmParameterizedTypeReference__Group_1_4_2_2__0__Impl rule__JvmParameterizedTypeReference__Group_1_4_2_2__1 )
            // InternalTqcl.g:2099:2: rule__JvmParameterizedTypeReference__Group_1_4_2_2__0__Impl rule__JvmParameterizedTypeReference__Group_1_4_2_2__1
            {
            pushFollow(FOLLOW_19);
            rule__JvmParameterizedTypeReference__Group_1_4_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1_4_2_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4_2_2__0"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4_2_2__0__Impl"
    // InternalTqcl.g:2106:1: rule__JvmParameterizedTypeReference__Group_1_4_2_2__0__Impl : ( ',' ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2110:1: ( ( ',' ) )
            // InternalTqcl.g:2111:1: ( ',' )
            {
            // InternalTqcl.g:2111:1: ( ',' )
            // InternalTqcl.g:2112:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_4_2_2_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_4_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4_2_2__0__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4_2_2__1"
    // InternalTqcl.g:2121:1: rule__JvmParameterizedTypeReference__Group_1_4_2_2__1 : rule__JvmParameterizedTypeReference__Group_1_4_2_2__1__Impl ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2125:1: ( rule__JvmParameterizedTypeReference__Group_1_4_2_2__1__Impl )
            // InternalTqcl.g:2126:2: rule__JvmParameterizedTypeReference__Group_1_4_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1_4_2_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4_2_2__1"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4_2_2__1__Impl"
    // InternalTqcl.g:2132:1: rule__JvmParameterizedTypeReference__Group_1_4_2_2__1__Impl : ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1 ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2136:1: ( ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1 ) ) )
            // InternalTqcl.g:2137:1: ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1 ) )
            {
            // InternalTqcl.g:2137:1: ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1 ) )
            // InternalTqcl.g:2138:2: ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsAssignment_1_4_2_2_1()); 
            }
            // InternalTqcl.g:2139:2: ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1 )
            // InternalTqcl.g:2139:3: rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsAssignment_1_4_2_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4_2_2__1__Impl"


    // $ANTLR start "rule__JvmWildcardTypeReference__Group__0"
    // InternalTqcl.g:2148:1: rule__JvmWildcardTypeReference__Group__0 : rule__JvmWildcardTypeReference__Group__0__Impl rule__JvmWildcardTypeReference__Group__1 ;
    public final void rule__JvmWildcardTypeReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2152:1: ( rule__JvmWildcardTypeReference__Group__0__Impl rule__JvmWildcardTypeReference__Group__1 )
            // InternalTqcl.g:2153:2: rule__JvmWildcardTypeReference__Group__0__Impl rule__JvmWildcardTypeReference__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__JvmWildcardTypeReference__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmWildcardTypeReference__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmWildcardTypeReference__Group__0"


    // $ANTLR start "rule__JvmWildcardTypeReference__Group__0__Impl"
    // InternalTqcl.g:2160:1: rule__JvmWildcardTypeReference__Group__0__Impl : ( () ) ;
    public final void rule__JvmWildcardTypeReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2164:1: ( ( () ) )
            // InternalTqcl.g:2165:1: ( () )
            {
            // InternalTqcl.g:2165:1: ( () )
            // InternalTqcl.g:2166:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0()); 
            }
            // InternalTqcl.g:2167:2: ()
            // InternalTqcl.g:2167:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmWildcardTypeReference__Group__0__Impl"


    // $ANTLR start "rule__JvmWildcardTypeReference__Group__1"
    // InternalTqcl.g:2175:1: rule__JvmWildcardTypeReference__Group__1 : rule__JvmWildcardTypeReference__Group__1__Impl rule__JvmWildcardTypeReference__Group__2 ;
    public final void rule__JvmWildcardTypeReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2179:1: ( rule__JvmWildcardTypeReference__Group__1__Impl rule__JvmWildcardTypeReference__Group__2 )
            // InternalTqcl.g:2180:2: rule__JvmWildcardTypeReference__Group__1__Impl rule__JvmWildcardTypeReference__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__JvmWildcardTypeReference__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmWildcardTypeReference__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmWildcardTypeReference__Group__1"


    // $ANTLR start "rule__JvmWildcardTypeReference__Group__1__Impl"
    // InternalTqcl.g:2187:1: rule__JvmWildcardTypeReference__Group__1__Impl : ( '?' ) ;
    public final void rule__JvmWildcardTypeReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2191:1: ( ( '?' ) )
            // InternalTqcl.g:2192:1: ( '?' )
            {
            // InternalTqcl.g:2192:1: ( '?' )
            // InternalTqcl.g:2193:2: '?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmWildcardTypeReference__Group__1__Impl"


    // $ANTLR start "rule__JvmWildcardTypeReference__Group__2"
    // InternalTqcl.g:2202:1: rule__JvmWildcardTypeReference__Group__2 : rule__JvmWildcardTypeReference__Group__2__Impl ;
    public final void rule__JvmWildcardTypeReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2206:1: ( rule__JvmWildcardTypeReference__Group__2__Impl )
            // InternalTqcl.g:2207:2: rule__JvmWildcardTypeReference__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JvmWildcardTypeReference__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmWildcardTypeReference__Group__2"


    // $ANTLR start "rule__JvmWildcardTypeReference__Group__2__Impl"
    // InternalTqcl.g:2213:1: rule__JvmWildcardTypeReference__Group__2__Impl : ( ( rule__JvmWildcardTypeReference__Alternatives_2 )? ) ;
    public final void rule__JvmWildcardTypeReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2217:1: ( ( ( rule__JvmWildcardTypeReference__Alternatives_2 )? ) )
            // InternalTqcl.g:2218:1: ( ( rule__JvmWildcardTypeReference__Alternatives_2 )? )
            {
            // InternalTqcl.g:2218:1: ( ( rule__JvmWildcardTypeReference__Alternatives_2 )? )
            // InternalTqcl.g:2219:2: ( rule__JvmWildcardTypeReference__Alternatives_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getAlternatives_2()); 
            }
            // InternalTqcl.g:2220:2: ( rule__JvmWildcardTypeReference__Alternatives_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26||LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalTqcl.g:2220:3: rule__JvmWildcardTypeReference__Alternatives_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__JvmWildcardTypeReference__Alternatives_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmWildcardTypeReferenceAccess().getAlternatives_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmWildcardTypeReference__Group__2__Impl"


    // $ANTLR start "rule__JvmWildcardTypeReference__Group_2_0__0"
    // InternalTqcl.g:2229:1: rule__JvmWildcardTypeReference__Group_2_0__0 : rule__JvmWildcardTypeReference__Group_2_0__0__Impl rule__JvmWildcardTypeReference__Group_2_0__1 ;
    public final void rule__JvmWildcardTypeReference__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2233:1: ( rule__JvmWildcardTypeReference__Group_2_0__0__Impl rule__JvmWildcardTypeReference__Group_2_0__1 )
            // InternalTqcl.g:2234:2: rule__JvmWildcardTypeReference__Group_2_0__0__Impl rule__JvmWildcardTypeReference__Group_2_0__1
            {
            pushFollow(FOLLOW_24);
            rule__JvmWildcardTypeReference__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmWildcardTypeReference__Group_2_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmWildcardTypeReference__Group_2_0__0"


    // $ANTLR start "rule__JvmWildcardTypeReference__Group_2_0__0__Impl"
    // InternalTqcl.g:2241:1: rule__JvmWildcardTypeReference__Group_2_0__0__Impl : ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0 ) ) ;
    public final void rule__JvmWildcardTypeReference__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2245:1: ( ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0 ) ) )
            // InternalTqcl.g:2246:1: ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0 ) )
            {
            // InternalTqcl.g:2246:1: ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0 ) )
            // InternalTqcl.g:2247:2: ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsAssignment_2_0_0()); 
            }
            // InternalTqcl.g:2248:2: ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0 )
            // InternalTqcl.g:2248:3: rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsAssignment_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmWildcardTypeReference__Group_2_0__0__Impl"


    // $ANTLR start "rule__JvmWildcardTypeReference__Group_2_0__1"
    // InternalTqcl.g:2256:1: rule__JvmWildcardTypeReference__Group_2_0__1 : rule__JvmWildcardTypeReference__Group_2_0__1__Impl ;
    public final void rule__JvmWildcardTypeReference__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2260:1: ( rule__JvmWildcardTypeReference__Group_2_0__1__Impl )
            // InternalTqcl.g:2261:2: rule__JvmWildcardTypeReference__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JvmWildcardTypeReference__Group_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmWildcardTypeReference__Group_2_0__1"


    // $ANTLR start "rule__JvmWildcardTypeReference__Group_2_0__1__Impl"
    // InternalTqcl.g:2267:1: rule__JvmWildcardTypeReference__Group_2_0__1__Impl : ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1 )* ) ;
    public final void rule__JvmWildcardTypeReference__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2271:1: ( ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1 )* ) )
            // InternalTqcl.g:2272:1: ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1 )* )
            {
            // InternalTqcl.g:2272:1: ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1 )* )
            // InternalTqcl.g:2273:2: ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsAssignment_2_0_1()); 
            }
            // InternalTqcl.g:2274:2: ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==27) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalTqcl.g:2274:3: rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsAssignment_2_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmWildcardTypeReference__Group_2_0__1__Impl"


    // $ANTLR start "rule__JvmWildcardTypeReference__Group_2_1__0"
    // InternalTqcl.g:2283:1: rule__JvmWildcardTypeReference__Group_2_1__0 : rule__JvmWildcardTypeReference__Group_2_1__0__Impl rule__JvmWildcardTypeReference__Group_2_1__1 ;
    public final void rule__JvmWildcardTypeReference__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2287:1: ( rule__JvmWildcardTypeReference__Group_2_1__0__Impl rule__JvmWildcardTypeReference__Group_2_1__1 )
            // InternalTqcl.g:2288:2: rule__JvmWildcardTypeReference__Group_2_1__0__Impl rule__JvmWildcardTypeReference__Group_2_1__1
            {
            pushFollow(FOLLOW_24);
            rule__JvmWildcardTypeReference__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmWildcardTypeReference__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmWildcardTypeReference__Group_2_1__0"


    // $ANTLR start "rule__JvmWildcardTypeReference__Group_2_1__0__Impl"
    // InternalTqcl.g:2295:1: rule__JvmWildcardTypeReference__Group_2_1__0__Impl : ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0 ) ) ;
    public final void rule__JvmWildcardTypeReference__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2299:1: ( ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0 ) ) )
            // InternalTqcl.g:2300:1: ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0 ) )
            {
            // InternalTqcl.g:2300:1: ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0 ) )
            // InternalTqcl.g:2301:2: ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsAssignment_2_1_0()); 
            }
            // InternalTqcl.g:2302:2: ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0 )
            // InternalTqcl.g:2302:3: rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsAssignment_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmWildcardTypeReference__Group_2_1__0__Impl"


    // $ANTLR start "rule__JvmWildcardTypeReference__Group_2_1__1"
    // InternalTqcl.g:2310:1: rule__JvmWildcardTypeReference__Group_2_1__1 : rule__JvmWildcardTypeReference__Group_2_1__1__Impl ;
    public final void rule__JvmWildcardTypeReference__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2314:1: ( rule__JvmWildcardTypeReference__Group_2_1__1__Impl )
            // InternalTqcl.g:2315:2: rule__JvmWildcardTypeReference__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JvmWildcardTypeReference__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmWildcardTypeReference__Group_2_1__1"


    // $ANTLR start "rule__JvmWildcardTypeReference__Group_2_1__1__Impl"
    // InternalTqcl.g:2321:1: rule__JvmWildcardTypeReference__Group_2_1__1__Impl : ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1 )* ) ;
    public final void rule__JvmWildcardTypeReference__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2325:1: ( ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1 )* ) )
            // InternalTqcl.g:2326:1: ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1 )* )
            {
            // InternalTqcl.g:2326:1: ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1 )* )
            // InternalTqcl.g:2327:2: ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsAssignment_2_1_1()); 
            }
            // InternalTqcl.g:2328:2: ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==27) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalTqcl.g:2328:3: rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsAssignment_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmWildcardTypeReference__Group_2_1__1__Impl"


    // $ANTLR start "rule__JvmUpperBound__Group__0"
    // InternalTqcl.g:2337:1: rule__JvmUpperBound__Group__0 : rule__JvmUpperBound__Group__0__Impl rule__JvmUpperBound__Group__1 ;
    public final void rule__JvmUpperBound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2341:1: ( rule__JvmUpperBound__Group__0__Impl rule__JvmUpperBound__Group__1 )
            // InternalTqcl.g:2342:2: rule__JvmUpperBound__Group__0__Impl rule__JvmUpperBound__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__JvmUpperBound__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmUpperBound__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmUpperBound__Group__0"


    // $ANTLR start "rule__JvmUpperBound__Group__0__Impl"
    // InternalTqcl.g:2349:1: rule__JvmUpperBound__Group__0__Impl : ( 'extends' ) ;
    public final void rule__JvmUpperBound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2353:1: ( ( 'extends' ) )
            // InternalTqcl.g:2354:1: ( 'extends' )
            {
            // InternalTqcl.g:2354:1: ( 'extends' )
            // InternalTqcl.g:2355:2: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmUpperBound__Group__0__Impl"


    // $ANTLR start "rule__JvmUpperBound__Group__1"
    // InternalTqcl.g:2364:1: rule__JvmUpperBound__Group__1 : rule__JvmUpperBound__Group__1__Impl ;
    public final void rule__JvmUpperBound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2368:1: ( rule__JvmUpperBound__Group__1__Impl )
            // InternalTqcl.g:2369:2: rule__JvmUpperBound__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JvmUpperBound__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmUpperBound__Group__1"


    // $ANTLR start "rule__JvmUpperBound__Group__1__Impl"
    // InternalTqcl.g:2375:1: rule__JvmUpperBound__Group__1__Impl : ( ( rule__JvmUpperBound__TypeReferenceAssignment_1 ) ) ;
    public final void rule__JvmUpperBound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2379:1: ( ( ( rule__JvmUpperBound__TypeReferenceAssignment_1 ) ) )
            // InternalTqcl.g:2380:1: ( ( rule__JvmUpperBound__TypeReferenceAssignment_1 ) )
            {
            // InternalTqcl.g:2380:1: ( ( rule__JvmUpperBound__TypeReferenceAssignment_1 ) )
            // InternalTqcl.g:2381:2: ( rule__JvmUpperBound__TypeReferenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceAssignment_1()); 
            }
            // InternalTqcl.g:2382:2: ( rule__JvmUpperBound__TypeReferenceAssignment_1 )
            // InternalTqcl.g:2382:3: rule__JvmUpperBound__TypeReferenceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__JvmUpperBound__TypeReferenceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmUpperBound__Group__1__Impl"


    // $ANTLR start "rule__JvmUpperBoundAnded__Group__0"
    // InternalTqcl.g:2391:1: rule__JvmUpperBoundAnded__Group__0 : rule__JvmUpperBoundAnded__Group__0__Impl rule__JvmUpperBoundAnded__Group__1 ;
    public final void rule__JvmUpperBoundAnded__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2395:1: ( rule__JvmUpperBoundAnded__Group__0__Impl rule__JvmUpperBoundAnded__Group__1 )
            // InternalTqcl.g:2396:2: rule__JvmUpperBoundAnded__Group__0__Impl rule__JvmUpperBoundAnded__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__JvmUpperBoundAnded__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmUpperBoundAnded__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmUpperBoundAnded__Group__0"


    // $ANTLR start "rule__JvmUpperBoundAnded__Group__0__Impl"
    // InternalTqcl.g:2403:1: rule__JvmUpperBoundAnded__Group__0__Impl : ( '&' ) ;
    public final void rule__JvmUpperBoundAnded__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2407:1: ( ( '&' ) )
            // InternalTqcl.g:2408:1: ( '&' )
            {
            // InternalTqcl.g:2408:1: ( '&' )
            // InternalTqcl.g:2409:2: '&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmUpperBoundAnded__Group__0__Impl"


    // $ANTLR start "rule__JvmUpperBoundAnded__Group__1"
    // InternalTqcl.g:2418:1: rule__JvmUpperBoundAnded__Group__1 : rule__JvmUpperBoundAnded__Group__1__Impl ;
    public final void rule__JvmUpperBoundAnded__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2422:1: ( rule__JvmUpperBoundAnded__Group__1__Impl )
            // InternalTqcl.g:2423:2: rule__JvmUpperBoundAnded__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JvmUpperBoundAnded__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmUpperBoundAnded__Group__1"


    // $ANTLR start "rule__JvmUpperBoundAnded__Group__1__Impl"
    // InternalTqcl.g:2429:1: rule__JvmUpperBoundAnded__Group__1__Impl : ( ( rule__JvmUpperBoundAnded__TypeReferenceAssignment_1 ) ) ;
    public final void rule__JvmUpperBoundAnded__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2433:1: ( ( ( rule__JvmUpperBoundAnded__TypeReferenceAssignment_1 ) ) )
            // InternalTqcl.g:2434:1: ( ( rule__JvmUpperBoundAnded__TypeReferenceAssignment_1 ) )
            {
            // InternalTqcl.g:2434:1: ( ( rule__JvmUpperBoundAnded__TypeReferenceAssignment_1 ) )
            // InternalTqcl.g:2435:2: ( rule__JvmUpperBoundAnded__TypeReferenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceAssignment_1()); 
            }
            // InternalTqcl.g:2436:2: ( rule__JvmUpperBoundAnded__TypeReferenceAssignment_1 )
            // InternalTqcl.g:2436:3: rule__JvmUpperBoundAnded__TypeReferenceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__JvmUpperBoundAnded__TypeReferenceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmUpperBoundAnded__Group__1__Impl"


    // $ANTLR start "rule__JvmLowerBound__Group__0"
    // InternalTqcl.g:2445:1: rule__JvmLowerBound__Group__0 : rule__JvmLowerBound__Group__0__Impl rule__JvmLowerBound__Group__1 ;
    public final void rule__JvmLowerBound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2449:1: ( rule__JvmLowerBound__Group__0__Impl rule__JvmLowerBound__Group__1 )
            // InternalTqcl.g:2450:2: rule__JvmLowerBound__Group__0__Impl rule__JvmLowerBound__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__JvmLowerBound__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmLowerBound__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmLowerBound__Group__0"


    // $ANTLR start "rule__JvmLowerBound__Group__0__Impl"
    // InternalTqcl.g:2457:1: rule__JvmLowerBound__Group__0__Impl : ( 'super' ) ;
    public final void rule__JvmLowerBound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2461:1: ( ( 'super' ) )
            // InternalTqcl.g:2462:1: ( 'super' )
            {
            // InternalTqcl.g:2462:1: ( 'super' )
            // InternalTqcl.g:2463:2: 'super'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmLowerBound__Group__0__Impl"


    // $ANTLR start "rule__JvmLowerBound__Group__1"
    // InternalTqcl.g:2472:1: rule__JvmLowerBound__Group__1 : rule__JvmLowerBound__Group__1__Impl ;
    public final void rule__JvmLowerBound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2476:1: ( rule__JvmLowerBound__Group__1__Impl )
            // InternalTqcl.g:2477:2: rule__JvmLowerBound__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JvmLowerBound__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmLowerBound__Group__1"


    // $ANTLR start "rule__JvmLowerBound__Group__1__Impl"
    // InternalTqcl.g:2483:1: rule__JvmLowerBound__Group__1__Impl : ( ( rule__JvmLowerBound__TypeReferenceAssignment_1 ) ) ;
    public final void rule__JvmLowerBound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2487:1: ( ( ( rule__JvmLowerBound__TypeReferenceAssignment_1 ) ) )
            // InternalTqcl.g:2488:1: ( ( rule__JvmLowerBound__TypeReferenceAssignment_1 ) )
            {
            // InternalTqcl.g:2488:1: ( ( rule__JvmLowerBound__TypeReferenceAssignment_1 ) )
            // InternalTqcl.g:2489:2: ( rule__JvmLowerBound__TypeReferenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceAssignment_1()); 
            }
            // InternalTqcl.g:2490:2: ( rule__JvmLowerBound__TypeReferenceAssignment_1 )
            // InternalTqcl.g:2490:3: rule__JvmLowerBound__TypeReferenceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__JvmLowerBound__TypeReferenceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmLowerBound__Group__1__Impl"


    // $ANTLR start "rule__JvmLowerBoundAnded__Group__0"
    // InternalTqcl.g:2499:1: rule__JvmLowerBoundAnded__Group__0 : rule__JvmLowerBoundAnded__Group__0__Impl rule__JvmLowerBoundAnded__Group__1 ;
    public final void rule__JvmLowerBoundAnded__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2503:1: ( rule__JvmLowerBoundAnded__Group__0__Impl rule__JvmLowerBoundAnded__Group__1 )
            // InternalTqcl.g:2504:2: rule__JvmLowerBoundAnded__Group__0__Impl rule__JvmLowerBoundAnded__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__JvmLowerBoundAnded__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmLowerBoundAnded__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmLowerBoundAnded__Group__0"


    // $ANTLR start "rule__JvmLowerBoundAnded__Group__0__Impl"
    // InternalTqcl.g:2511:1: rule__JvmLowerBoundAnded__Group__0__Impl : ( '&' ) ;
    public final void rule__JvmLowerBoundAnded__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2515:1: ( ( '&' ) )
            // InternalTqcl.g:2516:1: ( '&' )
            {
            // InternalTqcl.g:2516:1: ( '&' )
            // InternalTqcl.g:2517:2: '&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmLowerBoundAndedAccess().getAmpersandKeyword_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmLowerBoundAndedAccess().getAmpersandKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmLowerBoundAnded__Group__0__Impl"


    // $ANTLR start "rule__JvmLowerBoundAnded__Group__1"
    // InternalTqcl.g:2526:1: rule__JvmLowerBoundAnded__Group__1 : rule__JvmLowerBoundAnded__Group__1__Impl ;
    public final void rule__JvmLowerBoundAnded__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2530:1: ( rule__JvmLowerBoundAnded__Group__1__Impl )
            // InternalTqcl.g:2531:2: rule__JvmLowerBoundAnded__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JvmLowerBoundAnded__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmLowerBoundAnded__Group__1"


    // $ANTLR start "rule__JvmLowerBoundAnded__Group__1__Impl"
    // InternalTqcl.g:2537:1: rule__JvmLowerBoundAnded__Group__1__Impl : ( ( rule__JvmLowerBoundAnded__TypeReferenceAssignment_1 ) ) ;
    public final void rule__JvmLowerBoundAnded__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2541:1: ( ( ( rule__JvmLowerBoundAnded__TypeReferenceAssignment_1 ) ) )
            // InternalTqcl.g:2542:1: ( ( rule__JvmLowerBoundAnded__TypeReferenceAssignment_1 ) )
            {
            // InternalTqcl.g:2542:1: ( ( rule__JvmLowerBoundAnded__TypeReferenceAssignment_1 ) )
            // InternalTqcl.g:2543:2: ( rule__JvmLowerBoundAnded__TypeReferenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmLowerBoundAndedAccess().getTypeReferenceAssignment_1()); 
            }
            // InternalTqcl.g:2544:2: ( rule__JvmLowerBoundAnded__TypeReferenceAssignment_1 )
            // InternalTqcl.g:2544:3: rule__JvmLowerBoundAnded__TypeReferenceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__JvmLowerBoundAnded__TypeReferenceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmLowerBoundAndedAccess().getTypeReferenceAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmLowerBoundAnded__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalTqcl.g:2553:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2557:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalTqcl.g:2558:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalTqcl.g:2565:1: rule__QualifiedName__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2569:1: ( ( ruleValidID ) )
            // InternalTqcl.g:2570:1: ( ruleValidID )
            {
            // InternalTqcl.g:2570:1: ( ruleValidID )
            // InternalTqcl.g:2571:2: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalTqcl.g:2580:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2584:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalTqcl.g:2585:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalTqcl.g:2591:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2595:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalTqcl.g:2596:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalTqcl.g:2596:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalTqcl.g:2597:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalTqcl.g:2598:2: ( rule__QualifiedName__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==24) ) {
                    int LA24_2 = input.LA(2);

                    if ( (LA24_2==RULE_ID) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // InternalTqcl.g:2598:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalTqcl.g:2607:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2611:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalTqcl.g:2612:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalTqcl.g:2619:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2623:1: ( ( '.' ) )
            // InternalTqcl.g:2624:1: ( '.' )
            {
            // InternalTqcl.g:2624:1: ( '.' )
            // InternalTqcl.g:2625:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalTqcl.g:2634:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2638:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalTqcl.g:2639:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalTqcl.g:2645:1: rule__QualifiedName__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2649:1: ( ( ruleValidID ) )
            // InternalTqcl.g:2650:1: ( ruleValidID )
            {
            // InternalTqcl.g:2650:1: ( ruleValidID )
            // InternalTqcl.g:2651:2: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalTqcl.g:2661:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2665:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalTqcl.g:2666:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // InternalTqcl.g:2673:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2677:1: ( ( ruleQualifiedName ) )
            // InternalTqcl.g:2678:1: ( ruleQualifiedName )
            {
            // InternalTqcl.g:2678:1: ( ruleQualifiedName )
            // InternalTqcl.g:2679:2: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // InternalTqcl.g:2688:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl rule__QualifiedNameWithWildcard__Group__2 ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2692:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl rule__QualifiedNameWithWildcard__Group__2 )
            // InternalTqcl.g:2693:2: rule__QualifiedNameWithWildcard__Group__1__Impl rule__QualifiedNameWithWildcard__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // InternalTqcl.g:2700:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2704:1: ( ( '.' ) )
            // InternalTqcl.g:2705:1: ( '.' )
            {
            // InternalTqcl.g:2705:1: ( '.' )
            // InternalTqcl.g:2706:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__2"
    // InternalTqcl.g:2715:1: rule__QualifiedNameWithWildcard__Group__2 : rule__QualifiedNameWithWildcard__Group__2__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2719:1: ( rule__QualifiedNameWithWildcard__Group__2__Impl )
            // InternalTqcl.g:2720:2: rule__QualifiedNameWithWildcard__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__2"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__2__Impl"
    // InternalTqcl.g:2726:1: rule__QualifiedNameWithWildcard__Group__2__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildcard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2730:1: ( ( '*' ) )
            // InternalTqcl.g:2731:1: ( '*' )
            {
            // InternalTqcl.g:2731:1: ( '*' )
            // InternalTqcl.g:2732:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_2()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__2__Impl"


    // $ANTLR start "rule__XImportDeclaration__Group__0"
    // InternalTqcl.g:2742:1: rule__XImportDeclaration__Group__0 : rule__XImportDeclaration__Group__0__Impl rule__XImportDeclaration__Group__1 ;
    public final void rule__XImportDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2746:1: ( rule__XImportDeclaration__Group__0__Impl rule__XImportDeclaration__Group__1 )
            // InternalTqcl.g:2747:2: rule__XImportDeclaration__Group__0__Impl rule__XImportDeclaration__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__XImportDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XImportDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XImportDeclaration__Group__0"


    // $ANTLR start "rule__XImportDeclaration__Group__0__Impl"
    // InternalTqcl.g:2754:1: rule__XImportDeclaration__Group__0__Impl : ( 'import' ) ;
    public final void rule__XImportDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2758:1: ( ( 'import' ) )
            // InternalTqcl.g:2759:1: ( 'import' )
            {
            // InternalTqcl.g:2759:1: ( 'import' )
            // InternalTqcl.g:2760:2: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getImportKeyword_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationAccess().getImportKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XImportDeclaration__Group__0__Impl"


    // $ANTLR start "rule__XImportDeclaration__Group__1"
    // InternalTqcl.g:2769:1: rule__XImportDeclaration__Group__1 : rule__XImportDeclaration__Group__1__Impl rule__XImportDeclaration__Group__2 ;
    public final void rule__XImportDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2773:1: ( rule__XImportDeclaration__Group__1__Impl rule__XImportDeclaration__Group__2 )
            // InternalTqcl.g:2774:2: rule__XImportDeclaration__Group__1__Impl rule__XImportDeclaration__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__XImportDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XImportDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XImportDeclaration__Group__1"


    // $ANTLR start "rule__XImportDeclaration__Group__1__Impl"
    // InternalTqcl.g:2781:1: rule__XImportDeclaration__Group__1__Impl : ( ( rule__XImportDeclaration__Alternatives_1 ) ) ;
    public final void rule__XImportDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2785:1: ( ( ( rule__XImportDeclaration__Alternatives_1 ) ) )
            // InternalTqcl.g:2786:1: ( ( rule__XImportDeclaration__Alternatives_1 ) )
            {
            // InternalTqcl.g:2786:1: ( ( rule__XImportDeclaration__Alternatives_1 ) )
            // InternalTqcl.g:2787:2: ( rule__XImportDeclaration__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getAlternatives_1()); 
            }
            // InternalTqcl.g:2788:2: ( rule__XImportDeclaration__Alternatives_1 )
            // InternalTqcl.g:2788:3: rule__XImportDeclaration__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__XImportDeclaration__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XImportDeclaration__Group__1__Impl"


    // $ANTLR start "rule__XImportDeclaration__Group__2"
    // InternalTqcl.g:2796:1: rule__XImportDeclaration__Group__2 : rule__XImportDeclaration__Group__2__Impl ;
    public final void rule__XImportDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2800:1: ( rule__XImportDeclaration__Group__2__Impl )
            // InternalTqcl.g:2801:2: rule__XImportDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XImportDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XImportDeclaration__Group__2"


    // $ANTLR start "rule__XImportDeclaration__Group__2__Impl"
    // InternalTqcl.g:2807:1: rule__XImportDeclaration__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__XImportDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2811:1: ( ( ( ';' )? ) )
            // InternalTqcl.g:2812:1: ( ( ';' )? )
            {
            // InternalTqcl.g:2812:1: ( ( ';' )? )
            // InternalTqcl.g:2813:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getSemicolonKeyword_2()); 
            }
            // InternalTqcl.g:2814:2: ( ';' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalTqcl.g:2814:3: ';'
                    {
                    match(input,31,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XImportDeclaration__Group__2__Impl"


    // $ANTLR start "rule__XImportDeclaration__Group_1_0__0"
    // InternalTqcl.g:2823:1: rule__XImportDeclaration__Group_1_0__0 : rule__XImportDeclaration__Group_1_0__0__Impl rule__XImportDeclaration__Group_1_0__1 ;
    public final void rule__XImportDeclaration__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2827:1: ( rule__XImportDeclaration__Group_1_0__0__Impl rule__XImportDeclaration__Group_1_0__1 )
            // InternalTqcl.g:2828:2: rule__XImportDeclaration__Group_1_0__0__Impl rule__XImportDeclaration__Group_1_0__1
            {
            pushFollow(FOLLOW_29);
            rule__XImportDeclaration__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XImportDeclaration__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XImportDeclaration__Group_1_0__0"


    // $ANTLR start "rule__XImportDeclaration__Group_1_0__0__Impl"
    // InternalTqcl.g:2835:1: rule__XImportDeclaration__Group_1_0__0__Impl : ( ( rule__XImportDeclaration__StaticAssignment_1_0_0 ) ) ;
    public final void rule__XImportDeclaration__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2839:1: ( ( ( rule__XImportDeclaration__StaticAssignment_1_0_0 ) ) )
            // InternalTqcl.g:2840:1: ( ( rule__XImportDeclaration__StaticAssignment_1_0_0 ) )
            {
            // InternalTqcl.g:2840:1: ( ( rule__XImportDeclaration__StaticAssignment_1_0_0 ) )
            // InternalTqcl.g:2841:2: ( rule__XImportDeclaration__StaticAssignment_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getStaticAssignment_1_0_0()); 
            }
            // InternalTqcl.g:2842:2: ( rule__XImportDeclaration__StaticAssignment_1_0_0 )
            // InternalTqcl.g:2842:3: rule__XImportDeclaration__StaticAssignment_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__XImportDeclaration__StaticAssignment_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationAccess().getStaticAssignment_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XImportDeclaration__Group_1_0__0__Impl"


    // $ANTLR start "rule__XImportDeclaration__Group_1_0__1"
    // InternalTqcl.g:2850:1: rule__XImportDeclaration__Group_1_0__1 : rule__XImportDeclaration__Group_1_0__1__Impl rule__XImportDeclaration__Group_1_0__2 ;
    public final void rule__XImportDeclaration__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2854:1: ( rule__XImportDeclaration__Group_1_0__1__Impl rule__XImportDeclaration__Group_1_0__2 )
            // InternalTqcl.g:2855:2: rule__XImportDeclaration__Group_1_0__1__Impl rule__XImportDeclaration__Group_1_0__2
            {
            pushFollow(FOLLOW_29);
            rule__XImportDeclaration__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XImportDeclaration__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XImportDeclaration__Group_1_0__1"


    // $ANTLR start "rule__XImportDeclaration__Group_1_0__1__Impl"
    // InternalTqcl.g:2862:1: rule__XImportDeclaration__Group_1_0__1__Impl : ( ( rule__XImportDeclaration__ExtensionAssignment_1_0_1 )? ) ;
    public final void rule__XImportDeclaration__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2866:1: ( ( ( rule__XImportDeclaration__ExtensionAssignment_1_0_1 )? ) )
            // InternalTqcl.g:2867:1: ( ( rule__XImportDeclaration__ExtensionAssignment_1_0_1 )? )
            {
            // InternalTqcl.g:2867:1: ( ( rule__XImportDeclaration__ExtensionAssignment_1_0_1 )? )
            // InternalTqcl.g:2868:2: ( rule__XImportDeclaration__ExtensionAssignment_1_0_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getExtensionAssignment_1_0_1()); 
            }
            // InternalTqcl.g:2869:2: ( rule__XImportDeclaration__ExtensionAssignment_1_0_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalTqcl.g:2869:3: rule__XImportDeclaration__ExtensionAssignment_1_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XImportDeclaration__ExtensionAssignment_1_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationAccess().getExtensionAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XImportDeclaration__Group_1_0__1__Impl"


    // $ANTLR start "rule__XImportDeclaration__Group_1_0__2"
    // InternalTqcl.g:2877:1: rule__XImportDeclaration__Group_1_0__2 : rule__XImportDeclaration__Group_1_0__2__Impl rule__XImportDeclaration__Group_1_0__3 ;
    public final void rule__XImportDeclaration__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2881:1: ( rule__XImportDeclaration__Group_1_0__2__Impl rule__XImportDeclaration__Group_1_0__3 )
            // InternalTqcl.g:2882:2: rule__XImportDeclaration__Group_1_0__2__Impl rule__XImportDeclaration__Group_1_0__3
            {
            pushFollow(FOLLOW_30);
            rule__XImportDeclaration__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XImportDeclaration__Group_1_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XImportDeclaration__Group_1_0__2"


    // $ANTLR start "rule__XImportDeclaration__Group_1_0__2__Impl"
    // InternalTqcl.g:2889:1: rule__XImportDeclaration__Group_1_0__2__Impl : ( ( rule__XImportDeclaration__ImportedTypeAssignment_1_0_2 ) ) ;
    public final void rule__XImportDeclaration__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2893:1: ( ( ( rule__XImportDeclaration__ImportedTypeAssignment_1_0_2 ) ) )
            // InternalTqcl.g:2894:1: ( ( rule__XImportDeclaration__ImportedTypeAssignment_1_0_2 ) )
            {
            // InternalTqcl.g:2894:1: ( ( rule__XImportDeclaration__ImportedTypeAssignment_1_0_2 ) )
            // InternalTqcl.g:2895:2: ( rule__XImportDeclaration__ImportedTypeAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getImportedTypeAssignment_1_0_2()); 
            }
            // InternalTqcl.g:2896:2: ( rule__XImportDeclaration__ImportedTypeAssignment_1_0_2 )
            // InternalTqcl.g:2896:3: rule__XImportDeclaration__ImportedTypeAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__XImportDeclaration__ImportedTypeAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationAccess().getImportedTypeAssignment_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XImportDeclaration__Group_1_0__2__Impl"


    // $ANTLR start "rule__XImportDeclaration__Group_1_0__3"
    // InternalTqcl.g:2904:1: rule__XImportDeclaration__Group_1_0__3 : rule__XImportDeclaration__Group_1_0__3__Impl ;
    public final void rule__XImportDeclaration__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2908:1: ( rule__XImportDeclaration__Group_1_0__3__Impl )
            // InternalTqcl.g:2909:2: rule__XImportDeclaration__Group_1_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XImportDeclaration__Group_1_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XImportDeclaration__Group_1_0__3"


    // $ANTLR start "rule__XImportDeclaration__Group_1_0__3__Impl"
    // InternalTqcl.g:2915:1: rule__XImportDeclaration__Group_1_0__3__Impl : ( ( rule__XImportDeclaration__Alternatives_1_0_3 ) ) ;
    public final void rule__XImportDeclaration__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2919:1: ( ( ( rule__XImportDeclaration__Alternatives_1_0_3 ) ) )
            // InternalTqcl.g:2920:1: ( ( rule__XImportDeclaration__Alternatives_1_0_3 ) )
            {
            // InternalTqcl.g:2920:1: ( ( rule__XImportDeclaration__Alternatives_1_0_3 ) )
            // InternalTqcl.g:2921:2: ( rule__XImportDeclaration__Alternatives_1_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getAlternatives_1_0_3()); 
            }
            // InternalTqcl.g:2922:2: ( rule__XImportDeclaration__Alternatives_1_0_3 )
            // InternalTqcl.g:2922:3: rule__XImportDeclaration__Alternatives_1_0_3
            {
            pushFollow(FOLLOW_2);
            rule__XImportDeclaration__Alternatives_1_0_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationAccess().getAlternatives_1_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XImportDeclaration__Group_1_0__3__Impl"


    // $ANTLR start "rule__QualifiedNameInStaticImport__Group__0"
    // InternalTqcl.g:2931:1: rule__QualifiedNameInStaticImport__Group__0 : rule__QualifiedNameInStaticImport__Group__0__Impl rule__QualifiedNameInStaticImport__Group__1 ;
    public final void rule__QualifiedNameInStaticImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2935:1: ( rule__QualifiedNameInStaticImport__Group__0__Impl rule__QualifiedNameInStaticImport__Group__1 )
            // InternalTqcl.g:2936:2: rule__QualifiedNameInStaticImport__Group__0__Impl rule__QualifiedNameInStaticImport__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__QualifiedNameInStaticImport__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedNameInStaticImport__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameInStaticImport__Group__0"


    // $ANTLR start "rule__QualifiedNameInStaticImport__Group__0__Impl"
    // InternalTqcl.g:2943:1: rule__QualifiedNameInStaticImport__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedNameInStaticImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2947:1: ( ( ruleValidID ) )
            // InternalTqcl.g:2948:1: ( ruleValidID )
            {
            // InternalTqcl.g:2948:1: ( ruleValidID )
            // InternalTqcl.g:2949:2: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameInStaticImportAccess().getValidIDParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameInStaticImportAccess().getValidIDParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameInStaticImport__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameInStaticImport__Group__1"
    // InternalTqcl.g:2958:1: rule__QualifiedNameInStaticImport__Group__1 : rule__QualifiedNameInStaticImport__Group__1__Impl ;
    public final void rule__QualifiedNameInStaticImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2962:1: ( rule__QualifiedNameInStaticImport__Group__1__Impl )
            // InternalTqcl.g:2963:2: rule__QualifiedNameInStaticImport__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameInStaticImport__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameInStaticImport__Group__1"


    // $ANTLR start "rule__QualifiedNameInStaticImport__Group__1__Impl"
    // InternalTqcl.g:2969:1: rule__QualifiedNameInStaticImport__Group__1__Impl : ( '.' ) ;
    public final void rule__QualifiedNameInStaticImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2973:1: ( ( '.' ) )
            // InternalTqcl.g:2974:1: ( '.' )
            {
            // InternalTqcl.g:2974:1: ( '.' )
            // InternalTqcl.g:2975:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameInStaticImportAccess().getFullStopKeyword_1()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameInStaticImportAccess().getFullStopKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameInStaticImport__Group__1__Impl"


    // $ANTLR start "rule__TriquetrumScript__CommandsAssignment"
    // InternalTqcl.g:2985:1: rule__TriquetrumScript__CommandsAssignment : ( ruleCommand ) ;
    public final void rule__TriquetrumScript__CommandsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2989:1: ( ( ruleCommand ) )
            // InternalTqcl.g:2990:2: ( ruleCommand )
            {
            // InternalTqcl.g:2990:2: ( ruleCommand )
            // InternalTqcl.g:2991:3: ruleCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTriquetrumScriptAccess().getCommandsCommandParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTriquetrumScriptAccess().getCommandsCommandParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriquetrumScript__CommandsAssignment"


    // $ANTLR start "rule__Insert__ObjAssignment_1"
    // InternalTqcl.g:3000:1: rule__Insert__ObjAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Insert__ObjAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3004:1: ( ( ruleQualifiedName ) )
            // InternalTqcl.g:3005:2: ( ruleQualifiedName )
            {
            // InternalTqcl.g:3005:2: ( ruleQualifiedName )
            // InternalTqcl.g:3006:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertAccess().getObjQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInsertAccess().getObjQualifiedNameParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__ObjAssignment_1"


    // $ANTLR start "rule__Insert__AliasAssignment_2_1"
    // InternalTqcl.g:3015:1: rule__Insert__AliasAssignment_2_1 : ( ruleNamedObj ) ;
    public final void rule__Insert__AliasAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3019:1: ( ( ruleNamedObj ) )
            // InternalTqcl.g:3020:2: ( ruleNamedObj )
            {
            // InternalTqcl.g:3020:2: ( ruleNamedObj )
            // InternalTqcl.g:3021:3: ruleNamedObj
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertAccess().getAliasNamedObjParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNamedObj();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInsertAccess().getAliasNamedObjParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__AliasAssignment_2_1"


    // $ANTLR start "rule__Insert__ParametersAssignment_3_1"
    // InternalTqcl.g:3030:1: rule__Insert__ParametersAssignment_3_1 : ( ruleParameter ) ;
    public final void rule__Insert__ParametersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3034:1: ( ( ruleParameter ) )
            // InternalTqcl.g:3035:2: ( ruleParameter )
            {
            // InternalTqcl.g:3035:2: ( ruleParameter )
            // InternalTqcl.g:3036:3: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertAccess().getParametersParameterParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInsertAccess().getParametersParameterParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__ParametersAssignment_3_1"


    // $ANTLR start "rule__Parameter__NameAssignment_0"
    // InternalTqcl.g:3045:1: rule__Parameter__NameAssignment_0 : ( ruleQualifiedName ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3049:1: ( ( ruleQualifiedName ) )
            // InternalTqcl.g:3050:2: ( ruleQualifiedName )
            {
            // InternalTqcl.g:3050:2: ( ruleQualifiedName )
            // InternalTqcl.g:3051:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameQualifiedNameParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getNameQualifiedNameParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_0"


    // $ANTLR start "rule__Parameter__ValueAssignment_2"
    // InternalTqcl.g:3060:1: rule__Parameter__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Parameter__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3064:1: ( ( RULE_STRING ) )
            // InternalTqcl.g:3065:2: ( RULE_STRING )
            {
            // InternalTqcl.g:3065:2: ( RULE_STRING )
            // InternalTqcl.g:3066:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__ValueAssignment_2"


    // $ANTLR start "rule__NamedObj__NameAssignment"
    // InternalTqcl.g:3075:1: rule__NamedObj__NameAssignment : ( ruleQualifiedName ) ;
    public final void rule__NamedObj__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3079:1: ( ( ruleQualifiedName ) )
            // InternalTqcl.g:3080:2: ( ruleQualifiedName )
            {
            // InternalTqcl.g:3080:2: ( ruleQualifiedName )
            // InternalTqcl.g:3081:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedObjAccess().getNameQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamedObjAccess().getNameQualifiedNameParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedObj__NameAssignment"


    // $ANTLR start "rule__Connect__FromAssignment_1"
    // InternalTqcl.g:3090:1: rule__Connect__FromAssignment_1 : ( ruleNamedObj ) ;
    public final void rule__Connect__FromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3094:1: ( ( ruleNamedObj ) )
            // InternalTqcl.g:3095:2: ( ruleNamedObj )
            {
            // InternalTqcl.g:3095:2: ( ruleNamedObj )
            // InternalTqcl.g:3096:3: ruleNamedObj
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectAccess().getFromNamedObjParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNamedObj();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectAccess().getFromNamedObjParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__FromAssignment_1"


    // $ANTLR start "rule__Connect__ToAssignment_3"
    // InternalTqcl.g:3105:1: rule__Connect__ToAssignment_3 : ( ruleNamedObj ) ;
    public final void rule__Connect__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3109:1: ( ( ruleNamedObj ) )
            // InternalTqcl.g:3110:2: ( ruleNamedObj )
            {
            // InternalTqcl.g:3110:2: ( ruleNamedObj )
            // InternalTqcl.g:3111:3: ruleNamedObj
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectAccess().getToNamedObjParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNamedObj();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectAccess().getToNamedObjParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__ToAssignment_3"


    // $ANTLR start "rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0"
    // InternalTqcl.g:3120:1: rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0 : ( ruleJvmTypeReference ) ;
    public final void rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3124:1: ( ( ruleJvmTypeReference ) )
            // InternalTqcl.g:3125:2: ( ruleJvmTypeReference )
            {
            // InternalTqcl.g:3125:2: ( ruleJvmTypeReference )
            // InternalTqcl.g:3126:3: ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0"


    // $ANTLR start "rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1"
    // InternalTqcl.g:3135:1: rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1 : ( ruleJvmTypeReference ) ;
    public final void rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3139:1: ( ( ruleJvmTypeReference ) )
            // InternalTqcl.g:3140:2: ( ruleJvmTypeReference )
            {
            // InternalTqcl.g:3140:2: ( ruleJvmTypeReference )
            // InternalTqcl.g:3141:3: ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1"


    // $ANTLR start "rule__XFunctionTypeRef__ReturnTypeAssignment_2"
    // InternalTqcl.g:3150:1: rule__XFunctionTypeRef__ReturnTypeAssignment_2 : ( ruleJvmTypeReference ) ;
    public final void rule__XFunctionTypeRef__ReturnTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3154:1: ( ( ruleJvmTypeReference ) )
            // InternalTqcl.g:3155:2: ( ruleJvmTypeReference )
            {
            // InternalTqcl.g:3155:2: ( ruleJvmTypeReference )
            // InternalTqcl.g:3156:3: ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XFunctionTypeRef__ReturnTypeAssignment_2"


    // $ANTLR start "rule__JvmParameterizedTypeReference__TypeAssignment_0"
    // InternalTqcl.g:3165:1: rule__JvmParameterizedTypeReference__TypeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__JvmParameterizedTypeReference__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3169:1: ( ( ( ruleQualifiedName ) ) )
            // InternalTqcl.g:3170:2: ( ( ruleQualifiedName ) )
            {
            // InternalTqcl.g:3170:2: ( ( ruleQualifiedName ) )
            // InternalTqcl.g:3171:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
            }
            // InternalTqcl.g:3172:3: ( ruleQualifiedName )
            // InternalTqcl.g:3173:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeQualifiedNameParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__TypeAssignment_0"


    // $ANTLR start "rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1"
    // InternalTqcl.g:3184:1: rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1 : ( ruleJvmArgumentTypeReference ) ;
    public final void rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3188:1: ( ( ruleJvmArgumentTypeReference ) )
            // InternalTqcl.g:3189:2: ( ruleJvmArgumentTypeReference )
            {
            // InternalTqcl.g:3189:2: ( ruleJvmArgumentTypeReference )
            // InternalTqcl.g:3190:3: ruleJvmArgumentTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1"


    // $ANTLR start "rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1"
    // InternalTqcl.g:3199:1: rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1 : ( ruleJvmArgumentTypeReference ) ;
    public final void rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3203:1: ( ( ruleJvmArgumentTypeReference ) )
            // InternalTqcl.g:3204:2: ( ruleJvmArgumentTypeReference )
            {
            // InternalTqcl.g:3204:2: ( ruleJvmArgumentTypeReference )
            // InternalTqcl.g:3205:3: ruleJvmArgumentTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1"


    // $ANTLR start "rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1"
    // InternalTqcl.g:3214:1: rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1 : ( ( ruleValidID ) ) ;
    public final void rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3218:1: ( ( ( ruleValidID ) ) )
            // InternalTqcl.g:3219:2: ( ( ruleValidID ) )
            {
            // InternalTqcl.g:3219:2: ( ( ruleValidID ) )
            // InternalTqcl.g:3220:3: ( ruleValidID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_1_4_1_0()); 
            }
            // InternalTqcl.g:3221:3: ( ruleValidID )
            // InternalTqcl.g:3222:4: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeValidIDParserRuleCall_1_4_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeValidIDParserRuleCall_1_4_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_1_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1"


    // $ANTLR start "rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1"
    // InternalTqcl.g:3233:1: rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1 : ( ruleJvmArgumentTypeReference ) ;
    public final void rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3237:1: ( ( ruleJvmArgumentTypeReference ) )
            // InternalTqcl.g:3238:2: ( ruleJvmArgumentTypeReference )
            {
            // InternalTqcl.g:3238:2: ( ruleJvmArgumentTypeReference )
            // InternalTqcl.g:3239:3: ruleJvmArgumentTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_4_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_4_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1"


    // $ANTLR start "rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1"
    // InternalTqcl.g:3248:1: rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1 : ( ruleJvmArgumentTypeReference ) ;
    public final void rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3252:1: ( ( ruleJvmArgumentTypeReference ) )
            // InternalTqcl.g:3253:2: ( ruleJvmArgumentTypeReference )
            {
            // InternalTqcl.g:3253:2: ( ruleJvmArgumentTypeReference )
            // InternalTqcl.g:3254:3: ruleJvmArgumentTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_4_2_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_4_2_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1"


    // $ANTLR start "rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0"
    // InternalTqcl.g:3263:1: rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0 : ( ruleJvmUpperBound ) ;
    public final void rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3267:1: ( ( ruleJvmUpperBound ) )
            // InternalTqcl.g:3268:2: ( ruleJvmUpperBound )
            {
            // InternalTqcl.g:3268:2: ( ruleJvmUpperBound )
            // InternalTqcl.g:3269:3: ruleJvmUpperBound
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0"


    // $ANTLR start "rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1"
    // InternalTqcl.g:3278:1: rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1 : ( ruleJvmUpperBoundAnded ) ;
    public final void rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3282:1: ( ( ruleJvmUpperBoundAnded ) )
            // InternalTqcl.g:3283:2: ( ruleJvmUpperBoundAnded )
            {
            // InternalTqcl.g:3283:2: ( ruleJvmUpperBoundAnded )
            // InternalTqcl.g:3284:3: ruleJvmUpperBoundAnded
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundAndedParserRuleCall_2_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundAndedParserRuleCall_2_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1"


    // $ANTLR start "rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0"
    // InternalTqcl.g:3293:1: rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0 : ( ruleJvmLowerBound ) ;
    public final void rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3297:1: ( ( ruleJvmLowerBound ) )
            // InternalTqcl.g:3298:2: ( ruleJvmLowerBound )
            {
            // InternalTqcl.g:3298:2: ( ruleJvmLowerBound )
            // InternalTqcl.g:3299:3: ruleJvmLowerBound
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0"


    // $ANTLR start "rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1"
    // InternalTqcl.g:3308:1: rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1 : ( ruleJvmLowerBoundAnded ) ;
    public final void rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3312:1: ( ( ruleJvmLowerBoundAnded ) )
            // InternalTqcl.g:3313:2: ( ruleJvmLowerBoundAnded )
            {
            // InternalTqcl.g:3313:2: ( ruleJvmLowerBoundAnded )
            // InternalTqcl.g:3314:3: ruleJvmLowerBoundAnded
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundAndedParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJvmLowerBoundAnded();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundAndedParserRuleCall_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1"


    // $ANTLR start "rule__JvmUpperBound__TypeReferenceAssignment_1"
    // InternalTqcl.g:3323:1: rule__JvmUpperBound__TypeReferenceAssignment_1 : ( ruleJvmTypeReference ) ;
    public final void rule__JvmUpperBound__TypeReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3327:1: ( ( ruleJvmTypeReference ) )
            // InternalTqcl.g:3328:2: ( ruleJvmTypeReference )
            {
            // InternalTqcl.g:3328:2: ( ruleJvmTypeReference )
            // InternalTqcl.g:3329:3: ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmUpperBound__TypeReferenceAssignment_1"


    // $ANTLR start "rule__JvmUpperBoundAnded__TypeReferenceAssignment_1"
    // InternalTqcl.g:3338:1: rule__JvmUpperBoundAnded__TypeReferenceAssignment_1 : ( ruleJvmTypeReference ) ;
    public final void rule__JvmUpperBoundAnded__TypeReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3342:1: ( ( ruleJvmTypeReference ) )
            // InternalTqcl.g:3343:2: ( ruleJvmTypeReference )
            {
            // InternalTqcl.g:3343:2: ( ruleJvmTypeReference )
            // InternalTqcl.g:3344:3: ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmUpperBoundAnded__TypeReferenceAssignment_1"


    // $ANTLR start "rule__JvmLowerBound__TypeReferenceAssignment_1"
    // InternalTqcl.g:3353:1: rule__JvmLowerBound__TypeReferenceAssignment_1 : ( ruleJvmTypeReference ) ;
    public final void rule__JvmLowerBound__TypeReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3357:1: ( ( ruleJvmTypeReference ) )
            // InternalTqcl.g:3358:2: ( ruleJvmTypeReference )
            {
            // InternalTqcl.g:3358:2: ( ruleJvmTypeReference )
            // InternalTqcl.g:3359:3: ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmLowerBound__TypeReferenceAssignment_1"


    // $ANTLR start "rule__JvmLowerBoundAnded__TypeReferenceAssignment_1"
    // InternalTqcl.g:3368:1: rule__JvmLowerBoundAnded__TypeReferenceAssignment_1 : ( ruleJvmTypeReference ) ;
    public final void rule__JvmLowerBoundAnded__TypeReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3372:1: ( ( ruleJvmTypeReference ) )
            // InternalTqcl.g:3373:2: ( ruleJvmTypeReference )
            {
            // InternalTqcl.g:3373:2: ( ruleJvmTypeReference )
            // InternalTqcl.g:3374:3: ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmLowerBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmLowerBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmLowerBoundAnded__TypeReferenceAssignment_1"


    // $ANTLR start "rule__XImportDeclaration__StaticAssignment_1_0_0"
    // InternalTqcl.g:3383:1: rule__XImportDeclaration__StaticAssignment_1_0_0 : ( ( 'static' ) ) ;
    public final void rule__XImportDeclaration__StaticAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3387:1: ( ( ( 'static' ) ) )
            // InternalTqcl.g:3388:2: ( ( 'static' ) )
            {
            // InternalTqcl.g:3388:2: ( ( 'static' ) )
            // InternalTqcl.g:3389:3: ( 'static' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getStaticStaticKeyword_1_0_0_0()); 
            }
            // InternalTqcl.g:3390:3: ( 'static' )
            // InternalTqcl.g:3391:4: 'static'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getStaticStaticKeyword_1_0_0_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationAccess().getStaticStaticKeyword_1_0_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationAccess().getStaticStaticKeyword_1_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XImportDeclaration__StaticAssignment_1_0_0"


    // $ANTLR start "rule__XImportDeclaration__ExtensionAssignment_1_0_1"
    // InternalTqcl.g:3402:1: rule__XImportDeclaration__ExtensionAssignment_1_0_1 : ( ( 'extension' ) ) ;
    public final void rule__XImportDeclaration__ExtensionAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3406:1: ( ( ( 'extension' ) ) )
            // InternalTqcl.g:3407:2: ( ( 'extension' ) )
            {
            // InternalTqcl.g:3407:2: ( ( 'extension' ) )
            // InternalTqcl.g:3408:3: ( 'extension' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getExtensionExtensionKeyword_1_0_1_0()); 
            }
            // InternalTqcl.g:3409:3: ( 'extension' )
            // InternalTqcl.g:3410:4: 'extension'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getExtensionExtensionKeyword_1_0_1_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationAccess().getExtensionExtensionKeyword_1_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationAccess().getExtensionExtensionKeyword_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XImportDeclaration__ExtensionAssignment_1_0_1"


    // $ANTLR start "rule__XImportDeclaration__ImportedTypeAssignment_1_0_2"
    // InternalTqcl.g:3421:1: rule__XImportDeclaration__ImportedTypeAssignment_1_0_2 : ( ( ruleQualifiedNameInStaticImport ) ) ;
    public final void rule__XImportDeclaration__ImportedTypeAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3425:1: ( ( ( ruleQualifiedNameInStaticImport ) ) )
            // InternalTqcl.g:3426:2: ( ( ruleQualifiedNameInStaticImport ) )
            {
            // InternalTqcl.g:3426:2: ( ( ruleQualifiedNameInStaticImport ) )
            // InternalTqcl.g:3427:3: ( ruleQualifiedNameInStaticImport )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_0_2_0()); 
            }
            // InternalTqcl.g:3428:3: ( ruleQualifiedNameInStaticImport )
            // InternalTqcl.g:3429:4: ruleQualifiedNameInStaticImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeQualifiedNameInStaticImportParserRuleCall_1_0_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedNameInStaticImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeQualifiedNameInStaticImportParserRuleCall_1_0_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XImportDeclaration__ImportedTypeAssignment_1_0_2"


    // $ANTLR start "rule__XImportDeclaration__WildcardAssignment_1_0_3_0"
    // InternalTqcl.g:3440:1: rule__XImportDeclaration__WildcardAssignment_1_0_3_0 : ( ( '*' ) ) ;
    public final void rule__XImportDeclaration__WildcardAssignment_1_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3444:1: ( ( ( '*' ) ) )
            // InternalTqcl.g:3445:2: ( ( '*' ) )
            {
            // InternalTqcl.g:3445:2: ( ( '*' ) )
            // InternalTqcl.g:3446:3: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getWildcardAsteriskKeyword_1_0_3_0_0()); 
            }
            // InternalTqcl.g:3447:3: ( '*' )
            // InternalTqcl.g:3448:4: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getWildcardAsteriskKeyword_1_0_3_0_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationAccess().getWildcardAsteriskKeyword_1_0_3_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationAccess().getWildcardAsteriskKeyword_1_0_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XImportDeclaration__WildcardAssignment_1_0_3_0"


    // $ANTLR start "rule__XImportDeclaration__MemberNameAssignment_1_0_3_1"
    // InternalTqcl.g:3459:1: rule__XImportDeclaration__MemberNameAssignment_1_0_3_1 : ( ruleValidID ) ;
    public final void rule__XImportDeclaration__MemberNameAssignment_1_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3463:1: ( ( ruleValidID ) )
            // InternalTqcl.g:3464:2: ( ruleValidID )
            {
            // InternalTqcl.g:3464:2: ( ruleValidID )
            // InternalTqcl.g:3465:3: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getMemberNameValidIDParserRuleCall_1_0_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationAccess().getMemberNameValidIDParserRuleCall_1_0_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XImportDeclaration__MemberNameAssignment_1_0_3_1"


    // $ANTLR start "rule__XImportDeclaration__ImportedTypeAssignment_1_1"
    // InternalTqcl.g:3474:1: rule__XImportDeclaration__ImportedTypeAssignment_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__XImportDeclaration__ImportedTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3478:1: ( ( ( ruleQualifiedName ) ) )
            // InternalTqcl.g:3479:2: ( ( ruleQualifiedName ) )
            {
            // InternalTqcl.g:3479:2: ( ( ruleQualifiedName ) )
            // InternalTqcl.g:3480:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_1_0()); 
            }
            // InternalTqcl.g:3481:3: ( ruleQualifiedName )
            // InternalTqcl.g:3482:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeQualifiedNameParserRuleCall_1_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeQualifiedNameParserRuleCall_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XImportDeclaration__ImportedTypeAssignment_1_1"


    // $ANTLR start "rule__XImportDeclaration__ImportedNamespaceAssignment_1_2"
    // InternalTqcl.g:3493:1: rule__XImportDeclaration__ImportedNamespaceAssignment_1_2 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__XImportDeclaration__ImportedNamespaceAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3497:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalTqcl.g:3498:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalTqcl.g:3498:2: ( ruleQualifiedNameWithWildcard )
            // InternalTqcl.g:3499:3: ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XImportDeclaration__ImportedNamespaceAssignment_1_2"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\2\uffff\1\4\2\uffff\1\4\1\uffff";
    static final String dfa_3s = "\1\4\1\uffff\1\30\1\4\1\uffff\1\30\1\uffff";
    static final String dfa_4s = "\1\40\1\uffff\1\37\1\35\1\uffff\1\37\1\uffff";
    static final String dfa_5s = "\1\uffff\1\1\2\uffff\1\2\1\uffff\1\3";
    static final String dfa_6s = "\7\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\33\uffff\1\1",
            "",
            "\1\3\6\uffff\1\4",
            "\1\5\30\uffff\1\6",
            "",
            "\1\3\6\uffff\1\4",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "669:1: rule__XImportDeclaration__Alternatives_1 : ( ( ( rule__XImportDeclaration__Group_1_0__0 ) ) | ( ( rule__XImportDeclaration__ImportedTypeAssignment_1_1 ) ) | ( ( rule__XImportDeclaration__ImportedNamespaceAssignment_1_2 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004402L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000C0010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000001C0010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000020C0010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000010L});

}