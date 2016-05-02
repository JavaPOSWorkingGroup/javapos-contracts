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
// ElectronicValueRWConst
//
//   ElectronicValueRW constants for JavaPOS Applications.
//
// Modification history
// ------------------------------------------------------------------
// 2008-Jan-14 JavaPOS Release 1.12                                BS
//   New device category.
// 2013-Jul-25 JavaPOS Release 1.14                                BS
//   Added new constants:
//     EVRW_PIN_ENTRY_NONE
//     EVRW_PIN_ENTRY_EXTERNAL
//     EVRW_PIN_ENTRY_INTERNAL
//     EVRW_PIN_ENTRY_UNKNOWN
//     EVRW_TM_FALSE
//     EVRW_TM_TRUE
//     EVRW_TM_UNKNOWN
//     EVRW_TAG_AS_AUTHENTICATED
//     EVRW_TAG_AS_UNAUTHENTICATED
//     EVRW_TAG_CTT_CANCEL
//     EVRW_TAG_CTT_CHARGE
//     EVRW_TAG_CTT_RETURN
//     EVRW_TAG_CTT_SALES
//     EVRW_TAG_CM_CASH
//     EVRW_TAG_CM_CREDIT
//     EVRW_TAG_CM_POINT
//     EVRW_TAG_PC_INSTALLMENT_2
//     EVRW_TAG_PC_INSTALLMENT_3
//     EVRW_TAG_PC_BONUS_1
//     EVRW_TAG_PC_BONUS_2
//     EVRW_TAG_PC_BONUS_3
//     EVRW_TAG_PC_BONUS_4
//     EVRW_TAG_PC_BONUS_5
//     EVRW_TAG_PC_BONUS_COMBINATION_1
//     EVRW_TAG_PC_BONUS_COMBINATION_2
//     EVRW_TAG_PC_BONUS_COMBINATION_3
//     EVRW_TAG_PC_BONUS_COMBINATION_4
//     EVRW_TAG_PC_INSTALLMENT_1
//     EVRW_TAG_PC_LUMP
//     EVRW_TAG_PC_REVOLVING
//     EVRW_TAG_PM_COMBINED
//     EVRW_TAG_PM_FULL_SETTLEMENT
//     EVRW_TAG_PMFP_CASH
//     EVRW_TAG_PMFP_CREDIT
//     EVRW_TAG_PMFP_EM
//     EVRW_TAG_PMFP_OTHER
//     EVRW_TAG_ROS_NG
//     EVRW_TAG_ROS_OK
//     EVRW_TAG_ROS_UNKNOWN
//     EVRW_TAG_STT_1
//     EVRW_TAG_STT_2
//     EVRW_TAG_STT_3
//     EVRW_TAG_TT_ADD
//     EVRW_TAG_TT_CANCEL_CHARGE
//     EVRW_TAG_TT_CANCEL_RETURN
//     EVRW_TAG_TT_CANCEL_SALES
//     EVRW_TAG_TT_GET_LOG
//     EVRW_TAG_TT_READ
//     EVRW_TAG_TT_RETURN
//     EVRW_TAG_TT_SUBTRACT
//     EVRW_TAG_TT_WRITE
//     EVRW_TE_NOTIFY_TOUCH_RETRY
//     EVRW_TE_NOTIFY_TOUCH_RETRY_CANCELABLE
//     EVRW_TE_CONFIRM_TOUCH_RETRY
//     EVRW_TE_CONFIRM_CANCEL
//     EVRW_TE_NOTIFY_INVALID_OPERATION
//     EVRW_TE_CONFIRM_INVALID_OPERATION
//     EVRW_TE_CONFIRM_REMAINDER_SUBTRACTION
//     EVRW_TE_CONFIRM_CENTER_CHECK
//     EVRW_TE_CONFIRM_TOUCH_TIMEOUT
//     EVRW_TE_CONFIRM_AUTO_CHARGE
//     EVRW_TE_NOTIFY_CAPTURE_CARD
//     EVRW_TE_NOTIFY_PIN
//     EVRW_TE_NOTIFY_CENTER_CHECK
//     EVRW_TE_NOTIFY_COMPLETE
//     EVRW_TE_NOTIFY_TOUCH
//     EVRW_TE_NOTIFY_BUSY
//     EVRW_TE_CONFIRM_CENTER_CHECK_COMPLETE
//     EVRW_TE_CONFIRM_SELECT
//     EVRW_TE_NOTIFY_LOCK
//     EVRW_TE_NOTIFY_CENTER_CHECK_COMPLETE
//     EVRW_TE_CONFIRM_PIN_ENTRY_BY_OUTER_PINPAD
//
/////////////////////////////////////////////////////////////////////

