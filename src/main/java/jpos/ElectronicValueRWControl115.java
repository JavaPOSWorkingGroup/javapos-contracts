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
// ElectronicValueRWControl115
//
// Interface definining all new capabilities, properties and methods
// that are specific to Electronic Value RW for release 1.15.
//
// Modification history
// ------------------------------------------------------------------
// 2022-Apr-09 JavaPOS Release 1.15                                MC
//
/////////////////////////////////////////////////////////////////////

package jpos;

public interface ElectronicValueRWControl115 extends ElectronicValueRWControl114
{
    // Capabilities
    public boolean getCapAdditionalSecurityInformation() throws JposException;
    public boolean getCapAuthorizeCompletion() throws JposException;
    public boolean getCapAuthorizePreSales() throws JposException;
    public boolean getCapAuthorizeRefund() throws JposException;
    public boolean getCapAuthorizeVoid() throws JposException;
    public boolean getCapAuthorizeVoidPreSales() throws JposException;
    public boolean getCapCashDeposit() throws JposException;
    public boolean getCapCenterResultCode() throws JposException;
    public boolean getCapCheckCard() throws JposException;
    public int getCapDailyLog() throws JposException;
    public boolean getCapInstallments() throws JposException;
    public boolean getCapPaymentDetail() throws JposException;
    public boolean getCapTaxOthers() throws JposException;
    public boolean getCapTransactionNumber() throws JposException;
    public boolean getCapMembershipCertificate() throws JposException; // 1.14.1


    // Properties
    public String getCardCompanyID() throws JposException;
    public String getCenterResultCode() throws JposException;
    public String getDailyLog() throws JposException;
    public int getPaymentCondition() throws JposException;
    public String getPaymentDetail() throws JposException;
    public int getPaymentMedia() throws JposException;
    public void setPaymentMedia(int paymentMedia) throws JposException;
    public String getSlipNumber() throws JposException;
    public String getTransactionNumber() throws JposException;
    public int getTransactionType() throws JposException;
    public int getServiceType() throws JposException; // 1.14.1

    // Methods
    public void accessDailyLog(int sequenceNumber,
                               int type,
                               int timeout) throws JposException;
    public void accessData(int dataType,
                           int[] data,
                           Object obj) throws JposException; // 1.14.1
    public void activateEVService(int[] data,
                                  Object obj) throws JposException; // 1.14.1
    public void authorizeCompletion(int sequenceNumber,
                                    long amount,
                                    long taxOthers,
                                    int timeout) throws JposException;
    public void authorizePreSales(int sequenceNumber,
                                  long amount,
                                  long taxOthers,
                                  int timeout) throws JposException;
    public void authorizeRefund(int sequenceNumber,
                                long amount,
                                long taxOthers,
                                int timeout) throws JposException;
    public void authorizeSales(int sequenceNumber,
                               long amount,
                               long taxOthers,
                               int timeout) throws JposException;
    public void authorizeVoid(int sequenceNumber,
                              long amount,
                              long taxOthers,
                              int timeout) throws JposException;
    public void authorizeVoidPreSales(int sequenceNumber,
                                      long amount,
                                      long taxOthers,
                                      int timeout) throws JposException;
    public void cashDeposit(int sequenceNumber,
                            long amount,
                            int timeout) throws JposException;
    public void checkCard(int sequenceNumber,
                          int timeout) throws JposException;
    public void checkServiceRegistrationToMedium(int sequenceNumber,
                                                 int timeout) throws JposException; // 1.14.1
    public void closeDailyEVService(int[] data,
                                    Object obj) throws JposException; // 1.14.1
    public void deactivateEVService(int[] data,
                                    Object obj) throws JposException; // 1.14.1
    public void openDailyEVService(int[] data,
                                   Object obj) throws JposException; // 1.14.1
    public void registerServiceToMedium (int sequenceNumber,
                                         int timeout) throws JposException; // 1.14.1
    public void unregisterServiceToMedium(int sequenceNumber,
                                          int timeout) throws JposException; // 1.14.1
    public void updateData(int dataType,
                           int[] data,
                           Object obj) throws JposException; // 1.14.1
}
