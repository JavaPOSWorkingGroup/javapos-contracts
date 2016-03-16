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
// MICRConst
//
//   MICR constants for JavaPOS Applications.
//
// Modification history
// ------------------------------------------------------------------
// 98-02-18 JavaPOS Release 1.2                                   BS
//
/////////////////////////////////////////////////////////////////////

package jpos;

public interface MICRConst
{
    //###################################################################
    //#### MICR Constants
    //###################################################################

    /////////////////////////////////////////////////////////////////////
    // "CheckType" Property Constants
    /////////////////////////////////////////////////////////////////////

    public static final int MICR_CT_PERSONAL     =  1;
    public static final int MICR_CT_BUSINESS     =  2;
    public static final int MICR_CT_UNKNOWN      = 99;


    /////////////////////////////////////////////////////////////////////
    // "CountryCode" Property Constants
    /////////////////////////////////////////////////////////////////////

    public static final int MICR_CC_USA          =  1;
    public static final int MICR_CC_CANADA       =  2;
    public static final int MICR_CC_MEXICO       =  3;
    public static final int MICR_CC_UNKNOWN      = 99;


    /////////////////////////////////////////////////////////////////////
    // "ResultCodeExtended" Property Constants for MICR
    /////////////////////////////////////////////////////////////////////

    public static final int JPOS_EMICR_NOCHECK   = 1 + JposConst.JPOSERREXT; // EndInsertion
    public static final int JPOS_EMICR_CHECK     = 2 + JposConst.JPOSERREXT; // EndRemoval
}