package jpos;

public interface ElectronicValueRWConst
{
  /////////////////////////////////////////////////////////////////////
  // "CapCardSensor" Property Constants
  /////////////////////////////////////////////////////////////////////

  public static final int EVRW_CCS_ENTRY               = 0x00000001;
  public static final int EVRW_CCS_DETECT              = 0x00000002;
  public static final int EVRW_CCS_CAPTURE             = 0x00000004;


  /////////////////////////////////////////////////////////////////////
  // "CapDetectionControl" Property Constants
  /////////////////////////////////////////////////////////////////////

  public static final int EVRW_CDC_RWCONTROL           = 0x00000001;
  public static final int EVRW_CDC_APPLICATIONCONTROL  = 0x00000002;


  /////////////////////////////////////////////////////////////////////
  // "DetectionStatus" Property Constants
  /////////////////////////////////////////////////////////////////////

  public static final int EVRW_DS_NOCARD               = 1;
  public static final int EVRW_DS_DETECTED             = 2;
  public static final int EVRW_DS_ENTERED              = 3;
  public static final int EVRW_DS_CAPTURED             = 4;


  /////////////////////////////////////////////////////////////////////
  // "LogStatus" Property Constants
  /////////////////////////////////////////////////////////////////////

  public static final int EVRW_LS_OK                   = 1;
  public static final int EVRW_LS_NEARFULL             = 2;
  public static final int EVRW_LS_FULL                 = 3;


  /////////////////////////////////////////////////////////////////////
  // "PINEntry" Property Constants
  /////////////////////////////////////////////////////////////////////

  public static final int EVRW_PIN_ENTRY_NONE          = 1; // Added in release 1.14
  public static final int EVRW_PIN_ENTRY_EXTERNAL      = 2; // Added in release 1.14
  public static final int EVRW_PIN_ENTRY_INTERNAL      = 3; // Added in release 1.14
  public static final int EVRW_PIN_ENTRY_UNKNOWN       = 4; // Added in release 1.14


  /////////////////////////////////////////////////////////////////////
  // "TrainingModeState" Property Constants
  /////////////////////////////////////////////////////////////////////

  public static final int EVRW_TM_FALSE                = 1; // Added in release 1.14
  public static final int EVRW_TM_TRUE                 = 2; // Added in release 1.14
  public static final int EVRW_TM_UNKNOWN              = 3; // Added in release 1.14


  /////////////////////////////////////////////////////////////////////
  // "accessLog" Method: "Type" Parameter Constants
  /////////////////////////////////////////////////////////////////////

  public static final int EVRW_AL_REPORTING            = 1;
  public static final int EVRW_AL_SETTLEMENT           = 2;


  /////////////////////////////////////////////////////////////////////
  // "beginDetection" Method: "Type" Parameter Constants
  /////////////////////////////////////////////////////////////////////

  public static final int EVRW_BD_ANY                  = 1;
  public static final int EVRW_BD_SPECIFIC             = 2;


  /////////////////////////////////////////////////////////////////////
  // "retrieveResultInformation" Method: "value" Parameter Constants
  /////////////////////////////////////////////////////////////////////

  public static final int EVRW_TAG_AS_AUTHENTICATED    = 1; // Added in release 1.14
  public static final int EVRW_TAG_AS_UNAUTHENTICATED  = 2; // Added in release 1.14

  public static final int EVRW_TAG_CTT_CANCEL          = 1; // Added in release 1.14
  public static final int EVRW_TAG_CTT_CHARGE          = 2; // Added in release 1.14
  public static final int EVRW_TAG_CTT_RETURN          = 3; // Added in release 1.14
  public static final int EVRW_TAG_CTT_SALES           = 4; // Added in release 1.14

