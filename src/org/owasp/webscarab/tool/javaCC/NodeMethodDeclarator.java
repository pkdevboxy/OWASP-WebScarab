/* Generated By:JJTree: Do not edit this line. NodeMethodDeclarator.java */
package org.owasp.webscarab.tool.javaCC;


/**
 * <TODO description>
 *
 * @since release <RELEASE>
 * @version release <RELEASE><br />$Revision: 1.1 $ $Author: istr $
 * @author <AUTHOR>
 */
public class NodeMethodDeclarator 
  extends SimpleNode 
{
  
  public NodeMethodDeclarator ( int id ) {
    super( id );
  }
  
  public NodeMethodDeclarator ( JavaOneDotTwo p, int id ) {
    super( p, id );
  }

  /** Accept the visitor. **/
  public Object jjtAccept ( JavaOneDotTwoVisitor visitor, Object data ) {
    return visitor.visit( this, data );
  }
}

