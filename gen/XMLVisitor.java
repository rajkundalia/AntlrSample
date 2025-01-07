// Generated from D:/IntelliJProjects/AntlrSample/src/main/antlr/XML.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XMLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XMLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link XMLParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(XMLParser.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(XMLParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(XMLParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(XMLParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#textContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextContent(XMLParser.TextContentContext ctx);
}