  public static final int EVRW_TAG_CM_CASH             = 1; // Added in release 1.14
  public static final int EVRW_TAG_CM_CREDIT           = 2; // Added in release 1.14
  public static final int EVRW_TAG_CM_POINT            = 3; // Added in release 1.14

  public static final int EVRW_TAG_PC_INSTALLMENT_1       =  1; // Added in release 1.14
  public static final int EVRW_TAG_PC_INSTALLMENT_2       =  2; // Added in release 1.14
  public static final int EVRW_TAG_PC_INSTALLMENT_3       =  3; // Added in release 1.14
  public static final int EVRW_TAG_PC_BONUS_1             =  4; // Added in release 1.14
  public static final int EVRW_TAG_PC_BONUS_2             =  5; // Added in release 1.14
  public static final int EVRW_TAG_PC_BONUS_3             =  6; // Added in release 1.14
  public static final int EVRW_TAG_PC_BONUS_4             =  7; // Added in release 1.14
  public static final int EVRW_TAG_PC_BONUS_5             =  8; // Added in release 1.14
  public static final int EVRW_TAG_PC_BONUS_COMBINATION_1 =  9; // Added in release 1.14
  public static final int EVRW_TAG_PC_BONUS_COMBINATION_2 = 10; // Added in release 1.14
  public static final int EVRW_TAG_PC_BONUS_COMBINATION_3 = 11; // Added in release 1.14
  public static final int EVRW_TAG_PC_BONUS_COMBINATION_4 = 12; // Added in release 1.14
  public static final int EVRW_TAG_PC_LUMP                = 13; // Added in release 1.14
  public static final int EVRW_TAG_PC_REVOLVING           = 14; // Added in release 1.14

  public static final int EVRW_TAG_PM_COMBINED         = 1; // Added in release 1.14
  public static final int EVRW_TAG_PM_FULL_SETTLEMENT  = 2; // Added in release 1.14

  public static final int EVRW_TAG_PMFP_CASH           = 1; // Added in release 1.14
  public static final int EVRW_TAG_PMFP_CREDIT         = 2; // Added in release 1.14
  public static final int EVRW_TAG_PMFP_EM             = 3; // Added in release 1.14
  public static final int EVRW_TAG_PMFP_OTHER          = 4; // Added in release 1.14

  public static final int EVRW_TAG_ROS_NG              = 1; // Added in release 1.14
  public static final int EVRW_TAG_ROS_OK              = 2; // Added in release 1.14
  public static final int EVRW_TAG_ROS_UNKNOWN         = 3; // Added in release 1.14

  public static final int EVRW_TAG_STT_1               = 1; // Added in release 1.14
  public static final int EVRW_TAG_STT_2               = 2; // Added in release 1.14
  public static final int EVRW_TAG_STT_3               = 3; // Added in release 1.14

  public static final int EVRW_TAG_TT_ADD              = 1; // Added in release 1.14
  public static final int EVRW_TAG_TT_CANCEL_CHARGE    = 2; // Added in release 1.14
  public static final int EVRW_TAG_TT_CANCEL_RETURN    = 3; // Added in release 1.14
  public static final int EVRW_TAG_TT_CANCEL_SALES     = 4; // Added in release 1.14
  public static final int EVRW_TAG_TT_GET_LOG          = 5; // Added in release 1.14
  public static final int EVRW_TAG_TT_READ             = 6; // Added in release 1.14
  public static final int EVRW_TAG_TT_RETURN           = 7; // Added in release 1.14
  public static final int EVRW_TAG_TT_SUBTRACT         = 8; // Added in release 1.14
  public static final int EVRW_TAG_TT_WRITE            = 9; // Added in release 1.14


  /////////////////////////////////////////////////////////////////////
  // "transactionAccess" Method: "Control" Parameter Constants
  /////////////////////////////////////////////////////////////////////

  public static final int EVRW_TA_TRANSACTION          = 11;
  public static final int EVRW_TA_NORMAL               = 12;


