package hu.bme.mit.kk.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import hu.bme.mit.kk.dsl.services.LanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "':'", "'=='", "'||'", "'&&'", "'!'", "'('", "')'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g"; }



     	private LanguageGrammarAccess grammarAccess;
     	
        public InternalLanguageParser(TokenStream input, LanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected LanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_variables_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_variables_2_0= ruleVariable ) ) )* ( (lv_statements_3_0= ruleStatement ) )+ ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variables_0_0 = null;

        EObject lv_variables_2_0 = null;

        EObject lv_statements_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:79:28: ( ( ( (lv_variables_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_variables_2_0= ruleVariable ) ) )* ( (lv_statements_3_0= ruleStatement ) )+ ) )
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:80:1: ( ( (lv_variables_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_variables_2_0= ruleVariable ) ) )* ( (lv_statements_3_0= ruleStatement ) )+ )
            {
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:80:1: ( ( (lv_variables_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_variables_2_0= ruleVariable ) ) )* ( (lv_statements_3_0= ruleStatement ) )+ )
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:80:2: ( (lv_variables_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_variables_2_0= ruleVariable ) ) )* ( (lv_statements_3_0= ruleStatement ) )+
            {
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:80:2: ( (lv_variables_0_0= ruleVariable ) )
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:81:1: (lv_variables_0_0= ruleVariable )
            {
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:81:1: (lv_variables_0_0= ruleVariable )
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:82:3: lv_variables_0_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getVariablesVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleModel131);
            lv_variables_0_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		add(
                   			current, 
                   			"variables",
                    		lv_variables_0_0, 
                    		"Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:98:2: (otherlv_1= ',' ( (lv_variables_2_0= ruleVariable ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:98:4: otherlv_1= ',' ( (lv_variables_2_0= ruleVariable ) )
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleModel144); 

            	        	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getCommaKeyword_1_0());
            	        
            	    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:102:1: ( (lv_variables_2_0= ruleVariable ) )
            	    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:103:1: (lv_variables_2_0= ruleVariable )
            	    {
            	    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:103:1: (lv_variables_2_0= ruleVariable )
            	    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:104:3: lv_variables_2_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getVariablesVariableParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleModel165);
            	    lv_variables_2_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_2_0, 
            	            		"Variable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:120:4: ( (lv_statements_3_0= ruleStatement ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:121:1: (lv_statements_3_0= ruleStatement )
            	    {
            	    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:121:1: (lv_statements_3_0= ruleStatement )
            	    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:122:3: lv_statements_3_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleModel188);
            	    lv_statements_3_0=ruleStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"statements",
            	            		lv_statements_3_0, 
            	            		"Statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleVariable"
    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:146:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:147:2: (iv_ruleVariable= ruleVariable EOF )
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:148:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable225);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable235); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:155:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:158:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:159:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:159:1: ( (lv_name_0_0= RULE_ID ) )
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:160:1: (lv_name_0_0= RULE_ID )
            {
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:160:1: (lv_name_0_0= RULE_ID )
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:161:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable276); 

            			newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleStatement"
    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:185:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:186:2: (iv_ruleStatement= ruleStatement EOF )
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:187:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement316);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement326); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:194:1: ruleStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:197:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:198:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:198:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleExpression ) ) )
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:198:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:198:2: ( (otherlv_0= RULE_ID ) )
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:199:1: (otherlv_0= RULE_ID )
            {
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:199:1: (otherlv_0= RULE_ID )
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:200:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStatementRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatement371); 

            		newLeafNode(otherlv_0, grammarAccess.getStatementAccess().getVariableVariableCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleStatement383); 

                	newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getColonKeyword_1());
                
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:215:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:216:1: (lv_expression_2_0= ruleExpression )
            {
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:216:1: (lv_expression_2_0= ruleExpression )
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:217:3: lv_expression_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleStatement404);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStatementRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_2_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleExpression"
    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:241:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:242:2: (iv_ruleExpression= ruleExpression EOF )
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:243:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression440);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression450); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:250:1: ruleExpression returns [EObject current=null] : this_Iff_0= ruleIff ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Iff_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:253:28: (this_Iff_0= ruleIff )
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:255:5: this_Iff_0= ruleIff
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getIffParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleIff_in_ruleExpression496);
            this_Iff_0=ruleIff();

            state._fsp--;

             
                    current = this_Iff_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleIff"
    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:271:1: entryRuleIff returns [EObject current=null] : iv_ruleIff= ruleIff EOF ;
    public final EObject entryRuleIff() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIff = null;


        try {
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:272:2: (iv_ruleIff= ruleIff EOF )
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:273:2: iv_ruleIff= ruleIff EOF
            {
             newCompositeNode(grammarAccess.getIffRule()); 
            pushFollow(FOLLOW_ruleIff_in_entryRuleIff530);
            iv_ruleIff=ruleIff();

            state._fsp--;

             current =iv_ruleIff; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIff540); 

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
    // $ANTLR end "entryRuleIff"


    // $ANTLR start "ruleIff"
    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:280:1: ruleIff returns [EObject current=null] : (this_Or_0= ruleOr ( () otherlv_2= '==' ( (lv_right_3_0= ruleOr ) ) )? ) ;
    public final EObject ruleIff() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Or_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:283:28: ( (this_Or_0= ruleOr ( () otherlv_2= '==' ( (lv_right_3_0= ruleOr ) ) )? ) )
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:284:1: (this_Or_0= ruleOr ( () otherlv_2= '==' ( (lv_right_3_0= ruleOr ) ) )? )
            {
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:284:1: (this_Or_0= ruleOr ( () otherlv_2= '==' ( (lv_right_3_0= ruleOr ) ) )? )
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:285:5: this_Or_0= ruleOr ( () otherlv_2= '==' ( (lv_right_3_0= ruleOr ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getIffAccess().getOrParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleOr_in_ruleIff587);
            this_Or_0=ruleOr();

            state._fsp--;

             
                    current = this_Or_0; 
                    afterParserOrEnumRuleCall();
                
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:293:1: ( () otherlv_2= '==' ( (lv_right_3_0= ruleOr ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:293:2: () otherlv_2= '==' ( (lv_right_3_0= ruleOr ) )
                    {
                    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:293:2: ()
                    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:294:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getIffAccess().getIffLeftAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleIff608); 

                        	newLeafNode(otherlv_2, grammarAccess.getIffAccess().getEqualsSignEqualsSignKeyword_1_1());
                        
                    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:303:1: ( (lv_right_3_0= ruleOr ) )
                    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:304:1: (lv_right_3_0= ruleOr )
                    {
                    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:304:1: (lv_right_3_0= ruleOr )
                    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:305:3: lv_right_3_0= ruleOr
                    {
                     
                    	        newCompositeNode(grammarAccess.getIffAccess().getRightOrParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOr_in_ruleIff629);
                    lv_right_3_0=ruleOr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIffRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"Or");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIff"


    // $ANTLR start "entryRuleOr"
    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:329:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:330:2: (iv_ruleOr= ruleOr EOF )
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:331:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr667);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr677); 

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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:338:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:341:28: ( (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:342:1: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:342:1: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:343:5: this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAnd_in_ruleOr724);
            this_And_0=ruleAnd();

            state._fsp--;

             
                    current = this_And_0; 
                    afterParserOrEnumRuleCall();
                
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:351:1: ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:351:2: () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:351:2: ()
            	    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:352:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleOr745); 

            	        	newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	        
            	    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:361:1: ( (lv_right_3_0= ruleAnd ) )
            	    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:362:1: (lv_right_3_0= ruleAnd )
            	    {
            	    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:362:1: (lv_right_3_0= ruleAnd )
            	    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:363:3: lv_right_3_0= ruleAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnd_in_ruleOr766);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"And");
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


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:387:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:388:2: (iv_ruleAnd= ruleAnd EOF )
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:389:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd804);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd814); 

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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:396:1: ruleAnd returns [EObject current=null] : (this_Negation_0= ruleNegation ( () otherlv_2= '&&' ( (lv_right_3_0= ruleNegation ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Negation_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:399:28: ( (this_Negation_0= ruleNegation ( () otherlv_2= '&&' ( (lv_right_3_0= ruleNegation ) ) )* ) )
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:400:1: (this_Negation_0= ruleNegation ( () otherlv_2= '&&' ( (lv_right_3_0= ruleNegation ) ) )* )
            {
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:400:1: (this_Negation_0= ruleNegation ( () otherlv_2= '&&' ( (lv_right_3_0= ruleNegation ) ) )* )
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:401:5: this_Negation_0= ruleNegation ( () otherlv_2= '&&' ( (lv_right_3_0= ruleNegation ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndAccess().getNegationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleNegation_in_ruleAnd861);
            this_Negation_0=ruleNegation();

            state._fsp--;

             
                    current = this_Negation_0; 
                    afterParserOrEnumRuleCall();
                
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:409:1: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleNegation ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:409:2: () otherlv_2= '&&' ( (lv_right_3_0= ruleNegation ) )
            	    {
            	    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:409:2: ()
            	    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:410:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleAnd882); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	        
            	    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:419:1: ( (lv_right_3_0= ruleNegation ) )
            	    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:420:1: (lv_right_3_0= ruleNegation )
            	    {
            	    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:420:1: (lv_right_3_0= ruleNegation )
            	    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:421:3: lv_right_3_0= ruleNegation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndAccess().getRightNegationParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNegation_in_ruleAnd903);
            	    lv_right_3_0=ruleNegation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Negation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleNegation"
    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:445:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:446:2: (iv_ruleNegation= ruleNegation EOF )
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:447:2: iv_ruleNegation= ruleNegation EOF
            {
             newCompositeNode(grammarAccess.getNegationRule()); 
            pushFollow(FOLLOW_ruleNegation_in_entryRuleNegation941);
            iv_ruleNegation=ruleNegation();

            state._fsp--;

             current =iv_ruleNegation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegation951); 

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
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:454:1: ruleNegation returns [EObject current=null] : ( (otherlv_0= '!' () ( (lv_value_2_0= rulePrimary ) ) ) | this_Primary_3= rulePrimary ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_2_0 = null;

        EObject this_Primary_3 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:457:28: ( ( (otherlv_0= '!' () ( (lv_value_2_0= rulePrimary ) ) ) | this_Primary_3= rulePrimary ) )
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:458:1: ( (otherlv_0= '!' () ( (lv_value_2_0= rulePrimary ) ) ) | this_Primary_3= rulePrimary )
            {
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:458:1: ( (otherlv_0= '!' () ( (lv_value_2_0= rulePrimary ) ) ) | this_Primary_3= rulePrimary )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID||LA6_0==17) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:458:2: (otherlv_0= '!' () ( (lv_value_2_0= rulePrimary ) ) )
                    {
                    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:458:2: (otherlv_0= '!' () ( (lv_value_2_0= rulePrimary ) ) )
                    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:458:4: otherlv_0= '!' () ( (lv_value_2_0= rulePrimary ) )
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleNegation989); 

                        	newLeafNode(otherlv_0, grammarAccess.getNegationAccess().getExclamationMarkKeyword_0_0());
                        
                    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:462:1: ()
                    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:463:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getNegationAccess().getNegationAction_0_1(),
                                current);
                        

                    }

                    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:468:2: ( (lv_value_2_0= rulePrimary ) )
                    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:469:1: (lv_value_2_0= rulePrimary )
                    {
                    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:469:1: (lv_value_2_0= rulePrimary )
                    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:470:3: lv_value_2_0= rulePrimary
                    {
                     
                    	        newCompositeNode(grammarAccess.getNegationAccess().getValuePrimaryParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimary_in_ruleNegation1019);
                    lv_value_2_0=rulePrimary();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNegationRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"Primary");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:488:5: this_Primary_3= rulePrimary
                    {
                     
                            newCompositeNode(grammarAccess.getNegationAccess().getPrimaryParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePrimary_in_ruleNegation1048);
                    this_Primary_3=rulePrimary();

                    state._fsp--;

                     
                            current = this_Primary_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNegation"


    // $ANTLR start "entryRulePrimary"
    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:504:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:505:2: (iv_rulePrimary= rulePrimary EOF )
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:506:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary1083);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary1093); 

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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:513:1: rulePrimary returns [EObject current=null] : (this_VariableReference_0= ruleVariableReference | (otherlv_1= '(' this_Or_2= ruleOr otherlv_3= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_VariableReference_0 = null;

        EObject this_Or_2 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:516:28: ( (this_VariableReference_0= ruleVariableReference | (otherlv_1= '(' this_Or_2= ruleOr otherlv_3= ')' ) ) )
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:517:1: (this_VariableReference_0= ruleVariableReference | (otherlv_1= '(' this_Or_2= ruleOr otherlv_3= ')' ) )
            {
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:517:1: (this_VariableReference_0= ruleVariableReference | (otherlv_1= '(' this_Or_2= ruleOr otherlv_3= ')' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==17) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:518:5: this_VariableReference_0= ruleVariableReference
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getVariableReferenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleVariableReference_in_rulePrimary1140);
                    this_VariableReference_0=ruleVariableReference();

                    state._fsp--;

                     
                            current = this_VariableReference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:527:6: (otherlv_1= '(' this_Or_2= ruleOr otherlv_3= ')' )
                    {
                    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:527:6: (otherlv_1= '(' this_Or_2= ruleOr otherlv_3= ')' )
                    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:527:8: otherlv_1= '(' this_Or_2= ruleOr otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_17_in_rulePrimary1158); 

                        	newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getOrParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleOr_in_rulePrimary1180);
                    this_Or_2=ruleOr();

                    state._fsp--;

                     
                            current = this_Or_2; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_rulePrimary1191); 

                        	newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleVariableReference"
    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:552:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:553:2: (iv_ruleVariableReference= ruleVariableReference EOF )
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:554:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
             newCompositeNode(grammarAccess.getVariableReferenceRule()); 
            pushFollow(FOLLOW_ruleVariableReference_in_entryRuleVariableReference1228);
            iv_ruleVariableReference=ruleVariableReference();

            state._fsp--;

             current =iv_ruleVariableReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableReference1238); 

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
    // $ANTLR end "entryRuleVariableReference"


    // $ANTLR start "ruleVariableReference"
    // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:561:1: ruleVariableReference returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:564:28: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:565:1: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:565:1: ( () ( (otherlv_1= RULE_ID ) ) )
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:565:2: () ( (otherlv_1= RULE_ID ) )
            {
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:565:2: ()
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:566:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableReferenceAccess().getVariableReferenceAction_0(),
                        current);
                

            }

            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:571:2: ( (otherlv_1= RULE_ID ) )
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:572:1: (otherlv_1= RULE_ID )
            {
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:572:1: (otherlv_1= RULE_ID )
            // ../hu.bme.mit.kk.dsl/src-gen/hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.g:573:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableReferenceRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableReference1292); 

            		newLeafNode(otherlv_1, grammarAccess.getVariableReferenceAccess().getValueVariableCrossReference_1_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableReference"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleModel131 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_11_in_ruleModel144 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleModel165 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleModel188 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatement371 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStatement383 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStatement404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIff_in_ruleExpression496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIff_in_entryRuleIff530 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIff540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleIff587 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleIff608 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_ruleOr_in_ruleIff629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr724 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleOr745 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr766 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_ruleAnd861 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleAnd882 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_ruleNegation_in_ruleAnd903 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleNegation_in_entryRuleNegation941 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegation951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleNegation989 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleNegation1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleNegation1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary1083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_rulePrimary1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulePrimary1158 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_ruleOr_in_rulePrimary1180 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePrimary1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference1228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableReference1292 = new BitSet(new long[]{0x0000000000000002L});

}