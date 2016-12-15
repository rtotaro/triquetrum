package org.eclipse.triquetrum.commands.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.triquetrum.commands.services.TqclGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalTqclParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'insert'", "'as'", "'with'", "'='", "'connect'", "'to'", "'['", "']'", "'('", "','", "')'", "'=>'", "'<'", "'>'", "'.'", "'?'", "'extends'", "'&'", "'super'", "'*'", "'import'", "'static'", "'extension'", "';'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
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

        public InternalTqclParser(TokenStream input, TqclGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "TriquetrumScript";
       	}

       	@Override
       	protected TqclGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTriquetrumScript"
    // InternalTqcl.g:64:1: entryRuleTriquetrumScript returns [EObject current=null] : iv_ruleTriquetrumScript= ruleTriquetrumScript EOF ;
    public final EObject entryRuleTriquetrumScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriquetrumScript = null;


        try {
            // InternalTqcl.g:64:57: (iv_ruleTriquetrumScript= ruleTriquetrumScript EOF )
            // InternalTqcl.g:65:2: iv_ruleTriquetrumScript= ruleTriquetrumScript EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTriquetrumScriptRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTriquetrumScript=ruleTriquetrumScript();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTriquetrumScript; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTriquetrumScript"


    // $ANTLR start "ruleTriquetrumScript"
    // InternalTqcl.g:71:1: ruleTriquetrumScript returns [EObject current=null] : ( (lv_commands_0_0= ruleCommand ) )* ;
    public final EObject ruleTriquetrumScript() throws RecognitionException {
        EObject current = null;

        EObject lv_commands_0_0 = null;



        	enterRule();

        try {
            // InternalTqcl.g:77:2: ( ( (lv_commands_0_0= ruleCommand ) )* )
            // InternalTqcl.g:78:2: ( (lv_commands_0_0= ruleCommand ) )*
            {
            // InternalTqcl.g:78:2: ( (lv_commands_0_0= ruleCommand ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==10||LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTqcl.g:79:3: (lv_commands_0_0= ruleCommand )
            	    {
            	    // InternalTqcl.g:79:3: (lv_commands_0_0= ruleCommand )
            	    // InternalTqcl.g:80:4: lv_commands_0_0= ruleCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getTriquetrumScriptAccess().getCommandsCommandParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_commands_0_0=ruleCommand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getTriquetrumScriptRule());
            	      				}
            	      				add(
            	      					current,
            	      					"commands",
            	      					lv_commands_0_0,
            	      					"org.eclipse.triquetrum.commands.Tqcl.Command");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTriquetrumScript"


    // $ANTLR start "entryRuleCommand"
    // InternalTqcl.g:100:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalTqcl.g:100:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalTqcl.g:101:2: iv_ruleCommand= ruleCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalTqcl.g:107:1: ruleCommand returns [EObject current=null] : (this_Insert_0= ruleInsert | this_Connect_1= ruleConnect ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Insert_0 = null;

        EObject this_Connect_1 = null;



        	enterRule();

        try {
            // InternalTqcl.g:113:2: ( (this_Insert_0= ruleInsert | this_Connect_1= ruleConnect ) )
            // InternalTqcl.g:114:2: (this_Insert_0= ruleInsert | this_Connect_1= ruleConnect )
            {
            // InternalTqcl.g:114:2: (this_Insert_0= ruleInsert | this_Connect_1= ruleConnect )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==10) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTqcl.g:115:3: this_Insert_0= ruleInsert
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCommandAccess().getInsertParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Insert_0=ruleInsert();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Insert_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTqcl.g:124:3: this_Connect_1= ruleConnect
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCommandAccess().getConnectParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Connect_1=ruleConnect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Connect_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleInsert"
    // InternalTqcl.g:136:1: entryRuleInsert returns [EObject current=null] : iv_ruleInsert= ruleInsert EOF ;
    public final EObject entryRuleInsert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsert = null;


        try {
            // InternalTqcl.g:136:47: (iv_ruleInsert= ruleInsert EOF )
            // InternalTqcl.g:137:2: iv_ruleInsert= ruleInsert EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInsertRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInsert=ruleInsert();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInsert; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInsert"


    // $ANTLR start "ruleInsert"
    // InternalTqcl.g:143:1: ruleInsert returns [EObject current=null] : (otherlv_0= 'insert' ( (lv_obj_1_0= ruleQualifiedName ) ) (otherlv_2= 'as' ( (lv_alias_3_0= ruleNamedObj ) ) )? (otherlv_4= 'with' ( (lv_parameters_5_0= ruleParameter ) )* )? ) ;
    public final EObject ruleInsert() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_obj_1_0 = null;

        EObject lv_alias_3_0 = null;

        EObject lv_parameters_5_0 = null;



        	enterRule();

        try {
            // InternalTqcl.g:149:2: ( (otherlv_0= 'insert' ( (lv_obj_1_0= ruleQualifiedName ) ) (otherlv_2= 'as' ( (lv_alias_3_0= ruleNamedObj ) ) )? (otherlv_4= 'with' ( (lv_parameters_5_0= ruleParameter ) )* )? ) )
            // InternalTqcl.g:150:2: (otherlv_0= 'insert' ( (lv_obj_1_0= ruleQualifiedName ) ) (otherlv_2= 'as' ( (lv_alias_3_0= ruleNamedObj ) ) )? (otherlv_4= 'with' ( (lv_parameters_5_0= ruleParameter ) )* )? )
            {
            // InternalTqcl.g:150:2: (otherlv_0= 'insert' ( (lv_obj_1_0= ruleQualifiedName ) ) (otherlv_2= 'as' ( (lv_alias_3_0= ruleNamedObj ) ) )? (otherlv_4= 'with' ( (lv_parameters_5_0= ruleParameter ) )* )? )
            // InternalTqcl.g:151:3: otherlv_0= 'insert' ( (lv_obj_1_0= ruleQualifiedName ) ) (otherlv_2= 'as' ( (lv_alias_3_0= ruleNamedObj ) ) )? (otherlv_4= 'with' ( (lv_parameters_5_0= ruleParameter ) )* )?
            {
            otherlv_0=(Token)match(input,10,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInsertAccess().getInsertKeyword_0());
              		
            }
            // InternalTqcl.g:155:3: ( (lv_obj_1_0= ruleQualifiedName ) )
            // InternalTqcl.g:156:4: (lv_obj_1_0= ruleQualifiedName )
            {
            // InternalTqcl.g:156:4: (lv_obj_1_0= ruleQualifiedName )
            // InternalTqcl.g:157:5: lv_obj_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInsertAccess().getObjQualifiedNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_obj_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInsertRule());
              					}
              					set(
              						current,
              						"obj",
              						lv_obj_1_0,
              						"org.eclipse.xtext.xbase.Xtype.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTqcl.g:174:3: (otherlv_2= 'as' ( (lv_alias_3_0= ruleNamedObj ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTqcl.g:175:4: otherlv_2= 'as' ( (lv_alias_3_0= ruleNamedObj ) )
                    {
                    otherlv_2=(Token)match(input,11,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getInsertAccess().getAsKeyword_2_0());
                      			
                    }
                    // InternalTqcl.g:179:4: ( (lv_alias_3_0= ruleNamedObj ) )
                    // InternalTqcl.g:180:5: (lv_alias_3_0= ruleNamedObj )
                    {
                    // InternalTqcl.g:180:5: (lv_alias_3_0= ruleNamedObj )
                    // InternalTqcl.g:181:6: lv_alias_3_0= ruleNamedObj
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInsertAccess().getAliasNamedObjParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_6);
                    lv_alias_3_0=ruleNamedObj();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInsertRule());
                      						}
                      						set(
                      							current,
                      							"alias",
                      							lv_alias_3_0,
                      							"org.eclipse.triquetrum.commands.Tqcl.NamedObj");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalTqcl.g:199:3: (otherlv_4= 'with' ( (lv_parameters_5_0= ruleParameter ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTqcl.g:200:4: otherlv_4= 'with' ( (lv_parameters_5_0= ruleParameter ) )*
                    {
                    otherlv_4=(Token)match(input,12,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getInsertAccess().getWithKeyword_3_0());
                      			
                    }
                    // InternalTqcl.g:204:4: ( (lv_parameters_5_0= ruleParameter ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalTqcl.g:205:5: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalTqcl.g:205:5: (lv_parameters_5_0= ruleParameter )
                    	    // InternalTqcl.g:206:6: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getInsertAccess().getParametersParameterParserRuleCall_3_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_7);
                    	    lv_parameters_5_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getInsertRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"parameters",
                    	      							lv_parameters_5_0,
                    	      							"org.eclipse.triquetrum.commands.Tqcl.Parameter");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInsert"


    // $ANTLR start "entryRuleParameter"
    // InternalTqcl.g:228:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalTqcl.g:228:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalTqcl.g:229:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalTqcl.g:235:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalTqcl.g:241:2: ( ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalTqcl.g:242:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalTqcl.g:242:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalTqcl.g:243:3: ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalTqcl.g:243:3: ( (lv_name_0_0= ruleQualifiedName ) )
            // InternalTqcl.g:244:4: (lv_name_0_0= ruleQualifiedName )
            {
            // InternalTqcl.g:244:4: (lv_name_0_0= ruleQualifiedName )
            // InternalTqcl.g:245:5: lv_name_0_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterAccess().getNameQualifiedNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_name_0_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.xbase.Xtype.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalTqcl.g:266:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalTqcl.g:267:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalTqcl.g:267:4: (lv_value_2_0= RULE_STRING )
            // InternalTqcl.g:268:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_2_0, grammarAccess.getParameterAccess().getValueSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getParameterRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_2_0,
              						"org.eclipse.xtext.xbase.Xtype.STRING");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleNamedObj"
    // InternalTqcl.g:288:1: entryRuleNamedObj returns [EObject current=null] : iv_ruleNamedObj= ruleNamedObj EOF ;
    public final EObject entryRuleNamedObj() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedObj = null;


        try {
            // InternalTqcl.g:288:49: (iv_ruleNamedObj= ruleNamedObj EOF )
            // InternalTqcl.g:289:2: iv_ruleNamedObj= ruleNamedObj EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNamedObjRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNamedObj=ruleNamedObj();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNamedObj; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamedObj"


    // $ANTLR start "ruleNamedObj"
    // InternalTqcl.g:295:1: ruleNamedObj returns [EObject current=null] : ( (lv_name_0_0= ruleQualifiedName ) ) ;
    public final EObject ruleNamedObj() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalTqcl.g:301:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) )
            // InternalTqcl.g:302:2: ( (lv_name_0_0= ruleQualifiedName ) )
            {
            // InternalTqcl.g:302:2: ( (lv_name_0_0= ruleQualifiedName ) )
            // InternalTqcl.g:303:3: (lv_name_0_0= ruleQualifiedName )
            {
            // InternalTqcl.g:303:3: (lv_name_0_0= ruleQualifiedName )
            // InternalTqcl.g:304:4: lv_name_0_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getNamedObjAccess().getNameQualifiedNameParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getNamedObjRule());
              				}
              				set(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.xbase.Xtype.QualifiedName");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamedObj"


    // $ANTLR start "entryRuleConnect"
    // InternalTqcl.g:324:1: entryRuleConnect returns [EObject current=null] : iv_ruleConnect= ruleConnect EOF ;
    public final EObject entryRuleConnect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnect = null;


        try {
            // InternalTqcl.g:324:48: (iv_ruleConnect= ruleConnect EOF )
            // InternalTqcl.g:325:2: iv_ruleConnect= ruleConnect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConnectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConnect=ruleConnect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConnect; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnect"


    // $ANTLR start "ruleConnect"
    // InternalTqcl.g:331:1: ruleConnect returns [EObject current=null] : (otherlv_0= 'connect' ( (lv_from_1_0= ruleNamedObj ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleNamedObj ) ) ) ;
    public final EObject ruleConnect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_from_1_0 = null;

        EObject lv_to_3_0 = null;



        	enterRule();

        try {
            // InternalTqcl.g:337:2: ( (otherlv_0= 'connect' ( (lv_from_1_0= ruleNamedObj ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleNamedObj ) ) ) )
            // InternalTqcl.g:338:2: (otherlv_0= 'connect' ( (lv_from_1_0= ruleNamedObj ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleNamedObj ) ) )
            {
            // InternalTqcl.g:338:2: (otherlv_0= 'connect' ( (lv_from_1_0= ruleNamedObj ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleNamedObj ) ) )
            // InternalTqcl.g:339:3: otherlv_0= 'connect' ( (lv_from_1_0= ruleNamedObj ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleNamedObj ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConnectAccess().getConnectKeyword_0());
              		
            }
            // InternalTqcl.g:343:3: ( (lv_from_1_0= ruleNamedObj ) )
            // InternalTqcl.g:344:4: (lv_from_1_0= ruleNamedObj )
            {
            // InternalTqcl.g:344:4: (lv_from_1_0= ruleNamedObj )
            // InternalTqcl.g:345:5: lv_from_1_0= ruleNamedObj
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConnectAccess().getFromNamedObjParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_from_1_0=ruleNamedObj();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConnectRule());
              					}
              					set(
              						current,
              						"from",
              						lv_from_1_0,
              						"org.eclipse.triquetrum.commands.Tqcl.NamedObj");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getConnectAccess().getToKeyword_2());
              		
            }
            // InternalTqcl.g:366:3: ( (lv_to_3_0= ruleNamedObj ) )
            // InternalTqcl.g:367:4: (lv_to_3_0= ruleNamedObj )
            {
            // InternalTqcl.g:367:4: (lv_to_3_0= ruleNamedObj )
            // InternalTqcl.g:368:5: lv_to_3_0= ruleNamedObj
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConnectAccess().getToNamedObjParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_to_3_0=ruleNamedObj();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConnectRule());
              					}
              					set(
              						current,
              						"to",
              						lv_to_3_0,
              						"org.eclipse.triquetrum.commands.Tqcl.NamedObj");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnect"


    // $ANTLR start "entryRuleJvmTypeReference"
    // InternalTqcl.g:389:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // InternalTqcl.g:389:57: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // InternalTqcl.g:390:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // InternalTqcl.g:396:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_3 = null;



        	enterRule();

        try {
            // InternalTqcl.g:402:2: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef ) )
            // InternalTqcl.g:403:2: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef )
            {
            // InternalTqcl.g:403:2: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==18||LA7_0==21) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTqcl.g:404:3: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* )
                    {
                    // InternalTqcl.g:404:3: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* )
                    // InternalTqcl.g:405:4: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )*
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_11);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_JvmParameterizedTypeReference_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalTqcl.g:413:4: ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==16) && (synpred1_InternalTqcl())) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalTqcl.g:414:5: ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets )
                    	    {
                    	    // InternalTqcl.g:420:5: ( () ruleArrayBrackets )
                    	    // InternalTqcl.g:421:6: () ruleArrayBrackets
                    	    {
                    	    // InternalTqcl.g:421:6: ()
                    	    // InternalTqcl.g:422:7: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							current = forceCreateModelElementAndSet(
                    	      								grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	      								current);
                    	      						
                    	    }

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getArrayBracketsParserRuleCall_0_1_0_1());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_11);
                    	    ruleArrayBrackets();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalTqcl.g:439:3: this_XFunctionTypeRef_3= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XFunctionTypeRef_3=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XFunctionTypeRef_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleArrayBrackets"
    // InternalTqcl.g:451:1: entryRuleArrayBrackets returns [String current=null] : iv_ruleArrayBrackets= ruleArrayBrackets EOF ;
    public final String entryRuleArrayBrackets() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArrayBrackets = null;


        try {
            // InternalTqcl.g:451:53: (iv_ruleArrayBrackets= ruleArrayBrackets EOF )
            // InternalTqcl.g:452:2: iv_ruleArrayBrackets= ruleArrayBrackets EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayBracketsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayBrackets=ruleArrayBrackets();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayBrackets.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayBrackets"


    // $ANTLR start "ruleArrayBrackets"
    // InternalTqcl.g:458:1: ruleArrayBrackets returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleArrayBrackets() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTqcl.g:464:2: ( (kw= '[' kw= ']' ) )
            // InternalTqcl.g:465:2: (kw= '[' kw= ']' )
            {
            // InternalTqcl.g:465:2: (kw= '[' kw= ']' )
            // InternalTqcl.g:466:3: kw= '[' kw= ']'
            {
            kw=(Token)match(input,16,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getArrayBracketsAccess().getLeftSquareBracketKeyword_0());
              		
            }
            kw=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getArrayBracketsAccess().getRightSquareBracketKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayBrackets"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // InternalTqcl.g:480:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // InternalTqcl.g:480:57: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // InternalTqcl.g:481:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // InternalTqcl.g:487:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paramTypes_1_0 = null;

        EObject lv_paramTypes_3_0 = null;

        EObject lv_returnType_6_0 = null;



        	enterRule();

        try {
            // InternalTqcl.g:493:2: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // InternalTqcl.g:494:2: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // InternalTqcl.g:494:2: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // InternalTqcl.g:495:3: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // InternalTqcl.g:495:3: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTqcl.g:496:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    // InternalTqcl.g:500:4: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_ID||LA9_0==18||LA9_0==21) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalTqcl.g:501:5: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // InternalTqcl.g:501:5: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // InternalTqcl.g:502:6: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // InternalTqcl.g:502:6: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // InternalTqcl.g:503:7: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_14);
                            lv_paramTypes_1_0=ruleJvmTypeReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                              							}
                              							add(
                              								current,
                              								"paramTypes",
                              								lv_paramTypes_1_0,
                              								"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalTqcl.g:520:5: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop8:
                            do {
                                int alt8=2;
                                int LA8_0 = input.LA(1);

                                if ( (LA8_0==19) ) {
                                    alt8=1;
                                }


                                switch (alt8) {
                            	case 1 :
                            	    // InternalTqcl.g:521:6: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,19,FOLLOW_15); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	      					
                            	    }
                            	    // InternalTqcl.g:525:6: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // InternalTqcl.g:526:7: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // InternalTqcl.g:526:7: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // InternalTqcl.g:527:8: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_14);
                            	    lv_paramTypes_3_0=ruleJvmTypeReference();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"paramTypes",
                            	      									lv_paramTypes_3_0,
                            	      									"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop8;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalTqcl.g:555:3: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // InternalTqcl.g:556:4: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // InternalTqcl.g:556:4: (lv_returnType_6_0= ruleJvmTypeReference )
            // InternalTqcl.g:557:5: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
              					}
              					set(
              						current,
              						"returnType",
              						lv_returnType_6_0,
              						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // InternalTqcl.g:578:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // InternalTqcl.g:578:70: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // InternalTqcl.g:579:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // InternalTqcl.g:585:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;



        	enterRule();

        try {
            // InternalTqcl.g:591:2: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )? ) )
            // InternalTqcl.g:592:2: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )? )
            {
            // InternalTqcl.g:592:2: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )? )
            // InternalTqcl.g:593:3: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )?
            {
            // InternalTqcl.g:593:3: ( ( ruleQualifiedName ) )
            // InternalTqcl.g:594:4: ( ruleQualifiedName )
            {
            // InternalTqcl.g:594:4: ( ruleQualifiedName )
            // InternalTqcl.g:595:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_17);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTqcl.g:609:3: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) && (synpred2_InternalTqcl())) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTqcl.g:610:4: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )*
                    {
                    // InternalTqcl.g:610:4: ( ( '<' )=>otherlv_1= '<' )
                    // InternalTqcl.g:611:5: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                      				
                    }

                    }

                    // InternalTqcl.g:617:4: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // InternalTqcl.g:618:5: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // InternalTqcl.g:618:5: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // InternalTqcl.g:619:6: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                      						}
                      						add(
                      							current,
                      							"arguments",
                      							lv_arguments_2_0,
                      							"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTqcl.g:636:4: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==19) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalTqcl.g:637:5: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_18); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalTqcl.g:641:5: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // InternalTqcl.g:642:6: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // InternalTqcl.g:642:6: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // InternalTqcl.g:643:7: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_19);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"arguments",
                    	      								lv_arguments_4_0,
                    	      								"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,23,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                      			
                    }
                    // InternalTqcl.g:665:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==24) && (synpred3_InternalTqcl())) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalTqcl.g:666:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )?
                    	    {
                    	    // InternalTqcl.g:666:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) )
                    	    // InternalTqcl.g:667:6: ( ( () '.' ) )=> ( () otherlv_7= '.' )
                    	    {
                    	    // InternalTqcl.g:673:6: ( () otherlv_7= '.' )
                    	    // InternalTqcl.g:674:7: () otherlv_7= '.'
                    	    {
                    	    // InternalTqcl.g:674:7: ()
                    	    // InternalTqcl.g:675:8: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								current = forceCreateModelElementAndSet(
                    	      									grammarAccess.getJvmParameterizedTypeReferenceAccess().getJvmInnerTypeReferenceOuterAction_1_4_0_0_0(),
                    	      									current);
                    	      							
                    	    }

                    	    }

                    	    otherlv_7=(Token)match(input,24,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_7, grammarAccess.getJvmParameterizedTypeReferenceAccess().getFullStopKeyword_1_4_0_0_1());
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalTqcl.g:687:5: ( ( ruleValidID ) )
                    	    // InternalTqcl.g:688:6: ( ruleValidID )
                    	    {
                    	    // InternalTqcl.g:688:6: ( ruleValidID )
                    	    // InternalTqcl.g:689:7: ruleValidID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      							}
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_1_4_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_21);
                    	    ruleValidID();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalTqcl.g:703:5: ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )?
                    	    int alt13=2;
                    	    int LA13_0 = input.LA(1);

                    	    if ( (LA13_0==22) && (synpred4_InternalTqcl())) {
                    	        alt13=1;
                    	    }
                    	    switch (alt13) {
                    	        case 1 :
                    	            // InternalTqcl.g:704:6: ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>'
                    	            {
                    	            // InternalTqcl.g:704:6: ( ( '<' )=>otherlv_9= '<' )
                    	            // InternalTqcl.g:705:7: ( '<' )=>otherlv_9= '<'
                    	            {
                    	            otherlv_9=(Token)match(input,22,FOLLOW_18); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							newLeafNode(otherlv_9, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_4_2_0());
                    	              						
                    	            }

                    	            }

                    	            // InternalTqcl.g:711:6: ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) )
                    	            // InternalTqcl.g:712:7: (lv_arguments_10_0= ruleJvmArgumentTypeReference )
                    	            {
                    	            // InternalTqcl.g:712:7: (lv_arguments_10_0= ruleJvmArgumentTypeReference )
                    	            // InternalTqcl.g:713:8: lv_arguments_10_0= ruleJvmArgumentTypeReference
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              								newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_4_2_1_0());
                    	              							
                    	            }
                    	            pushFollow(FOLLOW_19);
                    	            lv_arguments_10_0=ruleJvmArgumentTypeReference();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								if (current==null) {
                    	              									current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	              								}
                    	              								add(
                    	              									current,
                    	              									"arguments",
                    	              									lv_arguments_10_0,
                    	              									"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
                    	              								afterParserOrEnumRuleCall();
                    	              							
                    	            }

                    	            }


                    	            }

                    	            // InternalTqcl.g:730:6: (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )*
                    	            loop12:
                    	            do {
                    	                int alt12=2;
                    	                int LA12_0 = input.LA(1);

                    	                if ( (LA12_0==19) ) {
                    	                    alt12=1;
                    	                }


                    	                switch (alt12) {
                    	            	case 1 :
                    	            	    // InternalTqcl.g:731:7: otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) )
                    	            	    {
                    	            	    otherlv_11=(Token)match(input,19,FOLLOW_18); if (state.failed) return current;
                    	            	    if ( state.backtracking==0 ) {

                    	            	      							newLeafNode(otherlv_11, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_4_2_2_0());
                    	            	      						
                    	            	    }
                    	            	    // InternalTqcl.g:735:7: ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) )
                    	            	    // InternalTqcl.g:736:8: (lv_arguments_12_0= ruleJvmArgumentTypeReference )
                    	            	    {
                    	            	    // InternalTqcl.g:736:8: (lv_arguments_12_0= ruleJvmArgumentTypeReference )
                    	            	    // InternalTqcl.g:737:9: lv_arguments_12_0= ruleJvmArgumentTypeReference
                    	            	    {
                    	            	    if ( state.backtracking==0 ) {

                    	            	      									newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_4_2_2_1_0());
                    	            	      								
                    	            	    }
                    	            	    pushFollow(FOLLOW_19);
                    	            	    lv_arguments_12_0=ruleJvmArgumentTypeReference();

                    	            	    state._fsp--;
                    	            	    if (state.failed) return current;
                    	            	    if ( state.backtracking==0 ) {

                    	            	      									if (current==null) {
                    	            	      										current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	            	      									}
                    	            	      									add(
                    	            	      										current,
                    	            	      										"arguments",
                    	            	      										lv_arguments_12_0,
                    	            	      										"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
                    	            	      									afterParserOrEnumRuleCall();
                    	            	      								
                    	            	    }

                    	            	    }


                    	            	    }


                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    break loop12;
                    	                }
                    	            } while (true);

                    	            otherlv_13=(Token)match(input,23,FOLLOW_20); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(otherlv_13, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_4_2_3());
                    	              					
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // InternalTqcl.g:766:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // InternalTqcl.g:766:65: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // InternalTqcl.g:767:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // InternalTqcl.g:773:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;



        	enterRule();

        try {
            // InternalTqcl.g:779:2: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // InternalTqcl.g:780:2: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // InternalTqcl.g:780:2: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID||LA16_0==18||LA16_0==21) ) {
                alt16=1;
            }
            else if ( (LA16_0==25) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalTqcl.g:781:3: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_JvmTypeReference_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTqcl.g:790:3: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_JvmWildcardTypeReference_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // InternalTqcl.g:802:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // InternalTqcl.g:802:65: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // InternalTqcl.g:803:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // InternalTqcl.g:809:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;

        EObject lv_constraints_4_0 = null;

        EObject lv_constraints_5_0 = null;



        	enterRule();

        try {
            // InternalTqcl.g:815:2: ( ( () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )? ) )
            // InternalTqcl.g:816:2: ( () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )? )
            {
            // InternalTqcl.g:816:2: ( () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )? )
            // InternalTqcl.g:817:3: () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )?
            {
            // InternalTqcl.g:817:3: ()
            // InternalTqcl.g:818:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,25,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
              		
            }
            // InternalTqcl.g:828:3: ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )?
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            else if ( (LA19_0==28) ) {
                alt19=2;
            }
            switch (alt19) {
                case 1 :
                    // InternalTqcl.g:829:4: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* )
                    {
                    // InternalTqcl.g:829:4: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* )
                    // InternalTqcl.g:830:5: ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )*
                    {
                    // InternalTqcl.g:830:5: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // InternalTqcl.g:831:6: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // InternalTqcl.g:831:6: (lv_constraints_2_0= ruleJvmUpperBound )
                    // InternalTqcl.g:832:7: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_23);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      							}
                      							add(
                      								current,
                      								"constraints",
                      								lv_constraints_2_0,
                      								"org.eclipse.xtext.xbase.Xtype.JvmUpperBound");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalTqcl.g:849:5: ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==27) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalTqcl.g:850:6: (lv_constraints_3_0= ruleJvmUpperBoundAnded )
                    	    {
                    	    // InternalTqcl.g:850:6: (lv_constraints_3_0= ruleJvmUpperBoundAnded )
                    	    // InternalTqcl.g:851:7: lv_constraints_3_0= ruleJvmUpperBoundAnded
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundAndedParserRuleCall_2_0_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_23);
                    	    lv_constraints_3_0=ruleJvmUpperBoundAnded();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"constraints",
                    	      								lv_constraints_3_0,
                    	      								"org.eclipse.xtext.xbase.Xtype.JvmUpperBoundAnded");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalTqcl.g:870:4: ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* )
                    {
                    // InternalTqcl.g:870:4: ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* )
                    // InternalTqcl.g:871:5: ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )*
                    {
                    // InternalTqcl.g:871:5: ( (lv_constraints_4_0= ruleJvmLowerBound ) )
                    // InternalTqcl.g:872:6: (lv_constraints_4_0= ruleJvmLowerBound )
                    {
                    // InternalTqcl.g:872:6: (lv_constraints_4_0= ruleJvmLowerBound )
                    // InternalTqcl.g:873:7: lv_constraints_4_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_23);
                    lv_constraints_4_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      							}
                      							add(
                      								current,
                      								"constraints",
                      								lv_constraints_4_0,
                      								"org.eclipse.xtext.xbase.Xtype.JvmLowerBound");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalTqcl.g:890:5: ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==27) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalTqcl.g:891:6: (lv_constraints_5_0= ruleJvmLowerBoundAnded )
                    	    {
                    	    // InternalTqcl.g:891:6: (lv_constraints_5_0= ruleJvmLowerBoundAnded )
                    	    // InternalTqcl.g:892:7: lv_constraints_5_0= ruleJvmLowerBoundAnded
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundAndedParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_23);
                    	    lv_constraints_5_0=ruleJvmLowerBoundAnded();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"constraints",
                    	      								lv_constraints_5_0,
                    	      								"org.eclipse.xtext.xbase.Xtype.JvmLowerBoundAnded");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // InternalTqcl.g:915:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // InternalTqcl.g:915:54: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // InternalTqcl.g:916:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // InternalTqcl.g:922:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;



        	enterRule();

        try {
            // InternalTqcl.g:928:2: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // InternalTqcl.g:929:2: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // InternalTqcl.g:929:2: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // InternalTqcl.g:930:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
              		
            }
            // InternalTqcl.g:934:3: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // InternalTqcl.g:935:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // InternalTqcl.g:935:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            // InternalTqcl.g:936:5: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJvmUpperBoundRule());
              					}
              					set(
              						current,
              						"typeReference",
              						lv_typeReference_1_0,
              						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // InternalTqcl.g:957:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // InternalTqcl.g:957:59: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // InternalTqcl.g:958:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // InternalTqcl.g:964:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;



        	enterRule();

        try {
            // InternalTqcl.g:970:2: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // InternalTqcl.g:971:2: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // InternalTqcl.g:971:2: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // InternalTqcl.g:972:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
              		
            }
            // InternalTqcl.g:976:3: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // InternalTqcl.g:977:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // InternalTqcl.g:977:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            // InternalTqcl.g:978:5: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJvmUpperBoundAndedRule());
              					}
              					set(
              						current,
              						"typeReference",
              						lv_typeReference_1_0,
              						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // InternalTqcl.g:999:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // InternalTqcl.g:999:54: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // InternalTqcl.g:1000:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // InternalTqcl.g:1006:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;



        	enterRule();

        try {
            // InternalTqcl.g:1012:2: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // InternalTqcl.g:1013:2: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // InternalTqcl.g:1013:2: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // InternalTqcl.g:1014:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
              		
            }
            // InternalTqcl.g:1018:3: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // InternalTqcl.g:1019:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // InternalTqcl.g:1019:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            // InternalTqcl.g:1020:5: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJvmLowerBoundRule());
              					}
              					set(
              						current,
              						"typeReference",
              						lv_typeReference_1_0,
              						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleJvmLowerBoundAnded"
    // InternalTqcl.g:1041:1: entryRuleJvmLowerBoundAnded returns [EObject current=null] : iv_ruleJvmLowerBoundAnded= ruleJvmLowerBoundAnded EOF ;
    public final EObject entryRuleJvmLowerBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBoundAnded = null;


        try {
            // InternalTqcl.g:1041:59: (iv_ruleJvmLowerBoundAnded= ruleJvmLowerBoundAnded EOF )
            // InternalTqcl.g:1042:2: iv_ruleJvmLowerBoundAnded= ruleJvmLowerBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundAndedRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmLowerBoundAnded=ruleJvmLowerBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBoundAnded; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmLowerBoundAnded"


    // $ANTLR start "ruleJvmLowerBoundAnded"
    // InternalTqcl.g:1048:1: ruleJvmLowerBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;



        	enterRule();

        try {
            // InternalTqcl.g:1054:2: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // InternalTqcl.g:1055:2: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // InternalTqcl.g:1055:2: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // InternalTqcl.g:1056:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAndedAccess().getAmpersandKeyword_0());
              		
            }
            // InternalTqcl.g:1060:3: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // InternalTqcl.g:1061:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // InternalTqcl.g:1061:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            // InternalTqcl.g:1062:5: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJvmLowerBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJvmLowerBoundAndedRule());
              					}
              					set(
              						current,
              						"typeReference",
              						lv_typeReference_1_0,
              						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmLowerBoundAnded"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalTqcl.g:1083:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalTqcl.g:1083:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalTqcl.g:1084:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalTqcl.g:1090:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;



        	enterRule();

        try {
            // InternalTqcl.g:1096:2: ( (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) )
            // InternalTqcl.g:1097:2: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            {
            // InternalTqcl.g:1097:2: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            // InternalTqcl.g:1098:3: this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_20);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ValidID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTqcl.g:1108:3: (kw= '.' this_ValidID_2= ruleValidID )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==24) ) {
                    int LA20_2 = input.LA(2);

                    if ( (LA20_2==RULE_ID) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // InternalTqcl.g:1109:4: kw= '.' this_ValidID_2= ruleValidID
            	    {
            	    kw=(Token)match(input,24,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_20);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ValidID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalTqcl.g:1129:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalTqcl.g:1129:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalTqcl.g:1130:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalTqcl.g:1136:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalTqcl.g:1142:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) )
            // InternalTqcl.g:1143:2: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            {
            // InternalTqcl.g:1143:2: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            // InternalTqcl.g:1144:3: this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_24);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,24,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1());
              		
            }
            kw=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleValidID"
    // InternalTqcl.g:1168:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // InternalTqcl.g:1168:47: (iv_ruleValidID= ruleValidID EOF )
            // InternalTqcl.g:1169:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // InternalTqcl.g:1175:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalTqcl.g:1181:2: (this_ID_0= RULE_ID )
            // InternalTqcl.g:1182:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleXImportDeclaration"
    // InternalTqcl.g:1192:1: entryRuleXImportDeclaration returns [EObject current=null] : iv_ruleXImportDeclaration= ruleXImportDeclaration EOF ;
    public final EObject entryRuleXImportDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXImportDeclaration = null;


        try {
            // InternalTqcl.g:1192:59: (iv_ruleXImportDeclaration= ruleXImportDeclaration EOF )
            // InternalTqcl.g:1193:2: iv_ruleXImportDeclaration= ruleXImportDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXImportDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXImportDeclaration=ruleXImportDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXImportDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXImportDeclaration"


    // $ANTLR start "ruleXImportDeclaration"
    // InternalTqcl.g:1199:1: ruleXImportDeclaration returns [EObject current=null] : (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? ) ;
    public final EObject ruleXImportDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_static_1_0=null;
        Token lv_extension_2_0=null;
        Token lv_wildcard_4_0=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_memberName_5_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_7_0 = null;



        	enterRule();

        try {
            // InternalTqcl.g:1205:2: ( (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? ) )
            // InternalTqcl.g:1206:2: (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? )
            {
            // InternalTqcl.g:1206:2: (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? )
            // InternalTqcl.g:1207:3: otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getXImportDeclarationAccess().getImportKeyword_0());
              		
            }
            // InternalTqcl.g:1211:3: ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) )
            int alt23=3;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalTqcl.g:1212:4: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) )
                    {
                    // InternalTqcl.g:1212:4: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) )
                    // InternalTqcl.g:1213:5: ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) )
                    {
                    // InternalTqcl.g:1213:5: ( (lv_static_1_0= 'static' ) )
                    // InternalTqcl.g:1214:6: (lv_static_1_0= 'static' )
                    {
                    // InternalTqcl.g:1214:6: (lv_static_1_0= 'static' )
                    // InternalTqcl.g:1215:7: lv_static_1_0= 'static'
                    {
                    lv_static_1_0=(Token)match(input,31,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_static_1_0, grammarAccess.getXImportDeclarationAccess().getStaticStaticKeyword_1_0_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      							}
                      							setWithLastConsumed(current, "static", true, "static");
                      						
                    }

                    }


                    }

                    // InternalTqcl.g:1227:5: ( (lv_extension_2_0= 'extension' ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==32) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalTqcl.g:1228:6: (lv_extension_2_0= 'extension' )
                            {
                            // InternalTqcl.g:1228:6: (lv_extension_2_0= 'extension' )
                            // InternalTqcl.g:1229:7: lv_extension_2_0= 'extension'
                            {
                            lv_extension_2_0=(Token)match(input,32,FOLLOW_27); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_extension_2_0, grammarAccess.getXImportDeclarationAccess().getExtensionExtensionKeyword_1_0_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getXImportDeclarationRule());
                              							}
                              							setWithLastConsumed(current, "extension", true, "extension");
                              						
                            }

                            }


                            }
                            break;

                    }

                    // InternalTqcl.g:1241:5: ( ( ruleQualifiedNameInStaticImport ) )
                    // InternalTqcl.g:1242:6: ( ruleQualifiedNameInStaticImport )
                    {
                    // InternalTqcl.g:1242:6: ( ruleQualifiedNameInStaticImport )
                    // InternalTqcl.g:1243:7: ruleQualifiedNameInStaticImport
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_28);
                    ruleQualifiedNameInStaticImport();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalTqcl.g:1257:5: ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==29) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==RULE_ID) ) {
                        alt22=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalTqcl.g:1258:6: ( (lv_wildcard_4_0= '*' ) )
                            {
                            // InternalTqcl.g:1258:6: ( (lv_wildcard_4_0= '*' ) )
                            // InternalTqcl.g:1259:7: (lv_wildcard_4_0= '*' )
                            {
                            // InternalTqcl.g:1259:7: (lv_wildcard_4_0= '*' )
                            // InternalTqcl.g:1260:8: lv_wildcard_4_0= '*'
                            {
                            lv_wildcard_4_0=(Token)match(input,29,FOLLOW_29); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_wildcard_4_0, grammarAccess.getXImportDeclarationAccess().getWildcardAsteriskKeyword_1_0_3_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getXImportDeclarationRule());
                              								}
                              								setWithLastConsumed(current, "wildcard", true, "*");
                              							
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalTqcl.g:1273:6: ( (lv_memberName_5_0= ruleValidID ) )
                            {
                            // InternalTqcl.g:1273:6: ( (lv_memberName_5_0= ruleValidID ) )
                            // InternalTqcl.g:1274:7: (lv_memberName_5_0= ruleValidID )
                            {
                            // InternalTqcl.g:1274:7: (lv_memberName_5_0= ruleValidID )
                            // InternalTqcl.g:1275:8: lv_memberName_5_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getXImportDeclarationAccess().getMemberNameValidIDParserRuleCall_1_0_3_1_0());
                              							
                            }
                            pushFollow(FOLLOW_29);
                            lv_memberName_5_0=ruleValidID();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getXImportDeclarationRule());
                              								}
                              								set(
                              									current,
                              									"memberName",
                              									lv_memberName_5_0,
                              									"org.eclipse.xtext.xbase.Xtype.ValidID");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTqcl.g:1295:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalTqcl.g:1295:4: ( ( ruleQualifiedName ) )
                    // InternalTqcl.g:1296:5: ( ruleQualifiedName )
                    {
                    // InternalTqcl.g:1296:5: ( ruleQualifiedName )
                    // InternalTqcl.g:1297:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_29);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalTqcl.g:1312:4: ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) )
                    {
                    // InternalTqcl.g:1312:4: ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) )
                    // InternalTqcl.g:1313:5: (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard )
                    {
                    // InternalTqcl.g:1313:5: (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard )
                    // InternalTqcl.g:1314:6: lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_29);
                    lv_importedNamespace_7_0=ruleQualifiedNameWithWildcard();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getXImportDeclarationRule());
                      						}
                      						set(
                      							current,
                      							"importedNamespace",
                      							lv_importedNamespace_7_0,
                      							"org.eclipse.xtext.xbase.Xtype.QualifiedNameWithWildcard");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalTqcl.g:1332:3: (otherlv_8= ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalTqcl.g:1333:4: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getXImportDeclarationAccess().getSemicolonKeyword_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXImportDeclaration"


    // $ANTLR start "entryRuleQualifiedNameInStaticImport"
    // InternalTqcl.g:1342:1: entryRuleQualifiedNameInStaticImport returns [String current=null] : iv_ruleQualifiedNameInStaticImport= ruleQualifiedNameInStaticImport EOF ;
    public final String entryRuleQualifiedNameInStaticImport() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameInStaticImport = null;


        try {
            // InternalTqcl.g:1342:67: (iv_ruleQualifiedNameInStaticImport= ruleQualifiedNameInStaticImport EOF )
            // InternalTqcl.g:1343:2: iv_ruleQualifiedNameInStaticImport= ruleQualifiedNameInStaticImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameInStaticImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameInStaticImport=ruleQualifiedNameInStaticImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameInStaticImport.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameInStaticImport"


    // $ANTLR start "ruleQualifiedNameInStaticImport"
    // InternalTqcl.g:1349:1: ruleQualifiedNameInStaticImport returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '.' )+ ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameInStaticImport() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;



        	enterRule();

        try {
            // InternalTqcl.g:1355:2: ( (this_ValidID_0= ruleValidID kw= '.' )+ )
            // InternalTqcl.g:1356:2: (this_ValidID_0= ruleValidID kw= '.' )+
            {
            // InternalTqcl.g:1356:2: (this_ValidID_0= ruleValidID kw= '.' )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    int LA25_2 = input.LA(2);

                    if ( (LA25_2==24) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // InternalTqcl.g:1357:3: this_ValidID_0= ruleValidID kw= '.'
            	    {
            	    if ( state.backtracking==0 ) {

            	      			newCompositeNode(grammarAccess.getQualifiedNameInStaticImportAccess().getValidIDParserRuleCall_0());
            	      		
            	    }
            	    pushFollow(FOLLOW_24);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_ValidID_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			afterParserOrEnumRuleCall();
            	      		
            	    }
            	    kw=(Token)match(input,24,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(kw);
            	      			newLeafNode(kw, grammarAccess.getQualifiedNameInStaticImportAccess().getFullStopKeyword_1());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameInStaticImport"

    // $ANTLR start synpred1_InternalTqcl
    public final void synpred1_InternalTqcl_fragment() throws RecognitionException {   
        // InternalTqcl.g:414:5: ( ( () ruleArrayBrackets ) )
        // InternalTqcl.g:414:6: ( () ruleArrayBrackets )
        {
        // InternalTqcl.g:414:6: ( () ruleArrayBrackets )
        // InternalTqcl.g:415:6: () ruleArrayBrackets
        {
        // InternalTqcl.g:415:6: ()
        // InternalTqcl.g:416:6: 
        {
        }

        pushFollow(FOLLOW_2);
        ruleArrayBrackets();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalTqcl

    // $ANTLR start synpred2_InternalTqcl
    public final void synpred2_InternalTqcl_fragment() throws RecognitionException {   
        // InternalTqcl.g:611:5: ( '<' )
        // InternalTqcl.g:611:6: '<'
        {
        match(input,22,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalTqcl

    // $ANTLR start synpred3_InternalTqcl
    public final void synpred3_InternalTqcl_fragment() throws RecognitionException {   
        // InternalTqcl.g:667:6: ( ( () '.' ) )
        // InternalTqcl.g:667:7: ( () '.' )
        {
        // InternalTqcl.g:667:7: ( () '.' )
        // InternalTqcl.g:668:7: () '.'
        {
        // InternalTqcl.g:668:7: ()
        // InternalTqcl.g:669:7: 
        {
        }

        match(input,24,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalTqcl

    // $ANTLR start synpred4_InternalTqcl
    public final void synpred4_InternalTqcl_fragment() throws RecognitionException {   
        // InternalTqcl.g:705:7: ( '<' )
        // InternalTqcl.g:705:8: '<'
        {
        match(input,22,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalTqcl

    // Delegated rules

    public final boolean synpred3_InternalTqcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalTqcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalTqcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalTqcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalTqcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalTqcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalTqcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalTqcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA23 dfa23 = new DFA23(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\2\uffff\1\4\3\uffff\1\4";
    static final String dfa_3s = "\1\5\1\uffff\1\30\1\5\2\uffff\1\30";
    static final String dfa_4s = "\1\37\1\uffff\1\41\1\35\2\uffff\1\41";
    static final String dfa_5s = "\1\uffff\1\1\2\uffff\1\2\1\3\1\uffff";
    static final String dfa_6s = "\7\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\31\uffff\1\1",
            "",
            "\1\3\10\uffff\1\4",
            "\1\6\27\uffff\1\5",
            "",
            "",
            "\1\3\10\uffff\1\4"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1211:3: ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004402L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000340020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000240020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002240020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001400002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000014000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000002L});

}