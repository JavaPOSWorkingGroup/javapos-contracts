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
// GraphicDisplayConst
//
//   Graphic Display constants for JavaPOS Applications.
//
// Modification history
// ------------------------------------------------------------------
// 2023-Sep-28 JavaPOS Release 1.16                                MC
//   New device category.
//
/////////////////////////////////////////////////////////////////////

package jpos;

public interface GraphicDisplayConst {
    //###################################################################
    //#### Graphic Display Constants
    //###################################################################

    /////////////////////////////////////////////////////////////////////
    // "CapStorage" Property Constants
    /////////////////////////////////////////////////////////////////////

    public static final int GDSP_CST_HOST_ONLY       = 1;
    public static final int GDSP_CST_HARDTOTALS_ONLY = 2;
    public static final int GDSP_CST_ALL             = 3;

    /////////////////////////////////////////////////////////////////////
    // "Storage" Property Constants
    /////////////////////////////////////////////////////////////////////

    public static final int GDSP_ST_HOST             = 1;
    public static final int GDSP_ST_HARDTOTALS       = 2;

    /////////////////////////////////////////////////////////////////////
    // "DisplayMode" Property Constants
    /////////////////////////////////////////////////////////////////////

    public static final int GDSP_DMODE_HIDDEN        = 1;
    public static final int GDSP_DMODE_IMAGE_FIT     = 2;
    public static final int GDSP_DMODE_IMAGE_FILL    = 3;
    public static final int GDSP_DMODE_IMAGE_CENTER  = 4;
    public static final int GDSP_DMODE_VIDEO_NORMAL  = 5;
    public static final int GDSP_DMODE_VIDEO_FULL    = 6;
    public static final int GDSP_DMODE_WEB           = 7;

    /////////////////////////////////////////////////////////////////////
    // "LoadStatus" Property Constants
    /////////////////////////////////////////////////////////////////////

    public static final int GDSP_LSTATUS_START       = 1;
    public static final int GDSP_LSTATUS_FINISH      = 2;
    public static final int GDSP_LSTATUS_CANCEL      = 3;

    /////////////////////////////////////////////////////////////////////
    // "StatusUpdateEvent" "Status" Property Constants
    /////////////////////////////////////////////////////////////////////

    public static final int GDSP_SUE_START_IMAGE_LOAD    = 11;
    public static final int GDSP_SUE_END_IMAGE_LOAD      = 12;
    public static final int GDSP_SUE_START_LOAD_WEBPAGE  = 21;
    public static final int GDSP_SUE_FINISH_LOAD_WEBPAGE = 22;
    public static final int GDSP_SUE_CANCEL_LOAD_WEBPAGE = 23;
    public static final int GDSP_SUE_START_PLAY_VIDEO    = 31;
    public static final int GDSP_SUE_STOP_PLAY_VIDEO     = 32;

    /////////////////////////////////////////////////////////////////////
    // "ErrorEvent" "ErrorCodeExtended" Property Constants
    /////////////////////////////////////////////////////////////////////

    public static final int EGDSP_NOROOM        = 201; // (Several)
}
