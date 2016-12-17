/*******************************************************************************
 * Copyright (c)  2016 Totaro Rodolfo
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Rodolfo Totaro - initial API and implementation and/or initial documentation
 *******************************************************************************/
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'insert'", "'as'", "'with'", "','", "'='", "'connect'", "'to'", "'['", "']'", "'=>'", "'('", "')'", "'<'", "'>'", "'.'", "'?'", "'extends'", "'&'", "'super'", "'*'", "'import'", "'static'", "'extension'"
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

                if ( (LA1_0==11||LA1_0==16) ) {
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
    // InternalTqcl.g:88:1: ruleCommand : ( ( rule__Command__Group__0 ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:92:2: ( ( ( rule__Command__Group__0 ) ) )
            // InternalTqcl.g:93:2: ( ( rule__Command__Group__0 ) )
            {
            // InternalTqcl.g:93:2: ( ( rule__Command__Group__0 ) )
            // InternalTqcl.g:94:3: ( rule__Command__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getGroup()); 
            }
            // InternalTqcl.g:95:3: ( rule__Command__Group__0 )
            // InternalTqcl.g:95:4: rule__Command__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Command__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getGroup()); 
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

                    if ( (LA2_2==25) ) {
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


    // $ANTLR start "rule__Command__Alternatives_0"
    // InternalTqcl.g:585:1: rule__Command__Alternatives_0 : ( ( ruleInsert ) | ( ruleConnect ) );
    public final void rule__Command__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:589:1: ( ( ruleInsert ) | ( ruleConnect ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
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
                       before(grammarAccess.getCommandAccess().getInsertParserRuleCall_0_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleInsert();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getInsertParserRuleCall_0_0()); 
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
                       before(grammarAccess.getCommandAccess().getConnectParserRuleCall_0_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleConnect();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getConnectParserRuleCall_0_1()); 
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
    // $ANTLR end "rule__Command__Alternatives_0"


    // $ANTLR start "rule__NamedObj__NameAlternatives_0"
    // InternalTqcl.g:606:1: rule__NamedObj__NameAlternatives_0 : ( ( ruleQualifiedName ) | ( RULE_STRING ) );
    public final void rule__NamedObj__NameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:610:1: ( ( ruleQualifiedName ) | ( RULE_STRING ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_STRING) ) {
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
                    // InternalTqcl.g:611:2: ( ruleQualifiedName )
                    {
                    // InternalTqcl.g:611:2: ( ruleQualifiedName )
                    // InternalTqcl.g:612:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNamedObjAccess().getNameQualifiedNameParserRuleCall_0_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNamedObjAccess().getNameQualifiedNameParserRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTqcl.g:617:2: ( RULE_STRING )
                    {
                    // InternalTqcl.g:617:2: ( RULE_STRING )
                    // InternalTqcl.g:618:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNamedObjAccess().getNameSTRINGTerminalRuleCall_0_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNamedObjAccess().getNameSTRINGTerminalRuleCall_0_1()); 
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
    // $ANTLR end "rule__NamedObj__NameAlternatives_0"


    // $ANTLR start "rule__JvmTypeReference__Alternatives"
    // InternalTqcl.g:627:1: rule__JvmTypeReference__Alternatives : ( ( ( rule__JvmTypeReference__Group_0__0 ) ) | ( ruleXFunctionTypeRef ) );
    public final void rule__JvmTypeReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:631:1: ( ( ( rule__JvmTypeReference__Group_0__0 ) ) | ( ruleXFunctionTypeRef ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=20 && LA5_0<=21)) ) {
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
                    // InternalTqcl.g:632:2: ( ( rule__JvmTypeReference__Group_0__0 ) )
                    {
                    // InternalTqcl.g:632:2: ( ( rule__JvmTypeReference__Group_0__0 ) )
                    // InternalTqcl.g:633:3: ( rule__JvmTypeReference__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getJvmTypeReferenceAccess().getGroup_0()); 
                    }
                    // InternalTqcl.g:634:3: ( rule__JvmTypeReference__Group_0__0 )
                    // InternalTqcl.g:634:4: rule__JvmTypeReference__Group_0__0
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
                    // InternalTqcl.g:638:2: ( ruleXFunctionTypeRef )
                    {
                    // InternalTqcl.g:638:2: ( ruleXFunctionTypeRef )
                    // InternalTqcl.g:639:3: ruleXFunctionTypeRef
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
    // InternalTqcl.g:648:1: rule__JvmArgumentTypeReference__Alternatives : ( ( ruleJvmTypeReference ) | ( ruleJvmWildcardTypeReference ) );
    public final void rule__JvmArgumentTypeReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:652:1: ( ( ruleJvmTypeReference ) | ( ruleJvmWildcardTypeReference ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID||(LA6_0>=20 && LA6_0<=21)) ) {
                alt6=1;
            }
            else if ( (LA6_0==26) ) {
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
                    // InternalTqcl.g:653:2: ( ruleJvmTypeReference )
                    {
                    // InternalTqcl.g:653:2: ( ruleJvmTypeReference )
                    // InternalTqcl.g:654:3: ruleJvmTypeReference
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
                    // InternalTqcl.g:659:2: ( ruleJvmWildcardTypeReference )
                    {
                    // InternalTqcl.g:659:2: ( ruleJvmWildcardTypeReference )
                    // InternalTqcl.g:660:3: ruleJvmWildcardTypeReference
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
    // InternalTqcl.g:669:1: rule__JvmWildcardTypeReference__Alternatives_2 : ( ( ( rule__JvmWildcardTypeReference__Group_2_0__0 ) ) | ( ( rule__JvmWildcardTypeReference__Group_2_1__0 ) ) );
    public final void rule__JvmWildcardTypeReference__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:673:1: ( ( ( rule__JvmWildcardTypeReference__Group_2_0__0 ) ) | ( ( rule__JvmWildcardTypeReference__Group_2_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            else if ( (LA7_0==29) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTqcl.g:674:2: ( ( rule__JvmWildcardTypeReference__Group_2_0__0 ) )
                    {
                    // InternalTqcl.g:674:2: ( ( rule__JvmWildcardTypeReference__Group_2_0__0 ) )
                    // InternalTqcl.g:675:3: ( rule__JvmWildcardTypeReference__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getJvmWildcardTypeReferenceAccess().getGroup_2_0()); 
                    }
                    // InternalTqcl.g:676:3: ( rule__JvmWildcardTypeReference__Group_2_0__0 )
                    // InternalTqcl.g:676:4: rule__JvmWildcardTypeReference__Group_2_0__0
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
                    // InternalTqcl.g:680:2: ( ( rule__JvmWildcardTypeReference__Group_2_1__0 ) )
                    {
                    // InternalTqcl.g:680:2: ( ( rule__JvmWildcardTypeReference__Group_2_1__0 ) )
                    // InternalTqcl.g:681:3: ( rule__JvmWildcardTypeReference__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getJvmWildcardTypeReferenceAccess().getGroup_2_1()); 
                    }
                    // InternalTqcl.g:682:3: ( rule__JvmWildcardTypeReference__Group_2_1__0 )
                    // InternalTqcl.g:682:4: rule__JvmWildcardTypeReference__Group_2_1__0
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
    // InternalTqcl.g:690:1: rule__XImportDeclaration__Alternatives_1 : ( ( ( rule__XImportDeclaration__Group_1_0__0 ) ) | ( ( rule__XImportDeclaration__ImportedTypeAssignment_1_1 ) ) | ( ( rule__XImportDeclaration__ImportedNamespaceAssignment_1_2 ) ) );
    public final void rule__XImportDeclaration__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:694:1: ( ( ( rule__XImportDeclaration__Group_1_0__0 ) ) | ( ( rule__XImportDeclaration__ImportedTypeAssignment_1_1 ) ) | ( ( rule__XImportDeclaration__ImportedNamespaceAssignment_1_2 ) ) )
            int alt8=3;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalTqcl.g:695:2: ( ( rule__XImportDeclaration__Group_1_0__0 ) )
                    {
                    // InternalTqcl.g:695:2: ( ( rule__XImportDeclaration__Group_1_0__0 ) )
                    // InternalTqcl.g:696:3: ( rule__XImportDeclaration__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXImportDeclarationAccess().getGroup_1_0()); 
                    }
                    // InternalTqcl.g:697:3: ( rule__XImportDeclaration__Group_1_0__0 )
                    // InternalTqcl.g:697:4: rule__XImportDeclaration__Group_1_0__0
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
                    // InternalTqcl.g:701:2: ( ( rule__XImportDeclaration__ImportedTypeAssignment_1_1 ) )
                    {
                    // InternalTqcl.g:701:2: ( ( rule__XImportDeclaration__ImportedTypeAssignment_1_1 ) )
                    // InternalTqcl.g:702:3: ( rule__XImportDeclaration__ImportedTypeAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXImportDeclarationAccess().getImportedTypeAssignment_1_1()); 
                    }
                    // InternalTqcl.g:703:3: ( rule__XImportDeclaration__ImportedTypeAssignment_1_1 )
                    // InternalTqcl.g:703:4: rule__XImportDeclaration__ImportedTypeAssignment_1_1
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
                    // InternalTqcl.g:707:2: ( ( rule__XImportDeclaration__ImportedNamespaceAssignment_1_2 ) )
                    {
                    // InternalTqcl.g:707:2: ( ( rule__XImportDeclaration__ImportedNamespaceAssignment_1_2 ) )
                    // InternalTqcl.g:708:3: ( rule__XImportDeclaration__ImportedNamespaceAssignment_1_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXImportDeclarationAccess().getImportedNamespaceAssignment_1_2()); 
                    }
                    // InternalTqcl.g:709:3: ( rule__XImportDeclaration__ImportedNamespaceAssignment_1_2 )
                    // InternalTqcl.g:709:4: rule__XImportDeclaration__ImportedNamespaceAssignment_1_2
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
    // InternalTqcl.g:717:1: rule__XImportDeclaration__Alternatives_1_0_3 : ( ( ( rule__XImportDeclaration__WildcardAssignment_1_0_3_0 ) ) | ( ( rule__XImportDeclaration__MemberNameAssignment_1_0_3_1 ) ) );
    public final void rule__XImportDeclaration__Alternatives_1_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:721:1: ( ( ( rule__XImportDeclaration__WildcardAssignment_1_0_3_0 ) ) | ( ( rule__XImportDeclaration__MemberNameAssignment_1_0_3_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalTqcl.g:722:2: ( ( rule__XImportDeclaration__WildcardAssignment_1_0_3_0 ) )
                    {
                    // InternalTqcl.g:722:2: ( ( rule__XImportDeclaration__WildcardAssignment_1_0_3_0 ) )
                    // InternalTqcl.g:723:3: ( rule__XImportDeclaration__WildcardAssignment_1_0_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXImportDeclarationAccess().getWildcardAssignment_1_0_3_0()); 
                    }
                    // InternalTqcl.g:724:3: ( rule__XImportDeclaration__WildcardAssignment_1_0_3_0 )
                    // InternalTqcl.g:724:4: rule__XImportDeclaration__WildcardAssignment_1_0_3_0
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
                    // InternalTqcl.g:728:2: ( ( rule__XImportDeclaration__MemberNameAssignment_1_0_3_1 ) )
                    {
                    // InternalTqcl.g:728:2: ( ( rule__XImportDeclaration__MemberNameAssignment_1_0_3_1 ) )
                    // InternalTqcl.g:729:3: ( rule__XImportDeclaration__MemberNameAssignment_1_0_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXImportDeclarationAccess().getMemberNameAssignment_1_0_3_1()); 
                    }
                    // InternalTqcl.g:730:3: ( rule__XImportDeclaration__MemberNameAssignment_1_0_3_1 )
                    // InternalTqcl.g:730:4: rule__XImportDeclaration__MemberNameAssignment_1_0_3_1
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


    // $ANTLR start "rule__Command__Group__0"
    // InternalTqcl.g:738:1: rule__Command__Group__0 : rule__Command__Group__0__Impl rule__Command__Group__1 ;
    public final void rule__Command__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:742:1: ( rule__Command__Group__0__Impl rule__Command__Group__1 )
            // InternalTqcl.g:743:2: rule__Command__Group__0__Impl rule__Command__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Command__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Command__Group__1();

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
    // $ANTLR end "rule__Command__Group__0"


    // $ANTLR start "rule__Command__Group__0__Impl"
    // InternalTqcl.g:750:1: rule__Command__Group__0__Impl : ( ( rule__Command__Alternatives_0 ) ) ;
    public final void rule__Command__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:754:1: ( ( ( rule__Command__Alternatives_0 ) ) )
            // InternalTqcl.g:755:1: ( ( rule__Command__Alternatives_0 ) )
            {
            // InternalTqcl.g:755:1: ( ( rule__Command__Alternatives_0 ) )
            // InternalTqcl.g:756:2: ( rule__Command__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getAlternatives_0()); 
            }
            // InternalTqcl.g:757:2: ( rule__Command__Alternatives_0 )
            // InternalTqcl.g:757:3: rule__Command__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Command__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getAlternatives_0()); 
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
    // $ANTLR end "rule__Command__Group__0__Impl"


    // $ANTLR start "rule__Command__Group__1"
    // InternalTqcl.g:765:1: rule__Command__Group__1 : rule__Command__Group__1__Impl ;
    public final void rule__Command__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:769:1: ( rule__Command__Group__1__Impl )
            // InternalTqcl.g:770:2: rule__Command__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Command__Group__1__Impl();

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
    // $ANTLR end "rule__Command__Group__1"


    // $ANTLR start "rule__Command__Group__1__Impl"
    // InternalTqcl.g:776:1: rule__Command__Group__1__Impl : ( ';' ) ;
    public final void rule__Command__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:780:1: ( ( ';' ) )
            // InternalTqcl.g:781:1: ( ';' )
            {
            // InternalTqcl.g:781:1: ( ';' )
            // InternalTqcl.g:782:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getSemicolonKeyword_1()); 
            }
            match(input,10,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getSemicolonKeyword_1()); 
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
    // $ANTLR end "rule__Command__Group__1__Impl"


    // $ANTLR start "rule__Insert__Group__0"
    // InternalTqcl.g:792:1: rule__Insert__Group__0 : rule__Insert__Group__0__Impl rule__Insert__Group__1 ;
    public final void rule__Insert__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:796:1: ( rule__Insert__Group__0__Impl rule__Insert__Group__1 )
            // InternalTqcl.g:797:2: rule__Insert__Group__0__Impl rule__Insert__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalTqcl.g:804:1: rule__Insert__Group__0__Impl : ( 'insert' ) ;
    public final void rule__Insert__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:808:1: ( ( 'insert' ) )
            // InternalTqcl.g:809:1: ( 'insert' )
            {
            // InternalTqcl.g:809:1: ( 'insert' )
            // InternalTqcl.g:810:2: 'insert'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertAccess().getInsertKeyword_0()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
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
    // InternalTqcl.g:819:1: rule__Insert__Group__1 : rule__Insert__Group__1__Impl rule__Insert__Group__2 ;
    public final void rule__Insert__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:823:1: ( rule__Insert__Group__1__Impl rule__Insert__Group__2 )
            // InternalTqcl.g:824:2: rule__Insert__Group__1__Impl rule__Insert__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalTqcl.g:831:1: rule__Insert__Group__1__Impl : ( ( rule__Insert__ObjAssignment_1 ) ) ;
    public final void rule__Insert__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:835:1: ( ( ( rule__Insert__ObjAssignment_1 ) ) )
            // InternalTqcl.g:836:1: ( ( rule__Insert__ObjAssignment_1 ) )
            {
            // InternalTqcl.g:836:1: ( ( rule__Insert__ObjAssignment_1 ) )
            // InternalTqcl.g:837:2: ( rule__Insert__ObjAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertAccess().getObjAssignment_1()); 
            }
            // InternalTqcl.g:838:2: ( rule__Insert__ObjAssignment_1 )
            // InternalTqcl.g:838:3: rule__Insert__ObjAssignment_1
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
    // InternalTqcl.g:846:1: rule__Insert__Group__2 : rule__Insert__Group__2__Impl rule__Insert__Group__3 ;
    public final void rule__Insert__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:850:1: ( rule__Insert__Group__2__Impl rule__Insert__Group__3 )
            // InternalTqcl.g:851:2: rule__Insert__Group__2__Impl rule__Insert__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalTqcl.g:858:1: rule__Insert__Group__2__Impl : ( ( rule__Insert__Group_2__0 )? ) ;
    public final void rule__Insert__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:862:1: ( ( ( rule__Insert__Group_2__0 )? ) )
            // InternalTqcl.g:863:1: ( ( rule__Insert__Group_2__0 )? )
            {
            // InternalTqcl.g:863:1: ( ( rule__Insert__Group_2__0 )? )
            // InternalTqcl.g:864:2: ( rule__Insert__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertAccess().getGroup_2()); 
            }
            // InternalTqcl.g:865:2: ( rule__Insert__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==12) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTqcl.g:865:3: rule__Insert__Group_2__0
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
    // InternalTqcl.g:873:1: rule__Insert__Group__3 : rule__Insert__Group__3__Impl ;
    public final void rule__Insert__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:877:1: ( rule__Insert__Group__3__Impl )
            // InternalTqcl.g:878:2: rule__Insert__Group__3__Impl
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
    // InternalTqcl.g:884:1: rule__Insert__Group__3__Impl : ( ( rule__Insert__Group_3__0 )? ) ;
    public final void rule__Insert__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:888:1: ( ( ( rule__Insert__Group_3__0 )? ) )
            // InternalTqcl.g:889:1: ( ( rule__Insert__Group_3__0 )? )
            {
            // InternalTqcl.g:889:1: ( ( rule__Insert__Group_3__0 )? )
            // InternalTqcl.g:890:2: ( rule__Insert__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertAccess().getGroup_3()); 
            }
            // InternalTqcl.g:891:2: ( rule__Insert__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==13) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTqcl.g:891:3: rule__Insert__Group_3__0
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
    // InternalTqcl.g:900:1: rule__Insert__Group_2__0 : rule__Insert__Group_2__0__Impl rule__Insert__Group_2__1 ;
    public final void rule__Insert__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:904:1: ( rule__Insert__Group_2__0__Impl rule__Insert__Group_2__1 )
            // InternalTqcl.g:905:2: rule__Insert__Group_2__0__Impl rule__Insert__Group_2__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalTqcl.g:912:1: rule__Insert__Group_2__0__Impl : ( 'as' ) ;
    public final void rule__Insert__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:916:1: ( ( 'as' ) )
            // InternalTqcl.g:917:1: ( 'as' )
            {
            // InternalTqcl.g:917:1: ( 'as' )
            // InternalTqcl.g:918:2: 'as'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertAccess().getAsKeyword_2_0()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
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
    // InternalTqcl.g:927:1: rule__Insert__Group_2__1 : rule__Insert__Group_2__1__Impl ;
    public final void rule__Insert__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:931:1: ( rule__Insert__Group_2__1__Impl )
            // InternalTqcl.g:932:2: rule__Insert__Group_2__1__Impl
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
    // InternalTqcl.g:938:1: rule__Insert__Group_2__1__Impl : ( ( rule__Insert__NameAssignment_2_1 ) ) ;
    public final void rule__Insert__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:942:1: ( ( ( rule__Insert__NameAssignment_2_1 ) ) )
            // InternalTqcl.g:943:1: ( ( rule__Insert__NameAssignment_2_1 ) )
            {
            // InternalTqcl.g:943:1: ( ( rule__Insert__NameAssignment_2_1 ) )
            // InternalTqcl.g:944:2: ( rule__Insert__NameAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertAccess().getNameAssignment_2_1()); 
            }
            // InternalTqcl.g:945:2: ( rule__Insert__NameAssignment_2_1 )
            // InternalTqcl.g:945:3: rule__Insert__NameAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Insert__NameAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInsertAccess().getNameAssignment_2_1()); 
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
    // InternalTqcl.g:954:1: rule__Insert__Group_3__0 : rule__Insert__Group_3__0__Impl rule__Insert__Group_3__1 ;
    public final void rule__Insert__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:958:1: ( rule__Insert__Group_3__0__Impl rule__Insert__Group_3__1 )
            // InternalTqcl.g:959:2: rule__Insert__Group_3__0__Impl rule__Insert__Group_3__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalTqcl.g:966:1: rule__Insert__Group_3__0__Impl : ( 'with' ) ;
    public final void rule__Insert__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:970:1: ( ( 'with' ) )
            // InternalTqcl.g:971:1: ( 'with' )
            {
            // InternalTqcl.g:971:1: ( 'with' )
            // InternalTqcl.g:972:2: 'with'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertAccess().getWithKeyword_3_0()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
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
    // InternalTqcl.g:981:1: rule__Insert__Group_3__1 : rule__Insert__Group_3__1__Impl rule__Insert__Group_3__2 ;
    public final void rule__Insert__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:985:1: ( rule__Insert__Group_3__1__Impl rule__Insert__Group_3__2 )
            // InternalTqcl.g:986:2: rule__Insert__Group_3__1__Impl rule__Insert__Group_3__2
            {
            pushFollow(FOLLOW_8);
            rule__Insert__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Insert__Group_3__2();

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
    // InternalTqcl.g:993:1: rule__Insert__Group_3__1__Impl : ( ( rule__Insert__ParametersAssignment_3_1 ) ) ;
    public final void rule__Insert__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:997:1: ( ( ( rule__Insert__ParametersAssignment_3_1 ) ) )
            // InternalTqcl.g:998:1: ( ( rule__Insert__ParametersAssignment_3_1 ) )
            {
            // InternalTqcl.g:998:1: ( ( rule__Insert__ParametersAssignment_3_1 ) )
            // InternalTqcl.g:999:2: ( rule__Insert__ParametersAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertAccess().getParametersAssignment_3_1()); 
            }
            // InternalTqcl.g:1000:2: ( rule__Insert__ParametersAssignment_3_1 )
            // InternalTqcl.g:1000:3: rule__Insert__ParametersAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Insert__ParametersAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

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


    // $ANTLR start "rule__Insert__Group_3__2"
    // InternalTqcl.g:1008:1: rule__Insert__Group_3__2 : rule__Insert__Group_3__2__Impl ;
    public final void rule__Insert__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1012:1: ( rule__Insert__Group_3__2__Impl )
            // InternalTqcl.g:1013:2: rule__Insert__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Insert__Group_3__2__Impl();

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
    // $ANTLR end "rule__Insert__Group_3__2"


    // $ANTLR start "rule__Insert__Group_3__2__Impl"
    // InternalTqcl.g:1019:1: rule__Insert__Group_3__2__Impl : ( ( rule__Insert__Group_3_2__0 )* ) ;
    public final void rule__Insert__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1023:1: ( ( ( rule__Insert__Group_3_2__0 )* ) )
            // InternalTqcl.g:1024:1: ( ( rule__Insert__Group_3_2__0 )* )
            {
            // InternalTqcl.g:1024:1: ( ( rule__Insert__Group_3_2__0 )* )
            // InternalTqcl.g:1025:2: ( rule__Insert__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertAccess().getGroup_3_2()); 
            }
            // InternalTqcl.g:1026:2: ( rule__Insert__Group_3_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==14) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTqcl.g:1026:3: rule__Insert__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Insert__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInsertAccess().getGroup_3_2()); 
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
    // $ANTLR end "rule__Insert__Group_3__2__Impl"


    // $ANTLR start "rule__Insert__Group_3_2__0"
    // InternalTqcl.g:1035:1: rule__Insert__Group_3_2__0 : rule__Insert__Group_3_2__0__Impl rule__Insert__Group_3_2__1 ;
    public final void rule__Insert__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1039:1: ( rule__Insert__Group_3_2__0__Impl rule__Insert__Group_3_2__1 )
            // InternalTqcl.g:1040:2: rule__Insert__Group_3_2__0__Impl rule__Insert__Group_3_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Insert__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Insert__Group_3_2__1();

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
    // $ANTLR end "rule__Insert__Group_3_2__0"


    // $ANTLR start "rule__Insert__Group_3_2__0__Impl"
    // InternalTqcl.g:1047:1: rule__Insert__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Insert__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1051:1: ( ( ',' ) )
            // InternalTqcl.g:1052:1: ( ',' )
            {
            // InternalTqcl.g:1052:1: ( ',' )
            // InternalTqcl.g:1053:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInsertAccess().getCommaKeyword_3_2_0()); 
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
    // $ANTLR end "rule__Insert__Group_3_2__0__Impl"


    // $ANTLR start "rule__Insert__Group_3_2__1"
    // InternalTqcl.g:1062:1: rule__Insert__Group_3_2__1 : rule__Insert__Group_3_2__1__Impl ;
    public final void rule__Insert__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1066:1: ( rule__Insert__Group_3_2__1__Impl )
            // InternalTqcl.g:1067:2: rule__Insert__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Insert__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__Insert__Group_3_2__1"


    // $ANTLR start "rule__Insert__Group_3_2__1__Impl"
    // InternalTqcl.g:1073:1: rule__Insert__Group_3_2__1__Impl : ( ( rule__Insert__ParametersAssignment_3_2_1 ) ) ;
    public final void rule__Insert__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1077:1: ( ( ( rule__Insert__ParametersAssignment_3_2_1 ) ) )
            // InternalTqcl.g:1078:1: ( ( rule__Insert__ParametersAssignment_3_2_1 ) )
            {
            // InternalTqcl.g:1078:1: ( ( rule__Insert__ParametersAssignment_3_2_1 ) )
            // InternalTqcl.g:1079:2: ( rule__Insert__ParametersAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertAccess().getParametersAssignment_3_2_1()); 
            }
            // InternalTqcl.g:1080:2: ( rule__Insert__ParametersAssignment_3_2_1 )
            // InternalTqcl.g:1080:3: rule__Insert__ParametersAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Insert__ParametersAssignment_3_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInsertAccess().getParametersAssignment_3_2_1()); 
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
    // $ANTLR end "rule__Insert__Group_3_2__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalTqcl.g:1089:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1093:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalTqcl.g:1094:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalTqcl.g:1101:1: rule__Parameter__Group__0__Impl : ( ruleNamedObj ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1105:1: ( ( ruleNamedObj ) )
            // InternalTqcl.g:1106:1: ( ruleNamedObj )
            {
            // InternalTqcl.g:1106:1: ( ruleNamedObj )
            // InternalTqcl.g:1107:2: ruleNamedObj
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNamedObjParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNamedObj();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getNamedObjParserRuleCall_0()); 
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
    // InternalTqcl.g:1116:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1120:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalTqcl.g:1121:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalTqcl.g:1128:1: rule__Parameter__Group__1__Impl : ( '=' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1132:1: ( ( '=' ) )
            // InternalTqcl.g:1133:1: ( '=' )
            {
            // InternalTqcl.g:1133:1: ( '=' )
            // InternalTqcl.g:1134:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getEqualsSignKeyword_1()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
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
    // InternalTqcl.g:1143:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1147:1: ( rule__Parameter__Group__2__Impl )
            // InternalTqcl.g:1148:2: rule__Parameter__Group__2__Impl
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
    // InternalTqcl.g:1154:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__ValueAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1158:1: ( ( ( rule__Parameter__ValueAssignment_2 ) ) )
            // InternalTqcl.g:1159:1: ( ( rule__Parameter__ValueAssignment_2 ) )
            {
            // InternalTqcl.g:1159:1: ( ( rule__Parameter__ValueAssignment_2 ) )
            // InternalTqcl.g:1160:2: ( rule__Parameter__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getValueAssignment_2()); 
            }
            // InternalTqcl.g:1161:2: ( rule__Parameter__ValueAssignment_2 )
            // InternalTqcl.g:1161:3: rule__Parameter__ValueAssignment_2
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
    // InternalTqcl.g:1170:1: rule__Connect__Group__0 : rule__Connect__Group__0__Impl rule__Connect__Group__1 ;
    public final void rule__Connect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1174:1: ( rule__Connect__Group__0__Impl rule__Connect__Group__1 )
            // InternalTqcl.g:1175:2: rule__Connect__Group__0__Impl rule__Connect__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalTqcl.g:1182:1: rule__Connect__Group__0__Impl : ( 'connect' ) ;
    public final void rule__Connect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1186:1: ( ( 'connect' ) )
            // InternalTqcl.g:1187:1: ( 'connect' )
            {
            // InternalTqcl.g:1187:1: ( 'connect' )
            // InternalTqcl.g:1188:2: 'connect'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectAccess().getConnectKeyword_0()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
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
    // InternalTqcl.g:1197:1: rule__Connect__Group__1 : rule__Connect__Group__1__Impl rule__Connect__Group__2 ;
    public final void rule__Connect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1201:1: ( rule__Connect__Group__1__Impl rule__Connect__Group__2 )
            // InternalTqcl.g:1202:2: rule__Connect__Group__1__Impl rule__Connect__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalTqcl.g:1209:1: rule__Connect__Group__1__Impl : ( ( rule__Connect__FromAssignment_1 ) ) ;
    public final void rule__Connect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1213:1: ( ( ( rule__Connect__FromAssignment_1 ) ) )
            // InternalTqcl.g:1214:1: ( ( rule__Connect__FromAssignment_1 ) )
            {
            // InternalTqcl.g:1214:1: ( ( rule__Connect__FromAssignment_1 ) )
            // InternalTqcl.g:1215:2: ( rule__Connect__FromAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectAccess().getFromAssignment_1()); 
            }
            // InternalTqcl.g:1216:2: ( rule__Connect__FromAssignment_1 )
            // InternalTqcl.g:1216:3: rule__Connect__FromAssignment_1
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
    // InternalTqcl.g:1224:1: rule__Connect__Group__2 : rule__Connect__Group__2__Impl rule__Connect__Group__3 ;
    public final void rule__Connect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1228:1: ( rule__Connect__Group__2__Impl rule__Connect__Group__3 )
            // InternalTqcl.g:1229:2: rule__Connect__Group__2__Impl rule__Connect__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalTqcl.g:1236:1: rule__Connect__Group__2__Impl : ( 'to' ) ;
    public final void rule__Connect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1240:1: ( ( 'to' ) )
            // InternalTqcl.g:1241:1: ( 'to' )
            {
            // InternalTqcl.g:1241:1: ( 'to' )
            // InternalTqcl.g:1242:2: 'to'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectAccess().getToKeyword_2()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
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
    // InternalTqcl.g:1251:1: rule__Connect__Group__3 : rule__Connect__Group__3__Impl ;
    public final void rule__Connect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1255:1: ( rule__Connect__Group__3__Impl )
            // InternalTqcl.g:1256:2: rule__Connect__Group__3__Impl
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
    // InternalTqcl.g:1262:1: rule__Connect__Group__3__Impl : ( ( rule__Connect__ToAssignment_3 ) ) ;
    public final void rule__Connect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1266:1: ( ( ( rule__Connect__ToAssignment_3 ) ) )
            // InternalTqcl.g:1267:1: ( ( rule__Connect__ToAssignment_3 ) )
            {
            // InternalTqcl.g:1267:1: ( ( rule__Connect__ToAssignment_3 ) )
            // InternalTqcl.g:1268:2: ( rule__Connect__ToAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectAccess().getToAssignment_3()); 
            }
            // InternalTqcl.g:1269:2: ( rule__Connect__ToAssignment_3 )
            // InternalTqcl.g:1269:3: rule__Connect__ToAssignment_3
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
    // InternalTqcl.g:1278:1: rule__JvmTypeReference__Group_0__0 : rule__JvmTypeReference__Group_0__0__Impl rule__JvmTypeReference__Group_0__1 ;
    public final void rule__JvmTypeReference__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1282:1: ( rule__JvmTypeReference__Group_0__0__Impl rule__JvmTypeReference__Group_0__1 )
            // InternalTqcl.g:1283:2: rule__JvmTypeReference__Group_0__0__Impl rule__JvmTypeReference__Group_0__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalTqcl.g:1290:1: rule__JvmTypeReference__Group_0__0__Impl : ( ruleJvmParameterizedTypeReference ) ;
    public final void rule__JvmTypeReference__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1294:1: ( ( ruleJvmParameterizedTypeReference ) )
            // InternalTqcl.g:1295:1: ( ruleJvmParameterizedTypeReference )
            {
            // InternalTqcl.g:1295:1: ( ruleJvmParameterizedTypeReference )
            // InternalTqcl.g:1296:2: ruleJvmParameterizedTypeReference
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
    // InternalTqcl.g:1305:1: rule__JvmTypeReference__Group_0__1 : rule__JvmTypeReference__Group_0__1__Impl ;
    public final void rule__JvmTypeReference__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1309:1: ( rule__JvmTypeReference__Group_0__1__Impl )
            // InternalTqcl.g:1310:2: rule__JvmTypeReference__Group_0__1__Impl
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
    // InternalTqcl.g:1316:1: rule__JvmTypeReference__Group_0__1__Impl : ( ( rule__JvmTypeReference__Group_0_1__0 )* ) ;
    public final void rule__JvmTypeReference__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1320:1: ( ( ( rule__JvmTypeReference__Group_0_1__0 )* ) )
            // InternalTqcl.g:1321:1: ( ( rule__JvmTypeReference__Group_0_1__0 )* )
            {
            // InternalTqcl.g:1321:1: ( ( rule__JvmTypeReference__Group_0_1__0 )* )
            // InternalTqcl.g:1322:2: ( rule__JvmTypeReference__Group_0_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmTypeReferenceAccess().getGroup_0_1()); 
            }
            // InternalTqcl.g:1323:2: ( rule__JvmTypeReference__Group_0_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==18) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTqcl.g:1323:3: rule__JvmTypeReference__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__JvmTypeReference__Group_0_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalTqcl.g:1332:1: rule__JvmTypeReference__Group_0_1__0 : rule__JvmTypeReference__Group_0_1__0__Impl ;
    public final void rule__JvmTypeReference__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1336:1: ( rule__JvmTypeReference__Group_0_1__0__Impl )
            // InternalTqcl.g:1337:2: rule__JvmTypeReference__Group_0_1__0__Impl
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
    // InternalTqcl.g:1343:1: rule__JvmTypeReference__Group_0_1__0__Impl : ( ( rule__JvmTypeReference__Group_0_1_0__0 ) ) ;
    public final void rule__JvmTypeReference__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1347:1: ( ( ( rule__JvmTypeReference__Group_0_1_0__0 ) ) )
            // InternalTqcl.g:1348:1: ( ( rule__JvmTypeReference__Group_0_1_0__0 ) )
            {
            // InternalTqcl.g:1348:1: ( ( rule__JvmTypeReference__Group_0_1_0__0 ) )
            // InternalTqcl.g:1349:2: ( rule__JvmTypeReference__Group_0_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmTypeReferenceAccess().getGroup_0_1_0()); 
            }
            // InternalTqcl.g:1350:2: ( rule__JvmTypeReference__Group_0_1_0__0 )
            // InternalTqcl.g:1350:3: rule__JvmTypeReference__Group_0_1_0__0
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
    // InternalTqcl.g:1359:1: rule__JvmTypeReference__Group_0_1_0__0 : rule__JvmTypeReference__Group_0_1_0__0__Impl rule__JvmTypeReference__Group_0_1_0__1 ;
    public final void rule__JvmTypeReference__Group_0_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1363:1: ( rule__JvmTypeReference__Group_0_1_0__0__Impl rule__JvmTypeReference__Group_0_1_0__1 )
            // InternalTqcl.g:1364:2: rule__JvmTypeReference__Group_0_1_0__0__Impl rule__JvmTypeReference__Group_0_1_0__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalTqcl.g:1371:1: rule__JvmTypeReference__Group_0_1_0__0__Impl : ( () ) ;
    public final void rule__JvmTypeReference__Group_0_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1375:1: ( ( () ) )
            // InternalTqcl.g:1376:1: ( () )
            {
            // InternalTqcl.g:1376:1: ( () )
            // InternalTqcl.g:1377:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0()); 
            }
            // InternalTqcl.g:1378:2: ()
            // InternalTqcl.g:1378:3: 
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
    // InternalTqcl.g:1386:1: rule__JvmTypeReference__Group_0_1_0__1 : rule__JvmTypeReference__Group_0_1_0__1__Impl ;
    public final void rule__JvmTypeReference__Group_0_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1390:1: ( rule__JvmTypeReference__Group_0_1_0__1__Impl )
            // InternalTqcl.g:1391:2: rule__JvmTypeReference__Group_0_1_0__1__Impl
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
    // InternalTqcl.g:1397:1: rule__JvmTypeReference__Group_0_1_0__1__Impl : ( ruleArrayBrackets ) ;
    public final void rule__JvmTypeReference__Group_0_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1401:1: ( ( ruleArrayBrackets ) )
            // InternalTqcl.g:1402:1: ( ruleArrayBrackets )
            {
            // InternalTqcl.g:1402:1: ( ruleArrayBrackets )
            // InternalTqcl.g:1403:2: ruleArrayBrackets
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
    // InternalTqcl.g:1413:1: rule__ArrayBrackets__Group__0 : rule__ArrayBrackets__Group__0__Impl rule__ArrayBrackets__Group__1 ;
    public final void rule__ArrayBrackets__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1417:1: ( rule__ArrayBrackets__Group__0__Impl rule__ArrayBrackets__Group__1 )
            // InternalTqcl.g:1418:2: rule__ArrayBrackets__Group__0__Impl rule__ArrayBrackets__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalTqcl.g:1425:1: rule__ArrayBrackets__Group__0__Impl : ( '[' ) ;
    public final void rule__ArrayBrackets__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1429:1: ( ( '[' ) )
            // InternalTqcl.g:1430:1: ( '[' )
            {
            // InternalTqcl.g:1430:1: ( '[' )
            // InternalTqcl.g:1431:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayBracketsAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
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
    // InternalTqcl.g:1440:1: rule__ArrayBrackets__Group__1 : rule__ArrayBrackets__Group__1__Impl ;
    public final void rule__ArrayBrackets__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1444:1: ( rule__ArrayBrackets__Group__1__Impl )
            // InternalTqcl.g:1445:2: rule__ArrayBrackets__Group__1__Impl
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
    // InternalTqcl.g:1451:1: rule__ArrayBrackets__Group__1__Impl : ( ']' ) ;
    public final void rule__ArrayBrackets__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1455:1: ( ( ']' ) )
            // InternalTqcl.g:1456:1: ( ']' )
            {
            // InternalTqcl.g:1456:1: ( ']' )
            // InternalTqcl.g:1457:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayBracketsAccess().getRightSquareBracketKeyword_1()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalTqcl.g:1467:1: rule__XFunctionTypeRef__Group__0 : rule__XFunctionTypeRef__Group__0__Impl rule__XFunctionTypeRef__Group__1 ;
    public final void rule__XFunctionTypeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1471:1: ( rule__XFunctionTypeRef__Group__0__Impl rule__XFunctionTypeRef__Group__1 )
            // InternalTqcl.g:1472:2: rule__XFunctionTypeRef__Group__0__Impl rule__XFunctionTypeRef__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalTqcl.g:1479:1: rule__XFunctionTypeRef__Group__0__Impl : ( ( rule__XFunctionTypeRef__Group_0__0 )? ) ;
    public final void rule__XFunctionTypeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1483:1: ( ( ( rule__XFunctionTypeRef__Group_0__0 )? ) )
            // InternalTqcl.g:1484:1: ( ( rule__XFunctionTypeRef__Group_0__0 )? )
            {
            // InternalTqcl.g:1484:1: ( ( rule__XFunctionTypeRef__Group_0__0 )? )
            // InternalTqcl.g:1485:2: ( rule__XFunctionTypeRef__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getGroup_0()); 
            }
            // InternalTqcl.g:1486:2: ( rule__XFunctionTypeRef__Group_0__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTqcl.g:1486:3: rule__XFunctionTypeRef__Group_0__0
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
    // InternalTqcl.g:1494:1: rule__XFunctionTypeRef__Group__1 : rule__XFunctionTypeRef__Group__1__Impl rule__XFunctionTypeRef__Group__2 ;
    public final void rule__XFunctionTypeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1498:1: ( rule__XFunctionTypeRef__Group__1__Impl rule__XFunctionTypeRef__Group__2 )
            // InternalTqcl.g:1499:2: rule__XFunctionTypeRef__Group__1__Impl rule__XFunctionTypeRef__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalTqcl.g:1506:1: rule__XFunctionTypeRef__Group__1__Impl : ( '=>' ) ;
    public final void rule__XFunctionTypeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1510:1: ( ( '=>' ) )
            // InternalTqcl.g:1511:1: ( '=>' )
            {
            // InternalTqcl.g:1511:1: ( '=>' )
            // InternalTqcl.g:1512:2: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
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
    // InternalTqcl.g:1521:1: rule__XFunctionTypeRef__Group__2 : rule__XFunctionTypeRef__Group__2__Impl ;
    public final void rule__XFunctionTypeRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1525:1: ( rule__XFunctionTypeRef__Group__2__Impl )
            // InternalTqcl.g:1526:2: rule__XFunctionTypeRef__Group__2__Impl
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
    // InternalTqcl.g:1532:1: rule__XFunctionTypeRef__Group__2__Impl : ( ( rule__XFunctionTypeRef__ReturnTypeAssignment_2 ) ) ;
    public final void rule__XFunctionTypeRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1536:1: ( ( ( rule__XFunctionTypeRef__ReturnTypeAssignment_2 ) ) )
            // InternalTqcl.g:1537:1: ( ( rule__XFunctionTypeRef__ReturnTypeAssignment_2 ) )
            {
            // InternalTqcl.g:1537:1: ( ( rule__XFunctionTypeRef__ReturnTypeAssignment_2 ) )
            // InternalTqcl.g:1538:2: ( rule__XFunctionTypeRef__ReturnTypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeAssignment_2()); 
            }
            // InternalTqcl.g:1539:2: ( rule__XFunctionTypeRef__ReturnTypeAssignment_2 )
            // InternalTqcl.g:1539:3: rule__XFunctionTypeRef__ReturnTypeAssignment_2
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
    // InternalTqcl.g:1548:1: rule__XFunctionTypeRef__Group_0__0 : rule__XFunctionTypeRef__Group_0__0__Impl rule__XFunctionTypeRef__Group_0__1 ;
    public final void rule__XFunctionTypeRef__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1552:1: ( rule__XFunctionTypeRef__Group_0__0__Impl rule__XFunctionTypeRef__Group_0__1 )
            // InternalTqcl.g:1553:2: rule__XFunctionTypeRef__Group_0__0__Impl rule__XFunctionTypeRef__Group_0__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalTqcl.g:1560:1: rule__XFunctionTypeRef__Group_0__0__Impl : ( '(' ) ;
    public final void rule__XFunctionTypeRef__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1564:1: ( ( '(' ) )
            // InternalTqcl.g:1565:1: ( '(' )
            {
            // InternalTqcl.g:1565:1: ( '(' )
            // InternalTqcl.g:1566:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalTqcl.g:1575:1: rule__XFunctionTypeRef__Group_0__1 : rule__XFunctionTypeRef__Group_0__1__Impl rule__XFunctionTypeRef__Group_0__2 ;
    public final void rule__XFunctionTypeRef__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1579:1: ( rule__XFunctionTypeRef__Group_0__1__Impl rule__XFunctionTypeRef__Group_0__2 )
            // InternalTqcl.g:1580:2: rule__XFunctionTypeRef__Group_0__1__Impl rule__XFunctionTypeRef__Group_0__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalTqcl.g:1587:1: rule__XFunctionTypeRef__Group_0__1__Impl : ( ( rule__XFunctionTypeRef__Group_0_1__0 )? ) ;
    public final void rule__XFunctionTypeRef__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1591:1: ( ( ( rule__XFunctionTypeRef__Group_0_1__0 )? ) )
            // InternalTqcl.g:1592:1: ( ( rule__XFunctionTypeRef__Group_0_1__0 )? )
            {
            // InternalTqcl.g:1592:1: ( ( rule__XFunctionTypeRef__Group_0_1__0 )? )
            // InternalTqcl.g:1593:2: ( rule__XFunctionTypeRef__Group_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getGroup_0_1()); 
            }
            // InternalTqcl.g:1594:2: ( rule__XFunctionTypeRef__Group_0_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID||(LA15_0>=20 && LA15_0<=21)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTqcl.g:1594:3: rule__XFunctionTypeRef__Group_0_1__0
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
    // InternalTqcl.g:1602:1: rule__XFunctionTypeRef__Group_0__2 : rule__XFunctionTypeRef__Group_0__2__Impl ;
    public final void rule__XFunctionTypeRef__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1606:1: ( rule__XFunctionTypeRef__Group_0__2__Impl )
            // InternalTqcl.g:1607:2: rule__XFunctionTypeRef__Group_0__2__Impl
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
    // InternalTqcl.g:1613:1: rule__XFunctionTypeRef__Group_0__2__Impl : ( ')' ) ;
    public final void rule__XFunctionTypeRef__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1617:1: ( ( ')' ) )
            // InternalTqcl.g:1618:1: ( ')' )
            {
            // InternalTqcl.g:1618:1: ( ')' )
            // InternalTqcl.g:1619:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
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
    // InternalTqcl.g:1629:1: rule__XFunctionTypeRef__Group_0_1__0 : rule__XFunctionTypeRef__Group_0_1__0__Impl rule__XFunctionTypeRef__Group_0_1__1 ;
    public final void rule__XFunctionTypeRef__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1633:1: ( rule__XFunctionTypeRef__Group_0_1__0__Impl rule__XFunctionTypeRef__Group_0_1__1 )
            // InternalTqcl.g:1634:2: rule__XFunctionTypeRef__Group_0_1__0__Impl rule__XFunctionTypeRef__Group_0_1__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalTqcl.g:1641:1: rule__XFunctionTypeRef__Group_0_1__0__Impl : ( ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0 ) ) ;
    public final void rule__XFunctionTypeRef__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1645:1: ( ( ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0 ) ) )
            // InternalTqcl.g:1646:1: ( ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0 ) )
            {
            // InternalTqcl.g:1646:1: ( ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0 ) )
            // InternalTqcl.g:1647:2: ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getParamTypesAssignment_0_1_0()); 
            }
            // InternalTqcl.g:1648:2: ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0 )
            // InternalTqcl.g:1648:3: rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0
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
    // InternalTqcl.g:1656:1: rule__XFunctionTypeRef__Group_0_1__1 : rule__XFunctionTypeRef__Group_0_1__1__Impl ;
    public final void rule__XFunctionTypeRef__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1660:1: ( rule__XFunctionTypeRef__Group_0_1__1__Impl )
            // InternalTqcl.g:1661:2: rule__XFunctionTypeRef__Group_0_1__1__Impl
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
    // InternalTqcl.g:1667:1: rule__XFunctionTypeRef__Group_0_1__1__Impl : ( ( rule__XFunctionTypeRef__Group_0_1_1__0 )* ) ;
    public final void rule__XFunctionTypeRef__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1671:1: ( ( ( rule__XFunctionTypeRef__Group_0_1_1__0 )* ) )
            // InternalTqcl.g:1672:1: ( ( rule__XFunctionTypeRef__Group_0_1_1__0 )* )
            {
            // InternalTqcl.g:1672:1: ( ( rule__XFunctionTypeRef__Group_0_1_1__0 )* )
            // InternalTqcl.g:1673:2: ( rule__XFunctionTypeRef__Group_0_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getGroup_0_1_1()); 
            }
            // InternalTqcl.g:1674:2: ( rule__XFunctionTypeRef__Group_0_1_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==14) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalTqcl.g:1674:3: rule__XFunctionTypeRef__Group_0_1_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__XFunctionTypeRef__Group_0_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalTqcl.g:1683:1: rule__XFunctionTypeRef__Group_0_1_1__0 : rule__XFunctionTypeRef__Group_0_1_1__0__Impl rule__XFunctionTypeRef__Group_0_1_1__1 ;
    public final void rule__XFunctionTypeRef__Group_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1687:1: ( rule__XFunctionTypeRef__Group_0_1_1__0__Impl rule__XFunctionTypeRef__Group_0_1_1__1 )
            // InternalTqcl.g:1688:2: rule__XFunctionTypeRef__Group_0_1_1__0__Impl rule__XFunctionTypeRef__Group_0_1_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalTqcl.g:1695:1: rule__XFunctionTypeRef__Group_0_1_1__0__Impl : ( ',' ) ;
    public final void rule__XFunctionTypeRef__Group_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1699:1: ( ( ',' ) )
            // InternalTqcl.g:1700:1: ( ',' )
            {
            // InternalTqcl.g:1700:1: ( ',' )
            // InternalTqcl.g:1701:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
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
    // InternalTqcl.g:1710:1: rule__XFunctionTypeRef__Group_0_1_1__1 : rule__XFunctionTypeRef__Group_0_1_1__1__Impl ;
    public final void rule__XFunctionTypeRef__Group_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1714:1: ( rule__XFunctionTypeRef__Group_0_1_1__1__Impl )
            // InternalTqcl.g:1715:2: rule__XFunctionTypeRef__Group_0_1_1__1__Impl
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
    // InternalTqcl.g:1721:1: rule__XFunctionTypeRef__Group_0_1_1__1__Impl : ( ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1 ) ) ;
    public final void rule__XFunctionTypeRef__Group_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1725:1: ( ( ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1 ) ) )
            // InternalTqcl.g:1726:1: ( ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1 ) )
            {
            // InternalTqcl.g:1726:1: ( ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1 ) )
            // InternalTqcl.g:1727:2: ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getParamTypesAssignment_0_1_1_1()); 
            }
            // InternalTqcl.g:1728:2: ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1 )
            // InternalTqcl.g:1728:3: rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1
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
    // InternalTqcl.g:1737:1: rule__JvmParameterizedTypeReference__Group__0 : rule__JvmParameterizedTypeReference__Group__0__Impl rule__JvmParameterizedTypeReference__Group__1 ;
    public final void rule__JvmParameterizedTypeReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1741:1: ( rule__JvmParameterizedTypeReference__Group__0__Impl rule__JvmParameterizedTypeReference__Group__1 )
            // InternalTqcl.g:1742:2: rule__JvmParameterizedTypeReference__Group__0__Impl rule__JvmParameterizedTypeReference__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalTqcl.g:1749:1: rule__JvmParameterizedTypeReference__Group__0__Impl : ( ( rule__JvmParameterizedTypeReference__TypeAssignment_0 ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1753:1: ( ( ( rule__JvmParameterizedTypeReference__TypeAssignment_0 ) ) )
            // InternalTqcl.g:1754:1: ( ( rule__JvmParameterizedTypeReference__TypeAssignment_0 ) )
            {
            // InternalTqcl.g:1754:1: ( ( rule__JvmParameterizedTypeReference__TypeAssignment_0 ) )
            // InternalTqcl.g:1755:2: ( rule__JvmParameterizedTypeReference__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeAssignment_0()); 
            }
            // InternalTqcl.g:1756:2: ( rule__JvmParameterizedTypeReference__TypeAssignment_0 )
            // InternalTqcl.g:1756:3: rule__JvmParameterizedTypeReference__TypeAssignment_0
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
    // InternalTqcl.g:1764:1: rule__JvmParameterizedTypeReference__Group__1 : rule__JvmParameterizedTypeReference__Group__1__Impl ;
    public final void rule__JvmParameterizedTypeReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1768:1: ( rule__JvmParameterizedTypeReference__Group__1__Impl )
            // InternalTqcl.g:1769:2: rule__JvmParameterizedTypeReference__Group__1__Impl
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
    // InternalTqcl.g:1775:1: rule__JvmParameterizedTypeReference__Group__1__Impl : ( ( rule__JvmParameterizedTypeReference__Group_1__0 )? ) ;
    public final void rule__JvmParameterizedTypeReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1779:1: ( ( ( rule__JvmParameterizedTypeReference__Group_1__0 )? ) )
            // InternalTqcl.g:1780:1: ( ( rule__JvmParameterizedTypeReference__Group_1__0 )? )
            {
            // InternalTqcl.g:1780:1: ( ( rule__JvmParameterizedTypeReference__Group_1__0 )? )
            // InternalTqcl.g:1781:2: ( rule__JvmParameterizedTypeReference__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1()); 
            }
            // InternalTqcl.g:1782:2: ( rule__JvmParameterizedTypeReference__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalTqcl.g:1782:3: rule__JvmParameterizedTypeReference__Group_1__0
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
    // InternalTqcl.g:1791:1: rule__JvmParameterizedTypeReference__Group_1__0 : rule__JvmParameterizedTypeReference__Group_1__0__Impl rule__JvmParameterizedTypeReference__Group_1__1 ;
    public final void rule__JvmParameterizedTypeReference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1795:1: ( rule__JvmParameterizedTypeReference__Group_1__0__Impl rule__JvmParameterizedTypeReference__Group_1__1 )
            // InternalTqcl.g:1796:2: rule__JvmParameterizedTypeReference__Group_1__0__Impl rule__JvmParameterizedTypeReference__Group_1__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalTqcl.g:1803:1: rule__JvmParameterizedTypeReference__Group_1__0__Impl : ( ( '<' ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1807:1: ( ( ( '<' ) ) )
            // InternalTqcl.g:1808:1: ( ( '<' ) )
            {
            // InternalTqcl.g:1808:1: ( ( '<' ) )
            // InternalTqcl.g:1809:2: ( '<' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0()); 
            }
            // InternalTqcl.g:1810:2: ( '<' )
            // InternalTqcl.g:1810:3: '<'
            {
            match(input,23,FOLLOW_2); if (state.failed) return ;

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
    // InternalTqcl.g:1818:1: rule__JvmParameterizedTypeReference__Group_1__1 : rule__JvmParameterizedTypeReference__Group_1__1__Impl rule__JvmParameterizedTypeReference__Group_1__2 ;
    public final void rule__JvmParameterizedTypeReference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1822:1: ( rule__JvmParameterizedTypeReference__Group_1__1__Impl rule__JvmParameterizedTypeReference__Group_1__2 )
            // InternalTqcl.g:1823:2: rule__JvmParameterizedTypeReference__Group_1__1__Impl rule__JvmParameterizedTypeReference__Group_1__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalTqcl.g:1830:1: rule__JvmParameterizedTypeReference__Group_1__1__Impl : ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1 ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1834:1: ( ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1 ) ) )
            // InternalTqcl.g:1835:1: ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1 ) )
            {
            // InternalTqcl.g:1835:1: ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1 ) )
            // InternalTqcl.g:1836:2: ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsAssignment_1_1()); 
            }
            // InternalTqcl.g:1837:2: ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1 )
            // InternalTqcl.g:1837:3: rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1
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
    // InternalTqcl.g:1845:1: rule__JvmParameterizedTypeReference__Group_1__2 : rule__JvmParameterizedTypeReference__Group_1__2__Impl rule__JvmParameterizedTypeReference__Group_1__3 ;
    public final void rule__JvmParameterizedTypeReference__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1849:1: ( rule__JvmParameterizedTypeReference__Group_1__2__Impl rule__JvmParameterizedTypeReference__Group_1__3 )
            // InternalTqcl.g:1850:2: rule__JvmParameterizedTypeReference__Group_1__2__Impl rule__JvmParameterizedTypeReference__Group_1__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalTqcl.g:1857:1: rule__JvmParameterizedTypeReference__Group_1__2__Impl : ( ( rule__JvmParameterizedTypeReference__Group_1_2__0 )* ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1861:1: ( ( ( rule__JvmParameterizedTypeReference__Group_1_2__0 )* ) )
            // InternalTqcl.g:1862:1: ( ( rule__JvmParameterizedTypeReference__Group_1_2__0 )* )
            {
            // InternalTqcl.g:1862:1: ( ( rule__JvmParameterizedTypeReference__Group_1_2__0 )* )
            // InternalTqcl.g:1863:2: ( rule__JvmParameterizedTypeReference__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_2()); 
            }
            // InternalTqcl.g:1864:2: ( rule__JvmParameterizedTypeReference__Group_1_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==14) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalTqcl.g:1864:3: rule__JvmParameterizedTypeReference__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__JvmParameterizedTypeReference__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalTqcl.g:1872:1: rule__JvmParameterizedTypeReference__Group_1__3 : rule__JvmParameterizedTypeReference__Group_1__3__Impl rule__JvmParameterizedTypeReference__Group_1__4 ;
    public final void rule__JvmParameterizedTypeReference__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1876:1: ( rule__JvmParameterizedTypeReference__Group_1__3__Impl rule__JvmParameterizedTypeReference__Group_1__4 )
            // InternalTqcl.g:1877:2: rule__JvmParameterizedTypeReference__Group_1__3__Impl rule__JvmParameterizedTypeReference__Group_1__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalTqcl.g:1884:1: rule__JvmParameterizedTypeReference__Group_1__3__Impl : ( '>' ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1888:1: ( ( '>' ) )
            // InternalTqcl.g:1889:1: ( '>' )
            {
            // InternalTqcl.g:1889:1: ( '>' )
            // InternalTqcl.g:1890:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalTqcl.g:1899:1: rule__JvmParameterizedTypeReference__Group_1__4 : rule__JvmParameterizedTypeReference__Group_1__4__Impl ;
    public final void rule__JvmParameterizedTypeReference__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1903:1: ( rule__JvmParameterizedTypeReference__Group_1__4__Impl )
            // InternalTqcl.g:1904:2: rule__JvmParameterizedTypeReference__Group_1__4__Impl
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
    // InternalTqcl.g:1910:1: rule__JvmParameterizedTypeReference__Group_1__4__Impl : ( ( rule__JvmParameterizedTypeReference__Group_1_4__0 )* ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1914:1: ( ( ( rule__JvmParameterizedTypeReference__Group_1_4__0 )* ) )
            // InternalTqcl.g:1915:1: ( ( rule__JvmParameterizedTypeReference__Group_1_4__0 )* )
            {
            // InternalTqcl.g:1915:1: ( ( rule__JvmParameterizedTypeReference__Group_1_4__0 )* )
            // InternalTqcl.g:1916:2: ( rule__JvmParameterizedTypeReference__Group_1_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_4()); 
            }
            // InternalTqcl.g:1917:2: ( rule__JvmParameterizedTypeReference__Group_1_4__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==25) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalTqcl.g:1917:3: rule__JvmParameterizedTypeReference__Group_1_4__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__JvmParameterizedTypeReference__Group_1_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalTqcl.g:1926:1: rule__JvmParameterizedTypeReference__Group_1_2__0 : rule__JvmParameterizedTypeReference__Group_1_2__0__Impl rule__JvmParameterizedTypeReference__Group_1_2__1 ;
    public final void rule__JvmParameterizedTypeReference__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1930:1: ( rule__JvmParameterizedTypeReference__Group_1_2__0__Impl rule__JvmParameterizedTypeReference__Group_1_2__1 )
            // InternalTqcl.g:1931:2: rule__JvmParameterizedTypeReference__Group_1_2__0__Impl rule__JvmParameterizedTypeReference__Group_1_2__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalTqcl.g:1938:1: rule__JvmParameterizedTypeReference__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1942:1: ( ( ',' ) )
            // InternalTqcl.g:1943:1: ( ',' )
            {
            // InternalTqcl.g:1943:1: ( ',' )
            // InternalTqcl.g:1944:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
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
    // InternalTqcl.g:1953:1: rule__JvmParameterizedTypeReference__Group_1_2__1 : rule__JvmParameterizedTypeReference__Group_1_2__1__Impl ;
    public final void rule__JvmParameterizedTypeReference__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1957:1: ( rule__JvmParameterizedTypeReference__Group_1_2__1__Impl )
            // InternalTqcl.g:1958:2: rule__JvmParameterizedTypeReference__Group_1_2__1__Impl
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
    // InternalTqcl.g:1964:1: rule__JvmParameterizedTypeReference__Group_1_2__1__Impl : ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1 ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1968:1: ( ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1 ) ) )
            // InternalTqcl.g:1969:1: ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1 ) )
            {
            // InternalTqcl.g:1969:1: ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1 ) )
            // InternalTqcl.g:1970:2: ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsAssignment_1_2_1()); 
            }
            // InternalTqcl.g:1971:2: ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1 )
            // InternalTqcl.g:1971:3: rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1
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
    // InternalTqcl.g:1980:1: rule__JvmParameterizedTypeReference__Group_1_4__0 : rule__JvmParameterizedTypeReference__Group_1_4__0__Impl rule__JvmParameterizedTypeReference__Group_1_4__1 ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1984:1: ( rule__JvmParameterizedTypeReference__Group_1_4__0__Impl rule__JvmParameterizedTypeReference__Group_1_4__1 )
            // InternalTqcl.g:1985:2: rule__JvmParameterizedTypeReference__Group_1_4__0__Impl rule__JvmParameterizedTypeReference__Group_1_4__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalTqcl.g:1992:1: rule__JvmParameterizedTypeReference__Group_1_4__0__Impl : ( ( rule__JvmParameterizedTypeReference__Group_1_4_0__0 ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:1996:1: ( ( ( rule__JvmParameterizedTypeReference__Group_1_4_0__0 ) ) )
            // InternalTqcl.g:1997:1: ( ( rule__JvmParameterizedTypeReference__Group_1_4_0__0 ) )
            {
            // InternalTqcl.g:1997:1: ( ( rule__JvmParameterizedTypeReference__Group_1_4_0__0 ) )
            // InternalTqcl.g:1998:2: ( rule__JvmParameterizedTypeReference__Group_1_4_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_4_0()); 
            }
            // InternalTqcl.g:1999:2: ( rule__JvmParameterizedTypeReference__Group_1_4_0__0 )
            // InternalTqcl.g:1999:3: rule__JvmParameterizedTypeReference__Group_1_4_0__0
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
    // InternalTqcl.g:2007:1: rule__JvmParameterizedTypeReference__Group_1_4__1 : rule__JvmParameterizedTypeReference__Group_1_4__1__Impl rule__JvmParameterizedTypeReference__Group_1_4__2 ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2011:1: ( rule__JvmParameterizedTypeReference__Group_1_4__1__Impl rule__JvmParameterizedTypeReference__Group_1_4__2 )
            // InternalTqcl.g:2012:2: rule__JvmParameterizedTypeReference__Group_1_4__1__Impl rule__JvmParameterizedTypeReference__Group_1_4__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalTqcl.g:2019:1: rule__JvmParameterizedTypeReference__Group_1_4__1__Impl : ( ( rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1 ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2023:1: ( ( ( rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1 ) ) )
            // InternalTqcl.g:2024:1: ( ( rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1 ) )
            {
            // InternalTqcl.g:2024:1: ( ( rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1 ) )
            // InternalTqcl.g:2025:2: ( rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeAssignment_1_4_1()); 
            }
            // InternalTqcl.g:2026:2: ( rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1 )
            // InternalTqcl.g:2026:3: rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1
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
    // InternalTqcl.g:2034:1: rule__JvmParameterizedTypeReference__Group_1_4__2 : rule__JvmParameterizedTypeReference__Group_1_4__2__Impl ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2038:1: ( rule__JvmParameterizedTypeReference__Group_1_4__2__Impl )
            // InternalTqcl.g:2039:2: rule__JvmParameterizedTypeReference__Group_1_4__2__Impl
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
    // InternalTqcl.g:2045:1: rule__JvmParameterizedTypeReference__Group_1_4__2__Impl : ( ( rule__JvmParameterizedTypeReference__Group_1_4_2__0 )? ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2049:1: ( ( ( rule__JvmParameterizedTypeReference__Group_1_4_2__0 )? ) )
            // InternalTqcl.g:2050:1: ( ( rule__JvmParameterizedTypeReference__Group_1_4_2__0 )? )
            {
            // InternalTqcl.g:2050:1: ( ( rule__JvmParameterizedTypeReference__Group_1_4_2__0 )? )
            // InternalTqcl.g:2051:2: ( rule__JvmParameterizedTypeReference__Group_1_4_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_4_2()); 
            }
            // InternalTqcl.g:2052:2: ( rule__JvmParameterizedTypeReference__Group_1_4_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTqcl.g:2052:3: rule__JvmParameterizedTypeReference__Group_1_4_2__0
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
    // InternalTqcl.g:2061:1: rule__JvmParameterizedTypeReference__Group_1_4_0__0 : rule__JvmParameterizedTypeReference__Group_1_4_0__0__Impl ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2065:1: ( rule__JvmParameterizedTypeReference__Group_1_4_0__0__Impl )
            // InternalTqcl.g:2066:2: rule__JvmParameterizedTypeReference__Group_1_4_0__0__Impl
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
    // InternalTqcl.g:2072:1: rule__JvmParameterizedTypeReference__Group_1_4_0__0__Impl : ( ( rule__JvmParameterizedTypeReference__Group_1_4_0_0__0 ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2076:1: ( ( ( rule__JvmParameterizedTypeReference__Group_1_4_0_0__0 ) ) )
            // InternalTqcl.g:2077:1: ( ( rule__JvmParameterizedTypeReference__Group_1_4_0_0__0 ) )
            {
            // InternalTqcl.g:2077:1: ( ( rule__JvmParameterizedTypeReference__Group_1_4_0_0__0 ) )
            // InternalTqcl.g:2078:2: ( rule__JvmParameterizedTypeReference__Group_1_4_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_4_0_0()); 
            }
            // InternalTqcl.g:2079:2: ( rule__JvmParameterizedTypeReference__Group_1_4_0_0__0 )
            // InternalTqcl.g:2079:3: rule__JvmParameterizedTypeReference__Group_1_4_0_0__0
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
    // InternalTqcl.g:2088:1: rule__JvmParameterizedTypeReference__Group_1_4_0_0__0 : rule__JvmParameterizedTypeReference__Group_1_4_0_0__0__Impl rule__JvmParameterizedTypeReference__Group_1_4_0_0__1 ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2092:1: ( rule__JvmParameterizedTypeReference__Group_1_4_0_0__0__Impl rule__JvmParameterizedTypeReference__Group_1_4_0_0__1 )
            // InternalTqcl.g:2093:2: rule__JvmParameterizedTypeReference__Group_1_4_0_0__0__Impl rule__JvmParameterizedTypeReference__Group_1_4_0_0__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalTqcl.g:2100:1: rule__JvmParameterizedTypeReference__Group_1_4_0_0__0__Impl : ( () ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2104:1: ( ( () ) )
            // InternalTqcl.g:2105:1: ( () )
            {
            // InternalTqcl.g:2105:1: ( () )
            // InternalTqcl.g:2106:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getJvmInnerTypeReferenceOuterAction_1_4_0_0_0()); 
            }
            // InternalTqcl.g:2107:2: ()
            // InternalTqcl.g:2107:3: 
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
    // InternalTqcl.g:2115:1: rule__JvmParameterizedTypeReference__Group_1_4_0_0__1 : rule__JvmParameterizedTypeReference__Group_1_4_0_0__1__Impl ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2119:1: ( rule__JvmParameterizedTypeReference__Group_1_4_0_0__1__Impl )
            // InternalTqcl.g:2120:2: rule__JvmParameterizedTypeReference__Group_1_4_0_0__1__Impl
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
    // InternalTqcl.g:2126:1: rule__JvmParameterizedTypeReference__Group_1_4_0_0__1__Impl : ( '.' ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2130:1: ( ( '.' ) )
            // InternalTqcl.g:2131:1: ( '.' )
            {
            // InternalTqcl.g:2131:1: ( '.' )
            // InternalTqcl.g:2132:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getFullStopKeyword_1_4_0_0_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalTqcl.g:2142:1: rule__JvmParameterizedTypeReference__Group_1_4_2__0 : rule__JvmParameterizedTypeReference__Group_1_4_2__0__Impl rule__JvmParameterizedTypeReference__Group_1_4_2__1 ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2146:1: ( rule__JvmParameterizedTypeReference__Group_1_4_2__0__Impl rule__JvmParameterizedTypeReference__Group_1_4_2__1 )
            // InternalTqcl.g:2147:2: rule__JvmParameterizedTypeReference__Group_1_4_2__0__Impl rule__JvmParameterizedTypeReference__Group_1_4_2__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalTqcl.g:2154:1: rule__JvmParameterizedTypeReference__Group_1_4_2__0__Impl : ( ( '<' ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2158:1: ( ( ( '<' ) ) )
            // InternalTqcl.g:2159:1: ( ( '<' ) )
            {
            // InternalTqcl.g:2159:1: ( ( '<' ) )
            // InternalTqcl.g:2160:2: ( '<' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_4_2_0()); 
            }
            // InternalTqcl.g:2161:2: ( '<' )
            // InternalTqcl.g:2161:3: '<'
            {
            match(input,23,FOLLOW_2); if (state.failed) return ;

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
    // InternalTqcl.g:2169:1: rule__JvmParameterizedTypeReference__Group_1_4_2__1 : rule__JvmParameterizedTypeReference__Group_1_4_2__1__Impl rule__JvmParameterizedTypeReference__Group_1_4_2__2 ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2173:1: ( rule__JvmParameterizedTypeReference__Group_1_4_2__1__Impl rule__JvmParameterizedTypeReference__Group_1_4_2__2 )
            // InternalTqcl.g:2174:2: rule__JvmParameterizedTypeReference__Group_1_4_2__1__Impl rule__JvmParameterizedTypeReference__Group_1_4_2__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalTqcl.g:2181:1: rule__JvmParameterizedTypeReference__Group_1_4_2__1__Impl : ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1 ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2185:1: ( ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1 ) ) )
            // InternalTqcl.g:2186:1: ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1 ) )
            {
            // InternalTqcl.g:2186:1: ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1 ) )
            // InternalTqcl.g:2187:2: ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsAssignment_1_4_2_1()); 
            }
            // InternalTqcl.g:2188:2: ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1 )
            // InternalTqcl.g:2188:3: rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1
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
    // InternalTqcl.g:2196:1: rule__JvmParameterizedTypeReference__Group_1_4_2__2 : rule__JvmParameterizedTypeReference__Group_1_4_2__2__Impl rule__JvmParameterizedTypeReference__Group_1_4_2__3 ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2200:1: ( rule__JvmParameterizedTypeReference__Group_1_4_2__2__Impl rule__JvmParameterizedTypeReference__Group_1_4_2__3 )
            // InternalTqcl.g:2201:2: rule__JvmParameterizedTypeReference__Group_1_4_2__2__Impl rule__JvmParameterizedTypeReference__Group_1_4_2__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalTqcl.g:2208:1: rule__JvmParameterizedTypeReference__Group_1_4_2__2__Impl : ( ( rule__JvmParameterizedTypeReference__Group_1_4_2_2__0 )* ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2212:1: ( ( ( rule__JvmParameterizedTypeReference__Group_1_4_2_2__0 )* ) )
            // InternalTqcl.g:2213:1: ( ( rule__JvmParameterizedTypeReference__Group_1_4_2_2__0 )* )
            {
            // InternalTqcl.g:2213:1: ( ( rule__JvmParameterizedTypeReference__Group_1_4_2_2__0 )* )
            // InternalTqcl.g:2214:2: ( rule__JvmParameterizedTypeReference__Group_1_4_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_4_2_2()); 
            }
            // InternalTqcl.g:2215:2: ( rule__JvmParameterizedTypeReference__Group_1_4_2_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==14) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalTqcl.g:2215:3: rule__JvmParameterizedTypeReference__Group_1_4_2_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__JvmParameterizedTypeReference__Group_1_4_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalTqcl.g:2223:1: rule__JvmParameterizedTypeReference__Group_1_4_2__3 : rule__JvmParameterizedTypeReference__Group_1_4_2__3__Impl ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2227:1: ( rule__JvmParameterizedTypeReference__Group_1_4_2__3__Impl )
            // InternalTqcl.g:2228:2: rule__JvmParameterizedTypeReference__Group_1_4_2__3__Impl
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
    // InternalTqcl.g:2234:1: rule__JvmParameterizedTypeReference__Group_1_4_2__3__Impl : ( '>' ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2238:1: ( ( '>' ) )
            // InternalTqcl.g:2239:1: ( '>' )
            {
            // InternalTqcl.g:2239:1: ( '>' )
            // InternalTqcl.g:2240:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_4_2_3()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalTqcl.g:2250:1: rule__JvmParameterizedTypeReference__Group_1_4_2_2__0 : rule__JvmParameterizedTypeReference__Group_1_4_2_2__0__Impl rule__JvmParameterizedTypeReference__Group_1_4_2_2__1 ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2254:1: ( rule__JvmParameterizedTypeReference__Group_1_4_2_2__0__Impl rule__JvmParameterizedTypeReference__Group_1_4_2_2__1 )
            // InternalTqcl.g:2255:2: rule__JvmParameterizedTypeReference__Group_1_4_2_2__0__Impl rule__JvmParameterizedTypeReference__Group_1_4_2_2__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalTqcl.g:2262:1: rule__JvmParameterizedTypeReference__Group_1_4_2_2__0__Impl : ( ',' ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2266:1: ( ( ',' ) )
            // InternalTqcl.g:2267:1: ( ',' )
            {
            // InternalTqcl.g:2267:1: ( ',' )
            // InternalTqcl.g:2268:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_4_2_2_0()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
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
    // InternalTqcl.g:2277:1: rule__JvmParameterizedTypeReference__Group_1_4_2_2__1 : rule__JvmParameterizedTypeReference__Group_1_4_2_2__1__Impl ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2281:1: ( rule__JvmParameterizedTypeReference__Group_1_4_2_2__1__Impl )
            // InternalTqcl.g:2282:2: rule__JvmParameterizedTypeReference__Group_1_4_2_2__1__Impl
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
    // InternalTqcl.g:2288:1: rule__JvmParameterizedTypeReference__Group_1_4_2_2__1__Impl : ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1 ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2292:1: ( ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1 ) ) )
            // InternalTqcl.g:2293:1: ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1 ) )
            {
            // InternalTqcl.g:2293:1: ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1 ) )
            // InternalTqcl.g:2294:2: ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsAssignment_1_4_2_2_1()); 
            }
            // InternalTqcl.g:2295:2: ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1 )
            // InternalTqcl.g:2295:3: rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1
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
    // InternalTqcl.g:2304:1: rule__JvmWildcardTypeReference__Group__0 : rule__JvmWildcardTypeReference__Group__0__Impl rule__JvmWildcardTypeReference__Group__1 ;
    public final void rule__JvmWildcardTypeReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2308:1: ( rule__JvmWildcardTypeReference__Group__0__Impl rule__JvmWildcardTypeReference__Group__1 )
            // InternalTqcl.g:2309:2: rule__JvmWildcardTypeReference__Group__0__Impl rule__JvmWildcardTypeReference__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalTqcl.g:2316:1: rule__JvmWildcardTypeReference__Group__0__Impl : ( () ) ;
    public final void rule__JvmWildcardTypeReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2320:1: ( ( () ) )
            // InternalTqcl.g:2321:1: ( () )
            {
            // InternalTqcl.g:2321:1: ( () )
            // InternalTqcl.g:2322:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0()); 
            }
            // InternalTqcl.g:2323:2: ()
            // InternalTqcl.g:2323:3: 
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
    // InternalTqcl.g:2331:1: rule__JvmWildcardTypeReference__Group__1 : rule__JvmWildcardTypeReference__Group__1__Impl rule__JvmWildcardTypeReference__Group__2 ;
    public final void rule__JvmWildcardTypeReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2335:1: ( rule__JvmWildcardTypeReference__Group__1__Impl rule__JvmWildcardTypeReference__Group__2 )
            // InternalTqcl.g:2336:2: rule__JvmWildcardTypeReference__Group__1__Impl rule__JvmWildcardTypeReference__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalTqcl.g:2343:1: rule__JvmWildcardTypeReference__Group__1__Impl : ( '?' ) ;
    public final void rule__JvmWildcardTypeReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2347:1: ( ( '?' ) )
            // InternalTqcl.g:2348:1: ( '?' )
            {
            // InternalTqcl.g:2348:1: ( '?' )
            // InternalTqcl.g:2349:2: '?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalTqcl.g:2358:1: rule__JvmWildcardTypeReference__Group__2 : rule__JvmWildcardTypeReference__Group__2__Impl ;
    public final void rule__JvmWildcardTypeReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2362:1: ( rule__JvmWildcardTypeReference__Group__2__Impl )
            // InternalTqcl.g:2363:2: rule__JvmWildcardTypeReference__Group__2__Impl
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
    // InternalTqcl.g:2369:1: rule__JvmWildcardTypeReference__Group__2__Impl : ( ( rule__JvmWildcardTypeReference__Alternatives_2 )? ) ;
    public final void rule__JvmWildcardTypeReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2373:1: ( ( ( rule__JvmWildcardTypeReference__Alternatives_2 )? ) )
            // InternalTqcl.g:2374:1: ( ( rule__JvmWildcardTypeReference__Alternatives_2 )? )
            {
            // InternalTqcl.g:2374:1: ( ( rule__JvmWildcardTypeReference__Alternatives_2 )? )
            // InternalTqcl.g:2375:2: ( rule__JvmWildcardTypeReference__Alternatives_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getAlternatives_2()); 
            }
            // InternalTqcl.g:2376:2: ( rule__JvmWildcardTypeReference__Alternatives_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27||LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTqcl.g:2376:3: rule__JvmWildcardTypeReference__Alternatives_2
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
    // InternalTqcl.g:2385:1: rule__JvmWildcardTypeReference__Group_2_0__0 : rule__JvmWildcardTypeReference__Group_2_0__0__Impl rule__JvmWildcardTypeReference__Group_2_0__1 ;
    public final void rule__JvmWildcardTypeReference__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2389:1: ( rule__JvmWildcardTypeReference__Group_2_0__0__Impl rule__JvmWildcardTypeReference__Group_2_0__1 )
            // InternalTqcl.g:2390:2: rule__JvmWildcardTypeReference__Group_2_0__0__Impl rule__JvmWildcardTypeReference__Group_2_0__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalTqcl.g:2397:1: rule__JvmWildcardTypeReference__Group_2_0__0__Impl : ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0 ) ) ;
    public final void rule__JvmWildcardTypeReference__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2401:1: ( ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0 ) ) )
            // InternalTqcl.g:2402:1: ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0 ) )
            {
            // InternalTqcl.g:2402:1: ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0 ) )
            // InternalTqcl.g:2403:2: ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsAssignment_2_0_0()); 
            }
            // InternalTqcl.g:2404:2: ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0 )
            // InternalTqcl.g:2404:3: rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0
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
    // InternalTqcl.g:2412:1: rule__JvmWildcardTypeReference__Group_2_0__1 : rule__JvmWildcardTypeReference__Group_2_0__1__Impl ;
    public final void rule__JvmWildcardTypeReference__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2416:1: ( rule__JvmWildcardTypeReference__Group_2_0__1__Impl )
            // InternalTqcl.g:2417:2: rule__JvmWildcardTypeReference__Group_2_0__1__Impl
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
    // InternalTqcl.g:2423:1: rule__JvmWildcardTypeReference__Group_2_0__1__Impl : ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1 )* ) ;
    public final void rule__JvmWildcardTypeReference__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2427:1: ( ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1 )* ) )
            // InternalTqcl.g:2428:1: ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1 )* )
            {
            // InternalTqcl.g:2428:1: ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1 )* )
            // InternalTqcl.g:2429:2: ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsAssignment_2_0_1()); 
            }
            // InternalTqcl.g:2430:2: ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==28) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalTqcl.g:2430:3: rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalTqcl.g:2439:1: rule__JvmWildcardTypeReference__Group_2_1__0 : rule__JvmWildcardTypeReference__Group_2_1__0__Impl rule__JvmWildcardTypeReference__Group_2_1__1 ;
    public final void rule__JvmWildcardTypeReference__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2443:1: ( rule__JvmWildcardTypeReference__Group_2_1__0__Impl rule__JvmWildcardTypeReference__Group_2_1__1 )
            // InternalTqcl.g:2444:2: rule__JvmWildcardTypeReference__Group_2_1__0__Impl rule__JvmWildcardTypeReference__Group_2_1__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalTqcl.g:2451:1: rule__JvmWildcardTypeReference__Group_2_1__0__Impl : ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0 ) ) ;
    public final void rule__JvmWildcardTypeReference__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2455:1: ( ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0 ) ) )
            // InternalTqcl.g:2456:1: ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0 ) )
            {
            // InternalTqcl.g:2456:1: ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0 ) )
            // InternalTqcl.g:2457:2: ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsAssignment_2_1_0()); 
            }
            // InternalTqcl.g:2458:2: ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0 )
            // InternalTqcl.g:2458:3: rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0
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
    // InternalTqcl.g:2466:1: rule__JvmWildcardTypeReference__Group_2_1__1 : rule__JvmWildcardTypeReference__Group_2_1__1__Impl ;
    public final void rule__JvmWildcardTypeReference__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2470:1: ( rule__JvmWildcardTypeReference__Group_2_1__1__Impl )
            // InternalTqcl.g:2471:2: rule__JvmWildcardTypeReference__Group_2_1__1__Impl
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
    // InternalTqcl.g:2477:1: rule__JvmWildcardTypeReference__Group_2_1__1__Impl : ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1 )* ) ;
    public final void rule__JvmWildcardTypeReference__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2481:1: ( ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1 )* ) )
            // InternalTqcl.g:2482:1: ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1 )* )
            {
            // InternalTqcl.g:2482:1: ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1 )* )
            // InternalTqcl.g:2483:2: ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsAssignment_2_1_1()); 
            }
            // InternalTqcl.g:2484:2: ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==28) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalTqcl.g:2484:3: rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalTqcl.g:2493:1: rule__JvmUpperBound__Group__0 : rule__JvmUpperBound__Group__0__Impl rule__JvmUpperBound__Group__1 ;
    public final void rule__JvmUpperBound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2497:1: ( rule__JvmUpperBound__Group__0__Impl rule__JvmUpperBound__Group__1 )
            // InternalTqcl.g:2498:2: rule__JvmUpperBound__Group__0__Impl rule__JvmUpperBound__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalTqcl.g:2505:1: rule__JvmUpperBound__Group__0__Impl : ( 'extends' ) ;
    public final void rule__JvmUpperBound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2509:1: ( ( 'extends' ) )
            // InternalTqcl.g:2510:1: ( 'extends' )
            {
            // InternalTqcl.g:2510:1: ( 'extends' )
            // InternalTqcl.g:2511:2: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalTqcl.g:2520:1: rule__JvmUpperBound__Group__1 : rule__JvmUpperBound__Group__1__Impl ;
    public final void rule__JvmUpperBound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2524:1: ( rule__JvmUpperBound__Group__1__Impl )
            // InternalTqcl.g:2525:2: rule__JvmUpperBound__Group__1__Impl
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
    // InternalTqcl.g:2531:1: rule__JvmUpperBound__Group__1__Impl : ( ( rule__JvmUpperBound__TypeReferenceAssignment_1 ) ) ;
    public final void rule__JvmUpperBound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2535:1: ( ( ( rule__JvmUpperBound__TypeReferenceAssignment_1 ) ) )
            // InternalTqcl.g:2536:1: ( ( rule__JvmUpperBound__TypeReferenceAssignment_1 ) )
            {
            // InternalTqcl.g:2536:1: ( ( rule__JvmUpperBound__TypeReferenceAssignment_1 ) )
            // InternalTqcl.g:2537:2: ( rule__JvmUpperBound__TypeReferenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceAssignment_1()); 
            }
            // InternalTqcl.g:2538:2: ( rule__JvmUpperBound__TypeReferenceAssignment_1 )
            // InternalTqcl.g:2538:3: rule__JvmUpperBound__TypeReferenceAssignment_1
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
    // InternalTqcl.g:2547:1: rule__JvmUpperBoundAnded__Group__0 : rule__JvmUpperBoundAnded__Group__0__Impl rule__JvmUpperBoundAnded__Group__1 ;
    public final void rule__JvmUpperBoundAnded__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2551:1: ( rule__JvmUpperBoundAnded__Group__0__Impl rule__JvmUpperBoundAnded__Group__1 )
            // InternalTqcl.g:2552:2: rule__JvmUpperBoundAnded__Group__0__Impl rule__JvmUpperBoundAnded__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalTqcl.g:2559:1: rule__JvmUpperBoundAnded__Group__0__Impl : ( '&' ) ;
    public final void rule__JvmUpperBoundAnded__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2563:1: ( ( '&' ) )
            // InternalTqcl.g:2564:1: ( '&' )
            {
            // InternalTqcl.g:2564:1: ( '&' )
            // InternalTqcl.g:2565:2: '&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalTqcl.g:2574:1: rule__JvmUpperBoundAnded__Group__1 : rule__JvmUpperBoundAnded__Group__1__Impl ;
    public final void rule__JvmUpperBoundAnded__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2578:1: ( rule__JvmUpperBoundAnded__Group__1__Impl )
            // InternalTqcl.g:2579:2: rule__JvmUpperBoundAnded__Group__1__Impl
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
    // InternalTqcl.g:2585:1: rule__JvmUpperBoundAnded__Group__1__Impl : ( ( rule__JvmUpperBoundAnded__TypeReferenceAssignment_1 ) ) ;
    public final void rule__JvmUpperBoundAnded__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2589:1: ( ( ( rule__JvmUpperBoundAnded__TypeReferenceAssignment_1 ) ) )
            // InternalTqcl.g:2590:1: ( ( rule__JvmUpperBoundAnded__TypeReferenceAssignment_1 ) )
            {
            // InternalTqcl.g:2590:1: ( ( rule__JvmUpperBoundAnded__TypeReferenceAssignment_1 ) )
            // InternalTqcl.g:2591:2: ( rule__JvmUpperBoundAnded__TypeReferenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceAssignment_1()); 
            }
            // InternalTqcl.g:2592:2: ( rule__JvmUpperBoundAnded__TypeReferenceAssignment_1 )
            // InternalTqcl.g:2592:3: rule__JvmUpperBoundAnded__TypeReferenceAssignment_1
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
    // InternalTqcl.g:2601:1: rule__JvmLowerBound__Group__0 : rule__JvmLowerBound__Group__0__Impl rule__JvmLowerBound__Group__1 ;
    public final void rule__JvmLowerBound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2605:1: ( rule__JvmLowerBound__Group__0__Impl rule__JvmLowerBound__Group__1 )
            // InternalTqcl.g:2606:2: rule__JvmLowerBound__Group__0__Impl rule__JvmLowerBound__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalTqcl.g:2613:1: rule__JvmLowerBound__Group__0__Impl : ( 'super' ) ;
    public final void rule__JvmLowerBound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2617:1: ( ( 'super' ) )
            // InternalTqcl.g:2618:1: ( 'super' )
            {
            // InternalTqcl.g:2618:1: ( 'super' )
            // InternalTqcl.g:2619:2: 'super'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalTqcl.g:2628:1: rule__JvmLowerBound__Group__1 : rule__JvmLowerBound__Group__1__Impl ;
    public final void rule__JvmLowerBound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2632:1: ( rule__JvmLowerBound__Group__1__Impl )
            // InternalTqcl.g:2633:2: rule__JvmLowerBound__Group__1__Impl
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
    // InternalTqcl.g:2639:1: rule__JvmLowerBound__Group__1__Impl : ( ( rule__JvmLowerBound__TypeReferenceAssignment_1 ) ) ;
    public final void rule__JvmLowerBound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2643:1: ( ( ( rule__JvmLowerBound__TypeReferenceAssignment_1 ) ) )
            // InternalTqcl.g:2644:1: ( ( rule__JvmLowerBound__TypeReferenceAssignment_1 ) )
            {
            // InternalTqcl.g:2644:1: ( ( rule__JvmLowerBound__TypeReferenceAssignment_1 ) )
            // InternalTqcl.g:2645:2: ( rule__JvmLowerBound__TypeReferenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceAssignment_1()); 
            }
            // InternalTqcl.g:2646:2: ( rule__JvmLowerBound__TypeReferenceAssignment_1 )
            // InternalTqcl.g:2646:3: rule__JvmLowerBound__TypeReferenceAssignment_1
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
    // InternalTqcl.g:2655:1: rule__JvmLowerBoundAnded__Group__0 : rule__JvmLowerBoundAnded__Group__0__Impl rule__JvmLowerBoundAnded__Group__1 ;
    public final void rule__JvmLowerBoundAnded__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2659:1: ( rule__JvmLowerBoundAnded__Group__0__Impl rule__JvmLowerBoundAnded__Group__1 )
            // InternalTqcl.g:2660:2: rule__JvmLowerBoundAnded__Group__0__Impl rule__JvmLowerBoundAnded__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalTqcl.g:2667:1: rule__JvmLowerBoundAnded__Group__0__Impl : ( '&' ) ;
    public final void rule__JvmLowerBoundAnded__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2671:1: ( ( '&' ) )
            // InternalTqcl.g:2672:1: ( '&' )
            {
            // InternalTqcl.g:2672:1: ( '&' )
            // InternalTqcl.g:2673:2: '&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmLowerBoundAndedAccess().getAmpersandKeyword_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalTqcl.g:2682:1: rule__JvmLowerBoundAnded__Group__1 : rule__JvmLowerBoundAnded__Group__1__Impl ;
    public final void rule__JvmLowerBoundAnded__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2686:1: ( rule__JvmLowerBoundAnded__Group__1__Impl )
            // InternalTqcl.g:2687:2: rule__JvmLowerBoundAnded__Group__1__Impl
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
    // InternalTqcl.g:2693:1: rule__JvmLowerBoundAnded__Group__1__Impl : ( ( rule__JvmLowerBoundAnded__TypeReferenceAssignment_1 ) ) ;
    public final void rule__JvmLowerBoundAnded__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2697:1: ( ( ( rule__JvmLowerBoundAnded__TypeReferenceAssignment_1 ) ) )
            // InternalTqcl.g:2698:1: ( ( rule__JvmLowerBoundAnded__TypeReferenceAssignment_1 ) )
            {
            // InternalTqcl.g:2698:1: ( ( rule__JvmLowerBoundAnded__TypeReferenceAssignment_1 ) )
            // InternalTqcl.g:2699:2: ( rule__JvmLowerBoundAnded__TypeReferenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmLowerBoundAndedAccess().getTypeReferenceAssignment_1()); 
            }
            // InternalTqcl.g:2700:2: ( rule__JvmLowerBoundAnded__TypeReferenceAssignment_1 )
            // InternalTqcl.g:2700:3: rule__JvmLowerBoundAnded__TypeReferenceAssignment_1
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
    // InternalTqcl.g:2709:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2713:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalTqcl.g:2714:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalTqcl.g:2721:1: rule__QualifiedName__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2725:1: ( ( ruleValidID ) )
            // InternalTqcl.g:2726:1: ( ruleValidID )
            {
            // InternalTqcl.g:2726:1: ( ruleValidID )
            // InternalTqcl.g:2727:2: ruleValidID
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
    // InternalTqcl.g:2736:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2740:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalTqcl.g:2741:2: rule__QualifiedName__Group__1__Impl
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
    // InternalTqcl.g:2747:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2751:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalTqcl.g:2752:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalTqcl.g:2752:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalTqcl.g:2753:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalTqcl.g:2754:2: ( rule__QualifiedName__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==25) ) {
                    int LA25_2 = input.LA(2);

                    if ( (LA25_2==RULE_ID) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // InternalTqcl.g:2754:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalTqcl.g:2763:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2767:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalTqcl.g:2768:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalTqcl.g:2775:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2779:1: ( ( '.' ) )
            // InternalTqcl.g:2780:1: ( '.' )
            {
            // InternalTqcl.g:2780:1: ( '.' )
            // InternalTqcl.g:2781:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalTqcl.g:2790:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2794:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalTqcl.g:2795:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalTqcl.g:2801:1: rule__QualifiedName__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2805:1: ( ( ruleValidID ) )
            // InternalTqcl.g:2806:1: ( ruleValidID )
            {
            // InternalTqcl.g:2806:1: ( ruleValidID )
            // InternalTqcl.g:2807:2: ruleValidID
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
    // InternalTqcl.g:2817:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2821:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalTqcl.g:2822:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalTqcl.g:2829:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2833:1: ( ( ruleQualifiedName ) )
            // InternalTqcl.g:2834:1: ( ruleQualifiedName )
            {
            // InternalTqcl.g:2834:1: ( ruleQualifiedName )
            // InternalTqcl.g:2835:2: ruleQualifiedName
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
    // InternalTqcl.g:2844:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl rule__QualifiedNameWithWildcard__Group__2 ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2848:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl rule__QualifiedNameWithWildcard__Group__2 )
            // InternalTqcl.g:2849:2: rule__QualifiedNameWithWildcard__Group__1__Impl rule__QualifiedNameWithWildcard__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalTqcl.g:2856:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2860:1: ( ( '.' ) )
            // InternalTqcl.g:2861:1: ( '.' )
            {
            // InternalTqcl.g:2861:1: ( '.' )
            // InternalTqcl.g:2862:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalTqcl.g:2871:1: rule__QualifiedNameWithWildcard__Group__2 : rule__QualifiedNameWithWildcard__Group__2__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2875:1: ( rule__QualifiedNameWithWildcard__Group__2__Impl )
            // InternalTqcl.g:2876:2: rule__QualifiedNameWithWildcard__Group__2__Impl
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
    // InternalTqcl.g:2882:1: rule__QualifiedNameWithWildcard__Group__2__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildcard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2886:1: ( ( '*' ) )
            // InternalTqcl.g:2887:1: ( '*' )
            {
            // InternalTqcl.g:2887:1: ( '*' )
            // InternalTqcl.g:2888:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_2()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalTqcl.g:2898:1: rule__XImportDeclaration__Group__0 : rule__XImportDeclaration__Group__0__Impl rule__XImportDeclaration__Group__1 ;
    public final void rule__XImportDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2902:1: ( rule__XImportDeclaration__Group__0__Impl rule__XImportDeclaration__Group__1 )
            // InternalTqcl.g:2903:2: rule__XImportDeclaration__Group__0__Impl rule__XImportDeclaration__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalTqcl.g:2910:1: rule__XImportDeclaration__Group__0__Impl : ( 'import' ) ;
    public final void rule__XImportDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2914:1: ( ( 'import' ) )
            // InternalTqcl.g:2915:1: ( 'import' )
            {
            // InternalTqcl.g:2915:1: ( 'import' )
            // InternalTqcl.g:2916:2: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getImportKeyword_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalTqcl.g:2925:1: rule__XImportDeclaration__Group__1 : rule__XImportDeclaration__Group__1__Impl rule__XImportDeclaration__Group__2 ;
    public final void rule__XImportDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2929:1: ( rule__XImportDeclaration__Group__1__Impl rule__XImportDeclaration__Group__2 )
            // InternalTqcl.g:2930:2: rule__XImportDeclaration__Group__1__Impl rule__XImportDeclaration__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalTqcl.g:2937:1: rule__XImportDeclaration__Group__1__Impl : ( ( rule__XImportDeclaration__Alternatives_1 ) ) ;
    public final void rule__XImportDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2941:1: ( ( ( rule__XImportDeclaration__Alternatives_1 ) ) )
            // InternalTqcl.g:2942:1: ( ( rule__XImportDeclaration__Alternatives_1 ) )
            {
            // InternalTqcl.g:2942:1: ( ( rule__XImportDeclaration__Alternatives_1 ) )
            // InternalTqcl.g:2943:2: ( rule__XImportDeclaration__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getAlternatives_1()); 
            }
            // InternalTqcl.g:2944:2: ( rule__XImportDeclaration__Alternatives_1 )
            // InternalTqcl.g:2944:3: rule__XImportDeclaration__Alternatives_1
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
    // InternalTqcl.g:2952:1: rule__XImportDeclaration__Group__2 : rule__XImportDeclaration__Group__2__Impl ;
    public final void rule__XImportDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2956:1: ( rule__XImportDeclaration__Group__2__Impl )
            // InternalTqcl.g:2957:2: rule__XImportDeclaration__Group__2__Impl
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
    // InternalTqcl.g:2963:1: rule__XImportDeclaration__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__XImportDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2967:1: ( ( ( ';' )? ) )
            // InternalTqcl.g:2968:1: ( ( ';' )? )
            {
            // InternalTqcl.g:2968:1: ( ( ';' )? )
            // InternalTqcl.g:2969:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getSemicolonKeyword_2()); 
            }
            // InternalTqcl.g:2970:2: ( ';' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==10) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalTqcl.g:2970:3: ';'
                    {
                    match(input,10,FOLLOW_2); if (state.failed) return ;

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
    // InternalTqcl.g:2979:1: rule__XImportDeclaration__Group_1_0__0 : rule__XImportDeclaration__Group_1_0__0__Impl rule__XImportDeclaration__Group_1_0__1 ;
    public final void rule__XImportDeclaration__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2983:1: ( rule__XImportDeclaration__Group_1_0__0__Impl rule__XImportDeclaration__Group_1_0__1 )
            // InternalTqcl.g:2984:2: rule__XImportDeclaration__Group_1_0__0__Impl rule__XImportDeclaration__Group_1_0__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalTqcl.g:2991:1: rule__XImportDeclaration__Group_1_0__0__Impl : ( ( rule__XImportDeclaration__StaticAssignment_1_0_0 ) ) ;
    public final void rule__XImportDeclaration__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:2995:1: ( ( ( rule__XImportDeclaration__StaticAssignment_1_0_0 ) ) )
            // InternalTqcl.g:2996:1: ( ( rule__XImportDeclaration__StaticAssignment_1_0_0 ) )
            {
            // InternalTqcl.g:2996:1: ( ( rule__XImportDeclaration__StaticAssignment_1_0_0 ) )
            // InternalTqcl.g:2997:2: ( rule__XImportDeclaration__StaticAssignment_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getStaticAssignment_1_0_0()); 
            }
            // InternalTqcl.g:2998:2: ( rule__XImportDeclaration__StaticAssignment_1_0_0 )
            // InternalTqcl.g:2998:3: rule__XImportDeclaration__StaticAssignment_1_0_0
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
    // InternalTqcl.g:3006:1: rule__XImportDeclaration__Group_1_0__1 : rule__XImportDeclaration__Group_1_0__1__Impl rule__XImportDeclaration__Group_1_0__2 ;
    public final void rule__XImportDeclaration__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3010:1: ( rule__XImportDeclaration__Group_1_0__1__Impl rule__XImportDeclaration__Group_1_0__2 )
            // InternalTqcl.g:3011:2: rule__XImportDeclaration__Group_1_0__1__Impl rule__XImportDeclaration__Group_1_0__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalTqcl.g:3018:1: rule__XImportDeclaration__Group_1_0__1__Impl : ( ( rule__XImportDeclaration__ExtensionAssignment_1_0_1 )? ) ;
    public final void rule__XImportDeclaration__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3022:1: ( ( ( rule__XImportDeclaration__ExtensionAssignment_1_0_1 )? ) )
            // InternalTqcl.g:3023:1: ( ( rule__XImportDeclaration__ExtensionAssignment_1_0_1 )? )
            {
            // InternalTqcl.g:3023:1: ( ( rule__XImportDeclaration__ExtensionAssignment_1_0_1 )? )
            // InternalTqcl.g:3024:2: ( rule__XImportDeclaration__ExtensionAssignment_1_0_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getExtensionAssignment_1_0_1()); 
            }
            // InternalTqcl.g:3025:2: ( rule__XImportDeclaration__ExtensionAssignment_1_0_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalTqcl.g:3025:3: rule__XImportDeclaration__ExtensionAssignment_1_0_1
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
    // InternalTqcl.g:3033:1: rule__XImportDeclaration__Group_1_0__2 : rule__XImportDeclaration__Group_1_0__2__Impl rule__XImportDeclaration__Group_1_0__3 ;
    public final void rule__XImportDeclaration__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3037:1: ( rule__XImportDeclaration__Group_1_0__2__Impl rule__XImportDeclaration__Group_1_0__3 )
            // InternalTqcl.g:3038:2: rule__XImportDeclaration__Group_1_0__2__Impl rule__XImportDeclaration__Group_1_0__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalTqcl.g:3045:1: rule__XImportDeclaration__Group_1_0__2__Impl : ( ( rule__XImportDeclaration__ImportedTypeAssignment_1_0_2 ) ) ;
    public final void rule__XImportDeclaration__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3049:1: ( ( ( rule__XImportDeclaration__ImportedTypeAssignment_1_0_2 ) ) )
            // InternalTqcl.g:3050:1: ( ( rule__XImportDeclaration__ImportedTypeAssignment_1_0_2 ) )
            {
            // InternalTqcl.g:3050:1: ( ( rule__XImportDeclaration__ImportedTypeAssignment_1_0_2 ) )
            // InternalTqcl.g:3051:2: ( rule__XImportDeclaration__ImportedTypeAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getImportedTypeAssignment_1_0_2()); 
            }
            // InternalTqcl.g:3052:2: ( rule__XImportDeclaration__ImportedTypeAssignment_1_0_2 )
            // InternalTqcl.g:3052:3: rule__XImportDeclaration__ImportedTypeAssignment_1_0_2
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
    // InternalTqcl.g:3060:1: rule__XImportDeclaration__Group_1_0__3 : rule__XImportDeclaration__Group_1_0__3__Impl ;
    public final void rule__XImportDeclaration__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3064:1: ( rule__XImportDeclaration__Group_1_0__3__Impl )
            // InternalTqcl.g:3065:2: rule__XImportDeclaration__Group_1_0__3__Impl
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
    // InternalTqcl.g:3071:1: rule__XImportDeclaration__Group_1_0__3__Impl : ( ( rule__XImportDeclaration__Alternatives_1_0_3 ) ) ;
    public final void rule__XImportDeclaration__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3075:1: ( ( ( rule__XImportDeclaration__Alternatives_1_0_3 ) ) )
            // InternalTqcl.g:3076:1: ( ( rule__XImportDeclaration__Alternatives_1_0_3 ) )
            {
            // InternalTqcl.g:3076:1: ( ( rule__XImportDeclaration__Alternatives_1_0_3 ) )
            // InternalTqcl.g:3077:2: ( rule__XImportDeclaration__Alternatives_1_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getAlternatives_1_0_3()); 
            }
            // InternalTqcl.g:3078:2: ( rule__XImportDeclaration__Alternatives_1_0_3 )
            // InternalTqcl.g:3078:3: rule__XImportDeclaration__Alternatives_1_0_3
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
    // InternalTqcl.g:3087:1: rule__QualifiedNameInStaticImport__Group__0 : rule__QualifiedNameInStaticImport__Group__0__Impl rule__QualifiedNameInStaticImport__Group__1 ;
    public final void rule__QualifiedNameInStaticImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3091:1: ( rule__QualifiedNameInStaticImport__Group__0__Impl rule__QualifiedNameInStaticImport__Group__1 )
            // InternalTqcl.g:3092:2: rule__QualifiedNameInStaticImport__Group__0__Impl rule__QualifiedNameInStaticImport__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalTqcl.g:3099:1: rule__QualifiedNameInStaticImport__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedNameInStaticImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3103:1: ( ( ruleValidID ) )
            // InternalTqcl.g:3104:1: ( ruleValidID )
            {
            // InternalTqcl.g:3104:1: ( ruleValidID )
            // InternalTqcl.g:3105:2: ruleValidID
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
    // InternalTqcl.g:3114:1: rule__QualifiedNameInStaticImport__Group__1 : rule__QualifiedNameInStaticImport__Group__1__Impl ;
    public final void rule__QualifiedNameInStaticImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3118:1: ( rule__QualifiedNameInStaticImport__Group__1__Impl )
            // InternalTqcl.g:3119:2: rule__QualifiedNameInStaticImport__Group__1__Impl
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
    // InternalTqcl.g:3125:1: rule__QualifiedNameInStaticImport__Group__1__Impl : ( '.' ) ;
    public final void rule__QualifiedNameInStaticImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3129:1: ( ( '.' ) )
            // InternalTqcl.g:3130:1: ( '.' )
            {
            // InternalTqcl.g:3130:1: ( '.' )
            // InternalTqcl.g:3131:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameInStaticImportAccess().getFullStopKeyword_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalTqcl.g:3141:1: rule__TriquetrumScript__CommandsAssignment : ( ruleCommand ) ;
    public final void rule__TriquetrumScript__CommandsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3145:1: ( ( ruleCommand ) )
            // InternalTqcl.g:3146:2: ( ruleCommand )
            {
            // InternalTqcl.g:3146:2: ( ruleCommand )
            // InternalTqcl.g:3147:3: ruleCommand
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
    // InternalTqcl.g:3156:1: rule__Insert__ObjAssignment_1 : ( ruleNamedObj ) ;
    public final void rule__Insert__ObjAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3160:1: ( ( ruleNamedObj ) )
            // InternalTqcl.g:3161:2: ( ruleNamedObj )
            {
            // InternalTqcl.g:3161:2: ( ruleNamedObj )
            // InternalTqcl.g:3162:3: ruleNamedObj
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertAccess().getObjNamedObjParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNamedObj();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInsertAccess().getObjNamedObjParserRuleCall_1_0()); 
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


    // $ANTLR start "rule__Insert__NameAssignment_2_1"
    // InternalTqcl.g:3171:1: rule__Insert__NameAssignment_2_1 : ( ruleNamedObj ) ;
    public final void rule__Insert__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3175:1: ( ( ruleNamedObj ) )
            // InternalTqcl.g:3176:2: ( ruleNamedObj )
            {
            // InternalTqcl.g:3176:2: ( ruleNamedObj )
            // InternalTqcl.g:3177:3: ruleNamedObj
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertAccess().getNameNamedObjParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNamedObj();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInsertAccess().getNameNamedObjParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__Insert__NameAssignment_2_1"


    // $ANTLR start "rule__Insert__ParametersAssignment_3_1"
    // InternalTqcl.g:3186:1: rule__Insert__ParametersAssignment_3_1 : ( ruleParameter ) ;
    public final void rule__Insert__ParametersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3190:1: ( ( ruleParameter ) )
            // InternalTqcl.g:3191:2: ( ruleParameter )
            {
            // InternalTqcl.g:3191:2: ( ruleParameter )
            // InternalTqcl.g:3192:3: ruleParameter
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


    // $ANTLR start "rule__Insert__ParametersAssignment_3_2_1"
    // InternalTqcl.g:3201:1: rule__Insert__ParametersAssignment_3_2_1 : ( ruleParameter ) ;
    public final void rule__Insert__ParametersAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3205:1: ( ( ruleParameter ) )
            // InternalTqcl.g:3206:2: ( ruleParameter )
            {
            // InternalTqcl.g:3206:2: ( ruleParameter )
            // InternalTqcl.g:3207:3: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertAccess().getParametersParameterParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInsertAccess().getParametersParameterParserRuleCall_3_2_1_0()); 
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
    // $ANTLR end "rule__Insert__ParametersAssignment_3_2_1"


    // $ANTLR start "rule__Parameter__ValueAssignment_2"
    // InternalTqcl.g:3216:1: rule__Parameter__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Parameter__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3220:1: ( ( RULE_STRING ) )
            // InternalTqcl.g:3221:2: ( RULE_STRING )
            {
            // InternalTqcl.g:3221:2: ( RULE_STRING )
            // InternalTqcl.g:3222:3: RULE_STRING
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
    // InternalTqcl.g:3231:1: rule__NamedObj__NameAssignment : ( ( rule__NamedObj__NameAlternatives_0 ) ) ;
    public final void rule__NamedObj__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3235:1: ( ( ( rule__NamedObj__NameAlternatives_0 ) ) )
            // InternalTqcl.g:3236:2: ( ( rule__NamedObj__NameAlternatives_0 ) )
            {
            // InternalTqcl.g:3236:2: ( ( rule__NamedObj__NameAlternatives_0 ) )
            // InternalTqcl.g:3237:3: ( rule__NamedObj__NameAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedObjAccess().getNameAlternatives_0()); 
            }
            // InternalTqcl.g:3238:3: ( rule__NamedObj__NameAlternatives_0 )
            // InternalTqcl.g:3238:4: rule__NamedObj__NameAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__NamedObj__NameAlternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamedObjAccess().getNameAlternatives_0()); 
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
    // InternalTqcl.g:3246:1: rule__Connect__FromAssignment_1 : ( ruleNamedObj ) ;
    public final void rule__Connect__FromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3250:1: ( ( ruleNamedObj ) )
            // InternalTqcl.g:3251:2: ( ruleNamedObj )
            {
            // InternalTqcl.g:3251:2: ( ruleNamedObj )
            // InternalTqcl.g:3252:3: ruleNamedObj
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
    // InternalTqcl.g:3261:1: rule__Connect__ToAssignment_3 : ( ruleNamedObj ) ;
    public final void rule__Connect__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3265:1: ( ( ruleNamedObj ) )
            // InternalTqcl.g:3266:2: ( ruleNamedObj )
            {
            // InternalTqcl.g:3266:2: ( ruleNamedObj )
            // InternalTqcl.g:3267:3: ruleNamedObj
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
    // InternalTqcl.g:3276:1: rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0 : ( ruleJvmTypeReference ) ;
    public final void rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3280:1: ( ( ruleJvmTypeReference ) )
            // InternalTqcl.g:3281:2: ( ruleJvmTypeReference )
            {
            // InternalTqcl.g:3281:2: ( ruleJvmTypeReference )
            // InternalTqcl.g:3282:3: ruleJvmTypeReference
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
    // InternalTqcl.g:3291:1: rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1 : ( ruleJvmTypeReference ) ;
    public final void rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3295:1: ( ( ruleJvmTypeReference ) )
            // InternalTqcl.g:3296:2: ( ruleJvmTypeReference )
            {
            // InternalTqcl.g:3296:2: ( ruleJvmTypeReference )
            // InternalTqcl.g:3297:3: ruleJvmTypeReference
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
    // InternalTqcl.g:3306:1: rule__XFunctionTypeRef__ReturnTypeAssignment_2 : ( ruleJvmTypeReference ) ;
    public final void rule__XFunctionTypeRef__ReturnTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3310:1: ( ( ruleJvmTypeReference ) )
            // InternalTqcl.g:3311:2: ( ruleJvmTypeReference )
            {
            // InternalTqcl.g:3311:2: ( ruleJvmTypeReference )
            // InternalTqcl.g:3312:3: ruleJvmTypeReference
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
    // InternalTqcl.g:3321:1: rule__JvmParameterizedTypeReference__TypeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__JvmParameterizedTypeReference__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3325:1: ( ( ( ruleQualifiedName ) ) )
            // InternalTqcl.g:3326:2: ( ( ruleQualifiedName ) )
            {
            // InternalTqcl.g:3326:2: ( ( ruleQualifiedName ) )
            // InternalTqcl.g:3327:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
            }
            // InternalTqcl.g:3328:3: ( ruleQualifiedName )
            // InternalTqcl.g:3329:4: ruleQualifiedName
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
    // InternalTqcl.g:3340:1: rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1 : ( ruleJvmArgumentTypeReference ) ;
    public final void rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3344:1: ( ( ruleJvmArgumentTypeReference ) )
            // InternalTqcl.g:3345:2: ( ruleJvmArgumentTypeReference )
            {
            // InternalTqcl.g:3345:2: ( ruleJvmArgumentTypeReference )
            // InternalTqcl.g:3346:3: ruleJvmArgumentTypeReference
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
    // InternalTqcl.g:3355:1: rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1 : ( ruleJvmArgumentTypeReference ) ;
    public final void rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3359:1: ( ( ruleJvmArgumentTypeReference ) )
            // InternalTqcl.g:3360:2: ( ruleJvmArgumentTypeReference )
            {
            // InternalTqcl.g:3360:2: ( ruleJvmArgumentTypeReference )
            // InternalTqcl.g:3361:3: ruleJvmArgumentTypeReference
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
    // InternalTqcl.g:3370:1: rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1 : ( ( ruleValidID ) ) ;
    public final void rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3374:1: ( ( ( ruleValidID ) ) )
            // InternalTqcl.g:3375:2: ( ( ruleValidID ) )
            {
            // InternalTqcl.g:3375:2: ( ( ruleValidID ) )
            // InternalTqcl.g:3376:3: ( ruleValidID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_1_4_1_0()); 
            }
            // InternalTqcl.g:3377:3: ( ruleValidID )
            // InternalTqcl.g:3378:4: ruleValidID
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
    // InternalTqcl.g:3389:1: rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1 : ( ruleJvmArgumentTypeReference ) ;
    public final void rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3393:1: ( ( ruleJvmArgumentTypeReference ) )
            // InternalTqcl.g:3394:2: ( ruleJvmArgumentTypeReference )
            {
            // InternalTqcl.g:3394:2: ( ruleJvmArgumentTypeReference )
            // InternalTqcl.g:3395:3: ruleJvmArgumentTypeReference
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
    // InternalTqcl.g:3404:1: rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1 : ( ruleJvmArgumentTypeReference ) ;
    public final void rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3408:1: ( ( ruleJvmArgumentTypeReference ) )
            // InternalTqcl.g:3409:2: ( ruleJvmArgumentTypeReference )
            {
            // InternalTqcl.g:3409:2: ( ruleJvmArgumentTypeReference )
            // InternalTqcl.g:3410:3: ruleJvmArgumentTypeReference
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
    // InternalTqcl.g:3419:1: rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0 : ( ruleJvmUpperBound ) ;
    public final void rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3423:1: ( ( ruleJvmUpperBound ) )
            // InternalTqcl.g:3424:2: ( ruleJvmUpperBound )
            {
            // InternalTqcl.g:3424:2: ( ruleJvmUpperBound )
            // InternalTqcl.g:3425:3: ruleJvmUpperBound
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
    // InternalTqcl.g:3434:1: rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1 : ( ruleJvmUpperBoundAnded ) ;
    public final void rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3438:1: ( ( ruleJvmUpperBoundAnded ) )
            // InternalTqcl.g:3439:2: ( ruleJvmUpperBoundAnded )
            {
            // InternalTqcl.g:3439:2: ( ruleJvmUpperBoundAnded )
            // InternalTqcl.g:3440:3: ruleJvmUpperBoundAnded
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
    // InternalTqcl.g:3449:1: rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0 : ( ruleJvmLowerBound ) ;
    public final void rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3453:1: ( ( ruleJvmLowerBound ) )
            // InternalTqcl.g:3454:2: ( ruleJvmLowerBound )
            {
            // InternalTqcl.g:3454:2: ( ruleJvmLowerBound )
            // InternalTqcl.g:3455:3: ruleJvmLowerBound
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
    // InternalTqcl.g:3464:1: rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1 : ( ruleJvmLowerBoundAnded ) ;
    public final void rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3468:1: ( ( ruleJvmLowerBoundAnded ) )
            // InternalTqcl.g:3469:2: ( ruleJvmLowerBoundAnded )
            {
            // InternalTqcl.g:3469:2: ( ruleJvmLowerBoundAnded )
            // InternalTqcl.g:3470:3: ruleJvmLowerBoundAnded
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
    // InternalTqcl.g:3479:1: rule__JvmUpperBound__TypeReferenceAssignment_1 : ( ruleJvmTypeReference ) ;
    public final void rule__JvmUpperBound__TypeReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3483:1: ( ( ruleJvmTypeReference ) )
            // InternalTqcl.g:3484:2: ( ruleJvmTypeReference )
            {
            // InternalTqcl.g:3484:2: ( ruleJvmTypeReference )
            // InternalTqcl.g:3485:3: ruleJvmTypeReference
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
    // InternalTqcl.g:3494:1: rule__JvmUpperBoundAnded__TypeReferenceAssignment_1 : ( ruleJvmTypeReference ) ;
    public final void rule__JvmUpperBoundAnded__TypeReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3498:1: ( ( ruleJvmTypeReference ) )
            // InternalTqcl.g:3499:2: ( ruleJvmTypeReference )
            {
            // InternalTqcl.g:3499:2: ( ruleJvmTypeReference )
            // InternalTqcl.g:3500:3: ruleJvmTypeReference
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
    // InternalTqcl.g:3509:1: rule__JvmLowerBound__TypeReferenceAssignment_1 : ( ruleJvmTypeReference ) ;
    public final void rule__JvmLowerBound__TypeReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3513:1: ( ( ruleJvmTypeReference ) )
            // InternalTqcl.g:3514:2: ( ruleJvmTypeReference )
            {
            // InternalTqcl.g:3514:2: ( ruleJvmTypeReference )
            // InternalTqcl.g:3515:3: ruleJvmTypeReference
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
    // InternalTqcl.g:3524:1: rule__JvmLowerBoundAnded__TypeReferenceAssignment_1 : ( ruleJvmTypeReference ) ;
    public final void rule__JvmLowerBoundAnded__TypeReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3528:1: ( ( ruleJvmTypeReference ) )
            // InternalTqcl.g:3529:2: ( ruleJvmTypeReference )
            {
            // InternalTqcl.g:3529:2: ( ruleJvmTypeReference )
            // InternalTqcl.g:3530:3: ruleJvmTypeReference
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
    // InternalTqcl.g:3539:1: rule__XImportDeclaration__StaticAssignment_1_0_0 : ( ( 'static' ) ) ;
    public final void rule__XImportDeclaration__StaticAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3543:1: ( ( ( 'static' ) ) )
            // InternalTqcl.g:3544:2: ( ( 'static' ) )
            {
            // InternalTqcl.g:3544:2: ( ( 'static' ) )
            // InternalTqcl.g:3545:3: ( 'static' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getStaticStaticKeyword_1_0_0_0()); 
            }
            // InternalTqcl.g:3546:3: ( 'static' )
            // InternalTqcl.g:3547:4: 'static'
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
    // InternalTqcl.g:3558:1: rule__XImportDeclaration__ExtensionAssignment_1_0_1 : ( ( 'extension' ) ) ;
    public final void rule__XImportDeclaration__ExtensionAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3562:1: ( ( ( 'extension' ) ) )
            // InternalTqcl.g:3563:2: ( ( 'extension' ) )
            {
            // InternalTqcl.g:3563:2: ( ( 'extension' ) )
            // InternalTqcl.g:3564:3: ( 'extension' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getExtensionExtensionKeyword_1_0_1_0()); 
            }
            // InternalTqcl.g:3565:3: ( 'extension' )
            // InternalTqcl.g:3566:4: 'extension'
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
    // InternalTqcl.g:3577:1: rule__XImportDeclaration__ImportedTypeAssignment_1_0_2 : ( ( ruleQualifiedNameInStaticImport ) ) ;
    public final void rule__XImportDeclaration__ImportedTypeAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3581:1: ( ( ( ruleQualifiedNameInStaticImport ) ) )
            // InternalTqcl.g:3582:2: ( ( ruleQualifiedNameInStaticImport ) )
            {
            // InternalTqcl.g:3582:2: ( ( ruleQualifiedNameInStaticImport ) )
            // InternalTqcl.g:3583:3: ( ruleQualifiedNameInStaticImport )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_0_2_0()); 
            }
            // InternalTqcl.g:3584:3: ( ruleQualifiedNameInStaticImport )
            // InternalTqcl.g:3585:4: ruleQualifiedNameInStaticImport
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
    // InternalTqcl.g:3596:1: rule__XImportDeclaration__WildcardAssignment_1_0_3_0 : ( ( '*' ) ) ;
    public final void rule__XImportDeclaration__WildcardAssignment_1_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3600:1: ( ( ( '*' ) ) )
            // InternalTqcl.g:3601:2: ( ( '*' ) )
            {
            // InternalTqcl.g:3601:2: ( ( '*' ) )
            // InternalTqcl.g:3602:3: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getWildcardAsteriskKeyword_1_0_3_0_0()); 
            }
            // InternalTqcl.g:3603:3: ( '*' )
            // InternalTqcl.g:3604:4: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getWildcardAsteriskKeyword_1_0_3_0_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalTqcl.g:3615:1: rule__XImportDeclaration__MemberNameAssignment_1_0_3_1 : ( ruleValidID ) ;
    public final void rule__XImportDeclaration__MemberNameAssignment_1_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3619:1: ( ( ruleValidID ) )
            // InternalTqcl.g:3620:2: ( ruleValidID )
            {
            // InternalTqcl.g:3620:2: ( ruleValidID )
            // InternalTqcl.g:3621:3: ruleValidID
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
    // InternalTqcl.g:3630:1: rule__XImportDeclaration__ImportedTypeAssignment_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__XImportDeclaration__ImportedTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3634:1: ( ( ( ruleQualifiedName ) ) )
            // InternalTqcl.g:3635:2: ( ( ruleQualifiedName ) )
            {
            // InternalTqcl.g:3635:2: ( ( ruleQualifiedName ) )
            // InternalTqcl.g:3636:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_1_0()); 
            }
            // InternalTqcl.g:3637:3: ( ruleQualifiedName )
            // InternalTqcl.g:3638:4: ruleQualifiedName
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
    // InternalTqcl.g:3649:1: rule__XImportDeclaration__ImportedNamespaceAssignment_1_2 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__XImportDeclaration__ImportedNamespaceAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTqcl.g:3653:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalTqcl.g:3654:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalTqcl.g:3654:2: ( ruleQualifiedNameWithWildcard )
            // InternalTqcl.g:3655:3: ruleQualifiedNameWithWildcard
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


    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\2\uffff\1\4\3\uffff\1\4";
    static final String dfa_3s = "\1\4\1\uffff\1\12\1\4\2\uffff\1\12";
    static final String dfa_4s = "\1\40\1\uffff\1\31\1\36\2\uffff\1\31";
    static final String dfa_5s = "\1\uffff\1\1\2\uffff\1\2\1\3\1\uffff";
    static final String dfa_6s = "\7\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\33\uffff\1\1",
            "",
            "\1\4\16\uffff\1\3",
            "\1\6\31\uffff\1\5",
            "",
            "",
            "\1\4\16\uffff\1\3"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "690:1: rule__XImportDeclaration__Alternatives_1 : ( ( ( rule__XImportDeclaration__Group_1_0__0 ) ) | ( ( rule__XImportDeclaration__ImportedTypeAssignment_1_1 ) ) | ( ( rule__XImportDeclaration__ImportedNamespaceAssignment_1_2 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000300010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000700010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004300010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000040000010L});

}