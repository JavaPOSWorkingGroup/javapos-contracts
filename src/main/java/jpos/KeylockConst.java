//////////////////////////////////////////////////////////////////////
//
// The JavaPOS library source code is now under the CPL license, which 
// is an OSS Apache-like license. The complete license is located at:
//    http://www.ibm.com/developerworks/library/os-cpl.html
//
//////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////
//
// This software is provided "AS IS".  The JavaPOS working group (including
// each of the Corporate members, contributors and individuals)  MAKES NO
// REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE,
// EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED
// WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
// NON-INFRINGEMENT. The JavaPOS working group shall not be liable for
// any damages suffered as a result of using, modifying or distributing this
// software or its derivatives.Permission to use, copy, modify, and distribute
// the software and its documentation for any purpose is hereby granted.
//
// KeylockConst
//
//   Keylock constants for JavaPOS Applications.
//
// Modification history
// ------------------------------------------------------------------
// 98-02-18 JavaPOS Release 1.2                                   BS
//
/////////////////////////////////////////////////////////////////////

package jpos;

public interface KeylockConst
{
    //###################################################################
    //#### Keylock Constants
    //###################################################################

    /////////////////////////////////////////////////////////////////////
    // "KeyPosition" Property Constants
    // "WaitForKeylockChange" Method: "KeyPosition" Parameter
    // "StatusUpdateEvent" Event: "status" Parameter
    /////////////////////////////////////////////////////////////////////

    public static final int LOCK_KP_ANY          = 0; // WaitForKeylockChange Only
    public static final int LOCK_KP_LOCK         = 1;
    public static final int LOCK_KP_NORM         = 2;
    public static final int LOCK_KP_SUPR         = 3;
}