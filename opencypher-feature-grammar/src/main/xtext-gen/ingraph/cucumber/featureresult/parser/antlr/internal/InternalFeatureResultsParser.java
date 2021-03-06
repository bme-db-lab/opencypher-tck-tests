package ingraph.cucumber.featureresult.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ingraph.cucumber.featureresult.services.FeatureResultsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFeatureResultsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_FLOAT", "RULE_INFINITY", "RULE_INT", "RULE_IDENTIFIER", "RULE_STRING_LITERAL", "RULE_ID", "RULE_STRING_BODY", "RULE_ESCAPED_APOSTROPHE", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'['", "']'", "'<'", "'>'", "'-'", "'->'", "'<-'", "'true'", "'false'", "'null'", "','", "'{'", "'}'", "':'"
    };
    public static final int RULE_ESCAPED_APOSTROPHE=11;
    public static final int RULE_IDENTIFIER=7;
    public static final int RULE_INFINITY=5;
    public static final int RULE_STRING=12;
    public static final int RULE_STRING_LITERAL=8;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=9;
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=16;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__23=23;
    public static final int RULE_FLOAT=4;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_STRING_BODY=10;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalFeatureResultsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFeatureResultsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFeatureResultsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFeatureResults.g"; }



     	private FeatureResultsGrammarAccess grammarAccess;

        public InternalFeatureResultsParser(TokenStream input, FeatureResultsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "FeatureValue";
       	}

       	@Override
       	protected FeatureResultsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFeatureValue"
    // InternalFeatureResults.g:64:1: entryRuleFeatureValue returns [EObject current=null] : iv_ruleFeatureValue= ruleFeatureValue EOF ;
    public final EObject entryRuleFeatureValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureValue = null;


        try {
            // InternalFeatureResults.g:64:53: (iv_ruleFeatureValue= ruleFeatureValue EOF )
            // InternalFeatureResults.g:65:2: iv_ruleFeatureValue= ruleFeatureValue EOF
            {
             newCompositeNode(grammarAccess.getFeatureValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureValue=ruleFeatureValue();

            state._fsp--;

             current =iv_ruleFeatureValue; 
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
    // $ANTLR end "entryRuleFeatureValue"


    // $ANTLR start "ruleFeatureValue"
    // InternalFeatureResults.g:71:1: ruleFeatureValue returns [EObject current=null] : (this_Node_0= ruleNode | this_Relationship_1= ruleRelationship | this_Path_2= rulePath | this_Integer_3= ruleInteger | this_FloatingPoint_4= ruleFloatingPoint | this_MyString_5= ruleMyString | this_Bool_6= ruleBool | this_NullValue_7= ruleNullValue | this_List_8= ruleList | this_Map_9= ruleMap ) ;
    public final EObject ruleFeatureValue() throws RecognitionException {
        EObject current = null;

        EObject this_Node_0 = null;

        EObject this_Relationship_1 = null;

        EObject this_Path_2 = null;

        EObject this_Integer_3 = null;

        EObject this_FloatingPoint_4 = null;

        EObject this_MyString_5 = null;

        EObject this_Bool_6 = null;

        EObject this_NullValue_7 = null;

        EObject this_List_8 = null;

        EObject this_Map_9 = null;



        	enterRule();

        try {
            // InternalFeatureResults.g:77:2: ( (this_Node_0= ruleNode | this_Relationship_1= ruleRelationship | this_Path_2= rulePath | this_Integer_3= ruleInteger | this_FloatingPoint_4= ruleFloatingPoint | this_MyString_5= ruleMyString | this_Bool_6= ruleBool | this_NullValue_7= ruleNullValue | this_List_8= ruleList | this_Map_9= ruleMap ) )
            // InternalFeatureResults.g:78:2: (this_Node_0= ruleNode | this_Relationship_1= ruleRelationship | this_Path_2= rulePath | this_Integer_3= ruleInteger | this_FloatingPoint_4= ruleFloatingPoint | this_MyString_5= ruleMyString | this_Bool_6= ruleBool | this_NullValue_7= ruleNullValue | this_List_8= ruleList | this_Map_9= ruleMap )
            {
            // InternalFeatureResults.g:78:2: (this_Node_0= ruleNode | this_Relationship_1= ruleRelationship | this_Path_2= rulePath | this_Integer_3= ruleInteger | this_FloatingPoint_4= ruleFloatingPoint | this_MyString_5= ruleMyString | this_Bool_6= ruleBool | this_NullValue_7= ruleNullValue | this_List_8= ruleList | this_Map_9= ruleMap )
            int alt1=10;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalFeatureResults.g:79:3: this_Node_0= ruleNode
                    {

                    			newCompositeNode(grammarAccess.getFeatureValueAccess().getNodeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Node_0=ruleNode();

                    state._fsp--;


                    			current = this_Node_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFeatureResults.g:88:3: this_Relationship_1= ruleRelationship
                    {

                    			newCompositeNode(grammarAccess.getFeatureValueAccess().getRelationshipParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Relationship_1=ruleRelationship();

                    state._fsp--;


                    			current = this_Relationship_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFeatureResults.g:97:3: this_Path_2= rulePath
                    {

                    			newCompositeNode(grammarAccess.getFeatureValueAccess().getPathParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Path_2=rulePath();

                    state._fsp--;


                    			current = this_Path_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFeatureResults.g:106:3: this_Integer_3= ruleInteger
                    {

                    			newCompositeNode(grammarAccess.getFeatureValueAccess().getIntegerParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Integer_3=ruleInteger();

                    state._fsp--;


                    			current = this_Integer_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalFeatureResults.g:115:3: this_FloatingPoint_4= ruleFloatingPoint
                    {

                    			newCompositeNode(grammarAccess.getFeatureValueAccess().getFloatingPointParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_FloatingPoint_4=ruleFloatingPoint();

                    state._fsp--;


                    			current = this_FloatingPoint_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalFeatureResults.g:124:3: this_MyString_5= ruleMyString
                    {

                    			newCompositeNode(grammarAccess.getFeatureValueAccess().getMyStringParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_MyString_5=ruleMyString();

                    state._fsp--;


                    			current = this_MyString_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalFeatureResults.g:133:3: this_Bool_6= ruleBool
                    {

                    			newCompositeNode(grammarAccess.getFeatureValueAccess().getBoolParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Bool_6=ruleBool();

                    state._fsp--;


                    			current = this_Bool_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalFeatureResults.g:142:3: this_NullValue_7= ruleNullValue
                    {

                    			newCompositeNode(grammarAccess.getFeatureValueAccess().getNullValueParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_NullValue_7=ruleNullValue();

                    state._fsp--;


                    			current = this_NullValue_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalFeatureResults.g:151:3: this_List_8= ruleList
                    {

                    			newCompositeNode(grammarAccess.getFeatureValueAccess().getListParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_List_8=ruleList();

                    state._fsp--;


                    			current = this_List_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalFeatureResults.g:160:3: this_Map_9= ruleMap
                    {

                    			newCompositeNode(grammarAccess.getFeatureValueAccess().getMapParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Map_9=ruleMap();

                    state._fsp--;


                    			current = this_Map_9;
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
    // $ANTLR end "ruleFeatureValue"


    // $ANTLR start "entryRuleNode"
    // InternalFeatureResults.g:172:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalFeatureResults.g:172:45: (iv_ruleNode= ruleNode EOF )
            // InternalFeatureResults.g:173:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalFeatureResults.g:179:1: ruleNode returns [EObject current=null] : this_NodeDesc_0= ruleNodeDesc ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        EObject this_NodeDesc_0 = null;



        	enterRule();

        try {
            // InternalFeatureResults.g:185:2: (this_NodeDesc_0= ruleNodeDesc )
            // InternalFeatureResults.g:186:2: this_NodeDesc_0= ruleNodeDesc
            {

            		newCompositeNode(grammarAccess.getNodeAccess().getNodeDescParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_NodeDesc_0=ruleNodeDesc();

            state._fsp--;


            		current = this_NodeDesc_0;
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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleNodeDesc"
    // InternalFeatureResults.g:197:1: entryRuleNodeDesc returns [EObject current=null] : iv_ruleNodeDesc= ruleNodeDesc EOF ;
    public final EObject entryRuleNodeDesc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeDesc = null;


        try {
            // InternalFeatureResults.g:197:49: (iv_ruleNodeDesc= ruleNodeDesc EOF )
            // InternalFeatureResults.g:198:2: iv_ruleNodeDesc= ruleNodeDesc EOF
            {
             newCompositeNode(grammarAccess.getNodeDescRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeDesc=ruleNodeDesc();

            state._fsp--;

             current =iv_ruleNodeDesc; 
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
    // $ANTLR end "entryRuleNodeDesc"


    // $ANTLR start "ruleNodeDesc"
    // InternalFeatureResults.g:204:1: ruleNodeDesc returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_labels_2_0= ruleLabel ) )* ( (lv_propertyMap_3_0= rulePropertyMap ) )? otherlv_4= ')' ) ;
    public final EObject ruleNodeDesc() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_labels_2_0 = null;

        EObject lv_propertyMap_3_0 = null;



        	enterRule();

        try {
            // InternalFeatureResults.g:210:2: ( ( () otherlv_1= '(' ( (lv_labels_2_0= ruleLabel ) )* ( (lv_propertyMap_3_0= rulePropertyMap ) )? otherlv_4= ')' ) )
            // InternalFeatureResults.g:211:2: ( () otherlv_1= '(' ( (lv_labels_2_0= ruleLabel ) )* ( (lv_propertyMap_3_0= rulePropertyMap ) )? otherlv_4= ')' )
            {
            // InternalFeatureResults.g:211:2: ( () otherlv_1= '(' ( (lv_labels_2_0= ruleLabel ) )* ( (lv_propertyMap_3_0= rulePropertyMap ) )? otherlv_4= ')' )
            // InternalFeatureResults.g:212:3: () otherlv_1= '(' ( (lv_labels_2_0= ruleLabel ) )* ( (lv_propertyMap_3_0= rulePropertyMap ) )? otherlv_4= ')'
            {
            // InternalFeatureResults.g:212:3: ()
            // InternalFeatureResults.g:213:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNodeDescAccess().getNodeDescAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getNodeDescAccess().getLeftParenthesisKeyword_1());
            		
            // InternalFeatureResults.g:223:3: ( (lv_labels_2_0= ruleLabel ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==32) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFeatureResults.g:224:4: (lv_labels_2_0= ruleLabel )
            	    {
            	    // InternalFeatureResults.g:224:4: (lv_labels_2_0= ruleLabel )
            	    // InternalFeatureResults.g:225:5: lv_labels_2_0= ruleLabel
            	    {

            	    					newCompositeNode(grammarAccess.getNodeDescAccess().getLabelsLabelParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_labels_2_0=ruleLabel();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNodeDescRule());
            	    					}
            	    					add(
            	    						current,
            	    						"labels",
            	    						lv_labels_2_0,
            	    						"ingraph.cucumber.featureresult.FeatureResults.Label");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalFeatureResults.g:242:3: ( (lv_propertyMap_3_0= rulePropertyMap ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==30) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalFeatureResults.g:243:4: (lv_propertyMap_3_0= rulePropertyMap )
                    {
                    // InternalFeatureResults.g:243:4: (lv_propertyMap_3_0= rulePropertyMap )
                    // InternalFeatureResults.g:244:5: lv_propertyMap_3_0= rulePropertyMap
                    {

                    					newCompositeNode(grammarAccess.getNodeDescAccess().getPropertyMapPropertyMapParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_propertyMap_3_0=rulePropertyMap();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNodeDescRule());
                    					}
                    					set(
                    						current,
                    						"propertyMap",
                    						lv_propertyMap_3_0,
                    						"ingraph.cucumber.featureresult.FeatureResults.PropertyMap");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getNodeDescAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleNodeDesc"


    // $ANTLR start "entryRuleRelationship"
    // InternalFeatureResults.g:269:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // InternalFeatureResults.g:269:53: (iv_ruleRelationship= ruleRelationship EOF )
            // InternalFeatureResults.g:270:2: iv_ruleRelationship= ruleRelationship EOF
            {
             newCompositeNode(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationship=ruleRelationship();

            state._fsp--;

             current =iv_ruleRelationship; 
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
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // InternalFeatureResults.g:276:1: ruleRelationship returns [EObject current=null] : this_RelationshipDesc_0= ruleRelationshipDesc ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        EObject this_RelationshipDesc_0 = null;



        	enterRule();

        try {
            // InternalFeatureResults.g:282:2: (this_RelationshipDesc_0= ruleRelationshipDesc )
            // InternalFeatureResults.g:283:2: this_RelationshipDesc_0= ruleRelationshipDesc
            {

            		newCompositeNode(grammarAccess.getRelationshipAccess().getRelationshipDescParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_RelationshipDesc_0=ruleRelationshipDesc();

            state._fsp--;


            		current = this_RelationshipDesc_0;
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
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleRelationshipDesc"
    // InternalFeatureResults.g:294:1: entryRuleRelationshipDesc returns [EObject current=null] : iv_ruleRelationshipDesc= ruleRelationshipDesc EOF ;
    public final EObject entryRuleRelationshipDesc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationshipDesc = null;


        try {
            // InternalFeatureResults.g:294:57: (iv_ruleRelationshipDesc= ruleRelationshipDesc EOF )
            // InternalFeatureResults.g:295:2: iv_ruleRelationshipDesc= ruleRelationshipDesc EOF
            {
             newCompositeNode(grammarAccess.getRelationshipDescRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationshipDesc=ruleRelationshipDesc();

            state._fsp--;

             current =iv_ruleRelationshipDesc; 
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
    // $ANTLR end "entryRuleRelationshipDesc"


    // $ANTLR start "ruleRelationshipDesc"
    // InternalFeatureResults.g:301:1: ruleRelationshipDesc returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_type_2_0= ruleRelationshipType ) ) ( (lv_propertyMap_3_0= rulePropertyMap ) )? otherlv_4= ']' ) ;
    public final EObject ruleRelationshipDesc() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_type_2_0 = null;

        EObject lv_propertyMap_3_0 = null;



        	enterRule();

        try {
            // InternalFeatureResults.g:307:2: ( ( () otherlv_1= '[' ( (lv_type_2_0= ruleRelationshipType ) ) ( (lv_propertyMap_3_0= rulePropertyMap ) )? otherlv_4= ']' ) )
            // InternalFeatureResults.g:308:2: ( () otherlv_1= '[' ( (lv_type_2_0= ruleRelationshipType ) ) ( (lv_propertyMap_3_0= rulePropertyMap ) )? otherlv_4= ']' )
            {
            // InternalFeatureResults.g:308:2: ( () otherlv_1= '[' ( (lv_type_2_0= ruleRelationshipType ) ) ( (lv_propertyMap_3_0= rulePropertyMap ) )? otherlv_4= ']' )
            // InternalFeatureResults.g:309:3: () otherlv_1= '[' ( (lv_type_2_0= ruleRelationshipType ) ) ( (lv_propertyMap_3_0= rulePropertyMap ) )? otherlv_4= ']'
            {
            // InternalFeatureResults.g:309:3: ()
            // InternalFeatureResults.g:310:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelationshipDescAccess().getRelationshipDescAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getRelationshipDescAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalFeatureResults.g:320:3: ( (lv_type_2_0= ruleRelationshipType ) )
            // InternalFeatureResults.g:321:4: (lv_type_2_0= ruleRelationshipType )
            {
            // InternalFeatureResults.g:321:4: (lv_type_2_0= ruleRelationshipType )
            // InternalFeatureResults.g:322:5: lv_type_2_0= ruleRelationshipType
            {

            					newCompositeNode(grammarAccess.getRelationshipDescAccess().getTypeRelationshipTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_type_2_0=ruleRelationshipType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationshipDescRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"ingraph.cucumber.featureresult.FeatureResults.RelationshipType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFeatureResults.g:339:3: ( (lv_propertyMap_3_0= rulePropertyMap ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==30) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalFeatureResults.g:340:4: (lv_propertyMap_3_0= rulePropertyMap )
                    {
                    // InternalFeatureResults.g:340:4: (lv_propertyMap_3_0= rulePropertyMap )
                    // InternalFeatureResults.g:341:5: lv_propertyMap_3_0= rulePropertyMap
                    {

                    					newCompositeNode(grammarAccess.getRelationshipDescAccess().getPropertyMapPropertyMapParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_propertyMap_3_0=rulePropertyMap();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRelationshipDescRule());
                    					}
                    					set(
                    						current,
                    						"propertyMap",
                    						lv_propertyMap_3_0,
                    						"ingraph.cucumber.featureresult.FeatureResults.PropertyMap");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRelationshipDescAccess().getRightSquareBracketKeyword_4());
            		

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
    // $ANTLR end "ruleRelationshipDesc"


    // $ANTLR start "entryRulePath"
    // InternalFeatureResults.g:366:1: entryRulePath returns [EObject current=null] : iv_rulePath= rulePath EOF ;
    public final EObject entryRulePath() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePath = null;


        try {
            // InternalFeatureResults.g:366:45: (iv_rulePath= rulePath EOF )
            // InternalFeatureResults.g:367:2: iv_rulePath= rulePath EOF
            {
             newCompositeNode(grammarAccess.getPathRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePath=rulePath();

            state._fsp--;

             current =iv_rulePath; 
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
    // $ANTLR end "entryRulePath"


    // $ANTLR start "rulePath"
    // InternalFeatureResults.g:373:1: rulePath returns [EObject current=null] : (otherlv_0= '<' this_PathBody_1= rulePathBody otherlv_2= '>' ) ;
    public final EObject rulePath() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_PathBody_1 = null;



        	enterRule();

        try {
            // InternalFeatureResults.g:379:2: ( (otherlv_0= '<' this_PathBody_1= rulePathBody otherlv_2= '>' ) )
            // InternalFeatureResults.g:380:2: (otherlv_0= '<' this_PathBody_1= rulePathBody otherlv_2= '>' )
            {
            // InternalFeatureResults.g:380:2: (otherlv_0= '<' this_PathBody_1= rulePathBody otherlv_2= '>' )
            // InternalFeatureResults.g:381:3: otherlv_0= '<' this_PathBody_1= rulePathBody otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPathAccess().getLessThanSignKeyword_0());
            		

            			newCompositeNode(grammarAccess.getPathAccess().getPathBodyParserRuleCall_1());
            		
            pushFollow(FOLLOW_9);
            this_PathBody_1=rulePathBody();

            state._fsp--;


            			current = this_PathBody_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getPathAccess().getGreaterThanSignKeyword_2());
            		

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
    // $ANTLR end "rulePath"


    // $ANTLR start "entryRulePathBody"
    // InternalFeatureResults.g:401:1: entryRulePathBody returns [EObject current=null] : iv_rulePathBody= rulePathBody EOF ;
    public final EObject entryRulePathBody() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathBody = null;


        try {
            // InternalFeatureResults.g:401:49: (iv_rulePathBody= rulePathBody EOF )
            // InternalFeatureResults.g:402:2: iv_rulePathBody= rulePathBody EOF
            {
             newCompositeNode(grammarAccess.getPathBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePathBody=rulePathBody();

            state._fsp--;

             current =iv_rulePathBody; 
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
    // $ANTLR end "entryRulePathBody"


    // $ANTLR start "rulePathBody"
    // InternalFeatureResults.g:408:1: rulePathBody returns [EObject current=null] : ( ( (lv_node_0_0= ruleNodeDesc ) ) ( (lv_pathLinks_1_0= rulePathLink ) )* ) ;
    public final EObject rulePathBody() throws RecognitionException {
        EObject current = null;

        EObject lv_node_0_0 = null;

        EObject lv_pathLinks_1_0 = null;



        	enterRule();

        try {
            // InternalFeatureResults.g:414:2: ( ( ( (lv_node_0_0= ruleNodeDesc ) ) ( (lv_pathLinks_1_0= rulePathLink ) )* ) )
            // InternalFeatureResults.g:415:2: ( ( (lv_node_0_0= ruleNodeDesc ) ) ( (lv_pathLinks_1_0= rulePathLink ) )* )
            {
            // InternalFeatureResults.g:415:2: ( ( (lv_node_0_0= ruleNodeDesc ) ) ( (lv_pathLinks_1_0= rulePathLink ) )* )
            // InternalFeatureResults.g:416:3: ( (lv_node_0_0= ruleNodeDesc ) ) ( (lv_pathLinks_1_0= rulePathLink ) )*
            {
            // InternalFeatureResults.g:416:3: ( (lv_node_0_0= ruleNodeDesc ) )
            // InternalFeatureResults.g:417:4: (lv_node_0_0= ruleNodeDesc )
            {
            // InternalFeatureResults.g:417:4: (lv_node_0_0= ruleNodeDesc )
            // InternalFeatureResults.g:418:5: lv_node_0_0= ruleNodeDesc
            {

            					newCompositeNode(grammarAccess.getPathBodyAccess().getNodeNodeDescParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_node_0_0=ruleNodeDesc();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPathBodyRule());
            					}
            					set(
            						current,
            						"node",
            						lv_node_0_0,
            						"ingraph.cucumber.featureresult.FeatureResults.NodeDesc");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFeatureResults.g:435:3: ( (lv_pathLinks_1_0= rulePathLink ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23||LA5_0==25) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalFeatureResults.g:436:4: (lv_pathLinks_1_0= rulePathLink )
            	    {
            	    // InternalFeatureResults.g:436:4: (lv_pathLinks_1_0= rulePathLink )
            	    // InternalFeatureResults.g:437:5: lv_pathLinks_1_0= rulePathLink
            	    {

            	    					newCompositeNode(grammarAccess.getPathBodyAccess().getPathLinksPathLinkParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_pathLinks_1_0=rulePathLink();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPathBodyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"pathLinks",
            	    						lv_pathLinks_1_0,
            	    						"ingraph.cucumber.featureresult.FeatureResults.PathLink");
            	    					afterParserOrEnumRuleCall();
            	    				

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
    // $ANTLR end "rulePathBody"


    // $ANTLR start "entryRulePathLink"
    // InternalFeatureResults.g:458:1: entryRulePathLink returns [EObject current=null] : iv_rulePathLink= rulePathLink EOF ;
    public final EObject entryRulePathLink() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathLink = null;


        try {
            // InternalFeatureResults.g:458:49: (iv_rulePathLink= rulePathLink EOF )
            // InternalFeatureResults.g:459:2: iv_rulePathLink= rulePathLink EOF
            {
             newCompositeNode(grammarAccess.getPathLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePathLink=rulePathLink();

            state._fsp--;

             current =iv_rulePathLink; 
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
    // $ANTLR end "entryRulePathLink"


    // $ANTLR start "rulePathLink"
    // InternalFeatureResults.g:465:1: rulePathLink returns [EObject current=null] : ( () ( (lv_relationship_1_0= ruleDirectedRelationship ) ) ( (lv_node_2_0= ruleNodeDesc ) ) ) ;
    public final EObject rulePathLink() throws RecognitionException {
        EObject current = null;

        EObject lv_relationship_1_0 = null;

        EObject lv_node_2_0 = null;



        	enterRule();

        try {
            // InternalFeatureResults.g:471:2: ( ( () ( (lv_relationship_1_0= ruleDirectedRelationship ) ) ( (lv_node_2_0= ruleNodeDesc ) ) ) )
            // InternalFeatureResults.g:472:2: ( () ( (lv_relationship_1_0= ruleDirectedRelationship ) ) ( (lv_node_2_0= ruleNodeDesc ) ) )
            {
            // InternalFeatureResults.g:472:2: ( () ( (lv_relationship_1_0= ruleDirectedRelationship ) ) ( (lv_node_2_0= ruleNodeDesc ) ) )
            // InternalFeatureResults.g:473:3: () ( (lv_relationship_1_0= ruleDirectedRelationship ) ) ( (lv_node_2_0= ruleNodeDesc ) )
            {
            // InternalFeatureResults.g:473:3: ()
            // InternalFeatureResults.g:474:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPathLinkAccess().getPathLinkAction_0(),
            					current);
            			

            }

            // InternalFeatureResults.g:480:3: ( (lv_relationship_1_0= ruleDirectedRelationship ) )
            // InternalFeatureResults.g:481:4: (lv_relationship_1_0= ruleDirectedRelationship )
            {
            // InternalFeatureResults.g:481:4: (lv_relationship_1_0= ruleDirectedRelationship )
            // InternalFeatureResults.g:482:5: lv_relationship_1_0= ruleDirectedRelationship
            {

            					newCompositeNode(grammarAccess.getPathLinkAccess().getRelationshipDirectedRelationshipParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_relationship_1_0=ruleDirectedRelationship();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPathLinkRule());
            					}
            					set(
            						current,
            						"relationship",
            						lv_relationship_1_0,
            						"ingraph.cucumber.featureresult.FeatureResults.DirectedRelationship");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFeatureResults.g:499:3: ( (lv_node_2_0= ruleNodeDesc ) )
            // InternalFeatureResults.g:500:4: (lv_node_2_0= ruleNodeDesc )
            {
            // InternalFeatureResults.g:500:4: (lv_node_2_0= ruleNodeDesc )
            // InternalFeatureResults.g:501:5: lv_node_2_0= ruleNodeDesc
            {

            					newCompositeNode(grammarAccess.getPathLinkAccess().getNodeNodeDescParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_node_2_0=ruleNodeDesc();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPathLinkRule());
            					}
            					set(
            						current,
            						"node",
            						lv_node_2_0,
            						"ingraph.cucumber.featureresult.FeatureResults.NodeDesc");
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
    // $ANTLR end "rulePathLink"


    // $ANTLR start "entryRuleDirectedRelationship"
    // InternalFeatureResults.g:522:1: entryRuleDirectedRelationship returns [EObject current=null] : iv_ruleDirectedRelationship= ruleDirectedRelationship EOF ;
    public final EObject entryRuleDirectedRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectedRelationship = null;


        try {
            // InternalFeatureResults.g:522:61: (iv_ruleDirectedRelationship= ruleDirectedRelationship EOF )
            // InternalFeatureResults.g:523:2: iv_ruleDirectedRelationship= ruleDirectedRelationship EOF
            {
             newCompositeNode(grammarAccess.getDirectedRelationshipRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirectedRelationship=ruleDirectedRelationship();

            state._fsp--;

             current =iv_ruleDirectedRelationship; 
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
    // $ANTLR end "entryRuleDirectedRelationship"


    // $ANTLR start "ruleDirectedRelationship"
    // InternalFeatureResults.g:529:1: ruleDirectedRelationship returns [EObject current=null] : (this_ForwardsRelationship_0= ruleForwardsRelationship | this_BackwardsRelationship_1= ruleBackwardsRelationship ) ;
    public final EObject ruleDirectedRelationship() throws RecognitionException {
        EObject current = null;

        EObject this_ForwardsRelationship_0 = null;

        EObject this_BackwardsRelationship_1 = null;



        	enterRule();

        try {
            // InternalFeatureResults.g:535:2: ( (this_ForwardsRelationship_0= ruleForwardsRelationship | this_BackwardsRelationship_1= ruleBackwardsRelationship ) )
            // InternalFeatureResults.g:536:2: (this_ForwardsRelationship_0= ruleForwardsRelationship | this_BackwardsRelationship_1= ruleBackwardsRelationship )
            {
            // InternalFeatureResults.g:536:2: (this_ForwardsRelationship_0= ruleForwardsRelationship | this_BackwardsRelationship_1= ruleBackwardsRelationship )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            else if ( (LA6_0==25) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalFeatureResults.g:537:3: this_ForwardsRelationship_0= ruleForwardsRelationship
                    {

                    			newCompositeNode(grammarAccess.getDirectedRelationshipAccess().getForwardsRelationshipParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForwardsRelationship_0=ruleForwardsRelationship();

                    state._fsp--;


                    			current = this_ForwardsRelationship_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFeatureResults.g:546:3: this_BackwardsRelationship_1= ruleBackwardsRelationship
                    {

                    			newCompositeNode(grammarAccess.getDirectedRelationshipAccess().getBackwardsRelationshipParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BackwardsRelationship_1=ruleBackwardsRelationship();

                    state._fsp--;


                    			current = this_BackwardsRelationship_1;
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
    // $ANTLR end "ruleDirectedRelationship"


    // $ANTLR start "entryRuleForwardsRelationship"
    // InternalFeatureResults.g:558:1: entryRuleForwardsRelationship returns [EObject current=null] : iv_ruleForwardsRelationship= ruleForwardsRelationship EOF ;
    public final EObject entryRuleForwardsRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForwardsRelationship = null;


        try {
            // InternalFeatureResults.g:558:61: (iv_ruleForwardsRelationship= ruleForwardsRelationship EOF )
            // InternalFeatureResults.g:559:2: iv_ruleForwardsRelationship= ruleForwardsRelationship EOF
            {
             newCompositeNode(grammarAccess.getForwardsRelationshipRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForwardsRelationship=ruleForwardsRelationship();

            state._fsp--;

             current =iv_ruleForwardsRelationship; 
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
    // $ANTLR end "entryRuleForwardsRelationship"


    // $ANTLR start "ruleForwardsRelationship"
    // InternalFeatureResults.g:565:1: ruleForwardsRelationship returns [EObject current=null] : ( () otherlv_1= '-' ( (lv_relationshipDesc_2_0= ruleRelationshipDesc ) ) otherlv_3= '->' ) ;
    public final EObject ruleForwardsRelationship() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_relationshipDesc_2_0 = null;



        	enterRule();

        try {
            // InternalFeatureResults.g:571:2: ( ( () otherlv_1= '-' ( (lv_relationshipDesc_2_0= ruleRelationshipDesc ) ) otherlv_3= '->' ) )
            // InternalFeatureResults.g:572:2: ( () otherlv_1= '-' ( (lv_relationshipDesc_2_0= ruleRelationshipDesc ) ) otherlv_3= '->' )
            {
            // InternalFeatureResults.g:572:2: ( () otherlv_1= '-' ( (lv_relationshipDesc_2_0= ruleRelationshipDesc ) ) otherlv_3= '->' )
            // InternalFeatureResults.g:573:3: () otherlv_1= '-' ( (lv_relationshipDesc_2_0= ruleRelationshipDesc ) ) otherlv_3= '->'
            {
            // InternalFeatureResults.g:573:3: ()
            // InternalFeatureResults.g:574:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getForwardsRelationshipAccess().getForwardsRelationshipAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getForwardsRelationshipAccess().getHyphenMinusKeyword_1());
            		
            // InternalFeatureResults.g:584:3: ( (lv_relationshipDesc_2_0= ruleRelationshipDesc ) )
            // InternalFeatureResults.g:585:4: (lv_relationshipDesc_2_0= ruleRelationshipDesc )
            {
            // InternalFeatureResults.g:585:4: (lv_relationshipDesc_2_0= ruleRelationshipDesc )
            // InternalFeatureResults.g:586:5: lv_relationshipDesc_2_0= ruleRelationshipDesc
            {

            					newCompositeNode(grammarAccess.getForwardsRelationshipAccess().getRelationshipDescRelationshipDescParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_relationshipDesc_2_0=ruleRelationshipDesc();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForwardsRelationshipRule());
            					}
            					set(
            						current,
            						"relationshipDesc",
            						lv_relationshipDesc_2_0,
            						"ingraph.cucumber.featureresult.FeatureResults.RelationshipDesc");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getForwardsRelationshipAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		

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
    // $ANTLR end "ruleForwardsRelationship"


    // $ANTLR start "entryRuleBackwardsRelationship"
    // InternalFeatureResults.g:611:1: entryRuleBackwardsRelationship returns [EObject current=null] : iv_ruleBackwardsRelationship= ruleBackwardsRelationship EOF ;
    public final EObject entryRuleBackwardsRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackwardsRelationship = null;


        try {
            // InternalFeatureResults.g:611:62: (iv_ruleBackwardsRelationship= ruleBackwardsRelationship EOF )
            // InternalFeatureResults.g:612:2: iv_ruleBackwardsRelationship= ruleBackwardsRelationship EOF
            {
             newCompositeNode(grammarAccess.getBackwardsRelationshipRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBackwardsRelationship=ruleBackwardsRelationship();

            state._fsp--;

             current =iv_ruleBackwardsRelationship; 
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
    // $ANTLR end "entryRuleBackwardsRelationship"


    // $ANTLR start "ruleBackwardsRelationship"
    // InternalFeatureResults.g:618:1: ruleBackwardsRelationship returns [EObject current=null] : ( () otherlv_1= '<-' ( (lv_relationshipDesc_2_0= ruleRelationshipDesc ) ) otherlv_3= '-' ) ;
    public final EObject ruleBackwardsRelationship() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_relationshipDesc_2_0 = null;



        	enterRule();

        try {
            // InternalFeatureResults.g:624:2: ( ( () otherlv_1= '<-' ( (lv_relationshipDesc_2_0= ruleRelationshipDesc ) ) otherlv_3= '-' ) )
            // InternalFeatureResults.g:625:2: ( () otherlv_1= '<-' ( (lv_relationshipDesc_2_0= ruleRelationshipDesc ) ) otherlv_3= '-' )
            {
            // InternalFeatureResults.g:625:2: ( () otherlv_1= '<-' ( (lv_relationshipDesc_2_0= ruleRelationshipDesc ) ) otherlv_3= '-' )
            // InternalFeatureResults.g:626:3: () otherlv_1= '<-' ( (lv_relationshipDesc_2_0= ruleRelationshipDesc ) ) otherlv_3= '-'
            {
            // InternalFeatureResults.g:626:3: ()
            // InternalFeatureResults.g:627:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBackwardsRelationshipAccess().getBackwardsRelationshipAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getBackwardsRelationshipAccess().getLessThanSignHyphenMinusKeyword_1());
            		
            // InternalFeatureResults.g:637:3: ( (lv_relationshipDesc_2_0= ruleRelationshipDesc ) )
            // InternalFeatureResults.g:638:4: (lv_relationshipDesc_2_0= ruleRelationshipDesc )
            {
            // InternalFeatureResults.g:638:4: (lv_relationshipDesc_2_0= ruleRelationshipDesc )
            // InternalFeatureResults.g:639:5: lv_relationshipDesc_2_0= ruleRelationshipDesc
            {

            					newCompositeNode(grammarAccess.getBackwardsRelationshipAccess().getRelationshipDescRelationshipDescParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_relationshipDesc_2_0=ruleRelationshipDesc();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBackwardsRelationshipRule());
            					}
            					set(
            						current,
            						"relationshipDesc",
            						lv_relationshipDesc_2_0,
            						"ingraph.cucumber.featureresult.FeatureResults.RelationshipDesc");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getBackwardsRelationshipAccess().getHyphenMinusKeyword_3());
            		

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
    // $ANTLR end "ruleBackwardsRelationship"


    // $ANTLR start "entryRuleFloatingPoint"
    // InternalFeatureResults.g:664:1: entryRuleFloatingPoint returns [EObject current=null] : iv_ruleFloatingPoint= ruleFloatingPoint EOF ;
    public final EObject entryRuleFloatingPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatingPoint = null;


        try {
            // InternalFeatureResults.g:664:54: (iv_ruleFloatingPoint= ruleFloatingPoint EOF )
            // InternalFeatureResults.g:665:2: iv_ruleFloatingPoint= ruleFloatingPoint EOF
            {
             newCompositeNode(grammarAccess.getFloatingPointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloatingPoint=ruleFloatingPoint();

            state._fsp--;

             current =iv_ruleFloatingPoint; 
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
    // $ANTLR end "entryRuleFloatingPoint"


    // $ANTLR start "ruleFloatingPoint"
    // InternalFeatureResults.g:671:1: ruleFloatingPoint returns [EObject current=null] : ( ( (lv_value_0_0= RULE_FLOAT ) ) | ( (lv_isInfinity_1_0= RULE_INFINITY ) ) ) ;
    public final EObject ruleFloatingPoint() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_isInfinity_1_0=null;


        	enterRule();

        try {
            // InternalFeatureResults.g:677:2: ( ( ( (lv_value_0_0= RULE_FLOAT ) ) | ( (lv_isInfinity_1_0= RULE_INFINITY ) ) ) )
            // InternalFeatureResults.g:678:2: ( ( (lv_value_0_0= RULE_FLOAT ) ) | ( (lv_isInfinity_1_0= RULE_INFINITY ) ) )
            {
            // InternalFeatureResults.g:678:2: ( ( (lv_value_0_0= RULE_FLOAT ) ) | ( (lv_isInfinity_1_0= RULE_INFINITY ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_FLOAT) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_INFINITY) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalFeatureResults.g:679:3: ( (lv_value_0_0= RULE_FLOAT ) )
                    {
                    // InternalFeatureResults.g:679:3: ( (lv_value_0_0= RULE_FLOAT ) )
                    // InternalFeatureResults.g:680:4: (lv_value_0_0= RULE_FLOAT )
                    {
                    // InternalFeatureResults.g:680:4: (lv_value_0_0= RULE_FLOAT )
                    // InternalFeatureResults.g:681:5: lv_value_0_0= RULE_FLOAT
                    {
                    lv_value_0_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); 

                    					newLeafNode(lv_value_0_0, grammarAccess.getFloatingPointAccess().getValueFLOATTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFloatingPointRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_0_0,
                    						"ingraph.cucumber.featureresult.FeatureResults.FLOAT");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureResults.g:698:3: ( (lv_isInfinity_1_0= RULE_INFINITY ) )
                    {
                    // InternalFeatureResults.g:698:3: ( (lv_isInfinity_1_0= RULE_INFINITY ) )
                    // InternalFeatureResults.g:699:4: (lv_isInfinity_1_0= RULE_INFINITY )
                    {
                    // InternalFeatureResults.g:699:4: (lv_isInfinity_1_0= RULE_INFINITY )
                    // InternalFeatureResults.g:700:5: lv_isInfinity_1_0= RULE_INFINITY
                    {
                    lv_isInfinity_1_0=(Token)match(input,RULE_INFINITY,FOLLOW_2); 

                    					newLeafNode(lv_isInfinity_1_0, grammarAccess.getFloatingPointAccess().getIsInfinityINFINITYTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFloatingPointRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"isInfinity",
                    						true,
                    						"ingraph.cucumber.featureresult.FeatureResults.INFINITY");
                    				

                    }


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
    // $ANTLR end "ruleFloatingPoint"


    // $ANTLR start "entryRuleBool"
    // InternalFeatureResults.g:720:1: entryRuleBool returns [EObject current=null] : iv_ruleBool= ruleBool EOF ;
    public final EObject entryRuleBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBool = null;


        try {
            // InternalFeatureResults.g:720:45: (iv_ruleBool= ruleBool EOF )
            // InternalFeatureResults.g:721:2: iv_ruleBool= ruleBool EOF
            {
             newCompositeNode(grammarAccess.getBoolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBool=ruleBool();

            state._fsp--;

             current =iv_ruleBool; 
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
    // $ANTLR end "entryRuleBool"


    // $ANTLR start "ruleBool"
    // InternalFeatureResults.g:727:1: ruleBool returns [EObject current=null] : ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) ;
    public final EObject ruleBool() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_1=null;
        Token lv_value_1_2=null;


        	enterRule();

        try {
            // InternalFeatureResults.g:733:2: ( ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) )
            // InternalFeatureResults.g:734:2: ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) )
            {
            // InternalFeatureResults.g:734:2: ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) )
            // InternalFeatureResults.g:735:3: () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) )
            {
            // InternalFeatureResults.g:735:3: ()
            // InternalFeatureResults.g:736:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoolAccess().getBoolAction_0(),
            					current);
            			

            }

            // InternalFeatureResults.g:742:3: ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) )
            // InternalFeatureResults.g:743:4: ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) )
            {
            // InternalFeatureResults.g:743:4: ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) )
            // InternalFeatureResults.g:744:5: (lv_value_1_1= 'true' | lv_value_1_2= 'false' )
            {
            // InternalFeatureResults.g:744:5: (lv_value_1_1= 'true' | lv_value_1_2= 'false' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            else if ( (LA8_0==27) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalFeatureResults.g:745:6: lv_value_1_1= 'true'
                    {
                    lv_value_1_1=(Token)match(input,26,FOLLOW_2); 

                    						newLeafNode(lv_value_1_1, grammarAccess.getBoolAccess().getValueTrueKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBoolRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalFeatureResults.g:756:6: lv_value_1_2= 'false'
                    {
                    lv_value_1_2=(Token)match(input,27,FOLLOW_2); 

                    						newLeafNode(lv_value_1_2, grammarAccess.getBoolAccess().getValueFalseKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBoolRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_1_2, null);
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleBool"


    // $ANTLR start "entryRuleNullValue"
    // InternalFeatureResults.g:773:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
    public final EObject entryRuleNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullValue = null;


        try {
            // InternalFeatureResults.g:773:50: (iv_ruleNullValue= ruleNullValue EOF )
            // InternalFeatureResults.g:774:2: iv_ruleNullValue= ruleNullValue EOF
            {
             newCompositeNode(grammarAccess.getNullValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNullValue=ruleNullValue();

            state._fsp--;

             current =iv_ruleNullValue; 
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
    // $ANTLR end "entryRuleNullValue"


    // $ANTLR start "ruleNullValue"
    // InternalFeatureResults.g:780:1: ruleNullValue returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFeatureResults.g:786:2: ( ( () otherlv_1= 'null' ) )
            // InternalFeatureResults.g:787:2: ( () otherlv_1= 'null' )
            {
            // InternalFeatureResults.g:787:2: ( () otherlv_1= 'null' )
            // InternalFeatureResults.g:788:3: () otherlv_1= 'null'
            {
            // InternalFeatureResults.g:788:3: ()
            // InternalFeatureResults.g:789:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNullValueAccess().getNullValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getNullValueAccess().getNullKeyword_1());
            		

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
    // $ANTLR end "ruleNullValue"


    // $ANTLR start "entryRuleList"
    // InternalFeatureResults.g:803:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalFeatureResults.g:803:45: (iv_ruleList= ruleList EOF )
            // InternalFeatureResults.g:804:2: iv_ruleList= ruleList EOF
            {
             newCompositeNode(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleList=ruleList();

            state._fsp--;

             current =iv_ruleList; 
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
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // InternalFeatureResults.g:810:1: ruleList returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_listContents_2_0= ruleListContents ) )? otherlv_3= ']' ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_listContents_2_0 = null;



        	enterRule();

        try {
            // InternalFeatureResults.g:816:2: ( ( () otherlv_1= '[' ( (lv_listContents_2_0= ruleListContents ) )? otherlv_3= ']' ) )
            // InternalFeatureResults.g:817:2: ( () otherlv_1= '[' ( (lv_listContents_2_0= ruleListContents ) )? otherlv_3= ']' )
            {
            // InternalFeatureResults.g:817:2: ( () otherlv_1= '[' ( (lv_listContents_2_0= ruleListContents ) )? otherlv_3= ']' )
            // InternalFeatureResults.g:818:3: () otherlv_1= '[' ( (lv_listContents_2_0= ruleListContents ) )? otherlv_3= ']'
            {
            // InternalFeatureResults.g:818:3: ()
            // InternalFeatureResults.g:819:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getListAccess().getListAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getListAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalFeatureResults.g:829:3: ( (lv_listContents_2_0= ruleListContents ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_FLOAT && LA9_0<=RULE_INT)||LA9_0==RULE_STRING_LITERAL||LA9_0==17||LA9_0==19||LA9_0==21||(LA9_0>=26 && LA9_0<=28)||LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalFeatureResults.g:830:4: (lv_listContents_2_0= ruleListContents )
                    {
                    // InternalFeatureResults.g:830:4: (lv_listContents_2_0= ruleListContents )
                    // InternalFeatureResults.g:831:5: lv_listContents_2_0= ruleListContents
                    {

                    					newCompositeNode(grammarAccess.getListAccess().getListContentsListContentsParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_listContents_2_0=ruleListContents();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getListRule());
                    					}
                    					set(
                    						current,
                    						"listContents",
                    						lv_listContents_2_0,
                    						"ingraph.cucumber.featureresult.FeatureResults.ListContents");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getListAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleListContents"
    // InternalFeatureResults.g:856:1: entryRuleListContents returns [EObject current=null] : iv_ruleListContents= ruleListContents EOF ;
    public final EObject entryRuleListContents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListContents = null;


        try {
            // InternalFeatureResults.g:856:53: (iv_ruleListContents= ruleListContents EOF )
            // InternalFeatureResults.g:857:2: iv_ruleListContents= ruleListContents EOF
            {
             newCompositeNode(grammarAccess.getListContentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListContents=ruleListContents();

            state._fsp--;

             current =iv_ruleListContents; 
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
    // $ANTLR end "entryRuleListContents"


    // $ANTLR start "ruleListContents"
    // InternalFeatureResults.g:863:1: ruleListContents returns [EObject current=null] : ( ( (lv_listContents_0_0= ruleListElement ) ) (otherlv_1= ',' ( (lv_listContents_2_0= ruleListElement ) ) )* ) ;
    public final EObject ruleListContents() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_listContents_0_0 = null;

        EObject lv_listContents_2_0 = null;



        	enterRule();

        try {
            // InternalFeatureResults.g:869:2: ( ( ( (lv_listContents_0_0= ruleListElement ) ) (otherlv_1= ',' ( (lv_listContents_2_0= ruleListElement ) ) )* ) )
            // InternalFeatureResults.g:870:2: ( ( (lv_listContents_0_0= ruleListElement ) ) (otherlv_1= ',' ( (lv_listContents_2_0= ruleListElement ) ) )* )
            {
            // InternalFeatureResults.g:870:2: ( ( (lv_listContents_0_0= ruleListElement ) ) (otherlv_1= ',' ( (lv_listContents_2_0= ruleListElement ) ) )* )
            // InternalFeatureResults.g:871:3: ( (lv_listContents_0_0= ruleListElement ) ) (otherlv_1= ',' ( (lv_listContents_2_0= ruleListElement ) ) )*
            {
            // InternalFeatureResults.g:871:3: ( (lv_listContents_0_0= ruleListElement ) )
            // InternalFeatureResults.g:872:4: (lv_listContents_0_0= ruleListElement )
            {
            // InternalFeatureResults.g:872:4: (lv_listContents_0_0= ruleListElement )
            // InternalFeatureResults.g:873:5: lv_listContents_0_0= ruleListElement
            {

            					newCompositeNode(grammarAccess.getListContentsAccess().getListContentsListElementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_listContents_0_0=ruleListElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListContentsRule());
            					}
            					add(
            						current,
            						"listContents",
            						lv_listContents_0_0,
            						"ingraph.cucumber.featureresult.FeatureResults.ListElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFeatureResults.g:890:3: (otherlv_1= ',' ( (lv_listContents_2_0= ruleListElement ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==29) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalFeatureResults.g:891:4: otherlv_1= ',' ( (lv_listContents_2_0= ruleListElement ) )
            	    {
            	    otherlv_1=(Token)match(input,29,FOLLOW_16); 

            	    				newLeafNode(otherlv_1, grammarAccess.getListContentsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalFeatureResults.g:895:4: ( (lv_listContents_2_0= ruleListElement ) )
            	    // InternalFeatureResults.g:896:5: (lv_listContents_2_0= ruleListElement )
            	    {
            	    // InternalFeatureResults.g:896:5: (lv_listContents_2_0= ruleListElement )
            	    // InternalFeatureResults.g:897:6: lv_listContents_2_0= ruleListElement
            	    {

            	    						newCompositeNode(grammarAccess.getListContentsAccess().getListContentsListElementParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_listContents_2_0=ruleListElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getListContentsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"listContents",
            	    							lv_listContents_2_0,
            	    							"ingraph.cucumber.featureresult.FeatureResults.ListElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "ruleListContents"


    // $ANTLR start "entryRuleListElement"
    // InternalFeatureResults.g:919:1: entryRuleListElement returns [EObject current=null] : iv_ruleListElement= ruleListElement EOF ;
    public final EObject entryRuleListElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListElement = null;


        try {
            // InternalFeatureResults.g:919:52: (iv_ruleListElement= ruleListElement EOF )
            // InternalFeatureResults.g:920:2: iv_ruleListElement= ruleListElement EOF
            {
             newCompositeNode(grammarAccess.getListElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListElement=ruleListElement();

            state._fsp--;

             current =iv_ruleListElement; 
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
    // $ANTLR end "entryRuleListElement"


    // $ANTLR start "ruleListElement"
    // InternalFeatureResults.g:926:1: ruleListElement returns [EObject current=null] : this_FeatureValue_0= ruleFeatureValue ;
    public final EObject ruleListElement() throws RecognitionException {
        EObject current = null;

        EObject this_FeatureValue_0 = null;



        	enterRule();

        try {
            // InternalFeatureResults.g:932:2: (this_FeatureValue_0= ruleFeatureValue )
            // InternalFeatureResults.g:933:2: this_FeatureValue_0= ruleFeatureValue
            {

            		newCompositeNode(grammarAccess.getListElementAccess().getFeatureValueParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_FeatureValue_0=ruleFeatureValue();

            state._fsp--;


            		current = this_FeatureValue_0;
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
    // $ANTLR end "ruleListElement"


    // $ANTLR start "entryRuleMap"
    // InternalFeatureResults.g:944:1: entryRuleMap returns [EObject current=null] : iv_ruleMap= ruleMap EOF ;
    public final EObject entryRuleMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMap = null;


        try {
            // InternalFeatureResults.g:944:44: (iv_ruleMap= ruleMap EOF )
            // InternalFeatureResults.g:945:2: iv_ruleMap= ruleMap EOF
            {
             newCompositeNode(grammarAccess.getMapRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMap=ruleMap();

            state._fsp--;

             current =iv_ruleMap; 
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
    // $ANTLR end "entryRuleMap"


    // $ANTLR start "ruleMap"
    // InternalFeatureResults.g:951:1: ruleMap returns [EObject current=null] : this_PropertyMap_0= rulePropertyMap ;
    public final EObject ruleMap() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyMap_0 = null;



        	enterRule();

        try {
            // InternalFeatureResults.g:957:2: (this_PropertyMap_0= rulePropertyMap )
            // InternalFeatureResults.g:958:2: this_PropertyMap_0= rulePropertyMap
            {

            		newCompositeNode(grammarAccess.getMapAccess().getPropertyMapParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_PropertyMap_0=rulePropertyMap();

            state._fsp--;


            		current = this_PropertyMap_0;
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
    // $ANTLR end "ruleMap"


    // $ANTLR start "entryRulePropertyMap"
    // InternalFeatureResults.g:969:1: entryRulePropertyMap returns [EObject current=null] : iv_rulePropertyMap= rulePropertyMap EOF ;
    public final EObject entryRulePropertyMap() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMap = null;


        try {
            // InternalFeatureResults.g:969:52: (iv_rulePropertyMap= rulePropertyMap EOF )
            // InternalFeatureResults.g:970:2: iv_rulePropertyMap= rulePropertyMap EOF
            {
             newCompositeNode(grammarAccess.getPropertyMapRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyMap=rulePropertyMap();

            state._fsp--;

             current =iv_rulePropertyMap; 
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
    // $ANTLR end "entryRulePropertyMap"


    // $ANTLR start "rulePropertyMap"
    // InternalFeatureResults.g:976:1: rulePropertyMap returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_mapContents_2_0= ruleMapContents ) )? otherlv_3= '}' ) ;
    public final EObject rulePropertyMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_mapContents_2_0 = null;



        	enterRule();

        try {
            // InternalFeatureResults.g:982:2: ( ( () otherlv_1= '{' ( (lv_mapContents_2_0= ruleMapContents ) )? otherlv_3= '}' ) )
            // InternalFeatureResults.g:983:2: ( () otherlv_1= '{' ( (lv_mapContents_2_0= ruleMapContents ) )? otherlv_3= '}' )
            {
            // InternalFeatureResults.g:983:2: ( () otherlv_1= '{' ( (lv_mapContents_2_0= ruleMapContents ) )? otherlv_3= '}' )
            // InternalFeatureResults.g:984:3: () otherlv_1= '{' ( (lv_mapContents_2_0= ruleMapContents ) )? otherlv_3= '}'
            {
            // InternalFeatureResults.g:984:3: ()
            // InternalFeatureResults.g:985:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPropertyMapAccess().getPropertyMapAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyMapAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalFeatureResults.g:995:3: ( (lv_mapContents_2_0= ruleMapContents ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_IDENTIFIER) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalFeatureResults.g:996:4: (lv_mapContents_2_0= ruleMapContents )
                    {
                    // InternalFeatureResults.g:996:4: (lv_mapContents_2_0= ruleMapContents )
                    // InternalFeatureResults.g:997:5: lv_mapContents_2_0= ruleMapContents
                    {

                    					newCompositeNode(grammarAccess.getPropertyMapAccess().getMapContentsMapContentsParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_18);
                    lv_mapContents_2_0=ruleMapContents();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPropertyMapRule());
                    					}
                    					set(
                    						current,
                    						"mapContents",
                    						lv_mapContents_2_0,
                    						"ingraph.cucumber.featureresult.FeatureResults.MapContents");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertyMapAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "rulePropertyMap"


    // $ANTLR start "entryRuleMapContents"
    // InternalFeatureResults.g:1022:1: entryRuleMapContents returns [EObject current=null] : iv_ruleMapContents= ruleMapContents EOF ;
    public final EObject entryRuleMapContents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapContents = null;


        try {
            // InternalFeatureResults.g:1022:52: (iv_ruleMapContents= ruleMapContents EOF )
            // InternalFeatureResults.g:1023:2: iv_ruleMapContents= ruleMapContents EOF
            {
             newCompositeNode(grammarAccess.getMapContentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapContents=ruleMapContents();

            state._fsp--;

             current =iv_ruleMapContents; 
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
    // $ANTLR end "entryRuleMapContents"


    // $ANTLR start "ruleMapContents"
    // InternalFeatureResults.g:1029:1: ruleMapContents returns [EObject current=null] : ( ( (lv_keyValuePairs_0_0= ruleKeyValuePair ) ) (otherlv_1= ',' ( (lv_keyValuePairs_2_0= ruleKeyValuePair ) ) )* ) ;
    public final EObject ruleMapContents() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_keyValuePairs_0_0 = null;

        EObject lv_keyValuePairs_2_0 = null;



        	enterRule();

        try {
            // InternalFeatureResults.g:1035:2: ( ( ( (lv_keyValuePairs_0_0= ruleKeyValuePair ) ) (otherlv_1= ',' ( (lv_keyValuePairs_2_0= ruleKeyValuePair ) ) )* ) )
            // InternalFeatureResults.g:1036:2: ( ( (lv_keyValuePairs_0_0= ruleKeyValuePair ) ) (otherlv_1= ',' ( (lv_keyValuePairs_2_0= ruleKeyValuePair ) ) )* )
            {
            // InternalFeatureResults.g:1036:2: ( ( (lv_keyValuePairs_0_0= ruleKeyValuePair ) ) (otherlv_1= ',' ( (lv_keyValuePairs_2_0= ruleKeyValuePair ) ) )* )
            // InternalFeatureResults.g:1037:3: ( (lv_keyValuePairs_0_0= ruleKeyValuePair ) ) (otherlv_1= ',' ( (lv_keyValuePairs_2_0= ruleKeyValuePair ) ) )*
            {
            // InternalFeatureResults.g:1037:3: ( (lv_keyValuePairs_0_0= ruleKeyValuePair ) )
            // InternalFeatureResults.g:1038:4: (lv_keyValuePairs_0_0= ruleKeyValuePair )
            {
            // InternalFeatureResults.g:1038:4: (lv_keyValuePairs_0_0= ruleKeyValuePair )
            // InternalFeatureResults.g:1039:5: lv_keyValuePairs_0_0= ruleKeyValuePair
            {

            					newCompositeNode(grammarAccess.getMapContentsAccess().getKeyValuePairsKeyValuePairParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_keyValuePairs_0_0=ruleKeyValuePair();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMapContentsRule());
            					}
            					add(
            						current,
            						"keyValuePairs",
            						lv_keyValuePairs_0_0,
            						"ingraph.cucumber.featureresult.FeatureResults.KeyValuePair");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFeatureResults.g:1056:3: (otherlv_1= ',' ( (lv_keyValuePairs_2_0= ruleKeyValuePair ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==29) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalFeatureResults.g:1057:4: otherlv_1= ',' ( (lv_keyValuePairs_2_0= ruleKeyValuePair ) )
            	    {
            	    otherlv_1=(Token)match(input,29,FOLLOW_19); 

            	    				newLeafNode(otherlv_1, grammarAccess.getMapContentsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalFeatureResults.g:1061:4: ( (lv_keyValuePairs_2_0= ruleKeyValuePair ) )
            	    // InternalFeatureResults.g:1062:5: (lv_keyValuePairs_2_0= ruleKeyValuePair )
            	    {
            	    // InternalFeatureResults.g:1062:5: (lv_keyValuePairs_2_0= ruleKeyValuePair )
            	    // InternalFeatureResults.g:1063:6: lv_keyValuePairs_2_0= ruleKeyValuePair
            	    {

            	    						newCompositeNode(grammarAccess.getMapContentsAccess().getKeyValuePairsKeyValuePairParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_keyValuePairs_2_0=ruleKeyValuePair();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMapContentsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"keyValuePairs",
            	    							lv_keyValuePairs_2_0,
            	    							"ingraph.cucumber.featureresult.FeatureResults.KeyValuePair");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "ruleMapContents"


    // $ANTLR start "entryRuleKeyValuePair"
    // InternalFeatureResults.g:1085:1: entryRuleKeyValuePair returns [EObject current=null] : iv_ruleKeyValuePair= ruleKeyValuePair EOF ;
    public final EObject entryRuleKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValuePair = null;


        try {
            // InternalFeatureResults.g:1085:53: (iv_ruleKeyValuePair= ruleKeyValuePair EOF )
            // InternalFeatureResults.g:1086:2: iv_ruleKeyValuePair= ruleKeyValuePair EOF
            {
             newCompositeNode(grammarAccess.getKeyValuePairRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKeyValuePair=ruleKeyValuePair();

            state._fsp--;

             current =iv_ruleKeyValuePair; 
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
    // $ANTLR end "entryRuleKeyValuePair"


    // $ANTLR start "ruleKeyValuePair"
    // InternalFeatureResults.g:1092:1: ruleKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= rulePropertyKey ) ) otherlv_1= ':' ( (lv_value_2_0= rulePropertyValue ) ) ) ;
    public final EObject ruleKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalFeatureResults.g:1098:2: ( ( ( (lv_key_0_0= rulePropertyKey ) ) otherlv_1= ':' ( (lv_value_2_0= rulePropertyValue ) ) ) )
            // InternalFeatureResults.g:1099:2: ( ( (lv_key_0_0= rulePropertyKey ) ) otherlv_1= ':' ( (lv_value_2_0= rulePropertyValue ) ) )
            {
            // InternalFeatureResults.g:1099:2: ( ( (lv_key_0_0= rulePropertyKey ) ) otherlv_1= ':' ( (lv_value_2_0= rulePropertyValue ) ) )
            // InternalFeatureResults.g:1100:3: ( (lv_key_0_0= rulePropertyKey ) ) otherlv_1= ':' ( (lv_value_2_0= rulePropertyValue ) )
            {
            // InternalFeatureResults.g:1100:3: ( (lv_key_0_0= rulePropertyKey ) )
            // InternalFeatureResults.g:1101:4: (lv_key_0_0= rulePropertyKey )
            {
            // InternalFeatureResults.g:1101:4: (lv_key_0_0= rulePropertyKey )
            // InternalFeatureResults.g:1102:5: lv_key_0_0= rulePropertyKey
            {

            					newCompositeNode(grammarAccess.getKeyValuePairAccess().getKeyPropertyKeyParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_key_0_0=rulePropertyKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKeyValuePairRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_0_0,
            						"ingraph.cucumber.featureresult.FeatureResults.PropertyKey");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getKeyValuePairAccess().getColonKeyword_1());
            		
            // InternalFeatureResults.g:1123:3: ( (lv_value_2_0= rulePropertyValue ) )
            // InternalFeatureResults.g:1124:4: (lv_value_2_0= rulePropertyValue )
            {
            // InternalFeatureResults.g:1124:4: (lv_value_2_0= rulePropertyValue )
            // InternalFeatureResults.g:1125:5: lv_value_2_0= rulePropertyValue
            {

            					newCompositeNode(grammarAccess.getKeyValuePairAccess().getValuePropertyValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=rulePropertyValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKeyValuePairRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"ingraph.cucumber.featureresult.FeatureResults.PropertyValue");
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
    // $ANTLR end "ruleKeyValuePair"


    // $ANTLR start "entryRulePropertyKey"
    // InternalFeatureResults.g:1146:1: entryRulePropertyKey returns [String current=null] : iv_rulePropertyKey= rulePropertyKey EOF ;
    public final String entryRulePropertyKey() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyKey = null;


        try {
            // InternalFeatureResults.g:1146:51: (iv_rulePropertyKey= rulePropertyKey EOF )
            // InternalFeatureResults.g:1147:2: iv_rulePropertyKey= rulePropertyKey EOF
            {
             newCompositeNode(grammarAccess.getPropertyKeyRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyKey=rulePropertyKey();

            state._fsp--;

             current =iv_rulePropertyKey.getText(); 
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
    // $ANTLR end "entryRulePropertyKey"


    // $ANTLR start "rulePropertyKey"
    // InternalFeatureResults.g:1153:1: rulePropertyKey returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SYMBOLIC_NAME_0= ruleSYMBOLIC_NAME ;
    public final AntlrDatatypeRuleToken rulePropertyKey() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_SYMBOLIC_NAME_0 = null;



        	enterRule();

        try {
            // InternalFeatureResults.g:1159:2: (this_SYMBOLIC_NAME_0= ruleSYMBOLIC_NAME )
            // InternalFeatureResults.g:1160:2: this_SYMBOLIC_NAME_0= ruleSYMBOLIC_NAME
            {

            		newCompositeNode(grammarAccess.getPropertyKeyAccess().getSYMBOLIC_NAMEParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_SYMBOLIC_NAME_0=ruleSYMBOLIC_NAME();

            state._fsp--;


            		current.merge(this_SYMBOLIC_NAME_0);
            	

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
    // $ANTLR end "rulePropertyKey"


    // $ANTLR start "entryRulePropertyValue"
    // InternalFeatureResults.g:1173:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalFeatureResults.g:1173:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalFeatureResults.g:1174:2: iv_rulePropertyValue= rulePropertyValue EOF
            {
             newCompositeNode(grammarAccess.getPropertyValueRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyValue=rulePropertyValue();

            state._fsp--;

             current =iv_rulePropertyValue; 
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
    // $ANTLR end "entryRulePropertyValue"


    // $ANTLR start "rulePropertyValue"
    // InternalFeatureResults.g:1180:1: rulePropertyValue returns [EObject current=null] : this_FeatureValue_0= ruleFeatureValue ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject this_FeatureValue_0 = null;



        	enterRule();

        try {
            // InternalFeatureResults.g:1186:2: (this_FeatureValue_0= ruleFeatureValue )
            // InternalFeatureResults.g:1187:2: this_FeatureValue_0= ruleFeatureValue
            {

            		newCompositeNode(grammarAccess.getPropertyValueAccess().getFeatureValueParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_FeatureValue_0=ruleFeatureValue();

            state._fsp--;


            		current = this_FeatureValue_0;
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
    // $ANTLR end "rulePropertyValue"


    // $ANTLR start "entryRuleRelationshipType"
    // InternalFeatureResults.g:1198:1: entryRuleRelationshipType returns [EObject current=null] : iv_ruleRelationshipType= ruleRelationshipType EOF ;
    public final EObject entryRuleRelationshipType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationshipType = null;


        try {
            // InternalFeatureResults.g:1198:57: (iv_ruleRelationshipType= ruleRelationshipType EOF )
            // InternalFeatureResults.g:1199:2: iv_ruleRelationshipType= ruleRelationshipType EOF
            {
             newCompositeNode(grammarAccess.getRelationshipTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationshipType=ruleRelationshipType();

            state._fsp--;

             current =iv_ruleRelationshipType; 
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
    // $ANTLR end "entryRuleRelationshipType"


    // $ANTLR start "ruleRelationshipType"
    // InternalFeatureResults.g:1205:1: ruleRelationshipType returns [EObject current=null] : (otherlv_0= ':' ( (lv_name_1_0= ruleRelationshipTypeName ) ) ) ;
    public final EObject ruleRelationshipType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalFeatureResults.g:1211:2: ( (otherlv_0= ':' ( (lv_name_1_0= ruleRelationshipTypeName ) ) ) )
            // InternalFeatureResults.g:1212:2: (otherlv_0= ':' ( (lv_name_1_0= ruleRelationshipTypeName ) ) )
            {
            // InternalFeatureResults.g:1212:2: (otherlv_0= ':' ( (lv_name_1_0= ruleRelationshipTypeName ) ) )
            // InternalFeatureResults.g:1213:3: otherlv_0= ':' ( (lv_name_1_0= ruleRelationshipTypeName ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationshipTypeAccess().getColonKeyword_0());
            		
            // InternalFeatureResults.g:1217:3: ( (lv_name_1_0= ruleRelationshipTypeName ) )
            // InternalFeatureResults.g:1218:4: (lv_name_1_0= ruleRelationshipTypeName )
            {
            // InternalFeatureResults.g:1218:4: (lv_name_1_0= ruleRelationshipTypeName )
            // InternalFeatureResults.g:1219:5: lv_name_1_0= ruleRelationshipTypeName
            {

            					newCompositeNode(grammarAccess.getRelationshipTypeAccess().getNameRelationshipTypeNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleRelationshipTypeName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationshipTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"ingraph.cucumber.featureresult.FeatureResults.RelationshipTypeName");
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
    // $ANTLR end "ruleRelationshipType"


    // $ANTLR start "entryRuleRelationshipTypeName"
    // InternalFeatureResults.g:1240:1: entryRuleRelationshipTypeName returns [String current=null] : iv_ruleRelationshipTypeName= ruleRelationshipTypeName EOF ;
    public final String entryRuleRelationshipTypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationshipTypeName = null;


        try {
            // InternalFeatureResults.g:1240:60: (iv_ruleRelationshipTypeName= ruleRelationshipTypeName EOF )
            // InternalFeatureResults.g:1241:2: iv_ruleRelationshipTypeName= ruleRelationshipTypeName EOF
            {
             newCompositeNode(grammarAccess.getRelationshipTypeNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationshipTypeName=ruleRelationshipTypeName();

            state._fsp--;

             current =iv_ruleRelationshipTypeName.getText(); 
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
    // $ANTLR end "entryRuleRelationshipTypeName"


    // $ANTLR start "ruleRelationshipTypeName"
    // InternalFeatureResults.g:1247:1: ruleRelationshipTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SYMBOLIC_NAME_0= ruleSYMBOLIC_NAME ;
    public final AntlrDatatypeRuleToken ruleRelationshipTypeName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_SYMBOLIC_NAME_0 = null;



        	enterRule();

        try {
            // InternalFeatureResults.g:1253:2: (this_SYMBOLIC_NAME_0= ruleSYMBOLIC_NAME )
            // InternalFeatureResults.g:1254:2: this_SYMBOLIC_NAME_0= ruleSYMBOLIC_NAME
            {

            		newCompositeNode(grammarAccess.getRelationshipTypeNameAccess().getSYMBOLIC_NAMEParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_SYMBOLIC_NAME_0=ruleSYMBOLIC_NAME();

            state._fsp--;


            		current.merge(this_SYMBOLIC_NAME_0);
            	

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
    // $ANTLR end "ruleRelationshipTypeName"


    // $ANTLR start "entryRuleLabel"
    // InternalFeatureResults.g:1267:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalFeatureResults.g:1267:46: (iv_ruleLabel= ruleLabel EOF )
            // InternalFeatureResults.g:1268:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalFeatureResults.g:1274:1: ruleLabel returns [EObject current=null] : (otherlv_0= ':' ( (lv_name_1_0= ruleLabelName ) ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalFeatureResults.g:1280:2: ( (otherlv_0= ':' ( (lv_name_1_0= ruleLabelName ) ) ) )
            // InternalFeatureResults.g:1281:2: (otherlv_0= ':' ( (lv_name_1_0= ruleLabelName ) ) )
            {
            // InternalFeatureResults.g:1281:2: (otherlv_0= ':' ( (lv_name_1_0= ruleLabelName ) ) )
            // InternalFeatureResults.g:1282:3: otherlv_0= ':' ( (lv_name_1_0= ruleLabelName ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getLabelAccess().getColonKeyword_0());
            		
            // InternalFeatureResults.g:1286:3: ( (lv_name_1_0= ruleLabelName ) )
            // InternalFeatureResults.g:1287:4: (lv_name_1_0= ruleLabelName )
            {
            // InternalFeatureResults.g:1287:4: (lv_name_1_0= ruleLabelName )
            // InternalFeatureResults.g:1288:5: lv_name_1_0= ruleLabelName
            {

            					newCompositeNode(grammarAccess.getLabelAccess().getNameLabelNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleLabelName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLabelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"ingraph.cucumber.featureresult.FeatureResults.LabelName");
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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleLabelName"
    // InternalFeatureResults.g:1309:1: entryRuleLabelName returns [String current=null] : iv_ruleLabelName= ruleLabelName EOF ;
    public final String entryRuleLabelName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLabelName = null;


        try {
            // InternalFeatureResults.g:1309:49: (iv_ruleLabelName= ruleLabelName EOF )
            // InternalFeatureResults.g:1310:2: iv_ruleLabelName= ruleLabelName EOF
            {
             newCompositeNode(grammarAccess.getLabelNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabelName=ruleLabelName();

            state._fsp--;

             current =iv_ruleLabelName.getText(); 
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
    // $ANTLR end "entryRuleLabelName"


    // $ANTLR start "ruleLabelName"
    // InternalFeatureResults.g:1316:1: ruleLabelName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SYMBOLIC_NAME_0= ruleSYMBOLIC_NAME ;
    public final AntlrDatatypeRuleToken ruleLabelName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_SYMBOLIC_NAME_0 = null;



        	enterRule();

        try {
            // InternalFeatureResults.g:1322:2: (this_SYMBOLIC_NAME_0= ruleSYMBOLIC_NAME )
            // InternalFeatureResults.g:1323:2: this_SYMBOLIC_NAME_0= ruleSYMBOLIC_NAME
            {

            		newCompositeNode(grammarAccess.getLabelNameAccess().getSYMBOLIC_NAMEParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_SYMBOLIC_NAME_0=ruleSYMBOLIC_NAME();

            state._fsp--;


            		current.merge(this_SYMBOLIC_NAME_0);
            	

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
    // $ANTLR end "ruleLabelName"


    // $ANTLR start "entryRuleInteger"
    // InternalFeatureResults.g:1336:1: entryRuleInteger returns [EObject current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final EObject entryRuleInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteger = null;


        try {
            // InternalFeatureResults.g:1336:48: (iv_ruleInteger= ruleInteger EOF )
            // InternalFeatureResults.g:1337:2: iv_ruleInteger= ruleInteger EOF
            {
             newCompositeNode(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteger=ruleInteger();

            state._fsp--;

             current =iv_ruleInteger; 
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
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalFeatureResults.g:1343:1: ruleInteger returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleInteger() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalFeatureResults.g:1349:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalFeatureResults.g:1350:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalFeatureResults.g:1350:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalFeatureResults.g:1351:3: (lv_value_0_0= RULE_INT )
            {
            // InternalFeatureResults.g:1351:3: (lv_value_0_0= RULE_INT )
            // InternalFeatureResults.g:1352:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getIntegerAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntegerRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleSYMBOLIC_NAME"
    // InternalFeatureResults.g:1371:1: entryRuleSYMBOLIC_NAME returns [String current=null] : iv_ruleSYMBOLIC_NAME= ruleSYMBOLIC_NAME EOF ;
    public final String entryRuleSYMBOLIC_NAME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSYMBOLIC_NAME = null;


        try {
            // InternalFeatureResults.g:1371:53: (iv_ruleSYMBOLIC_NAME= ruleSYMBOLIC_NAME EOF )
            // InternalFeatureResults.g:1372:2: iv_ruleSYMBOLIC_NAME= ruleSYMBOLIC_NAME EOF
            {
             newCompositeNode(grammarAccess.getSYMBOLIC_NAMERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSYMBOLIC_NAME=ruleSYMBOLIC_NAME();

            state._fsp--;

             current =iv_ruleSYMBOLIC_NAME.getText(); 
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
    // $ANTLR end "entryRuleSYMBOLIC_NAME"


    // $ANTLR start "ruleSYMBOLIC_NAME"
    // InternalFeatureResults.g:1378:1: ruleSYMBOLIC_NAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken ruleSYMBOLIC_NAME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;


        	enterRule();

        try {
            // InternalFeatureResults.g:1384:2: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // InternalFeatureResults.g:1385:2: this_IDENTIFIER_0= RULE_IDENTIFIER
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); 

            		current.merge(this_IDENTIFIER_0);
            	

            		newLeafNode(this_IDENTIFIER_0, grammarAccess.getSYMBOLIC_NAMEAccess().getIDENTIFIERTerminalRuleCall());
            	

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
    // $ANTLR end "ruleSYMBOLIC_NAME"


    // $ANTLR start "entryRuleMyString"
    // InternalFeatureResults.g:1395:1: entryRuleMyString returns [EObject current=null] : iv_ruleMyString= ruleMyString EOF ;
    public final EObject entryRuleMyString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMyString = null;


        try {
            // InternalFeatureResults.g:1395:49: (iv_ruleMyString= ruleMyString EOF )
            // InternalFeatureResults.g:1396:2: iv_ruleMyString= ruleMyString EOF
            {
             newCompositeNode(grammarAccess.getMyStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMyString=ruleMyString();

            state._fsp--;

             current =iv_ruleMyString; 
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
    // $ANTLR end "entryRuleMyString"


    // $ANTLR start "ruleMyString"
    // InternalFeatureResults.g:1402:1: ruleMyString returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING_LITERAL ) ) ;
    public final EObject ruleMyString() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalFeatureResults.g:1408:2: ( ( (lv_value_0_0= RULE_STRING_LITERAL ) ) )
            // InternalFeatureResults.g:1409:2: ( (lv_value_0_0= RULE_STRING_LITERAL ) )
            {
            // InternalFeatureResults.g:1409:2: ( (lv_value_0_0= RULE_STRING_LITERAL ) )
            // InternalFeatureResults.g:1410:3: (lv_value_0_0= RULE_STRING_LITERAL )
            {
            // InternalFeatureResults.g:1410:3: (lv_value_0_0= RULE_STRING_LITERAL )
            // InternalFeatureResults.g:1411:4: lv_value_0_0= RULE_STRING_LITERAL
            {
            lv_value_0_0=(Token)match(input,RULE_STRING_LITERAL,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getMyStringAccess().getValueSTRING_LITERALTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getMyStringRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"ingraph.cucumber.featureresult.FeatureResults.STRING_LITERAL");
            			

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
    // $ANTLR end "ruleMyString"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\4\11\uffff";
    static final String dfa_3s = "\1\36\1\uffff\1\40\11\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\12\1\2\1\11";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\2\5\1\4\1\uffff\1\6\10\uffff\1\1\1\uffff\1\2\1\uffff\1\3\4\uffff\2\7\1\10\1\uffff\1\11",
            "",
            "\3\13\1\uffff\1\13\10\uffff\1\13\1\uffff\3\13\4\uffff\3\13\1\uffff\1\13\1\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "78:2: (this_Node_0= ruleNode | this_Relationship_1= ruleRelationship | this_Path_2= rulePath | this_Integer_3= ruleInteger | this_FloatingPoint_4= ruleFloatingPoint | this_MyString_5= ruleMyString | this_Bool_6= ruleBool | this_NullValue_7= ruleNullValue | this_List_8= ruleList | this_Map_9= ruleMap )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000140040000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000040100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002800002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000005C3A0170L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000005C2A0170L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000080L});

}