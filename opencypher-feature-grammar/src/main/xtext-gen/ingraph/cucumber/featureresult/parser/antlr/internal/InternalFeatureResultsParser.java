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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_INFINITY", "RULE_IDENTIFIER", "RULE_STRING_LITERAL", "RULE_INTEGER_LITERAL", "RULE_ID", "RULE_STRING_BODY", "RULE_ESCAPED_APOSTROPHE", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'['", "']'", "'<'", "'>'", "'-'", "'->'", "'<-'", "'true'", "'false'", "'null'", "','", "'{'", "'}'", "':'"
    };
    public static final int RULE_ESCAPED_APOSTROPHE=11;
    public static final int RULE_IDENTIFIER=6;
    public static final int RULE_INFINITY=5;
    public static final int RULE_STRING=12;
    public static final int RULE_STRING_LITERAL=7;
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
    public static final int RULE_INTEGER_LITERAL=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__23=23;
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
        	return "Value";
       	}

       	@Override
       	protected FeatureResultsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleValue"
    // InternalFeatureResults.g:64:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalFeatureResults.g:64:46: (iv_ruleValue= ruleValue EOF )
            // InternalFeatureResults.g:65:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalFeatureResults.g:71:1: ruleValue returns [EObject current=null] : (this_Node_0= ruleNode | this_Relationship_1= ruleRelationship | this_Path_2= rulePath | this_Integer_3= ruleInteger | this_FloatingPoint_4= ruleFloatingPoint | this_MyString_5= ruleMyString | this_Bool_6= ruleBool | this_NullValue_7= ruleNullValue | this_List_8= ruleList | this_Map_9= ruleMap ) ;
    public final EObject ruleValue() throws RecognitionException {
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

                    			newCompositeNode(grammarAccess.getValueAccess().getNodeParserRuleCall_0());
                    		
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

                    			newCompositeNode(grammarAccess.getValueAccess().getRelationshipParserRuleCall_1());
                    		
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

                    			newCompositeNode(grammarAccess.getValueAccess().getPathParserRuleCall_2());
                    		
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

                    			newCompositeNode(grammarAccess.getValueAccess().getIntegerParserRuleCall_3());
                    		
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

                    			newCompositeNode(grammarAccess.getValueAccess().getFloatingPointParserRuleCall_4());
                    		
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

                    			newCompositeNode(grammarAccess.getValueAccess().getMyStringParserRuleCall_5());
                    		
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

                    			newCompositeNode(grammarAccess.getValueAccess().getBoolParserRuleCall_6());
                    		
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

                    			newCompositeNode(grammarAccess.getValueAccess().getNullValueParserRuleCall_7());
                    		
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

                    			newCompositeNode(grammarAccess.getValueAccess().getListParserRuleCall_8());
                    		
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

                    			newCompositeNode(grammarAccess.getValueAccess().getMapParserRuleCall_9());
                    		
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
    // $ANTLR end "ruleValue"


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
        AntlrDatatypeRuleToken lv_labels_2_0 = null;

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
        AntlrDatatypeRuleToken lv_type_2_0 = null;

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
    // InternalFeatureResults.g:529:1: ruleDirectedRelationship returns [EObject current=null] : ( () ( ( (lv_relationship_1_1= ruleForwardsRelationship | lv_relationship_1_2= ruleBackwardsRelationship ) ) ) ) ;
    public final EObject ruleDirectedRelationship() throws RecognitionException {
        EObject current = null;

        EObject lv_relationship_1_1 = null;

        EObject lv_relationship_1_2 = null;



        	enterRule();

        try {
            // InternalFeatureResults.g:535:2: ( ( () ( ( (lv_relationship_1_1= ruleForwardsRelationship | lv_relationship_1_2= ruleBackwardsRelationship ) ) ) ) )
            // InternalFeatureResults.g:536:2: ( () ( ( (lv_relationship_1_1= ruleForwardsRelationship | lv_relationship_1_2= ruleBackwardsRelationship ) ) ) )
            {
            // InternalFeatureResults.g:536:2: ( () ( ( (lv_relationship_1_1= ruleForwardsRelationship | lv_relationship_1_2= ruleBackwardsRelationship ) ) ) )
            // InternalFeatureResults.g:537:3: () ( ( (lv_relationship_1_1= ruleForwardsRelationship | lv_relationship_1_2= ruleBackwardsRelationship ) ) )
            {
            // InternalFeatureResults.g:537:3: ()
            // InternalFeatureResults.g:538:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDirectedRelationshipAccess().getDirectedRelationshipAction_0(),
            					current);
            			

            }

            // InternalFeatureResults.g:544:3: ( ( (lv_relationship_1_1= ruleForwardsRelationship | lv_relationship_1_2= ruleBackwardsRelationship ) ) )
            // InternalFeatureResults.g:545:4: ( (lv_relationship_1_1= ruleForwardsRelationship | lv_relationship_1_2= ruleBackwardsRelationship ) )
            {
            // InternalFeatureResults.g:545:4: ( (lv_relationship_1_1= ruleForwardsRelationship | lv_relationship_1_2= ruleBackwardsRelationship ) )
            // InternalFeatureResults.g:546:5: (lv_relationship_1_1= ruleForwardsRelationship | lv_relationship_1_2= ruleBackwardsRelationship )
            {
            // InternalFeatureResults.g:546:5: (lv_relationship_1_1= ruleForwardsRelationship | lv_relationship_1_2= ruleBackwardsRelationship )
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
                    // InternalFeatureResults.g:547:6: lv_relationship_1_1= ruleForwardsRelationship
                    {

                    						newCompositeNode(grammarAccess.getDirectedRelationshipAccess().getRelationshipForwardsRelationshipParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_relationship_1_1=ruleForwardsRelationship();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDirectedRelationshipRule());
                    						}
                    						set(
                    							current,
                    							"relationship",
                    							lv_relationship_1_1,
                    							"ingraph.cucumber.featureresult.FeatureResults.ForwardsRelationship");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalFeatureResults.g:563:6: lv_relationship_1_2= ruleBackwardsRelationship
                    {

                    						newCompositeNode(grammarAccess.getDirectedRelationshipAccess().getRelationshipBackwardsRelationshipParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_relationship_1_2=ruleBackwardsRelationship();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDirectedRelationshipRule());
                    						}
                    						set(
                    							current,
                    							"relationship",
                    							lv_relationship_1_2,
                    							"ingraph.cucumber.featureresult.FeatureResults.BackwardsRelationship");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleDirectedRelationship"


    // $ANTLR start "entryRuleForwardsRelationship"
    // InternalFeatureResults.g:585:1: entryRuleForwardsRelationship returns [EObject current=null] : iv_ruleForwardsRelationship= ruleForwardsRelationship EOF ;
    public final EObject entryRuleForwardsRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForwardsRelationship = null;


        try {
            // InternalFeatureResults.g:585:61: (iv_ruleForwardsRelationship= ruleForwardsRelationship EOF )
            // InternalFeatureResults.g:586:2: iv_ruleForwardsRelationship= ruleForwardsRelationship EOF
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
    // InternalFeatureResults.g:592:1: ruleForwardsRelationship returns [EObject current=null] : ( () otherlv_1= '-' ( (lv_relationshipDesc_2_0= ruleRelationshipDesc ) ) otherlv_3= '->' ) ;
    public final EObject ruleForwardsRelationship() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_relationshipDesc_2_0 = null;



        	enterRule();

        try {
            // InternalFeatureResults.g:598:2: ( ( () otherlv_1= '-' ( (lv_relationshipDesc_2_0= ruleRelationshipDesc ) ) otherlv_3= '->' ) )
            // InternalFeatureResults.g:599:2: ( () otherlv_1= '-' ( (lv_relationshipDesc_2_0= ruleRelationshipDesc ) ) otherlv_3= '->' )
            {
            // InternalFeatureResults.g:599:2: ( () otherlv_1= '-' ( (lv_relationshipDesc_2_0= ruleRelationshipDesc ) ) otherlv_3= '->' )
            // InternalFeatureResults.g:600:3: () otherlv_1= '-' ( (lv_relationshipDesc_2_0= ruleRelationshipDesc ) ) otherlv_3= '->'
            {
            // InternalFeatureResults.g:600:3: ()
            // InternalFeatureResults.g:601:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getForwardsRelationshipAccess().getForwardsRelationshipAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getForwardsRelationshipAccess().getHyphenMinusKeyword_1());
            		
            // InternalFeatureResults.g:611:3: ( (lv_relationshipDesc_2_0= ruleRelationshipDesc ) )
            // InternalFeatureResults.g:612:4: (lv_relationshipDesc_2_0= ruleRelationshipDesc )
            {
            // InternalFeatureResults.g:612:4: (lv_relationshipDesc_2_0= ruleRelationshipDesc )
            // InternalFeatureResults.g:613:5: lv_relationshipDesc_2_0= ruleRelationshipDesc
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
    // InternalFeatureResults.g:638:1: entryRuleBackwardsRelationship returns [EObject current=null] : iv_ruleBackwardsRelationship= ruleBackwardsRelationship EOF ;
    public final EObject entryRuleBackwardsRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackwardsRelationship = null;


        try {
            // InternalFeatureResults.g:638:62: (iv_ruleBackwardsRelationship= ruleBackwardsRelationship EOF )
            // InternalFeatureResults.g:639:2: iv_ruleBackwardsRelationship= ruleBackwardsRelationship EOF
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
    // InternalFeatureResults.g:645:1: ruleBackwardsRelationship returns [EObject current=null] : ( () otherlv_1= '<-' ( (lv_relationshipDesc_2_0= ruleRelationshipDesc ) ) otherlv_3= '-' ) ;
    public final EObject ruleBackwardsRelationship() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_relationshipDesc_2_0 = null;



        	enterRule();

        try {
            // InternalFeatureResults.g:651:2: ( ( () otherlv_1= '<-' ( (lv_relationshipDesc_2_0= ruleRelationshipDesc ) ) otherlv_3= '-' ) )
            // InternalFeatureResults.g:652:2: ( () otherlv_1= '<-' ( (lv_relationshipDesc_2_0= ruleRelationshipDesc ) ) otherlv_3= '-' )
            {
            // InternalFeatureResults.g:652:2: ( () otherlv_1= '<-' ( (lv_relationshipDesc_2_0= ruleRelationshipDesc ) ) otherlv_3= '-' )
            // InternalFeatureResults.g:653:3: () otherlv_1= '<-' ( (lv_relationshipDesc_2_0= ruleRelationshipDesc ) ) otherlv_3= '-'
            {
            // InternalFeatureResults.g:653:3: ()
            // InternalFeatureResults.g:654:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBackwardsRelationshipAccess().getBackwardsRelationshipAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getBackwardsRelationshipAccess().getLessThanSignHyphenMinusKeyword_1());
            		
            // InternalFeatureResults.g:664:3: ( (lv_relationshipDesc_2_0= ruleRelationshipDesc ) )
            // InternalFeatureResults.g:665:4: (lv_relationshipDesc_2_0= ruleRelationshipDesc )
            {
            // InternalFeatureResults.g:665:4: (lv_relationshipDesc_2_0= ruleRelationshipDesc )
            // InternalFeatureResults.g:666:5: lv_relationshipDesc_2_0= ruleRelationshipDesc
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


    // $ANTLR start "entryRuleInteger"
    // InternalFeatureResults.g:691:1: entryRuleInteger returns [EObject current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final EObject entryRuleInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteger = null;


        try {
            // InternalFeatureResults.g:691:48: (iv_ruleInteger= ruleInteger EOF )
            // InternalFeatureResults.g:692:2: iv_ruleInteger= ruleInteger EOF
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
    // InternalFeatureResults.g:698:1: ruleInteger returns [EObject current=null] : ( () this_INT_1= RULE_INT ) ;
    public final EObject ruleInteger() throws RecognitionException {
        EObject current = null;

        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalFeatureResults.g:704:2: ( ( () this_INT_1= RULE_INT ) )
            // InternalFeatureResults.g:705:2: ( () this_INT_1= RULE_INT )
            {
            // InternalFeatureResults.g:705:2: ( () this_INT_1= RULE_INT )
            // InternalFeatureResults.g:706:3: () this_INT_1= RULE_INT
            {
            // InternalFeatureResults.g:706:3: ()
            // InternalFeatureResults.g:707:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerAccess().getIntegerAction_0(),
            					current);
            			

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			newLeafNode(this_INT_1, grammarAccess.getIntegerAccess().getINTTerminalRuleCall_1());
            		

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


    // $ANTLR start "entryRuleFloatingPoint"
    // InternalFeatureResults.g:721:1: entryRuleFloatingPoint returns [EObject current=null] : iv_ruleFloatingPoint= ruleFloatingPoint EOF ;
    public final EObject entryRuleFloatingPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatingPoint = null;


        try {
            // InternalFeatureResults.g:721:54: (iv_ruleFloatingPoint= ruleFloatingPoint EOF )
            // InternalFeatureResults.g:722:2: iv_ruleFloatingPoint= ruleFloatingPoint EOF
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
    // InternalFeatureResults.g:728:1: ruleFloatingPoint returns [EObject current=null] : ( () (this_INT_1= RULE_INT | this_INFINITY_2= RULE_INFINITY ) ) ;
    public final EObject ruleFloatingPoint() throws RecognitionException {
        EObject current = null;

        Token this_INT_1=null;
        Token this_INFINITY_2=null;


        	enterRule();

        try {
            // InternalFeatureResults.g:734:2: ( ( () (this_INT_1= RULE_INT | this_INFINITY_2= RULE_INFINITY ) ) )
            // InternalFeatureResults.g:735:2: ( () (this_INT_1= RULE_INT | this_INFINITY_2= RULE_INFINITY ) )
            {
            // InternalFeatureResults.g:735:2: ( () (this_INT_1= RULE_INT | this_INFINITY_2= RULE_INFINITY ) )
            // InternalFeatureResults.g:736:3: () (this_INT_1= RULE_INT | this_INFINITY_2= RULE_INFINITY )
            {
            // InternalFeatureResults.g:736:3: ()
            // InternalFeatureResults.g:737:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFloatingPointAccess().getFloatingPointAction_0(),
            					current);
            			

            }

            // InternalFeatureResults.g:743:3: (this_INT_1= RULE_INT | this_INFINITY_2= RULE_INFINITY )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
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
                    // InternalFeatureResults.g:744:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				newLeafNode(this_INT_1, grammarAccess.getFloatingPointAccess().getINTTerminalRuleCall_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalFeatureResults.g:749:4: this_INFINITY_2= RULE_INFINITY
                    {
                    this_INFINITY_2=(Token)match(input,RULE_INFINITY,FOLLOW_2); 

                    				newLeafNode(this_INFINITY_2, grammarAccess.getFloatingPointAccess().getINFINITYTerminalRuleCall_1_1());
                    			

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
    // $ANTLR end "ruleFloatingPoint"


    // $ANTLR start "entryRuleBool"
    // InternalFeatureResults.g:758:1: entryRuleBool returns [EObject current=null] : iv_ruleBool= ruleBool EOF ;
    public final EObject entryRuleBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBool = null;


        try {
            // InternalFeatureResults.g:758:45: (iv_ruleBool= ruleBool EOF )
            // InternalFeatureResults.g:759:2: iv_ruleBool= ruleBool EOF
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
    // InternalFeatureResults.g:765:1: ruleBool returns [EObject current=null] : ( () (otherlv_1= 'true' | otherlv_2= 'false' ) ) ;
    public final EObject ruleBool() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalFeatureResults.g:771:2: ( ( () (otherlv_1= 'true' | otherlv_2= 'false' ) ) )
            // InternalFeatureResults.g:772:2: ( () (otherlv_1= 'true' | otherlv_2= 'false' ) )
            {
            // InternalFeatureResults.g:772:2: ( () (otherlv_1= 'true' | otherlv_2= 'false' ) )
            // InternalFeatureResults.g:773:3: () (otherlv_1= 'true' | otherlv_2= 'false' )
            {
            // InternalFeatureResults.g:773:3: ()
            // InternalFeatureResults.g:774:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoolAccess().getBoolAction_0(),
            					current);
            			

            }

            // InternalFeatureResults.g:780:3: (otherlv_1= 'true' | otherlv_2= 'false' )
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
                    // InternalFeatureResults.g:781:4: otherlv_1= 'true'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getBoolAccess().getTrueKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalFeatureResults.g:786:4: otherlv_2= 'false'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getBoolAccess().getFalseKeyword_1_1());
                    			

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
    // $ANTLR end "ruleBool"


    // $ANTLR start "entryRuleNullValue"
    // InternalFeatureResults.g:795:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
    public final EObject entryRuleNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullValue = null;


        try {
            // InternalFeatureResults.g:795:50: (iv_ruleNullValue= ruleNullValue EOF )
            // InternalFeatureResults.g:796:2: iv_ruleNullValue= ruleNullValue EOF
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
    // InternalFeatureResults.g:802:1: ruleNullValue returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFeatureResults.g:808:2: ( ( () otherlv_1= 'null' ) )
            // InternalFeatureResults.g:809:2: ( () otherlv_1= 'null' )
            {
            // InternalFeatureResults.g:809:2: ( () otherlv_1= 'null' )
            // InternalFeatureResults.g:810:3: () otherlv_1= 'null'
            {
            // InternalFeatureResults.g:810:3: ()
            // InternalFeatureResults.g:811:4: 
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
    // InternalFeatureResults.g:825:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalFeatureResults.g:825:45: (iv_ruleList= ruleList EOF )
            // InternalFeatureResults.g:826:2: iv_ruleList= ruleList EOF
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
    // InternalFeatureResults.g:832:1: ruleList returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_listContents_2_0= ruleListContents ) )? otherlv_3= ']' ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_listContents_2_0 = null;



        	enterRule();

        try {
            // InternalFeatureResults.g:838:2: ( ( () otherlv_1= '[' ( (lv_listContents_2_0= ruleListContents ) )? otherlv_3= ']' ) )
            // InternalFeatureResults.g:839:2: ( () otherlv_1= '[' ( (lv_listContents_2_0= ruleListContents ) )? otherlv_3= ']' )
            {
            // InternalFeatureResults.g:839:2: ( () otherlv_1= '[' ( (lv_listContents_2_0= ruleListContents ) )? otherlv_3= ']' )
            // InternalFeatureResults.g:840:3: () otherlv_1= '[' ( (lv_listContents_2_0= ruleListContents ) )? otherlv_3= ']'
            {
            // InternalFeatureResults.g:840:3: ()
            // InternalFeatureResults.g:841:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getListAccess().getListAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getListAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalFeatureResults.g:851:3: ( (lv_listContents_2_0= ruleListContents ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_INT && LA9_0<=RULE_INFINITY)||LA9_0==RULE_STRING_LITERAL||LA9_0==17||LA9_0==19||LA9_0==21||(LA9_0>=26 && LA9_0<=28)||LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalFeatureResults.g:852:4: (lv_listContents_2_0= ruleListContents )
                    {
                    // InternalFeatureResults.g:852:4: (lv_listContents_2_0= ruleListContents )
                    // InternalFeatureResults.g:853:5: lv_listContents_2_0= ruleListContents
                    {

                    					newCompositeNode(grammarAccess.getListAccess().getListContentsListContentsParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_listContents_2_0=ruleListContents();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getListRule());
                    					}
                    					add(
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
    // InternalFeatureResults.g:878:1: entryRuleListContents returns [EObject current=null] : iv_ruleListContents= ruleListContents EOF ;
    public final EObject entryRuleListContents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListContents = null;


        try {
            // InternalFeatureResults.g:878:53: (iv_ruleListContents= ruleListContents EOF )
            // InternalFeatureResults.g:879:2: iv_ruleListContents= ruleListContents EOF
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
    // InternalFeatureResults.g:885:1: ruleListContents returns [EObject current=null] : ( ( (lv_listContents_0_0= ruleListElement ) ) (otherlv_1= ',' ( (lv_listContents_2_0= ruleListElement ) ) )* ) ;
    public final EObject ruleListContents() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_listContents_0_0 = null;

        EObject lv_listContents_2_0 = null;



        	enterRule();

        try {
            // InternalFeatureResults.g:891:2: ( ( ( (lv_listContents_0_0= ruleListElement ) ) (otherlv_1= ',' ( (lv_listContents_2_0= ruleListElement ) ) )* ) )
            // InternalFeatureResults.g:892:2: ( ( (lv_listContents_0_0= ruleListElement ) ) (otherlv_1= ',' ( (lv_listContents_2_0= ruleListElement ) ) )* )
            {
            // InternalFeatureResults.g:892:2: ( ( (lv_listContents_0_0= ruleListElement ) ) (otherlv_1= ',' ( (lv_listContents_2_0= ruleListElement ) ) )* )
            // InternalFeatureResults.g:893:3: ( (lv_listContents_0_0= ruleListElement ) ) (otherlv_1= ',' ( (lv_listContents_2_0= ruleListElement ) ) )*
            {
            // InternalFeatureResults.g:893:3: ( (lv_listContents_0_0= ruleListElement ) )
            // InternalFeatureResults.g:894:4: (lv_listContents_0_0= ruleListElement )
            {
            // InternalFeatureResults.g:894:4: (lv_listContents_0_0= ruleListElement )
            // InternalFeatureResults.g:895:5: lv_listContents_0_0= ruleListElement
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

            // InternalFeatureResults.g:912:3: (otherlv_1= ',' ( (lv_listContents_2_0= ruleListElement ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==29) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalFeatureResults.g:913:4: otherlv_1= ',' ( (lv_listContents_2_0= ruleListElement ) )
            	    {
            	    otherlv_1=(Token)match(input,29,FOLLOW_16); 

            	    				newLeafNode(otherlv_1, grammarAccess.getListContentsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalFeatureResults.g:917:4: ( (lv_listContents_2_0= ruleListElement ) )
            	    // InternalFeatureResults.g:918:5: (lv_listContents_2_0= ruleListElement )
            	    {
            	    // InternalFeatureResults.g:918:5: (lv_listContents_2_0= ruleListElement )
            	    // InternalFeatureResults.g:919:6: lv_listContents_2_0= ruleListElement
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
    // InternalFeatureResults.g:941:1: entryRuleListElement returns [EObject current=null] : iv_ruleListElement= ruleListElement EOF ;
    public final EObject entryRuleListElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListElement = null;


        try {
            // InternalFeatureResults.g:941:52: (iv_ruleListElement= ruleListElement EOF )
            // InternalFeatureResults.g:942:2: iv_ruleListElement= ruleListElement EOF
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
    // InternalFeatureResults.g:948:1: ruleListElement returns [EObject current=null] : this_Value_0= ruleValue ;
    public final EObject ruleListElement() throws RecognitionException {
        EObject current = null;

        EObject this_Value_0 = null;



        	enterRule();

        try {
            // InternalFeatureResults.g:954:2: (this_Value_0= ruleValue )
            // InternalFeatureResults.g:955:2: this_Value_0= ruleValue
            {

            		newCompositeNode(grammarAccess.getListElementAccess().getValueParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Value_0=ruleValue();

            state._fsp--;


            		current = this_Value_0;
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
    // InternalFeatureResults.g:966:1: entryRuleMap returns [EObject current=null] : iv_ruleMap= ruleMap EOF ;
    public final EObject entryRuleMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMap = null;


        try {
            // InternalFeatureResults.g:966:44: (iv_ruleMap= ruleMap EOF )
            // InternalFeatureResults.g:967:2: iv_ruleMap= ruleMap EOF
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
    // InternalFeatureResults.g:973:1: ruleMap returns [EObject current=null] : this_PropertyMap_0= rulePropertyMap ;
    public final EObject ruleMap() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyMap_0 = null;



        	enterRule();

        try {
            // InternalFeatureResults.g:979:2: (this_PropertyMap_0= rulePropertyMap )
            // InternalFeatureResults.g:980:2: this_PropertyMap_0= rulePropertyMap
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
    // InternalFeatureResults.g:991:1: entryRulePropertyMap returns [EObject current=null] : iv_rulePropertyMap= rulePropertyMap EOF ;
    public final EObject entryRulePropertyMap() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMap = null;


        try {
            // InternalFeatureResults.g:991:52: (iv_rulePropertyMap= rulePropertyMap EOF )
            // InternalFeatureResults.g:992:2: iv_rulePropertyMap= rulePropertyMap EOF
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
    // InternalFeatureResults.g:998:1: rulePropertyMap returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_mapContents_2_0= ruleMapContents ) )? otherlv_3= '}' ) ;
    public final EObject rulePropertyMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_mapContents_2_0 = null;



        	enterRule();

        try {
            // InternalFeatureResults.g:1004:2: ( ( () otherlv_1= '{' ( (lv_mapContents_2_0= ruleMapContents ) )? otherlv_3= '}' ) )
            // InternalFeatureResults.g:1005:2: ( () otherlv_1= '{' ( (lv_mapContents_2_0= ruleMapContents ) )? otherlv_3= '}' )
            {
            // InternalFeatureResults.g:1005:2: ( () otherlv_1= '{' ( (lv_mapContents_2_0= ruleMapContents ) )? otherlv_3= '}' )
            // InternalFeatureResults.g:1006:3: () otherlv_1= '{' ( (lv_mapContents_2_0= ruleMapContents ) )? otherlv_3= '}'
            {
            // InternalFeatureResults.g:1006:3: ()
            // InternalFeatureResults.g:1007:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPropertyMapAccess().getPropertyMapAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyMapAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalFeatureResults.g:1017:3: ( (lv_mapContents_2_0= ruleMapContents ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_IDENTIFIER) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalFeatureResults.g:1018:4: (lv_mapContents_2_0= ruleMapContents )
                    {
                    // InternalFeatureResults.g:1018:4: (lv_mapContents_2_0= ruleMapContents )
                    // InternalFeatureResults.g:1019:5: lv_mapContents_2_0= ruleMapContents
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
    // InternalFeatureResults.g:1044:1: entryRuleMapContents returns [EObject current=null] : iv_ruleMapContents= ruleMapContents EOF ;
    public final EObject entryRuleMapContents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapContents = null;


        try {
            // InternalFeatureResults.g:1044:52: (iv_ruleMapContents= ruleMapContents EOF )
            // InternalFeatureResults.g:1045:2: iv_ruleMapContents= ruleMapContents EOF
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
    // InternalFeatureResults.g:1051:1: ruleMapContents returns [EObject current=null] : ( ( (lv_keyValuePairs_0_0= ruleKeyValuePair ) ) (otherlv_1= ',' ( (lv_keyValuePairs_2_0= ruleKeyValuePair ) ) )* ) ;
    public final EObject ruleMapContents() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_keyValuePairs_0_0 = null;

        EObject lv_keyValuePairs_2_0 = null;



        	enterRule();

        try {
            // InternalFeatureResults.g:1057:2: ( ( ( (lv_keyValuePairs_0_0= ruleKeyValuePair ) ) (otherlv_1= ',' ( (lv_keyValuePairs_2_0= ruleKeyValuePair ) ) )* ) )
            // InternalFeatureResults.g:1058:2: ( ( (lv_keyValuePairs_0_0= ruleKeyValuePair ) ) (otherlv_1= ',' ( (lv_keyValuePairs_2_0= ruleKeyValuePair ) ) )* )
            {
            // InternalFeatureResults.g:1058:2: ( ( (lv_keyValuePairs_0_0= ruleKeyValuePair ) ) (otherlv_1= ',' ( (lv_keyValuePairs_2_0= ruleKeyValuePair ) ) )* )
            // InternalFeatureResults.g:1059:3: ( (lv_keyValuePairs_0_0= ruleKeyValuePair ) ) (otherlv_1= ',' ( (lv_keyValuePairs_2_0= ruleKeyValuePair ) ) )*
            {
            // InternalFeatureResults.g:1059:3: ( (lv_keyValuePairs_0_0= ruleKeyValuePair ) )
            // InternalFeatureResults.g:1060:4: (lv_keyValuePairs_0_0= ruleKeyValuePair )
            {
            // InternalFeatureResults.g:1060:4: (lv_keyValuePairs_0_0= ruleKeyValuePair )
            // InternalFeatureResults.g:1061:5: lv_keyValuePairs_0_0= ruleKeyValuePair
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

            // InternalFeatureResults.g:1078:3: (otherlv_1= ',' ( (lv_keyValuePairs_2_0= ruleKeyValuePair ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==29) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalFeatureResults.g:1079:4: otherlv_1= ',' ( (lv_keyValuePairs_2_0= ruleKeyValuePair ) )
            	    {
            	    otherlv_1=(Token)match(input,29,FOLLOW_19); 

            	    				newLeafNode(otherlv_1, grammarAccess.getMapContentsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalFeatureResults.g:1083:4: ( (lv_keyValuePairs_2_0= ruleKeyValuePair ) )
            	    // InternalFeatureResults.g:1084:5: (lv_keyValuePairs_2_0= ruleKeyValuePair )
            	    {
            	    // InternalFeatureResults.g:1084:5: (lv_keyValuePairs_2_0= ruleKeyValuePair )
            	    // InternalFeatureResults.g:1085:6: lv_keyValuePairs_2_0= ruleKeyValuePair
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
    // InternalFeatureResults.g:1107:1: entryRuleKeyValuePair returns [EObject current=null] : iv_ruleKeyValuePair= ruleKeyValuePair EOF ;
    public final EObject entryRuleKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValuePair = null;


        try {
            // InternalFeatureResults.g:1107:53: (iv_ruleKeyValuePair= ruleKeyValuePair EOF )
            // InternalFeatureResults.g:1108:2: iv_ruleKeyValuePair= ruleKeyValuePair EOF
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
    // InternalFeatureResults.g:1114:1: ruleKeyValuePair returns [EObject current=null] : ( rulePropertyKey otherlv_1= ':' this_PropertyValue_2= rulePropertyValue ) ;
    public final EObject ruleKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_PropertyValue_2 = null;



        	enterRule();

        try {
            // InternalFeatureResults.g:1120:2: ( ( rulePropertyKey otherlv_1= ':' this_PropertyValue_2= rulePropertyValue ) )
            // InternalFeatureResults.g:1121:2: ( rulePropertyKey otherlv_1= ':' this_PropertyValue_2= rulePropertyValue )
            {
            // InternalFeatureResults.g:1121:2: ( rulePropertyKey otherlv_1= ':' this_PropertyValue_2= rulePropertyValue )
            // InternalFeatureResults.g:1122:3: rulePropertyKey otherlv_1= ':' this_PropertyValue_2= rulePropertyValue
            {

            			newCompositeNode(grammarAccess.getKeyValuePairAccess().getPropertyKeyParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            rulePropertyKey();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,32,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getKeyValuePairAccess().getColonKeyword_1());
            		

            			newCompositeNode(grammarAccess.getKeyValuePairAccess().getPropertyValueParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_PropertyValue_2=rulePropertyValue();

            state._fsp--;


            			current = this_PropertyValue_2;
            			afterParserOrEnumRuleCall();
            		

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
    // InternalFeatureResults.g:1145:1: entryRulePropertyKey returns [String current=null] : iv_rulePropertyKey= rulePropertyKey EOF ;
    public final String entryRulePropertyKey() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyKey = null;


        try {
            // InternalFeatureResults.g:1145:51: (iv_rulePropertyKey= rulePropertyKey EOF )
            // InternalFeatureResults.g:1146:2: iv_rulePropertyKey= rulePropertyKey EOF
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
    // InternalFeatureResults.g:1152:1: rulePropertyKey returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SYMBOLIC_NAME_0= ruleSYMBOLIC_NAME ;
    public final AntlrDatatypeRuleToken rulePropertyKey() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_SYMBOLIC_NAME_0 = null;



        	enterRule();

        try {
            // InternalFeatureResults.g:1158:2: (this_SYMBOLIC_NAME_0= ruleSYMBOLIC_NAME )
            // InternalFeatureResults.g:1159:2: this_SYMBOLIC_NAME_0= ruleSYMBOLIC_NAME
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
    // InternalFeatureResults.g:1172:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalFeatureResults.g:1172:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalFeatureResults.g:1173:2: iv_rulePropertyValue= rulePropertyValue EOF
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
    // InternalFeatureResults.g:1179:1: rulePropertyValue returns [EObject current=null] : this_Value_0= ruleValue ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject this_Value_0 = null;



        	enterRule();

        try {
            // InternalFeatureResults.g:1185:2: (this_Value_0= ruleValue )
            // InternalFeatureResults.g:1186:2: this_Value_0= ruleValue
            {

            		newCompositeNode(grammarAccess.getPropertyValueAccess().getValueParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Value_0=ruleValue();

            state._fsp--;


            		current = this_Value_0;
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
    // InternalFeatureResults.g:1197:1: entryRuleRelationshipType returns [String current=null] : iv_ruleRelationshipType= ruleRelationshipType EOF ;
    public final String entryRuleRelationshipType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationshipType = null;


        try {
            // InternalFeatureResults.g:1197:56: (iv_ruleRelationshipType= ruleRelationshipType EOF )
            // InternalFeatureResults.g:1198:2: iv_ruleRelationshipType= ruleRelationshipType EOF
            {
             newCompositeNode(grammarAccess.getRelationshipTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationshipType=ruleRelationshipType();

            state._fsp--;

             current =iv_ruleRelationshipType.getText(); 
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
    // InternalFeatureResults.g:1204:1: ruleRelationshipType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ':' this_RelationshipTypeName_1= ruleRelationshipTypeName ) ;
    public final AntlrDatatypeRuleToken ruleRelationshipType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_RelationshipTypeName_1 = null;



        	enterRule();

        try {
            // InternalFeatureResults.g:1210:2: ( (kw= ':' this_RelationshipTypeName_1= ruleRelationshipTypeName ) )
            // InternalFeatureResults.g:1211:2: (kw= ':' this_RelationshipTypeName_1= ruleRelationshipTypeName )
            {
            // InternalFeatureResults.g:1211:2: (kw= ':' this_RelationshipTypeName_1= ruleRelationshipTypeName )
            // InternalFeatureResults.g:1212:3: kw= ':' this_RelationshipTypeName_1= ruleRelationshipTypeName
            {
            kw=(Token)match(input,32,FOLLOW_19); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getRelationshipTypeAccess().getColonKeyword_0());
            		

            			newCompositeNode(grammarAccess.getRelationshipTypeAccess().getRelationshipTypeNameParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_RelationshipTypeName_1=ruleRelationshipTypeName();

            state._fsp--;


            			current.merge(this_RelationshipTypeName_1);
            		

            			afterParserOrEnumRuleCall();
            		

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
    // InternalFeatureResults.g:1231:1: entryRuleRelationshipTypeName returns [String current=null] : iv_ruleRelationshipTypeName= ruleRelationshipTypeName EOF ;
    public final String entryRuleRelationshipTypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationshipTypeName = null;


        try {
            // InternalFeatureResults.g:1231:60: (iv_ruleRelationshipTypeName= ruleRelationshipTypeName EOF )
            // InternalFeatureResults.g:1232:2: iv_ruleRelationshipTypeName= ruleRelationshipTypeName EOF
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
    // InternalFeatureResults.g:1238:1: ruleRelationshipTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SYMBOLIC_NAME_0= ruleSYMBOLIC_NAME ;
    public final AntlrDatatypeRuleToken ruleRelationshipTypeName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_SYMBOLIC_NAME_0 = null;



        	enterRule();

        try {
            // InternalFeatureResults.g:1244:2: (this_SYMBOLIC_NAME_0= ruleSYMBOLIC_NAME )
            // InternalFeatureResults.g:1245:2: this_SYMBOLIC_NAME_0= ruleSYMBOLIC_NAME
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
    // InternalFeatureResults.g:1258:1: entryRuleLabel returns [String current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final String entryRuleLabel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLabel = null;


        try {
            // InternalFeatureResults.g:1258:45: (iv_ruleLabel= ruleLabel EOF )
            // InternalFeatureResults.g:1259:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel.getText(); 
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
    // InternalFeatureResults.g:1265:1: ruleLabel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ':' this_LabelName_1= ruleLabelName ) ;
    public final AntlrDatatypeRuleToken ruleLabel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_LabelName_1 = null;



        	enterRule();

        try {
            // InternalFeatureResults.g:1271:2: ( (kw= ':' this_LabelName_1= ruleLabelName ) )
            // InternalFeatureResults.g:1272:2: (kw= ':' this_LabelName_1= ruleLabelName )
            {
            // InternalFeatureResults.g:1272:2: (kw= ':' this_LabelName_1= ruleLabelName )
            // InternalFeatureResults.g:1273:3: kw= ':' this_LabelName_1= ruleLabelName
            {
            kw=(Token)match(input,32,FOLLOW_19); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getLabelAccess().getColonKeyword_0());
            		

            			newCompositeNode(grammarAccess.getLabelAccess().getLabelNameParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_LabelName_1=ruleLabelName();

            state._fsp--;


            			current.merge(this_LabelName_1);
            		

            			afterParserOrEnumRuleCall();
            		

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
    // InternalFeatureResults.g:1292:1: entryRuleLabelName returns [String current=null] : iv_ruleLabelName= ruleLabelName EOF ;
    public final String entryRuleLabelName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLabelName = null;


        try {
            // InternalFeatureResults.g:1292:49: (iv_ruleLabelName= ruleLabelName EOF )
            // InternalFeatureResults.g:1293:2: iv_ruleLabelName= ruleLabelName EOF
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
    // InternalFeatureResults.g:1299:1: ruleLabelName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SYMBOLIC_NAME_0= ruleSYMBOLIC_NAME ;
    public final AntlrDatatypeRuleToken ruleLabelName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_SYMBOLIC_NAME_0 = null;



        	enterRule();

        try {
            // InternalFeatureResults.g:1305:2: (this_SYMBOLIC_NAME_0= ruleSYMBOLIC_NAME )
            // InternalFeatureResults.g:1306:2: this_SYMBOLIC_NAME_0= ruleSYMBOLIC_NAME
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


    // $ANTLR start "entryRuleSYMBOLIC_NAME"
    // InternalFeatureResults.g:1319:1: entryRuleSYMBOLIC_NAME returns [String current=null] : iv_ruleSYMBOLIC_NAME= ruleSYMBOLIC_NAME EOF ;
    public final String entryRuleSYMBOLIC_NAME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSYMBOLIC_NAME = null;


        try {
            // InternalFeatureResults.g:1319:53: (iv_ruleSYMBOLIC_NAME= ruleSYMBOLIC_NAME EOF )
            // InternalFeatureResults.g:1320:2: iv_ruleSYMBOLIC_NAME= ruleSYMBOLIC_NAME EOF
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
    // InternalFeatureResults.g:1326:1: ruleSYMBOLIC_NAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken ruleSYMBOLIC_NAME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;


        	enterRule();

        try {
            // InternalFeatureResults.g:1332:2: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // InternalFeatureResults.g:1333:2: this_IDENTIFIER_0= RULE_IDENTIFIER
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
    // InternalFeatureResults.g:1343:1: entryRuleMyString returns [EObject current=null] : iv_ruleMyString= ruleMyString EOF ;
    public final EObject entryRuleMyString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMyString = null;


        try {
            // InternalFeatureResults.g:1343:49: (iv_ruleMyString= ruleMyString EOF )
            // InternalFeatureResults.g:1344:2: iv_ruleMyString= ruleMyString EOF
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
    // InternalFeatureResults.g:1350:1: ruleMyString returns [EObject current=null] : ( () this_STRING_LITERAL_1= RULE_STRING_LITERAL ) ;
    public final EObject ruleMyString() throws RecognitionException {
        EObject current = null;

        Token this_STRING_LITERAL_1=null;


        	enterRule();

        try {
            // InternalFeatureResults.g:1356:2: ( ( () this_STRING_LITERAL_1= RULE_STRING_LITERAL ) )
            // InternalFeatureResults.g:1357:2: ( () this_STRING_LITERAL_1= RULE_STRING_LITERAL )
            {
            // InternalFeatureResults.g:1357:2: ( () this_STRING_LITERAL_1= RULE_STRING_LITERAL )
            // InternalFeatureResults.g:1358:3: () this_STRING_LITERAL_1= RULE_STRING_LITERAL
            {
            // InternalFeatureResults.g:1358:3: ()
            // InternalFeatureResults.g:1359:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMyStringAccess().getMyStringAction_0(),
            					current);
            			

            }

            this_STRING_LITERAL_1=(Token)match(input,RULE_STRING_LITERAL,FOLLOW_2); 

            			newLeafNode(this_STRING_LITERAL_1, grammarAccess.getMyStringAccess().getSTRING_LITERALTerminalRuleCall_1());
            		

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
            "\1\4\1\5\1\uffff\1\6\11\uffff\1\1\1\uffff\1\2\1\uffff\1\3\4\uffff\2\7\1\10\1\uffff\1\11",
            "",
            "\2\13\1\uffff\1\13\11\uffff\1\13\1\uffff\3\13\4\uffff\3\13\1\uffff\1\13\1\uffff\1\12",
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
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000005C3A00B0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000005C2A00B0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});

}