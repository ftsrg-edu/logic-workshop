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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "'and'", "'are on the island.'", "'says that'", "'.'", "'if and only if'", "'or'", "'but'", "'it is not true that'", "'('", "')'", "'is a knight'", "'is a knave'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLanguage.g"; }



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
    // InternalLanguage.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalLanguage.g:68:2: (iv_ruleModel= ruleModel EOF )
            // InternalLanguage.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLanguage.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_people_0_0= rulePerson ) ) ( (otherlv_1= ',' ( (lv_people_2_0= rulePerson ) ) )* otherlv_3= 'and' ( (lv_people_4_0= rulePerson ) ) ) otherlv_5= 'are on the island.' ( (lv_statements_6_0= ruleStatement ) )+ ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_people_0_0 = null;

        EObject lv_people_2_0 = null;

        EObject lv_people_4_0 = null;

        EObject lv_statements_6_0 = null;


         enterRule(); 
            
        try {
            // InternalLanguage.g:79:28: ( ( ( (lv_people_0_0= rulePerson ) ) ( (otherlv_1= ',' ( (lv_people_2_0= rulePerson ) ) )* otherlv_3= 'and' ( (lv_people_4_0= rulePerson ) ) ) otherlv_5= 'are on the island.' ( (lv_statements_6_0= ruleStatement ) )+ ) )
            // InternalLanguage.g:80:1: ( ( (lv_people_0_0= rulePerson ) ) ( (otherlv_1= ',' ( (lv_people_2_0= rulePerson ) ) )* otherlv_3= 'and' ( (lv_people_4_0= rulePerson ) ) ) otherlv_5= 'are on the island.' ( (lv_statements_6_0= ruleStatement ) )+ )
            {
            // InternalLanguage.g:80:1: ( ( (lv_people_0_0= rulePerson ) ) ( (otherlv_1= ',' ( (lv_people_2_0= rulePerson ) ) )* otherlv_3= 'and' ( (lv_people_4_0= rulePerson ) ) ) otherlv_5= 'are on the island.' ( (lv_statements_6_0= ruleStatement ) )+ )
            // InternalLanguage.g:80:2: ( (lv_people_0_0= rulePerson ) ) ( (otherlv_1= ',' ( (lv_people_2_0= rulePerson ) ) )* otherlv_3= 'and' ( (lv_people_4_0= rulePerson ) ) ) otherlv_5= 'are on the island.' ( (lv_statements_6_0= ruleStatement ) )+
            {
            // InternalLanguage.g:80:2: ( (lv_people_0_0= rulePerson ) )
            // InternalLanguage.g:81:1: (lv_people_0_0= rulePerson )
            {
            // InternalLanguage.g:81:1: (lv_people_0_0= rulePerson )
            // InternalLanguage.g:82:3: lv_people_0_0= rulePerson
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getPeoplePersonParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_3);
            lv_people_0_0=rulePerson();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		add(
                   			current, 
                   			"people",
                    		lv_people_0_0, 
                    		"hu.bme.mit.kk.dsl.Language.Person");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalLanguage.g:98:2: ( (otherlv_1= ',' ( (lv_people_2_0= rulePerson ) ) )* otherlv_3= 'and' ( (lv_people_4_0= rulePerson ) ) )
            // InternalLanguage.g:98:3: (otherlv_1= ',' ( (lv_people_2_0= rulePerson ) ) )* otherlv_3= 'and' ( (lv_people_4_0= rulePerson ) )
            {
            // InternalLanguage.g:98:3: (otherlv_1= ',' ( (lv_people_2_0= rulePerson ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLanguage.g:98:5: otherlv_1= ',' ( (lv_people_2_0= rulePerson ) )
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_4); 

            	        	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getCommaKeyword_1_0_0());
            	        
            	    // InternalLanguage.g:102:1: ( (lv_people_2_0= rulePerson ) )
            	    // InternalLanguage.g:103:1: (lv_people_2_0= rulePerson )
            	    {
            	    // InternalLanguage.g:103:1: (lv_people_2_0= rulePerson )
            	    // InternalLanguage.g:104:3: lv_people_2_0= rulePerson
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getPeoplePersonParserRuleCall_1_0_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_3);
            	    lv_people_2_0=rulePerson();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"people",
            	            		lv_people_2_0, 
            	            		"hu.bme.mit.kk.dsl.Language.Person");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,12,FOLLOW_4); 

                	newLeafNode(otherlv_3, grammarAccess.getModelAccess().getAndKeyword_1_1());
                
            // InternalLanguage.g:124:1: ( (lv_people_4_0= rulePerson ) )
            // InternalLanguage.g:125:1: (lv_people_4_0= rulePerson )
            {
            // InternalLanguage.g:125:1: (lv_people_4_0= rulePerson )
            // InternalLanguage.g:126:3: lv_people_4_0= rulePerson
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getPeoplePersonParserRuleCall_1_2_0()); 
            	    
            pushFollow(FOLLOW_5);
            lv_people_4_0=rulePerson();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		add(
                   			current, 
                   			"people",
                    		lv_people_4_0, 
                    		"hu.bme.mit.kk.dsl.Language.Person");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_4); 

                	newLeafNode(otherlv_5, grammarAccess.getModelAccess().getAreOnTheIslandKeyword_2());
                
            // InternalLanguage.g:146:1: ( (lv_statements_6_0= ruleStatement ) )+
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
            	    // InternalLanguage.g:147:1: (lv_statements_6_0= ruleStatement )
            	    {
            	    // InternalLanguage.g:147:1: (lv_statements_6_0= ruleStatement )
            	    // InternalLanguage.g:148:3: lv_statements_6_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_6);
            	    lv_statements_6_0=ruleStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"statements",
            	            		lv_statements_6_0, 
            	            		"hu.bme.mit.kk.dsl.Language.Statement");
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


    // $ANTLR start "entryRulePerson"
    // InternalLanguage.g:172:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalLanguage.g:173:2: (iv_rulePerson= rulePerson EOF )
            // InternalLanguage.g:174:2: iv_rulePerson= rulePerson EOF
            {
             newCompositeNode(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerson=rulePerson();

            state._fsp--;

             current =iv_rulePerson; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalLanguage.g:181:1: rulePerson returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // InternalLanguage.g:184:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalLanguage.g:185:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalLanguage.g:185:1: ( (lv_name_0_0= RULE_ID ) )
            // InternalLanguage.g:186:1: (lv_name_0_0= RULE_ID )
            {
            // InternalLanguage.g:186:1: (lv_name_0_0= RULE_ID )
            // InternalLanguage.g:187:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            			newLeafNode(lv_name_0_0, grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPersonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

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
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleStatement"
    // InternalLanguage.g:211:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalLanguage.g:212:2: (iv_ruleStatement= ruleStatement EOF )
            // InternalLanguage.g:213:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLanguage.g:220:1: ruleStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'says that' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= '.' ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // InternalLanguage.g:223:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'says that' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= '.' ) )
            // InternalLanguage.g:224:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'says that' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= '.' )
            {
            // InternalLanguage.g:224:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'says that' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= '.' )
            // InternalLanguage.g:224:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'says that' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= '.'
            {
            // InternalLanguage.g:224:2: ( (otherlv_0= RULE_ID ) )
            // InternalLanguage.g:225:1: (otherlv_0= RULE_ID )
            {
            // InternalLanguage.g:225:1: (otherlv_0= RULE_ID )
            // InternalLanguage.g:226:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStatementRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            		newLeafNode(otherlv_0, grammarAccess.getStatementAccess().getPersonPersonCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_8); 

                	newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getSaysThatKeyword_1());
                
            // InternalLanguage.g:241:1: ( (lv_expression_2_0= ruleExpression ) )
            // InternalLanguage.g:242:1: (lv_expression_2_0= ruleExpression )
            {
            // InternalLanguage.g:242:1: (lv_expression_2_0= ruleExpression )
            // InternalLanguage.g:243:3: lv_expression_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_9);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStatementRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_2_0, 
                    		"hu.bme.mit.kk.dsl.Language.Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getStatementAccess().getFullStopKeyword_3());
                

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
    // InternalLanguage.g:271:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalLanguage.g:272:2: (iv_ruleExpression= ruleExpression EOF )
            // InternalLanguage.g:273:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLanguage.g:280:1: ruleExpression returns [EObject current=null] : this_Iff_0= ruleIff ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Iff_0 = null;


         enterRule(); 
            
        try {
            // InternalLanguage.g:283:28: (this_Iff_0= ruleIff )
            // InternalLanguage.g:285:5: this_Iff_0= ruleIff
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getIffParserRuleCall()); 
                
            pushFollow(FOLLOW_2);
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
    // InternalLanguage.g:301:1: entryRuleIff returns [EObject current=null] : iv_ruleIff= ruleIff EOF ;
    public final EObject entryRuleIff() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIff = null;


        try {
            // InternalLanguage.g:302:2: (iv_ruleIff= ruleIff EOF )
            // InternalLanguage.g:303:2: iv_ruleIff= ruleIff EOF
            {
             newCompositeNode(grammarAccess.getIffRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIff=ruleIff();

            state._fsp--;

             current =iv_ruleIff; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLanguage.g:310:1: ruleIff returns [EObject current=null] : (this_Or_0= ruleOr ( () otherlv_2= 'if and only if' ( (lv_right_3_0= ruleOr ) ) )? ) ;
    public final EObject ruleIff() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Or_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalLanguage.g:313:28: ( (this_Or_0= ruleOr ( () otherlv_2= 'if and only if' ( (lv_right_3_0= ruleOr ) ) )? ) )
            // InternalLanguage.g:314:1: (this_Or_0= ruleOr ( () otherlv_2= 'if and only if' ( (lv_right_3_0= ruleOr ) ) )? )
            {
            // InternalLanguage.g:314:1: (this_Or_0= ruleOr ( () otherlv_2= 'if and only if' ( (lv_right_3_0= ruleOr ) ) )? )
            // InternalLanguage.g:315:5: this_Or_0= ruleOr ( () otherlv_2= 'if and only if' ( (lv_right_3_0= ruleOr ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getIffAccess().getOrParserRuleCall_0()); 
                
            pushFollow(FOLLOW_10);
            this_Or_0=ruleOr();

            state._fsp--;

             
                    current = this_Or_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalLanguage.g:323:1: ( () otherlv_2= 'if and only if' ( (lv_right_3_0= ruleOr ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalLanguage.g:323:2: () otherlv_2= 'if and only if' ( (lv_right_3_0= ruleOr ) )
                    {
                    // InternalLanguage.g:323:2: ()
                    // InternalLanguage.g:324:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getIffAccess().getIffLeftAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,16,FOLLOW_8); 

                        	newLeafNode(otherlv_2, grammarAccess.getIffAccess().getIfAndOnlyIfKeyword_1_1());
                        
                    // InternalLanguage.g:333:1: ( (lv_right_3_0= ruleOr ) )
                    // InternalLanguage.g:334:1: (lv_right_3_0= ruleOr )
                    {
                    // InternalLanguage.g:334:1: (lv_right_3_0= ruleOr )
                    // InternalLanguage.g:335:3: lv_right_3_0= ruleOr
                    {
                     
                    	        newCompositeNode(grammarAccess.getIffAccess().getRightOrParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleOr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIffRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"hu.bme.mit.kk.dsl.Language.Or");
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
    // InternalLanguage.g:359:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalLanguage.g:360:2: (iv_ruleOr= ruleOr EOF )
            // InternalLanguage.g:361:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLanguage.g:368:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalLanguage.g:371:28: ( (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalLanguage.g:372:1: (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalLanguage.g:372:1: (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalLanguage.g:373:5: this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
                
            pushFollow(FOLLOW_11);
            this_And_0=ruleAnd();

            state._fsp--;

             
                    current = this_And_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalLanguage.g:381:1: ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLanguage.g:381:2: () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalLanguage.g:381:2: ()
            	    // InternalLanguage.g:382:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,17,FOLLOW_8); 

            	        	newLeafNode(otherlv_2, grammarAccess.getOrAccess().getOrKeyword_1_1());
            	        
            	    // InternalLanguage.g:391:1: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalLanguage.g:392:1: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalLanguage.g:392:1: (lv_right_3_0= ruleAnd )
            	    // InternalLanguage.g:393:3: lv_right_3_0= ruleAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_11);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"hu.bme.mit.kk.dsl.Language.And");
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
    // InternalLanguage.g:417:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalLanguage.g:418:2: (iv_ruleAnd= ruleAnd EOF )
            // InternalLanguage.g:419:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLanguage.g:426:1: ruleAnd returns [EObject current=null] : (this_Negationable_0= ruleNegationable ( () otherlv_2= 'and' ( (lv_right_3_0= ruleNegationable ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Negationable_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalLanguage.g:429:28: ( (this_Negationable_0= ruleNegationable ( () otherlv_2= 'and' ( (lv_right_3_0= ruleNegationable ) ) )* ) )
            // InternalLanguage.g:430:1: (this_Negationable_0= ruleNegationable ( () otherlv_2= 'and' ( (lv_right_3_0= ruleNegationable ) ) )* )
            {
            // InternalLanguage.g:430:1: (this_Negationable_0= ruleNegationable ( () otherlv_2= 'and' ( (lv_right_3_0= ruleNegationable ) ) )* )
            // InternalLanguage.g:431:5: this_Negationable_0= ruleNegationable ( () otherlv_2= 'and' ( (lv_right_3_0= ruleNegationable ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndAccess().getNegationableParserRuleCall_0()); 
                
            pushFollow(FOLLOW_12);
            this_Negationable_0=ruleNegationable();

            state._fsp--;

             
                    current = this_Negationable_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalLanguage.g:439:1: ( () otherlv_2= 'and' ( (lv_right_3_0= ruleNegationable ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==12) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLanguage.g:439:2: () otherlv_2= 'and' ( (lv_right_3_0= ruleNegationable ) )
            	    {
            	    // InternalLanguage.g:439:2: ()
            	    // InternalLanguage.g:440:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,12,FOLLOW_8); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAndKeyword_1_1());
            	        
            	    // InternalLanguage.g:449:1: ( (lv_right_3_0= ruleNegationable ) )
            	    // InternalLanguage.g:450:1: (lv_right_3_0= ruleNegationable )
            	    {
            	    // InternalLanguage.g:450:1: (lv_right_3_0= ruleNegationable )
            	    // InternalLanguage.g:451:3: lv_right_3_0= ruleNegationable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndAccess().getRightNegationableParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_12);
            	    lv_right_3_0=ruleNegationable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"hu.bme.mit.kk.dsl.Language.Negationable");
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


    // $ANTLR start "entryRuleNegationable"
    // InternalLanguage.g:475:1: entryRuleNegationable returns [EObject current=null] : iv_ruleNegationable= ruleNegationable EOF ;
    public final EObject entryRuleNegationable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegationable = null;


        try {
            // InternalLanguage.g:476:2: (iv_ruleNegationable= ruleNegationable EOF )
            // InternalLanguage.g:477:2: iv_ruleNegationable= ruleNegationable EOF
            {
             newCompositeNode(grammarAccess.getNegationableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNegationable=ruleNegationable();

            state._fsp--;

             current =iv_ruleNegationable; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNegationable"


    // $ANTLR start "ruleNegationable"
    // InternalLanguage.g:484:1: ruleNegationable returns [EObject current=null] : ( (otherlv_0= 'but' )? ( (otherlv_1= 'it is not true that' () ( (lv_value_3_0= rulePrimary ) ) ) | this_KnaveReference_4= ruleKnaveReference | this_Primary_5= rulePrimary ) ) ;
    public final EObject ruleNegationable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_3_0 = null;

        EObject this_KnaveReference_4 = null;

        EObject this_Primary_5 = null;


         enterRule(); 
            
        try {
            // InternalLanguage.g:487:28: ( ( (otherlv_0= 'but' )? ( (otherlv_1= 'it is not true that' () ( (lv_value_3_0= rulePrimary ) ) ) | this_KnaveReference_4= ruleKnaveReference | this_Primary_5= rulePrimary ) ) )
            // InternalLanguage.g:488:1: ( (otherlv_0= 'but' )? ( (otherlv_1= 'it is not true that' () ( (lv_value_3_0= rulePrimary ) ) ) | this_KnaveReference_4= ruleKnaveReference | this_Primary_5= rulePrimary ) )
            {
            // InternalLanguage.g:488:1: ( (otherlv_0= 'but' )? ( (otherlv_1= 'it is not true that' () ( (lv_value_3_0= rulePrimary ) ) ) | this_KnaveReference_4= ruleKnaveReference | this_Primary_5= rulePrimary ) )
            // InternalLanguage.g:488:2: (otherlv_0= 'but' )? ( (otherlv_1= 'it is not true that' () ( (lv_value_3_0= rulePrimary ) ) ) | this_KnaveReference_4= ruleKnaveReference | this_Primary_5= rulePrimary )
            {
            // InternalLanguage.g:488:2: (otherlv_0= 'but' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalLanguage.g:488:4: otherlv_0= 'but'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_8); 

                        	newLeafNode(otherlv_0, grammarAccess.getNegationableAccess().getButKeyword_0());
                        

                    }
                    break;

            }

            // InternalLanguage.g:492:3: ( (otherlv_1= 'it is not true that' () ( (lv_value_3_0= rulePrimary ) ) ) | this_KnaveReference_4= ruleKnaveReference | this_Primary_5= rulePrimary )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt7=1;
                }
                break;
            case RULE_ID:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==23) ) {
                    alt7=2;
                }
                else if ( (LA7_2==22) ) {
                    alt7=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalLanguage.g:492:4: (otherlv_1= 'it is not true that' () ( (lv_value_3_0= rulePrimary ) ) )
                    {
                    // InternalLanguage.g:492:4: (otherlv_1= 'it is not true that' () ( (lv_value_3_0= rulePrimary ) ) )
                    // InternalLanguage.g:492:6: otherlv_1= 'it is not true that' () ( (lv_value_3_0= rulePrimary ) )
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_8); 

                        	newLeafNode(otherlv_1, grammarAccess.getNegationableAccess().getItIsNotTrueThatKeyword_1_0_0());
                        
                    // InternalLanguage.g:496:1: ()
                    // InternalLanguage.g:497:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getNegationableAccess().getNegationableAction_1_0_1(),
                                current);
                        

                    }

                    // InternalLanguage.g:502:2: ( (lv_value_3_0= rulePrimary ) )
                    // InternalLanguage.g:503:1: (lv_value_3_0= rulePrimary )
                    {
                    // InternalLanguage.g:503:1: (lv_value_3_0= rulePrimary )
                    // InternalLanguage.g:504:3: lv_value_3_0= rulePrimary
                    {
                     
                    	        newCompositeNode(grammarAccess.getNegationableAccess().getValuePrimaryParserRuleCall_1_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=rulePrimary();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNegationableRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"hu.bme.mit.kk.dsl.Language.Primary");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLanguage.g:522:5: this_KnaveReference_4= ruleKnaveReference
                    {
                     
                            newCompositeNode(grammarAccess.getNegationableAccess().getKnaveReferenceParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_KnaveReference_4=ruleKnaveReference();

                    state._fsp--;

                     
                            current = this_KnaveReference_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalLanguage.g:532:5: this_Primary_5= rulePrimary
                    {
                     
                            newCompositeNode(grammarAccess.getNegationableAccess().getPrimaryParserRuleCall_1_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Primary_5=rulePrimary();

                    state._fsp--;

                     
                            current = this_Primary_5; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleNegationable"


    // $ANTLR start "entryRulePrimary"
    // InternalLanguage.g:548:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalLanguage.g:549:2: (iv_rulePrimary= rulePrimary EOF )
            // InternalLanguage.g:550:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLanguage.g:557:1: rulePrimary returns [EObject current=null] : (this_KnightReference_0= ruleKnightReference | (otherlv_1= '(' this_Iff_2= ruleIff otherlv_3= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_KnightReference_0 = null;

        EObject this_Iff_2 = null;


         enterRule(); 
            
        try {
            // InternalLanguage.g:560:28: ( (this_KnightReference_0= ruleKnightReference | (otherlv_1= '(' this_Iff_2= ruleIff otherlv_3= ')' ) ) )
            // InternalLanguage.g:561:1: (this_KnightReference_0= ruleKnightReference | (otherlv_1= '(' this_Iff_2= ruleIff otherlv_3= ')' ) )
            {
            // InternalLanguage.g:561:1: (this_KnightReference_0= ruleKnightReference | (otherlv_1= '(' this_Iff_2= ruleIff otherlv_3= ')' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalLanguage.g:562:5: this_KnightReference_0= ruleKnightReference
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getKnightReferenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_KnightReference_0=ruleKnightReference();

                    state._fsp--;

                     
                            current = this_KnightReference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalLanguage.g:571:6: (otherlv_1= '(' this_Iff_2= ruleIff otherlv_3= ')' )
                    {
                    // InternalLanguage.g:571:6: (otherlv_1= '(' this_Iff_2= ruleIff otherlv_3= ')' )
                    // InternalLanguage.g:571:8: otherlv_1= '(' this_Iff_2= ruleIff otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_8); 

                        	newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getIffParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_13);
                    this_Iff_2=ruleIff();

                    state._fsp--;

                     
                            current = this_Iff_2; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_3=(Token)match(input,21,FOLLOW_2); 

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


    // $ANTLR start "entryRuleKnightReference"
    // InternalLanguage.g:596:1: entryRuleKnightReference returns [EObject current=null] : iv_ruleKnightReference= ruleKnightReference EOF ;
    public final EObject entryRuleKnightReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKnightReference = null;


        try {
            // InternalLanguage.g:597:2: (iv_ruleKnightReference= ruleKnightReference EOF )
            // InternalLanguage.g:598:2: iv_ruleKnightReference= ruleKnightReference EOF
            {
             newCompositeNode(grammarAccess.getKnightReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKnightReference=ruleKnightReference();

            state._fsp--;

             current =iv_ruleKnightReference; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleKnightReference"


    // $ANTLR start "ruleKnightReference"
    // InternalLanguage.g:605:1: ruleKnightReference returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is a knight' ) ;
    public final EObject ruleKnightReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalLanguage.g:608:28: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is a knight' ) )
            // InternalLanguage.g:609:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is a knight' )
            {
            // InternalLanguage.g:609:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is a knight' )
            // InternalLanguage.g:609:2: () ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is a knight'
            {
            // InternalLanguage.g:609:2: ()
            // InternalLanguage.g:610:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getKnightReferenceAccess().getKnightReferenceAction_0(),
                        current);
                

            }

            // InternalLanguage.g:615:2: ( (otherlv_1= RULE_ID ) )
            // InternalLanguage.g:616:1: (otherlv_1= RULE_ID )
            {
            // InternalLanguage.g:616:1: (otherlv_1= RULE_ID )
            // InternalLanguage.g:617:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getKnightReferenceRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_14); 

            		newLeafNode(otherlv_1, grammarAccess.getKnightReferenceAccess().getPersonPersonCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_2); 

                	newLeafNode(otherlv_2, grammarAccess.getKnightReferenceAccess().getIsAKnightKeyword_2());
                

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
    // $ANTLR end "ruleKnightReference"


    // $ANTLR start "entryRuleKnaveReference"
    // InternalLanguage.g:640:1: entryRuleKnaveReference returns [EObject current=null] : iv_ruleKnaveReference= ruleKnaveReference EOF ;
    public final EObject entryRuleKnaveReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKnaveReference = null;


        try {
            // InternalLanguage.g:641:2: (iv_ruleKnaveReference= ruleKnaveReference EOF )
            // InternalLanguage.g:642:2: iv_ruleKnaveReference= ruleKnaveReference EOF
            {
             newCompositeNode(grammarAccess.getKnaveReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKnaveReference=ruleKnaveReference();

            state._fsp--;

             current =iv_ruleKnaveReference; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleKnaveReference"


    // $ANTLR start "ruleKnaveReference"
    // InternalLanguage.g:649:1: ruleKnaveReference returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is a knave' ) ;
    public final EObject ruleKnaveReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalLanguage.g:652:28: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is a knave' ) )
            // InternalLanguage.g:653:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is a knave' )
            {
            // InternalLanguage.g:653:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is a knave' )
            // InternalLanguage.g:653:2: () ( (otherlv_1= RULE_ID ) ) otherlv_2= 'is a knave'
            {
            // InternalLanguage.g:653:2: ()
            // InternalLanguage.g:654:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getKnaveReferenceAccess().getKnaveReferenceAction_0(),
                        current);
                

            }

            // InternalLanguage.g:659:2: ( (otherlv_1= RULE_ID ) )
            // InternalLanguage.g:660:1: (otherlv_1= RULE_ID )
            {
            // InternalLanguage.g:660:1: (otherlv_1= RULE_ID )
            // InternalLanguage.g:661:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getKnaveReferenceRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_15); 

            		newLeafNode(otherlv_1, grammarAccess.getKnaveReferenceAccess().getPersonPersonCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_2); 

                	newLeafNode(otherlv_2, grammarAccess.getKnaveReferenceAccess().getIsAKnaveKeyword_2());
                

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
    // $ANTLR end "ruleKnaveReference"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000001C0010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});

}