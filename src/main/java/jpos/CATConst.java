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
// CATConst
//
//   Credit Authorization Terminal constants for JavaPOS Applications.
//
// Modification history
// ------------------------------------------------------------------
// 98-11-02 JavaPOS Release 1.4                                   BS
//
/////////////////////////////////////////////////////////////////////

package jpos;

public interface CATConst
{
    /////////////////////////////////////////////////////////////////////
    // Payment Condition Constants
    /////////////////////////////////////////////////////////////////////

    public static final int CAT_PAYMENT_LUMP                 =  10;
    public static final int CAT_PAYMENT_BONUS_1              =  21;
    public static final int CAT_PAYMENT_BONUS_2              =  22;
    public static final int CAT_PAYMENT_BONUS_3              =  23;
    public static final int CAT_PAYMENT_BONUS_4              =  24;
    public static final int CAT_PAYMENT_BONUS_5              =  25;
    public static final int CAT_PAYMENT_INSTALLMENT_1        =  61;
    public static final int CAT_PAYMENT_INSTALLMENT_2        =  62;
    public static final int CAT_PAYMENT_INSTALLMENT_3        =  63;
    public static final int CAT_PAYMENT_BONUS_COMBINATION_1  =  31;
    public static final int CAT_PAYMENT_BONUS_COMBINATION_2  =  32;
    public static final int CAT_PAYMENT_BONUS_COMBINATION_3  =  33;
    public static final int CAT_PAYMENT_BONUS_COMBINATION_4  =  34;
    public static final int CAT_PAYMENT_REVOLVING            =  80;
    public static final int CAT_PAYMENT_DEBIT                = 110;


    /////////////////////////////////////////////////////////////////////
    // Transaction Type Constants
    /////////////////////////////////////////////////////////////////////

    public static final int CAT_TRANSACTION_SALES            = 10;
    public static final int CAT_TRANSACTION_VOID             = 20;
    public static final int CAT_TRANSACTION_REFUND           = 21;
    public static final int CAT_TRANSACTION_VOIDPRESALES     = 29;
    public static final int CAT_TRANSACTION_COMPLETION       = 30;
    public static final int CAT_TRANSACTION_PRESALES         = 40;
    public static final int CAT_TRANSACTION_CHECKCARD        = 41;


		/////////////////////////////////////////////////////////////////////
		// "PaymentMedia' Property Constants
		/////////////////////////////////////////////////////////////////////

    public static final int CAT_MEDIA_UNSPECIFIED            = 0;
    public static final int CAT_MEDIA_NONDEFINE              = 0;
    public static final int CAT_MEDIA_CREDIT                 = 1;
    public static final int CAT_MEDIA_DEBIT                  = 2;


    /////////////////////////////////////////////////////////////////////
    // ResultCodeExtended Constants
    /////////////////////////////////////////////////////////////////////

    public static final int JPOS_ECAT_CENTERERROR            = 01;
    public static final int JPOS_ECAT_COMMANDERROR           = 90;
    public static final int JPOS_ECAT_RESET                  = 91;
    public static final int JPOS_ECAT_COMMUNICATIONERROR     = 92;
    public static final int JPOS_ECAT_DAILYLOGOVERFLOW       = 200;


    /////////////////////////////////////////////////////////////////////
    // "Daily Log" Property  & Argument Constants
    /////////////////////////////////////////////////////////////////////

    public static final int CAT_DL_NONE                   = 0;  //None of them
    public static final int CAT_DL_REPORTING              = 1;  //Only Reporting
    public static final int CAT_DL_SETTLEMENT             = 2;  //Only Settlement
    public static final int CAT_DL_REPORTING_SETTLEMENT   = 3;  //Both of them
}