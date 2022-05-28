//////////////////////////////////////////////////////////////////////
//
// The JavaPOS library source code is now under the CPL license, which 
// is an OSS Apache-like license. The complete license is located at:
//    http://www.ibm.com/developerworks/library/os-cpl.html
//
//////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////
//
// THIS SOFTWARE IS PROVIDED AS IS. THE JAVAPOS WORKING GROUP MAKES NO 
// REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE, 
// EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED 
// WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR 
// NON-INFRINGEMENT.  INDIVIDUAL OR CORPORATE MEMBERS OF THE JAVAPOS 
// WORKING GROUP SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED AS A RESULT
// OF USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
// 
// DirectIOListener
//
//   Interface to implement to support JavaPOS DirectIO Events.
//
// Modification history
// ------------------------------------------------------------------
// 98-02-18 JavaPOS Release 1.2                                   BS
//
/////////////////////////////////////////////////////////////////////

package jpos.events;

public interface DirectIOListener extends java.util.EventListener
{
    public void directIOOccurred(DirectIOEvent e);
}