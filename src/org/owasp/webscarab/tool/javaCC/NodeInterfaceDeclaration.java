/* Generated By:JJTree: Do not edit this line. NodeInterfaceDeclaration.java */
package org.owasp.webscarab.tool.javaCC;


/**
 * <TODO description>
 *
 * @since release <RELEASE>
 * @version release <RELEASE><br />$Revision: 1.1 $ $Author: istr $
 * @author <AUTHOR>
 */
public class NodeInterfaceDeclaration 
  extends SimpleNode 
{
  
  public NodeInterfaceDeclaration ( int id ) {
    super( id );
  }
  
  public NodeInterfaceDeclaration ( JavaOneDotTwo p, int id ) {
    super( p, id );
  }

  /** Accept the visitor. **/
  public Object jjtAccept ( JavaOneDotTwoVisitor visitor, Object data ) {
    return visitor.visit( this, data );
  }
}

