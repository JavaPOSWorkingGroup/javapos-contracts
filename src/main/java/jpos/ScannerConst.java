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
// 1998-Feb-18 JavaPOS Release 1.2                                 BS
// 2003-Jun-03 JavaPOS Release 1.8                                 BS
//   Added new ScanDataType constants.
// 2007-Jan-04 JavaPOS Release 1.11                                BS
//   Added new ScanDataType constants:
//       SCAN_SDT_DATAMATRIX
//       SCAN_SDT_QRCODE
//       SCAN_SDT_UQRCODE
//       SCAN_SDT_AZTEC
//       SCAN_SDT_UPDF417
// 2008-Jan-14 JavaPOS Release 1.12                                BS
//   Added new ScanDataType constants:
//       SCAN_SDT_GS1DATABAR
//       SCAN_SDT_GS1DATABAR_E
// 2013-Jul-25 JavaPOS Release 1.14                                BS
//   Added new ScanDataType constants:
//       SCAN_SDT_ITF_CK
//       SCAN_SDT_GS1DATABAR_TYPE2
//       SCAN_SDT_AMES
//       SCAN_SDT_TFMAT
//       SCAN_SDT_Code39_CK
//       SCAN_SDT_Code32
//       SCAN_SDT_CodeCIP
//       SCAN_SDT_TRIOPTIC39
//       SCAN_SDT_ISBT128
//       SCAN_SDT_Code11
//       SCAN_SDT_MSI
//       SCAN_SDT_PLESSEY
//       SCAN_SDT_TELEPEN
//       SCAN_SDT_TLC39
//       SCAN_SDT_GS1DATAMATRIX
//       SCAN_SDT_GS1QRCODE
//       SCAN_SDT_Code49
//       SCAN_SDT_Code16k
//       SCAN_SDT_CodablockA
//       SCAN_SDT_CodablockF
//       SCAN_SDT_Codablock256
//       SCAN_SDT_HANXIN
//       SCAN_SDT_AusPost
//       SCAN_SDT_CanPost
//       SCAN_SDT_ChinaPost
//       SCAN_SDT_DutchKix
//       SCAN_SDT_InfoMail
//       SCAN_SDT_JapanPost
//       SCAN_SDT_KoreanPost
//       SCAN_SDT_SwedenPost
//       SCAN_SDT_UkPost
//       SCAN_SDT_UsIntelligent
//       SCAN_SDT_UsPlanet
//       SCAN_SDT_PostNet
// 2025-Feb-04 JavaPOS Release 1.15.2                              MC
//   Marked ScanDataType constant as deprecated:
//       SCAN_SDT_EAN128
//   Added ScanDataType constant as replacement for SCAN_SDT_EAN128:
//       SCAN_SDT_GS1128
//   Added new ScanDataType constant:
//       SCAN_SDT_DWCODE
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
@Deprecated                                              // Deprecated JavaPOS 1.15.2
    public static final int SCAN_SDT_EAN128      = 120;  // EAN 128
    public static final int SCAN_SDT_OCRA        = 121;  // OCR "A"
    public static final int SCAN_SDT_OCRB        = 122;  // OCR "B"

    // One dimensional symbologies (Added in Release 1.8)
    //        The following RSS constants deprecated in 1.12.
    //        Instead use the GS1DATABAR constants below.
    public static final int SCAN_SDT_RSS14       = 131;  // Reduced Space Symbology - 14 digit GTIN
    public static final int SCAN_SDT_RSS_EXPANDED= 132;  // RSS - 14 digit GTIN plus additional fields

    // One dimensional symbologies (added in Release 1.12)
    public static final int SCAN_SDT_GS1DATABAR  = 131;  // GS1 DataBar Omnidirectional (normal or stacked)
    public static final int SCAN_SDT_GS1DATABAR_E= 132;  // GS1 DataBar Expanded (normal or stacked)

    // One dimensional symbologies (added in Release 1.14)
    public static final int SCAN_SDT_ITF_CK           = 133;  // Interleaved 2 of 5 check digit verified and transmitted
    public static final int SCAN_SDT_GS1DATABAR_TYPE2 = 134; // GS1 DataBar Limited
    public static final int SCAN_SDT_AMES             = 135;  // Ames Code
    public static final int SCAN_SDT_TFMAT            = 136;  // Matrix 2 of 5
    public static final int SCAN_SDT_Code39_CK        = 137;  // Code 39 with check character verified and transmitted
    public static final int SCAN_SDT_Code32           = 138;  // Code 39 with Mod 32 check character
    public static final int SCAN_SDT_CodeCIP          = 139;  // Code 39 CIP
    public static final int SCAN_SDT_TRIOPTIC39       = 140;  // Tri-Optic Code 39
    public static final int SCAN_SDT_ISBT128          = 141;  // ISBT-128
    public static final int SCAN_SDT_Code11           = 142;  // Code 11
    public static final int SCAN_SDT_MSI              = 143;  // MSI Code
    public static final int SCAN_SDT_PLESSEY          = 144;  // Plessey Code
    public static final int SCAN_SDT_TELEPEN          = 145;  // Telepen

    // One dimensional symbologies (added in Release 1.15.2)
    public static final int SCAN_SDT_GS1128      = 120;  // GS1-128
    public static final int SCAN_SDT_DWCODE      = 146;  // Digital Watermarking

    // Composite Symbologies (Added in Release 1.8)
    public static final int SCAN_SDT_CCA         = 151;  // Composite Component A.
    public static final int SCAN_SDT_CCB         = 152;  // Composite Component B.
    public static final int SCAN_SDT_CCC         = 153;  // Composite Component C.

    // Composite Symbologies (Added in Release 1.14)
    public static final int SCAN_SDT_TLC39       = 154;  // TLC-39

    // Two dimensional symbologies
    public static final int SCAN_SDT_PDF417      = 201;
    public static final int SCAN_SDT_MAXICODE    = 202;

    // Two dimensional symbologies (Added in Release 1.11)
    public static final int SCAN_SDT_DATAMATRIX  = 203;  // Data Matrix
    public static final int SCAN_SDT_QRCODE      = 204;  // QR Code
    public static final int SCAN_SDT_UQRCODE     = 205;  // Micro QR Code
    public static final int SCAN_SDT_AZTEC       = 206;  // Aztec
    public static final int SCAN_SDT_UPDF417     = 207;  // Micro PDF 417

    // Two dimensional symbologies (Added in Release 1.14)
    public static final int SCAN_SDT_GS1DATAMATRIX = 208;  // GS1 DataMatrix
    public static final int SCAN_SDT_GS1QRCODE     = 209;  // GS1 QR Code
    public static final int SCAN_SDT_Code49        = 210;  // Code 49
    public static final int SCAN_SDT_Code16k       = 211;  // Code 16K
    public static final int SCAN_SDT_CodablockA    = 212;  // Codablock A
    public static final int SCAN_SDT_CodablockF    = 213;  // Codablock F
    public static final int SCAN_SDT_Codablock256  = 214;  // Codablock 256
    public static final int SCAN_SDT_HANXIN        = 215;  // Han Xin Code

    // Postal Code Symbologies (Added in Release 1.14)
    public static final int SCAN_SDT_AusPost       = 301;  // Australian Post
    public static final int SCAN_SDT_CanPost       = 302;  // Canada Post
    public static final int SCAN_SDT_ChinaPost     = 303;  // China Post
    public static final int SCAN_SDT_DutchKix      = 304;  // Dutch Post
    public static final int SCAN_SDT_InfoMail      = 305;  // InfoMail
    public static final int SCAN_SDT_JapanPost     = 306;  // Japan Post
    public static final int SCAN_SDT_KoreanPost    = 307;  // Korean Post
    public static final int SCAN_SDT_SwedenPost    = 308;  // Sweden Post
    public static final int SCAN_SDT_UkPost        = 309;  // UK Post BPO
    public static final int SCAN_SDT_UsIntelligent = 310;  // US Intelligent Mail
    public static final int SCAN_SDT_UsPlanet      = 311;  // US Planet Code
    public static final int SCAN_SDT_PostNet       = 312;  // US Postnet

    // Special cases
    public static final int SCAN_SDT_OTHER       = 501;  // Start of Scanner-
                                                         //   Specific bar code
                                                         //   symbologies
    public static final int SCAN_SDT_UNKNOWN     =   0;  // Cannot determine the
                                                         //   barcode symbology.
}