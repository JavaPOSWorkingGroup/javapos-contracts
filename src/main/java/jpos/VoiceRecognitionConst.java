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
// VoiceRecognitionConst
//
//   Voice Recognition constants for JavaPOS Applications.
//
// Modification history
// ------------------------------------------------------------------
// 2023-Sep-28 JavaPOS Release 1.16                                MC
//   New device category.
//
/////////////////////////////////////////////////////////////////////

package jpos;

public interface VoiceRecognitionConst {
    //###################################################################
    //#### Voice Recognition Constants
    //###################################################################

    /////////////////////////////////////////////////////////////////////
    // "HearingResult" Property Constants
    /////////////////////////////////////////////////////////////////////

    public static final int VRCG_HRESULT_FREE                   = 11;
    public static final int VRCG_HRESULT_SENTENCE               = 21;
    public static final int VRCG_HRESULT_WORD                   = 31;
    public static final int VRCG_HRESULT_YESNO_YES              = 41;
    public static final int VRCG_HRESULT_YESNO_NO               = 42;
    public static final int VRCG_HRESULT_YESNO_CANCEL           = 43;

    /////////////////////////////////////////////////////////////////////
    // "HearingStatus" Property Constants
    /////////////////////////////////////////////////////////////////////

    public static final int VRCG_HSTATUS_NONE                   =  0;
    public static final int VRCG_HSTATUS_FREE                   = 10;
    public static final int VRCG_HSTATUS_SENTENCE               = 20;
    public static final int VRCG_HSTATUS_WORD                   = 30;
    public static final int VRCG_HSTATUS_YESNO                  = 40;

    /////////////////////////////////////////////////////////////////////
    // "StatusUpdateEvent" "Status" Property Constants
    /////////////////////////////////////////////////////////////////////

    public static final int VRCG_SUE_STOP_HEARING               =  0;
    public static final int VRCG_SUE_START_HEARING_FREE         = 10;
    public static final int VRCG_SUE_START_HEARING_SENTENCE     = 20;
    public static final int VRCG_SUE_START_HEARING_WORD         = 30;
    public static final int VRCG_SUE_START_HEARING_YESNO        = 40;
}
