/* Generated By:JJTree: Do not edit this line. NodeForUpdate.java */
package org.owasp.webscarab.tool.javaCC;


/**
 * <TODO description>
 *
 * @since release <RELEASE>
 * @version release <RELEASE><br />$Revision: 1.1 $ $Author: istr $
 * @author <AUTHOR>
 */
public class NodeForUpdate 
  extends SimpleNode 
{
  
  public NodeForUpdate ( int id ) {
    super( id );
  }
  
  public NodeForUpdate ( JavaOneDotTwo p, int id ) {
    super( p, id );
  }

  /** Accept the visitor. **/
  public Object jjtAccept ( JavaOneDotTwoVisitor visitor, Object data ) {
    return visitor.visit( this, data );
  }
}

