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
// ToneIndicatorConst
//
//   Tone Indicator constants for JavaPOS Applications.
//
// Modification history
// ------------------------------------------------------------------
// 98-02-18 JavaPOS Release 1.2                                   BS
// 2009-Feb-23 JavaPOS Release 1.13                               BS
//   Added "MelodyType"constant:
//     TONE_MT_NONE
// 2009-Oct-06 JavaPOS Release 1.13.1                             BS
//   Added "MelodyType"constants:
//     TONE_MT_TYPE1
//     TONE_MT_TYPE2
//     TONE_MT_TYPE3
//     TONE_MT_TYPE4
//     TONE_MT_TYPE5
//
/////////////////////////////////////////////////////////////////////

package jpos;

public interface ToneIndicatorConst
{
    //###################################################################
    //#### Tone Indicator Constants
    //###################################################################

    /////////////////////////////////////////////////////////////////////
    // "MelodyType" Property Constants
    /////////////////////////////////////////////////////////////////////

    public static final int TONE_MT_NONE  = 0;
    public static final int TONE_MT_TYPE1 = 1;
    public static final int TONE_MT_TYPE2 = 2;
    public static final int TONE_MT_TYPE3 = 3;
    public static final int TONE_MT_TYPE4 = 4;
    public static final int TONE_MT_TYPE5 = 5;
}