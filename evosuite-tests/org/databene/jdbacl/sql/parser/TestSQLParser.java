/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl.sql.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.BufferedTokenStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.TokenSource;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;
import org.databene.jdbacl.sql.parser.SQLParser;
import org.databene.regex.antlr.RegexLexer;
import org.databene.script.antlr.DatabeneScriptLexer;
import org.evosuite.testcase.CodeUnderTestException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestSQLParser {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ANTLRStringStream aNTLRStringStream0 = new ANTLRStringStream(".");
      RegexLexer regexLexer0 = new RegexLexer((CharStream) aNTLRStringStream0);
      CommonTokenStream commonTokenStream0 = new CommonTokenStream((TokenSource) regexLexer0);
      SQLParser sQLParser0 = new SQLParser((TokenStream) commonTokenStream0);
      sQLParser0.size();
      assertEquals(2, sQLParser0.getNumberOfSyntaxErrors());
      assertEquals(2, commonTokenStream0.range());
  }

  @Test
  public void test1()  throws Throwable  {
      CommonTokenStream commonTokenStream0 = new CommonTokenStream((TokenSource) null);
      SQLParser sQLParser0 = new SQLParser((TokenStream) commonTokenStream0);
      // Undeclared exception!
      try {
        sQLParser0.ora_storage_opt();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      SQLParser.create_index_return sQLParser_create_index_return0 = new SQLParser.create_index_return();
      Object object0 = sQLParser_create_index_return0.getTree();
      assertNull(object0);
  }

  @Test
  public void test3()  throws Throwable  {
      TokenRewriteStream tokenRewriteStream0 = new TokenRewriteStream();
      SQLParser sQLParser0 = new SQLParser((TokenStream) tokenRewriteStream0);
      // Undeclared exception!
      try {
        sQLParser0.table_name();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      SQLParser.foreign_key_constraint_return sQLParser_foreign_key_constraint_return0 = new SQLParser.foreign_key_constraint_return();
      assertNotNull(sQLParser_foreign_key_constraint_return0);
  }

  @Test
  public void test5()  throws Throwable  {
      ANTLRReaderStream aNTLRReaderStream0 = new ANTLRReaderStream();
      RecognizerSharedState recognizerSharedState0 = new RecognizerSharedState();
      DatabeneScriptLexer databeneScriptLexer0 = new DatabeneScriptLexer((CharStream) aNTLRReaderStream0, recognizerSharedState0);
      BufferedTokenStream bufferedTokenStream0 = new BufferedTokenStream((TokenSource) databeneScriptLexer0);
      SQLParser sQLParser0 = new SQLParser((TokenStream) bufferedTokenStream0);
      try {
        sQLParser0.expression_list();
        fail("Expecting exception: NoViableAltException");
      } catch(NoViableAltException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      ANTLRStringStream aNTLRStringStream0 = new ANTLRStringStream("A'S");
      RegexLexer regexLexer0 = new RegexLexer((CharStream) aNTLRStringStream0);
      CommonTokenStream commonTokenStream0 = new CommonTokenStream((TokenSource) regexLexer0);
      SQLParser sQLParser0 = new SQLParser((TokenStream) commonTokenStream0);
      try {
        sQLParser0.exclusive_or_expression();
        fail("Expecting exception: MismatchedTokenException");
      } catch(MismatchedTokenException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      TokenRewriteStream tokenRewriteStream0 = new TokenRewriteStream();
      SQLParser sQLParser0 = new SQLParser((TokenStream) tokenRewriteStream0);
      CommonTreeAdaptor commonTreeAdaptor0 = (CommonTreeAdaptor)sQLParser0.getTreeAdaptor();
      sQLParser0.setTreeAdaptor((TreeAdaptor) commonTreeAdaptor0);
      assertEquals(false, sQLParser0.failed());
  }

  @Test
  public void test8()  throws Throwable  {
      RecognizerSharedState recognizerSharedState0 = new RecognizerSharedState();
      SQLParser sQLParser0 = new SQLParser((TokenStream) null, recognizerSharedState0);
      // Undeclared exception!
      try {
        sQLParser0.default_value();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test9()  throws Throwable  {
      SQLParser.check_constraint_return sQLParser_check_constraint_return0 = new SQLParser.check_constraint_return();
      Object object0 = sQLParser_check_constraint_return0.getTree();
      assertNull(object0);
  }

  @Test
  public void test10()  throws Throwable  {
      SQLParser.drop_sequence_return sQLParser_drop_sequence_return0 = new SQLParser.drop_sequence_return();
      assertNotNull(sQLParser_drop_sequence_return0);
  }

  @Test
  public void test11()  throws Throwable  {
      SQLParser.add_constraints_return sQLParser_add_constraints_return0 = new SQLParser.add_constraints_return();
      Object object0 = sQLParser_add_constraints_return0.getTree();
      assertNull(object0);
  }

  @Test
  public void test12()  throws Throwable  {
      SQLParser.ora_lob_config_return sQLParser_ora_lob_config_return0 = new SQLParser.ora_lob_config_return();
      assertNotNull(sQLParser_ora_lob_config_return0);
  }

  @Test
  public void test13()  throws Throwable  {
      SQLParser.column_spec_return sQLParser_column_spec_return0 = new SQLParser.column_spec_return();
      Object object0 = sQLParser_column_spec_return0.getTree();
      assertNull(object0);
  }

  @Test
  public void test14()  throws Throwable  {
      SQLParser.column_detail_return sQLParser_column_detail_return0 = new SQLParser.column_detail_return();
      assertNotNull(sQLParser_column_detail_return0);
  }

  @Test
  public void test15()  throws Throwable  {
      TokenRewriteStream tokenRewriteStream0 = new TokenRewriteStream();
      SQLParser sQLParser0 = new SQLParser((TokenStream) tokenRewriteStream0);
      // Undeclared exception!
      try {
        sQLParser0.drop_table();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test16()  throws Throwable  {
      ANTLRStringStream aNTLRStringStream0 = new ANTLRStringStream(".");
      RegexLexer regexLexer0 = new RegexLexer((CharStream) aNTLRStringStream0);
      CommonTokenStream commonTokenStream0 = new CommonTokenStream((TokenSource) regexLexer0);
      SQLParser sQLParser0 = new SQLParser((TokenStream) commonTokenStream0);
      sQLParser0.exclusive_or_expression();
      assertEquals(1, commonTokenStream0.range());
      assertEquals(1, commonTokenStream0.mark());
  }

  @Test
  public void test17()  throws Throwable  {
      SQLParser.table_details_return sQLParser_table_details_return0 = new SQLParser.table_details_return();
      assertNotNull(sQLParser_table_details_return0);
  }

  @Test
  public void test18()  throws Throwable  {
      SQLParser.constraint_spec_return sQLParser_constraint_spec_return0 = new SQLParser.constraint_spec_return();
      assertNotNull(sQLParser_constraint_spec_return0);
  }

  @Test
  public void test19()  throws Throwable  {
      SQLParser.partition_parts_return sQLParser_partition_parts_return0 = new SQLParser.partition_parts_return();
      Object object0 = sQLParser_partition_parts_return0.getTree();
      assertNull(object0);
  }

  @Test
  public void test20()  throws Throwable  {
      SQLParser.index_name_return sQLParser_index_name_return0 = new SQLParser.index_name_return();
      Object object0 = sQLParser_index_name_return0.getTree();
      assertNull(object0);
  }

  @Test
  public void test21()  throws Throwable  {
      SQLParser.table_mutation_return sQLParser_table_mutation_return0 = new SQLParser.table_mutation_return();
      assertNotNull(sQLParser_table_mutation_return0);
  }

  @Test
  public void test22()  throws Throwable  {
      SQLParser.table_comment_details_return sQLParser_table_comment_details_return0 = new SQLParser.table_comment_details_return();
      Object object0 = sQLParser_table_comment_details_return0.getTree();
      assertNull(object0);
  }

  @Test
  public void test23()  throws Throwable  {
      SQLParser.partition_part_return sQLParser_partition_part_return0 = new SQLParser.partition_part_return();
      assertNotNull(sQLParser_partition_part_return0);
  }

  @Test
  public void test24()  throws Throwable  {
      SQLParser.ora_flag_return sQLParser_ora_flag_return0 = new SQLParser.ora_flag_return();
      assertNotNull(sQLParser_ora_flag_return0);
  }

  @Test
  public void test25()  throws Throwable  {
      SQLParser.ora_partition_spec_return sQLParser_ora_partition_spec_return0 = new SQLParser.ora_partition_spec_return();
      assertNotNull(sQLParser_ora_partition_spec_return0);
  }

  @Test
  public void test26()  throws Throwable  {
      RecognizerSharedState recognizerSharedState0 = new RecognizerSharedState();
      SQLParser sQLParser0 = new SQLParser((TokenStream) null, recognizerSharedState0);
      // Undeclared exception!
      try {
        sQLParser0.qualified_name();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test27()  throws Throwable  {
      ANTLRStringStream aNTLRStringStream0 = new ANTLRStringStream(".");
      RegexLexer regexLexer0 = new RegexLexer((CharStream) aNTLRStringStream0);
      CommonTokenStream commonTokenStream0 = new CommonTokenStream((TokenSource) regexLexer0);
      SQLParser sQLParser0 = new SQLParser((TokenStream) commonTokenStream0);
      SQLParser.ora_configs_return sQLParser_ora_configs_return0 = sQLParser0.ora_configs();
      assertNotNull(sQLParser_ora_configs_return0);
  }

  @Test
  public void test28()  throws Throwable  {
      RegexLexer regexLexer0 = new RegexLexer();
      TokenRewriteStream tokenRewriteStream0 = new TokenRewriteStream((TokenSource) regexLexer0, 1958);
      RecognizerSharedState recognizerSharedState0 = new RecognizerSharedState();
      Parser parser0 = new Parser((TokenStream) tokenRewriteStream0, recognizerSharedState0);
  }

  @Test
  public void test29()  throws Throwable  {
      SQLParser.value_list_return sQLParser_value_list_return0 = new SQLParser.value_list_return();
      Object object0 = sQLParser_value_list_return0.getTree();
      assertNull(object0);
  }

  @Test
  public void test30()  throws Throwable  {
      BufferedTokenStream bufferedTokenStream0 = new BufferedTokenStream((TokenSource) null);
      RecognizerSharedState recognizerSharedState0 = new RecognizerSharedState();
      SQLParser sQLParser0 = new SQLParser((TokenStream) bufferedTokenStream0, recognizerSharedState0);
      // Undeclared exception!
      try {
        sQLParser0.commands();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test31()  throws Throwable  {
      SQLParser.ora_lob_return sQLParser_ora_lob_return0 = new SQLParser.ora_lob_return();
      assertNotNull(sQLParser_ora_lob_return0);
  }

  @Test
  public void test32()  throws Throwable  {
      SQLParser.create_sequence_return sQLParser_create_sequence_return0 = new SQLParser.create_sequence_return();
      Object object0 = sQLParser_create_sequence_return0.getTree();
      assertNull(object0);
  }

  @Test
  public void test33()  throws Throwable  {
      SQLParser.fractionDigits_return sQLParser_fractionDigits_return0 = new SQLParser.fractionDigits_return();
      Object object0 = sQLParser_fractionDigits_return0.getTree();
      assertNull(object0);
  }

  @Test
  public void test34()  throws Throwable  {
      SQLParser.drop_index_return sQLParser_drop_index_return0 = new SQLParser.drop_index_return();
      Object object0 = sQLParser_drop_index_return0.getTree();
      assertNull(object0);
  }

  @Test
  public void test35()  throws Throwable  {
      SQLParser.create_table_return sQLParser_create_table_return0 = new SQLParser.create_table_return();
      Object object0 = sQLParser_create_table_return0.getTree();
      assertNull(object0);
  }

  @Test
  public void test36()  throws Throwable  {
      SQLParser.ora_config_return sQLParser_ora_config_return0 = new SQLParser.ora_config_return();
      Object object0 = sQLParser_ora_config_return0.getTree();
      assertNull(object0);
  }

  @Test
  public void test37()  throws Throwable  {
      SQLParser.name_list_return sQLParser_name_list_return0 = new SQLParser.name_list_return();
      Object object0 = sQLParser_name_list_return0.getTree();
      assertNull(object0);
  }

  @Test
  public void test38()  throws Throwable  {
      SQLParser.unique_constraint_return sQLParser_unique_constraint_return0 = new SQLParser.unique_constraint_return();
      Object object0 = sQLParser_unique_constraint_return0.getTree();
      assertNull(object0);
  }

  @Test
  public void test39()  throws Throwable  {
      RecognizerSharedState recognizerSharedState0 = new RecognizerSharedState();
      SQLParser sQLParser0 = new SQLParser((TokenStream) null, recognizerSharedState0);
      // Undeclared exception!
      try {
        sQLParser0.comment();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test40()  throws Throwable  {
      RecognizerSharedState recognizerSharedState0 = new RecognizerSharedState();
      SQLParser sQLParser0 = new SQLParser((TokenStream) null, recognizerSharedState0);
      // Undeclared exception!
      try {
        sQLParser0.size_uom();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test41()  throws Throwable  {
      SQLParser.ora_storage_spec_return sQLParser_ora_storage_spec_return0 = new SQLParser.ora_storage_spec_return();
      assertNotNull(sQLParser_ora_storage_spec_return0);
  }

  @Test
  public void test42()  throws Throwable  {
      SQLParser.ora_key_return sQLParser_ora_key_return0 = new SQLParser.ora_key_return();
      Object object0 = sQLParser_ora_key_return0.getTree();
      assertNull(object0);
  }

  @Test
  public void test43()  throws Throwable  {
      TokenRewriteStream tokenRewriteStream0 = new TokenRewriteStream();
      Parser parser0 = new Parser((TokenStream) tokenRewriteStream0);
  }

  @Test
  public void test44()  throws Throwable  {
      SQLParser.column_comment_details_return sQLParser_column_comment_details_return0 = new SQLParser.column_comment_details_return();
      assertNotNull(sQLParser_column_comment_details_return0);
  }

  @Test
  public void test45()  throws Throwable  {
      TokenRewriteStream tokenRewriteStream0 = new TokenRewriteStream();
      RecognizerSharedState recognizerSharedState0 = new RecognizerSharedState();
      SQLParser sQLParser0 = new SQLParser((TokenStream) tokenRewriteStream0, recognizerSharedState0);
      SQLParser.DFA2 sQLParser_DFA2_0 = sQLParser0.new DFA2(sQLParser0);
      String string0 = sQLParser_DFA2_0.getDescription();
      assertEquals("95:1: command : ( ( create_table ';' ) | ( comment ';' ) | ( drop_table ';' ) | ( alter_table ';' ) | ( create_index ';' ) | ( drop_index ';' ) | ( create_sequence ';' ) | ( drop_sequence ';' ) );", string0);
  }

  @Test
  public void test46()  throws Throwable  {
      SQLParser.ora_lob_index_return sQLParser_ora_lob_index_return0 = new SQLParser.ora_lob_index_return();
      assertNotNull(sQLParser_ora_lob_index_return0);
  }

  @Test
  public void test47()  throws Throwable  {
      TokenRewriteStream tokenRewriteStream0 = new TokenRewriteStream();
      RecognizerSharedState recognizerSharedState0 = new RecognizerSharedState();
      SQLParser sQLParser0 = new SQLParser((TokenStream) tokenRewriteStream0, recognizerSharedState0);
      // Undeclared exception!
      try {
        sQLParser0.type();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test48()  throws Throwable  {
      SQLParser.inline_constraint_return sQLParser_inline_constraint_return0 = new SQLParser.inline_constraint_return();
      Object object0 = sQLParser_inline_constraint_return0.getTree();
      assertNull(object0);
  }

  @Test
  public void test49()  throws Throwable  {
      SQLParser.column_name_return sQLParser_column_name_return0 = new SQLParser.column_name_return();
      Object object0 = sQLParser_column_name_return0.getTree();
      assertNull(object0);
  }

  @Test
  public void test50()  throws Throwable  {
      CommonTokenStream commonTokenStream0 = new CommonTokenStream((TokenSource) null, 1757);
      RecognizerSharedState recognizerSharedState0 = new RecognizerSharedState();
      SQLParser sQLParser0 = new SQLParser((TokenStream) commonTokenStream0, recognizerSharedState0);
      // Undeclared exception!
      try {
        sQLParser0.constraint_detail();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test51()  throws Throwable  {
      SQLParser.command_return sQLParser_command_return0 = new SQLParser.command_return();
      Object object0 = sQLParser_command_return0.getTree();
      assertNull(object0);
  }

  @Test
  public void test52()  throws Throwable  {
      SQLParser.arguments_return sQLParser_arguments_return0 = new SQLParser.arguments_return();
      assertNotNull(sQLParser_arguments_return0);
  }

  @Test
  public void test53()  throws Throwable  {
      SQLParser.nullability_return sQLParser_nullability_return0 = new SQLParser.nullability_return();
      Object object0 = sQLParser_nullability_return0.getTree();
      assertNull(object0);
  }

  @Test
  public void test54()  throws Throwable  {
      ANTLRStringStream aNTLRStringStream0 = new ANTLRStringStream("0]mf<>e]+j");
      RegexLexer regexLexer0 = new RegexLexer((CharStream) aNTLRStringStream0);
      CommonTokenStream commonTokenStream0 = new CommonTokenStream((TokenSource) regexLexer0);
      SQLParser sQLParser0 = new SQLParser((TokenStream) commonTokenStream0);
      try {
        sQLParser0.exclusive_or_expression();
        fail("Expecting exception: NoViableAltException");
      } catch(NoViableAltException e) {
      }
  }
  