  /////////////////////////////////////////////////////////////////////
  // "StatusUpdateEvent" Event: "Data" Parameter Constants
  /////////////////////////////////////////////////////////////////////

  public static final int EVRW_SUE_LS_OK                  = 11;
  public static final int EVRW_SUE_LS_NEARFULL            = 12;
  public static final int EVRW_SUE_LS_FULL                = 13;
  public static final int EVRW_SUE_DS_NOCARD              = 21;
  public static final int EVRW_SUE_DS_DETECTED            = 22;
  public static final int EVRW_SUE_DS_ENTERED             = 23;
  public static final int EVRW_SUE_DS_CAPTURED            = 24;


  /////////////////////////////////////////////////////////////////////
  // "TransitionEvent" Event: "EventNumber" Parameter Constants
  /////////////////////////////////////////////////////////////////////

  public static final int EVRW_TE_NOTIFY_TOUCH_RETRY                =  1; // Added in release 1.14
  public static final int EVRW_TE_NOTIFY_TOUCH_RETRY_CANCELABLE     =  2; // Added in release 1.14
  public static final int EVRW_TE_CONFIRM_TOUCH_RETRY               =  3; // Added in release 1.14
  public static final int EVRW_TE_CONFIRM_CANCEL                    =  4; // Added in release 1.14
  public static final int EVRW_TE_NOTIFY_INVALID_OPERATION          =  5; // Added in release 1.14
  public static final int EVRW_TE_CONFIRM_INVALID_OPERATION         =  6; // Added in release 1.14
  public static final int EVRW_TE_CONFIRM_REMAINDER_SUBTRACTION     =  7; // Added in release 1.14
  public static final int EVRW_TE_CONFIRM_CENTER_CHECK              =  8; // Added in release 1.14
  public static final int EVRW_TE_CONFIRM_TOUCH_TIMEOUT             =  9; // Added in release 1.14
  public static final int EVRW_TE_CONFIRM_AUTO_CHARGE               = 10; // Added in release 1.14
  public static final int EVRW_TE_NOTIFY_CAPTURE_CARD               = 11; // Added in release 1.14
  public static final int EVRW_TE_NOTIFY_PIN                        = 12; // Added in release 1.14
  public static final int EVRW_TE_NOTIFY_CENTER_CHECK               = 13; // Added in release 1.14
  public static final int EVRW_TE_NOTIFY_COMPLETE                   = 14; // Added in release 1.14
  public static final int EVRW_TE_NOTIFY_TOUCH                      = 15; // Added in release 1.14
  public static final int EVRW_TE_NOTIFY_BUSY                       = 16; // Added in release 1.14
  public static final int EVRW_TE_CONFIRM_CENTER_CHECK_COMPLETE     = 17; // Added in release 1.14
  public static final int EVRW_TE_CONFIRM_SELECT                    = 18; // Added in release 1.14
  public static final int EVRW_TE_NOTIFY_LOCK                       = 19; // Added in release 1.14
  public static final int EVRW_TE_NOTIFY_CENTER_CHECK_COMPLETE      = 20; // Added in release 1.14
  public static final int EVRW_TE_CONFIRM_PIN_ENTRY_BY_OUTER_PINPAD = 21; // Added in release 1.14


  /////////////////////////////////////////////////////////////////////
  // "ResultCodeExtended" Property Constants
  /////////////////////////////////////////////////////////////////////

  public static final int OPOS_EVRW_NOCARD                = 201;
  public static final int OPOS_EVRW_RELEASE               = 202;
  public static final int OPOS_EVRW_CENTERERROR           = 203;
  public static final int OPOS_EVRW_COMMANDERROR          = 204;
  public static final int OPOS_EVRW_RESET                 = 205;
  public static final int OPOS_EVRW_COMMUNICATIONERROR    = 206;
  public static final int OPOS_EVRW_LOGOVERFLOW           = 207;
  public static final int OPOS_EVRW_DAILYLOGOVERFLOW      = 208;
  public static final int OPOS_EVRW_DEFICIENT             = 209;
  public static final int OPOS_EVRW_OVERDEPOSIT           = 210;
}
