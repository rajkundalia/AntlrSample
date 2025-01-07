// Generated from D:/IntelliJProjects/AntlrSample/src/main/antlr/XML.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XMLParser}.
 */
public interface XMLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link XMLParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(XMLParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(XMLParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(XMLParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(XMLParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(XMLParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(XMLParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(XMLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(XMLParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#textContent}.
	 * @param ctx the parse tree
	 */
	void enterTextContent(XMLParser.TextContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#textContent}.
	 * @param ctx the parse tree
	 */
	void exitTextContent(XMLParser.TextContentContext ctx);
}