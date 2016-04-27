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
// ScannerConst
//
//   Scanner constants for JavaPOS Applications.
//
// Modification history
// ------------------------------------------------------------------
// 98-02-18 JavaPOS Release 1.2                                   BS
// 03-Jun-2003 JavaPOS Release 1.8                                BS
//   Added new ScanDataType constants.
//
/////////////////////////////////////////////////////////////////////

package jpos;

public interface ScannerConst
{
    //###################################################################
    //#### Scanner Constants
    //###################################################################

    /////////////////////////////////////////////////////////////////////
    // "ScanDataType" Property Constants
    /////////////////////////////////////////////////////////////////////

    // One dimensional symbologies
    public static final int SCAN_SDT_UPCA        = 101;  // Digits
    public static final int SCAN_SDT_UPCE        = 102;  // Digits
    public static final int SCAN_SDT_JAN8        = 103;  // = EAN 8
    public static final int SCAN_SDT_EAN8        = 103;  // = JAN 8
    public static final int SCAN_SDT_JAN13       = 104;  // = EAN 13
    public static final int SCAN_SDT_EAN13       = 104;  // = JAN 13
    public static final int SCAN_SDT_TF          = 105;  // (Discrete 2 of 5)
                                                         //   Digits
    public static final int SCAN_SDT_ITF         = 106;  // (Interleaved 2 of 5)
                                                         //   Digits
    public static final int SCAN_SDT_Codabar     = 107;  // Digits, -, $, :, /, .,
                                                         //   +; 4 start/stop
                                                         //   characters (a, b, c,
                                                         //   d)
    public static final int SCAN_SDT_Code39      = 108;  // Alpha, Digits, Space,
                                                         //   -, ., $, /, +, %;
                                                         //   start/stop (*)
                                                         // Also has Full Ascii
                                                         //   feature
    public static final int SCAN_SDT_Code93      = 109;  // Same characters as
                                                         //   Code 39
    public static final int SCAN_SDT_Code128     = 110;  // 128 data characters
    public static final int SCAN_SDT_UPCA_S      = 111;  // UPC-A with
                                                         //   supplemental barcode
    public static final int SCAN_SDT_UPCE_S      = 112;  // UPC-E with
                                                         //   supplemental barcode
    public static final int SCAN_SDT_UPCD1       = 113;  // UPC-D1
    public static final int SCAN_SDT_UPCD2       = 114;  // UPC-D2
    public static final int SCAN_SDT_UPCD3       = 115;  // UPC-D3
    public static final int SCAN_SDT_UPCD4       = 116;  // UPC-D4
    public static final int SCAN_SDT_UPCD5       = 117;  // UPC-D5
    public static final int SCAN_SDT_EAN8_S      = 118;  // EAN 8 with
                                                         //   supplemental barcode
    public static final int SCAN_SDT_EAN13_S     = 119;  // EAN 13 with
                                                         //   supplemental barcode
    public static final int SCAN_SDT_EAN128      = 120;  // EAN 128
    public static final int SCAN_SDT_OCRA        = 121;  // OCR "A"
    public static final int SCAN_SDT_OCRB        = 122;  // OCR "B"

    // One dimensional symbologies (Added in Release 1.8)
    public static final int SCAN_SDT_RSS14       = 131;  // Reduced Space Symbology - 14 digit GTIN
    public static final int SCAN_SDT_RSS_EXPANDED= 132;  // RSS - 14 digit GTIN plus additional fields

    // Composite Symbologies (Added in Release 1.8)
    public static final int SCAN_SDT_CCA         = 151;  // Composite Component A.
    public static final int SCAN_SDT_CCB         = 152;  // Composite Component B.
    public static final int SCAN_SDT_CCC         = 153;  // Composite Component C.

    // Two dimensional symbologies
    public static final int SCAN_SDT_PDF417      = 201;
    public static final int SCAN_SDT_MAXICODE    = 202;

    // Special cases
    public static final int SCAN_SDT_OTHER       = 501;  // Start of Scanner-
                                                         //   Specific bar code
                                                         //   symbologies
    public static final int SCAN_SDT_UNKNOWN     =   0;  // Cannot determine the
                                                         //   barcode symbology.
}