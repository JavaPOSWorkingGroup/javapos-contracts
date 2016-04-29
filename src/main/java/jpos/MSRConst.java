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
// MSRConst
//
//   MSR constants for JavaPOS Applications.
//
// Modification history
// ------------------------------------------------------------------
// 1998-Feb-18 JavaPOS Release 1.2                                 BS
// 2006-Feb-10 JavaPOS Release 1.10                                BS
//
/////////////////////////////////////////////////////////////////////

package jpos;

public interface MSRConst
{
    //###################################################################
    //#### MSR Constants
    //###################################################################

    /////////////////////////////////////////////////////////////////////
    // "TracksToRead" Property Constants
    /////////////////////////////////////////////////////////////////////

    public static final int MSR_TR_NONE      = 0;

    public static final int MSR_TR_1         = 1;
    public static final int MSR_TR_2         = 2;
    public static final int MSR_TR_3         = 4;
    public static final int MSR_TR_4         = 8;

    public static final int MSR_TR_1_2       = MSR_TR_1 | MSR_TR_2;
    public static final int MSR_TR_1_3       = MSR_TR_1 | MSR_TR_3;
    public static final int MSR_TR_1_4       = MSR_TR_1 | MSR_TR_4;
    public static final int MSR_TR_2_3       = MSR_TR_2 | MSR_TR_3;
    public static final int MSR_TR_2_4       = MSR_TR_2 | MSR_TR_4;
    public static final int MSR_TR_3_4       = MSR_TR_3 | MSR_TR_4;

    public static final int MSR_TR_1_2_3     = MSR_TR_1 | MSR_TR_2 | MSR_TR_3;
    public static final int MSR_TR_1_2_4     = MSR_TR_1 | MSR_TR_2 | MSR_TR_4;
    public static final int MSR_TR_1_3_4     = MSR_TR_1 | MSR_TR_3 | MSR_TR_4;
    public static final int MSR_TR_2_3_4     = MSR_TR_2 | MSR_TR_3 | MSR_TR_4;

    public static final int MSR_TR_1_2_3_4   = MSR_TR_1 | MSR_TR_2 |
                                               MSR_TR_3 | MSR_TR_4;


    /////////////////////////////////////////////////////////////////////
    // "ErrorReportingType" Property Constants
    /////////////////////////////////////////////////////////////////////

    public static final int MSR_ERT_CARD         = 0;
    public static final int MSR_ERT_TRACK        = 1;


    /////////////////////////////////////////////////////////////////////
    // "ErrorEvent" Event: "ResultCodeExtended" Parameter Constants
    /////////////////////////////////////////////////////////////////////

    public static final int JPOS_EMSR_START      = 1 + JposConst.JPOSERREXT;
    public static final int JPOS_EMSR_END        = 2 + JposConst.JPOSERREXT;
    public static final int JPOS_EMSR_PARITY     = 3 + JposConst.JPOSERREXT;
    public static final int JPOS_EMSR_LRC        = 4 + JposConst.JPOSERREXT;
}