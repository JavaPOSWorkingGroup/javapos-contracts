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
// VideoCaptureConst
//
//   Video Capture constants for JavaPOS Applications.
//
// Modification history
// ------------------------------------------------------------------
// 2023-Sep-28 JavaPOS Release 1.16                                MC
//   New device category.
//
/////////////////////////////////////////////////////////////////////

package jpos;

public interface VideoCaptureConst {
    //###################################################################
    //#### Graphic Display Constants
    //###################################################################

    /////////////////////////////////////////////////////////////////////
    // "CapStorage" Property Constants
    /////////////////////////////////////////////////////////////////////

    public static final int VCAP_CST_HOST_ONLY       = 1;
    public static final int VCAP_CST_HARDTOTALS_ONLY = 2;
    public static final int VCAP_CST_ALL             = 3;

    /////////////////////////////////////////////////////////////////////
    // "Storage" Property Constants
    /////////////////////////////////////////////////////////////////////

    public static final int VCAP_ST_HOST             = 1;
    public static final int VCAP_ST_HARDTOTALS       = 2;
    public static final int VCAP_ST_HOST_HARDTOTALS  = 3;

    /////////////////////////////////////////////////////////////////////
    // "VideoCaptureMode" Property Constants
    /////////////////////////////////////////////////////////////////////

    public static final int VCAP_VCMODE_PHOTO        = 1;
    public static final int VCAP_VCMODE_VIDEO        = 2;

    /////////////////////////////////////////////////////////////////////
    // "StatusUpdateEvent" "Status" Property Constants
    /////////////////////////////////////////////////////////////////////

    public static final int VCAP_SUE_START_PHOTO            = 11;
    public static final int VCAP_SUE_END_PHOTO              = 12;
    public static final int VCAP_SUE_START_VIDEO            = 21;
    public static final int VCAP_SUE_STOP_VIDEO             = 22;

    /////////////////////////////////////////////////////////////////////
    // "ErrorEvent" "ErrorCodeExtended" Property Constants
    /////////////////////////////////////////////////////////////////////

    public static final int EVCAP_NOROOM        = 201; // (Several)
}
