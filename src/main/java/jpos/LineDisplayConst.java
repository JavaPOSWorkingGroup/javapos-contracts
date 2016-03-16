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
// LineDisplayConst
//
//   Line Display constants for JavaPOS Applications.
//
// Modification history
// ------------------------------------------------------------------
// 98-02-18 JavaPOS Release 1.2                                   BS
//
/////////////////////////////////////////////////////////////////////

package jpos;

public interface LineDisplayConst
{
    //###################################################################
    //#### Line Display Constants
    //###################################################################

    /////////////////////////////////////////////////////////////////////
    // "CapBlink" Property Constants
    /////////////////////////////////////////////////////////////////////

    public static final int DISP_CB_NOBLINK      = 0;
    public static final int DISP_CB_BLINKALL     = 1;
    public static final int DISP_CB_BLINKEACH    = 2;


    /////////////////////////////////////////////////////////////////////
    // "CapCharacterSet" Property Constants
    /////////////////////////////////////////////////////////////////////

    public static final int DISP_CCS_NUMERIC     =   0;
    public static final int DISP_CCS_ALPHA       =   1;
    public static final int DISP_CCS_ASCII       = 998;
    public static final int DISP_CCS_KANA        =  10;
    public static final int DISP_CCS_KANJI       =  11;
    public static final int DISP_CCS_UNICODE     = 997;


    /////////////////////////////////////////////////////////////////////
    // "CapCursorType" Property Constants
    /////////////////////////////////////////////////////////////////////

    public static final int DISP_CCT_FIXED       =   0x00000001;
    public static final int DISP_CCT_BLOCK       =   0x00000002;
    public static final int DISP_CCT_HALFBLOCK   =   0x00000004;
    public static final int DISP_CCT_UNDERLINE   =   0x00000008;
    public static final int DISP_CCT_REVERSE     =   0x00000010;
    public static final int DISP_CCT_OTHER       =   0x00000020;


    /////////////////////////////////////////////////////////////////////
    // "CapReadBack" Property Constants
    /////////////////////////////////////////////////////////////////////

    public static final int DISP_CRB_NONE        =   0x00000000;
    public static final int DISP_CRB_SINGLE      =   0x00000001;


    /////////////////////////////////////////////////////////////////////
    // "CapReverse" Property Constants
    /////////////////////////////////////////////////////////////////////

    public static final int DISP_CR_NONE          =   0x00000000;
    public static final int DISP_CR_REVERSEALL    =   0x00000001;
    public static final int DISP_CR_REVERSEEACH   =   0x00000002;


    /////////////////////////////////////////////////////////////////////
    // "CharacterSet" Property Constants
    /////////////////////////////////////////////////////////////////////

    public static final int DISP_CS_UNICODE      = 997;
    public static final int DISP_CS_ASCII        = 998;
    public static final int DISP_CS_ANSI         = 999;


    /////////////////////////////////////////////////////////////////////
    // "CursorType" Property Constants
    /////////////////////////////////////////////////////////////////////

    public static final int DISP_CT_NONE        =   0;
    public static final int DISP_CT_FIXED       =   1;
    public static final int DISP_CT_BLOCK       =   2;
    public static final int DISP_CT_HALFBLOCK   =   3;
    public static final int DISP_CT_UNDERLINE   =   4;
    public static final int DISP_CT_REVERSE     =   5;
    public static final int DISP_CT_OTHER       =   6;


    /////////////////////////////////////////////////////////////////////
    // "MarqueeType" Property Constants
    /////////////////////////////////////////////////////////////////////

    public static final int DISP_MT_NONE         = 0;
    public static final int DISP_MT_UP           = 1;
    public static final int DISP_MT_DOWN         = 2;
    public static final int DISP_MT_LEFT         = 3;
    public static final int DISP_MT_RIGHT        = 4;
    public static final int DISP_MT_INIT         = 5;


    /////////////////////////////////////////////////////////////////////
    // "MarqueeFormat" Property Constants
    /////////////////////////////////////////////////////////////////////

    public static final int DISP_MF_WALK         = 0;
    public static final int DISP_MF_PLACE        = 1;


    /////////////////////////////////////////////////////////////////////
    // "DefineGlyph" Method: "GlyphType" Parameter Constants
    /////////////////////////////////////////////////////////////////////

    public static final int DISP_GT_SINGLE       = 1;


    /////////////////////////////////////////////////////////////////////
    // "DisplayText" Method: "Attribute" Property Constants
    // "DisplayTextAt" Method: "Attribute" Property Constants
    /////////////////////////////////////////////////////////////////////

    public static final int DISP_DT_NORMAL        = 0;
    public static final int DISP_DT_BLINK         = 1;
    public static final int DISP_DT_REVERSE       = 2;
    public static final int DISP_DT_BLINK_REVERSE = 3;


    /////////////////////////////////////////////////////////////////////
    // "ScrollText" Method: "Direction" Parameter Constants
    /////////////////////////////////////////////////////////////////////

    public static final int DISP_ST_UP           = 1;
    public static final int DISP_ST_DOWN         = 2;
    public static final int DISP_ST_LEFT         = 3;
    public static final int DISP_ST_RIGHT        = 4;


    /////////////////////////////////////////////////////////////////////
    // "SetDescriptor" Method: "Attribute" Parameter Constants
    /////////////////////////////////////////////////////////////////////

    public static final int DISP_SD_OFF          = 0;
    public static final int DISP_SD_ON           = 1;
    public static final int DISP_SD_BLINK        = 2;
}